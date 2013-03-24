package ru.lanit.samara.pgu.core.util;

import org.w3c.dom.Element;

public interface WebserviceInvocation {

    Element invoke(String endpoint, String action, byte[] request);
}
