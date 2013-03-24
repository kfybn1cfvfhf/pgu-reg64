package com.nvision.pgu.web.services.nakhodka;

import com.nvision.pgu.web.services.utils.UddiUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ochiruhin
 * Date: 2/21/12
 * Time: 5:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomLookupUtil {
    public static final String SELECTED_REGION_PARAM_NAME = "userSelectedRegion";
    public static final String OKATO_PARAM_NAME = "okato";
    public static final String REGION_MAPPING_TYPE = "regionMappingType";

    public static String extractRegion(Map<String, String> optionsMap) {
        Logger logger = LoggerFactory.getLogger(CustomLookupUtil.class);
        String result = "";
        String searchKey = SELECTED_REGION_PARAM_NAME;

        String regionMappingType = (optionsMap.containsKey(REGION_MAPPING_TYPE)) ? optionsMap.get(REGION_MAPPING_TYPE) : AbstractNakhodkaForm.REGION_MAPPING_TYPE_DISABLED;

        if (AbstractNakhodkaForm.REGION_MAPPING_TYPE_DISABLED.equals(regionMappingType)) {
            searchKey = SELECTED_REGION_PARAM_NAME;
        } else
        if (AbstractNakhodkaForm.REGION_MAPPING_TYPE_DATABASE.equals(regionMappingType)) {
            searchKey = OKATO_PARAM_NAME;
        }

        result = (optionsMap.containsKey(searchKey)) ? optionsMap.get(searchKey) : new String();
        logger.warn("Region = ({},{})",searchKey,result);

        return result;
    }

    public static String findEndpoint(Map<String, String> optionsMap, String serviceName) {
        return UddiUtils.getUddi(serviceName, CustomLookupUtil.extractRegion(optionsMap));
    }
}
