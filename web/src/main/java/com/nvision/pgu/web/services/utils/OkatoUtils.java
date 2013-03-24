package com.nvision.pgu.web.services.utils;

import com.nvision.pgu.dic.DicHierarchyConformityException;
import com.nvision.pgu.dic.DicItemNotFoundException;
import com.nvision.pgu.dic.DicNotFoundException;
import com.nvision.pgu.dic.DicRegistryUI;
import com.nvision.pgu.nsi.ws.DicItem;
import com.nvision.pgu.nsi.ws.ListDicItem;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * User: ktarasov
 * Date: 23.08.2011
 * Time: 11:32:28
 */
public class OkatoUtils {

    public static class OkatoIncorrectException extends Exception {
        OkatoIncorrectException(String okato, Throwable th) {
            super("OKATO `" + okato + "\' is incorrect", th);
        }
    }

    public static final String LEVEL = "LEVEL";
    public static final String TYPE = "TYPE";
    public static final String CODE = "CODE";
    public static final String NAME = "NAME";

    public static final String TYPE_REGION = "REGION";
    public static final String TYPE_AO = "AO";
    public static final String TYPE_AREA = "AREA";
    public static final String TYPE_DISTRICT = "DISTRICT";
    public static final String TYPE_INNER_CITY_AREA = "INNER_CITY_AREA";
    public static final String TYPE_DISTRICT_OF_CITY = "DISTRICT_OF_CITY";
    public static final String TYPE_CITY = "CITY";
    public static final String TYPE_PGT = "PGT";
    public static final String TYPE_VILLAGE_COUNCIL = "VILLAGE_COUNCIL";

    public static List<Map<String, String>> expandOkato(DicRegistryUI drui, String lowLevelOkato) throws DicItemNotFoundException, DicNotFoundException, DicHierarchyConformityException, OkatoIncorrectException {
        if (null == lowLevelOkato || lowLevelOkato.isEmpty() || "null".equals(lowLevelOkato)) {
            return Collections.emptyList();
        }
        final List<DicItem> okatoList = fetchHierarchy(drui, lowLevelOkato);

        return processOkatos(okatoList);
    }

    private static List<DicItem> fetchHierarchy(DicRegistryUI drui, String lowLevelOkato) throws DicNotFoundException, DicItemNotFoundException, DicHierarchyConformityException {
        List<DicItem> dictionary = new LinkedList<DicItem>();
        DicItem currentDicItem = drui.getItemByKey("OKATO", lowLevelOkato);
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

    static List<Map<String, String>> processOkatos(List<DicItem> kladrs) throws OkatoIncorrectException {
       List<Map<String, String>> result = new LinkedList<Map<String, String>>();

        for (DicItem item : kladrs) {
            final String itemCode = item.getKey().getCode();
            final String itemName = item.getName();
            OkatoParser parser;
            try {
                parser = new OkatoParser(itemCode);
            } catch (IllegalStateException ise) {
                throw new OkatoIncorrectException(itemCode, ise);
            }

            result.add(okatoParserToMap(parser, itemCode, itemName));
        }

        return result;
    }

    static Map<String, String> okatoParserToMap(OkatoParser parser, String code, String name) {
        HashMap<String, String> result = new HashMap<String, String>();
        result.put(LEVEL, parser.level);
        result.put(TYPE, parser.type);
        result.put(CODE, code);
        result.put(NAME, name);

        return result;
    }
}
