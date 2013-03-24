package com.nvision.pgu.web.services.utils;

import com.nvision.pgu.dic.DicHierarchyConformityException;
import com.nvision.pgu.dic.DicItemNotFoundException;
import com.nvision.pgu.dic.DicNotFoundException;
import com.nvision.pgu.dic.DicRegistryUI;
import com.nvision.pgu.nsi.ws.DicItem;
import com.nvision.pgu.nsi.ws.ListDicItem;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * User: ktarasov
 * Date: 03.05.2011
 * Time: 15:34:30
 */
public class KladrUtils {
    public static final String REGION_CODE = "REGION.CODE";
    public static final String REGION_NAME = "REGION.NAME";
    public static final String DICTRICT_CODE = "DICTRICT.CODE";
    public static final String DICTRICT_NAME = "DICTRICT.NAME";
    public static final String CITY_CODE = "CITY.CODE";
    public static final String CITY_NAME = "CITY.NAME";
    public static final String TOWN_CODE = "TOWN.CODE";
    public static final String TOWN_NAME = "TOWN.NAME";

    private static final String KLADR_MOSCOW = "77000000000";
    private static final String KLARD_ST_PETER = "78000000000";

    public static LinkedHashMap<String, String> expandKladr(DicRegistryUI drui, String lowLevelKladr) throws DicItemNotFoundException, DicNotFoundException, DicHierarchyConformityException {
        if (null == lowLevelKladr || lowLevelKladr.isEmpty() || "null".equals(lowLevelKladr)) {
            return new LinkedHashMap<String, String>();
        }
        final List<DicItem> kladrList = fetchHierarchy(drui, lowLevelKladr);
        return processKladrs(kladrList);
    }

    private static List<DicItem> fetchHierarchy(DicRegistryUI drui, String lowLevelKladr) throws DicNotFoundException, DicItemNotFoundException, DicHierarchyConformityException {
        List<DicItem> dictionary = new LinkedList<DicItem>();
        DicItem currentDicItem = drui.getItemByKey("KLADRRegion", lowLevelKladr);
        boolean hasParents;
        do {
            dictionary.add(currentDicItem);
            final ListDicItem listDicItem = drui.listItemsByChild(currentDicItem.getKey());
            final List<DicItem> dicItemList = listDicItem.getItem();
            hasParents = null != dicItemList && !dicItemList.isEmpty();
            if (hasParents) {
                currentDicItem = dicItemList.get(0);
            }
        } while (hasParents);

        Collections.reverse(dictionary);

        return dictionary;
    }

    static LinkedHashMap<String, String> processKladrs(List<DicItem> kladrs) {
        LinkedHashMap<String, String> result = new LinkedHashMap<String, String>();

        for (DicItem item : kladrs) {
            String kladr = item.getKey().getCode();
            if (kladr.length() > 11) {
                kladr = kladr.substring(0, 11);
            }

            int nonZeroPosition = 0;
            for (int i = 0; i < kladr.length(); i++) {
                if (kladr.charAt(i) != '0') {
                    nonZeroPosition = i;
                }
            }

            if (nonZeroPosition < 2) {
                result.put(REGION_CODE, kladr);
                result.put(REGION_NAME, item.getName());
                if (KLADR_MOSCOW.equals(kladr) || KLARD_ST_PETER.equals(kladr)) {
                    result.put(CITY_CODE, kladr);
                    result.put(CITY_NAME, item.getName());
                }
            } else if (nonZeroPosition < 5) {
                result.put(DICTRICT_CODE, kladr);
                result.put(DICTRICT_NAME, item.getName());
            } else if (nonZeroPosition < 8) {
                result.put(CITY_CODE, kladr);
                result.put(CITY_NAME, item.getName());
            } else {
                result.put(TOWN_CODE, kladr);
                result.put(TOWN_NAME, item.getName());
            }
        }

        return result;
    }
}
