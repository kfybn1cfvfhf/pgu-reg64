package com.nvision.pgu.web.services.nakhodka;

import com.nvision.pgu.dao.LookupItemsList;
import com.nvision.pgu.dao.LookupItemsList.LookupItem;
import com.nvision.pgu.dic.DicNotFoundException;
import com.nvision.pgu.dic.DicRegistryUI;
import com.nvision.pgu.nsi.ws.DicItem;
import com.nvision.pgu.nsi.ws.DicItemList;
import com.nvision.pgu.nsi.ws.ListDicItem;
import com.nvision.pgu.web.controller.AbstractCustomLookupController;
import com.nvision.pgu.web.controller.lookup.LookupException;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: p.samets
 * Date: 29.04.11
 */

@Controller
@RequestMapping(value = AbstractCustomLookupController.MAPPING_BASE + "LookupNationalityController", method = RequestMethod.GET)
public class Service36400225LookupNationality extends AbstractCustomLookupController {
    private static Logger logger = LoggerFactory.getLogger(Service36400225LookupNationality.class);

    private static final String NATIONALITY = "NATIONALITY_LS";
    private static final String END_LITERAL = "а";//русская буква "а"
    private static final String SEPARATOR = ",";

    @Autowired
    DicRegistryUI dicRegistryUI;

    @Override
    public LookupItemsList getItemsList(String parentItemCode, Integer itemsPerPage, Integer pageIndex, String searchText, Map<String, String> optionsMap) throws LookupException {
        return getListProfile(parentItemCode, "36400225", optionsMap);  //TODO заменить на рельный номер услуги
    }

    @Override
    public String getValueByCode(String itemCode, Map<String, String> optionsMap) throws LookupException {
        LookupItemsList itemsList = getListProfile(itemCode, "36400225", optionsMap); //TODO заменить на рельный номер услуги
        if (itemsList.iterator().hasNext()) {
            return itemsList.get(itemCode).getText();
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    private LookupItemsList getListProfile(String itemCode, String serviceId, Map<String, String> optionsMap) {
        //Выборка значений для справочника NATIONALITY для поля "Национальность" в зависимости от пола (М или Ж)
        LookupItemsList itemsList = new LookupItemsList();
        org.json.JSONObject jsonValue = new org.json.JSONObject();
        String sex = optionsMap.get("sex");
        try {
            int total = dicRegistryUI.listItemsAll(NATIONALITY, 1, 1).getTotal();
            DicItemList list = dicRegistryUI.listItemsAll(NATIONALITY, 1, total);
            final ListDicItem listDicItem = list.getList();
            for (DicItem item : listDicItem.getItem()) {
                final String code = item.getKey().getCode();
                final String name = item.getName();
                String symbol = name.substring(name.length()-1);
                if("woman".equalsIgnoreCase(sex)){
                    if(isIncludeNumbers(code, sex)){
                        jsonValue.put(code, name);
                        itemsList.add(code, name, jsonValue);
                    } else if(END_LITERAL.equalsIgnoreCase(symbol) || isIncludeNumbers(code, sex)){
                        if(!isIncludeNumbers(code, "man")){
                            jsonValue.put(code, name);
                            itemsList.add(code, name, jsonValue);
                        }
                    }
                } else if("man".equalsIgnoreCase(sex)){
                    if(isIncludeNumbers(code, sex)){
                        jsonValue.put(code, name);
                        itemsList.add(code, name, jsonValue);
                    } else if(!END_LITERAL.equalsIgnoreCase(symbol) && !"РУССКАЯ".equalsIgnoreCase(name)){
                        if(!isIncludeNumbers(code, "woman")){
                            jsonValue.put(code, name);
                            itemsList.add(code, name, jsonValue);
                        }
                    }
                }
            }
        } catch (DicNotFoundException e) {
            logger.warn("Справочник " + NATIONALITY + " не найден.");
        } catch (IndexOutOfBoundsException ibe) {
            // nothing to do.
        } catch (JSONException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        //return itemsList;
        return getSortLookupItemsList(itemsList);
    }

    private boolean isIncludeNumbers(String code, String sex){
        List<String> list;
        if("man".equalsIgnoreCase(sex)){
            list = Arrays.asList("20","53","59");
        } else {
            list = Arrays.asList("197","199","200","201","172","184","117","186","205","190","174","175");
        }
        for(String code_element : list){
            if(code.equalsIgnoreCase(code_element))
                return true;
        }
        return false;
    }

    private static LookupItemsList getSortLookupItemsList(LookupItemsList lookupItemsList){
        List<LookupItem> itemList = new ArrayList<LookupItem>();
        for(LookupItem lookupItem : lookupItemsList){
            itemList.add(lookupItem);
        }
        Collections.sort(itemList, sortItemNameCompare);
        LookupItemsList sortLookupItemList = new LookupItemsList();
        for(LookupItem lookupItem : itemList){
            sortLookupItemList.add(lookupItem);
        }
        return sortLookupItemList;
    }

    static Comparator<LookupItem> sortItemNameCompare = new Comparator<LookupItem>() {

        public int compare(LookupItem item1, LookupItem item2) {
            return item1.getText().compareToIgnoreCase(item2.getText());
        }
    };

}
