package com.nvision.pgu.web.services.utils;

import com.nvision.pgu.dic.DicNotFoundException;
import com.nvision.pgu.dic.DicRegistryUI;
import com.nvision.pgu.nsi.ws.DicItem;
import com.nvision.pgu.nsi.ws.DicItemList;
import com.nvision.pgu.nsi.ws.ListDicItem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by IntelliJ IDEA.
 * User: i.yarosh
 * Date: 06.03.12
 * Time: 4:18
 * To change this template use File | Settings | File Templates.
 */
public class NationalityUtils {

    private static final String NAHODKA_NATIONALITY = "NATIONALITY_LS";
//    private static final String RUSSIA_CODE = "643";
    private static final Logger logger = LoggerFactory.getLogger(NationalityUtils.class);
    private static final String SEPARATOR = ",";

    /**
     * Метод, который проверяет число, представленное строкой на четность
     *
     * @param s число, представленное строкой
     *
     * @return true, если число четное, false, если число нечетное
     */
    private static boolean isEven(String s){
        int n = Integer.parseInt(s);
       if (n % 2 == 0){
         return true;
       } else {
	    return false;
	  }
    }

     /**
     * Метод, который возвращает строку, в которой через ',' перечислены коды значений справочника NahodkaNationality
     *
     * @param dicRegistryUI переменная для работы с данными справочника
     * @return возвращает строку, в которой через ',' перечислены коды элементов
     */



    public static String getNahodkaNationality(DicRegistryUI dicRegistryUI, String sex) {
        String result = "";
        try {
            StringBuilder resultBuilder = new StringBuilder();
            int total = dicRegistryUI.listItemsAll(NAHODKA_NATIONALITY, 1, 1).getTotal();
            DicItemList list = dicRegistryUI.listItemsAll(NAHODKA_NATIONALITY, 1, total);
            final ListDicItem listDicItem = list.getList();
            for (DicItem item : listDicItem.getItem()) {
                final String code = item.getKey().getCode();
                if("man".equals(sex)){
                   if(!isEven(code)){
                        resultBuilder.append(code).append(SEPARATOR);
                   }
                }
                else if ("woman".equals(sex)){
                       if(isEven(code)){
                        resultBuilder.append(code).append(SEPARATOR);
                   }
                }
            }


            int resultLength = resultBuilder.toString().length();
            result = resultBuilder.toString().substring(0, resultLength - SEPARATOR.length());

        } catch (DicNotFoundException e) {
            logger.warn("Справочник " + NAHODKA_NATIONALITY + " не найден.");
        } catch (IndexOutOfBoundsException ibe) {
            // nothing to do.
        }

        return result;
    }
}

