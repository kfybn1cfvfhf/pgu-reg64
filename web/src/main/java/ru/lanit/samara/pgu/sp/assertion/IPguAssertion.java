package ru.lanit.samara.pgu.sp.assertion;

import com.nvision.pgu.sp.assertion.PortalVersion;
import com.nvision.pgu.sp.principal.IPrincipal;
import dk.itst.oiosaml.sp.UserAssertion;

public interface IPguAssertion {

    IPrincipal getPrincipal();

    void setPrincipal(IPrincipal principal);

    Integer getErrorCode();

    void setErrorCode(Integer errorCode);

    UserAssertion getUserAssertion();

    public PortalVersion getPortalVersion();
}
