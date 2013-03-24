package com.nvision.pgu.service.temp.impl.callwrappers;

import com.nvision.pgu.service.core.impl.callwrappers.MR243CallWrapper;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;


public class AisEcu64CallWrapper extends MR243CallWrapper {

    private static final Logger LOGGER = LoggerFactory.getLogger(AisEcu64CallWrapper.class);

    @Override
    protected String buildSoapXml(final Map<String, Object> xmlContext, final byte[] data, final long orderId,
                                  Map<String, Object> context) throws IOException, TemplateException {
        if (context.get("AUTH_TOKEN") == null) {
            throw new RuntimeException("Authtoken not found");
        }
        xmlContext.put("typeCode", "GSRV");
        xmlContext.put("status", "REQUEST");
        xmlContext.put("exchangeType", "1");

        String request = super.buildSoapXml(xmlContext, data, orderId, context);

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(request);
        }
        return request;
    }
}