package com.nvision.pgu.web.services.utils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * User: ktarasov
 * Date: 23.08.2011
 * Time: 11:58:35
 * 1 — автономный округ (AO);
 * 2 — район (в том числе внутригородской), округ (AREA, DISTRICT);
 * 4 — город, поселок городского типа (CITY, PGT);
 * 3 — внутригородской район, округ города (INNER_CITY_AREA, DISTRICT_OF_CITY);
 * 5 — город, поселок городского типа (CITY, PGT);
 * 8 — сельсовет (VILLAGE_COUNCIL);
 * 9 — сельсовет (VILLAGE_COUNCIL).
 */
final class OkatoParser {

    public final String level;
    public final String type;

    public final String level1;
    public final String level1R0Code;
    public final String level2R1;
    public final String level2R1Code;
    public final String level2;
    public final String level3R2;
    public final String level3R2Code;
    public final String level3;
    static final Pattern ALL_ZEROS = Pattern.compile("0+");

    OkatoParser(String okato) {
        if (okato.length() < 8) {
            char[] okatoRaw = new char[8];
            Arrays.fill(okatoRaw, '0');
            okato.getChars(0, okato.length(), okatoRaw, 0);
            okato = new String(okatoRaw);
        }
        level1 = okato.substring(0, 2);
        level2R1 = okato.substring(2, 3);
        level2 = okato.substring(3, 5);
        level3R2 = okato.substring(5, 6);
        level3 = okato.substring(6);

        level1R0Code = calculateLevel1TypeCode(level1);
        level2R1Code = calculateLevel2TypeCode(level2R1, level2);
        level3R2Code = calculateLevel3TypeCode(level3R2, level3);

        type = calculateType(level1R0Code, level2R1Code, level3R2Code);
        level = calculateLevel(level2R1, level2, level3R2, level3);
    }

    private static String calculateType(String level1R0Code, String level2R1Code, String level3R2Code) {
        if (null != level3R2Code) {
            return level3R2Code;
        }
        if (null != level2R1Code) {
            return level2R1Code;
        }
        return level1R0Code;
    }

    private static String calculateLevel(String level2R1, String level2, String level3R2, String level3) {
        if (!"0".equals(level3R2) || !ALL_ZEROS.matcher(level3).matches()) {
            return "3";
        }
        if (!"0".equals(level2R1) || !ALL_ZEROS.matcher(level2).matches()) {
            return "2";
        }
        return "1";
    }

    private static String calculateLevel1TypeCode(String level1) {
        return ("40".equals(level1) || "45".equals(level1)) ? OkatoUtils.TYPE_CITY : OkatoUtils.TYPE_REGION;
    }

    private static String calculateLevel2TypeCode(String level2R1, String level2) {
        final char typeCode = level2R1.charAt(0);
        switch (typeCode) {
            case '0':
                return null;
            case '1':
                return OkatoUtils.TYPE_AO;
            case '2':
                return level2.charAt(0) >= '6' ? OkatoUtils.TYPE_DISTRICT : OkatoUtils.TYPE_AREA;
            case '4':
                return level2.charAt(0) >= '5' ? OkatoUtils.TYPE_PGT : OkatoUtils.TYPE_CITY;
            default:
                throw new IllegalStateException("Unknown type `" + typeCode + "\'");
        }
    }

    private static String calculateLevel3TypeCode(String level3R2, String level3) {
        final char typeCode = level3R2.charAt(0);
        switch (typeCode) {
            case '0':
                return null;
            case '3':
                return level3.charAt(0) >= '6' ? OkatoUtils.TYPE_DISTRICT_OF_CITY : OkatoUtils.TYPE_INNER_CITY_AREA;
            case '5':
            case '6':
                return level3.charAt(0) >= '5' ? OkatoUtils.TYPE_PGT : OkatoUtils.TYPE_CITY;
            case '8':
            case '9':
                return OkatoUtils.TYPE_VILLAGE_COUNCIL;
            default:
                throw new IllegalStateException("Unknown type `" + typeCode + "\'");
        }
    }
}
