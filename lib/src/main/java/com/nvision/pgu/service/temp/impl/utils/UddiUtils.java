package com.nvision.pgu.service.temp.impl.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.nvg.idecs.uddi.ServiceClientFactory;
import ru.nvg.idecs.uddi.UDDINames;

/**
 * Не используется здесь в этом проекте (02.03.2012)
 * Created by IntelliJ IDEA.
 * User: p.samets
 * Date: 26.01.12
 * Time: 14:18
 * To change this template use File | Settings | File Templates.
 */
public class UddiUtils {
    private static Logger logger = LoggerFactory.getLogger(UddiUtils.class);

    private UddiUtils() {
    }

    /**
     * @param serviceId
     * @param region    регион верхнего уровня (возвращаемый getUserSelectedTopRegion)
     * @return
     */
    public static String getUddi(String serviceId, String region) {
        String endpoint = null;
        String key = null;

        try {
            key = UDDINames.NAME_SERVICE_PREFIX + serviceId + "_" + region;
            endpoint = ServiceClientFactory.getEndpoint(key);
        } catch (Exception ex) {
            endpoint = null;
        }

        logger.debug(String.format("Endpoint for key %s is %s", key, endpoint));

        if (endpoint == null || endpoint.trim().isEmpty()) {
            try {
                key = UDDINames.NAME_SERVICE_PREFIX + serviceId;
                endpoint = ServiceClientFactory.getEndpoint(key);
            } catch (Exception ex) {
                endpoint = null;
            }
        }

        logger.debug(String.format("Endpoint for key %s is %s", key, endpoint));

        return endpoint;
    }
}
