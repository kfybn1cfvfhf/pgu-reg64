package ru.lanit.samara.pgu.sp.assertion;

import com.nvision.pgu.sp.assertion.PguAssertion;
import com.nvision.pgu.sp.assertion.PortalVersion;
import com.nvision.pgu.sp.principal.IPrincipal;
import dk.itst.oiosaml.sp.UserAssertion;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

public class PguAssertionWrapper implements IPguAssertion, IPguAssertionWrap, Serializable {

    private PguAssertion pguAssertion;

    @Override
    public PguAssertion getPguAssertion() {
        return this.pguAssertion;
    }

    @Autowired
    private PguAssertionWrapper(HttpServletRequest request) {
        this.pguAssertion = (PguAssertion) request.getSession().getAttribute("pguAssertion");
    }

    public PguAssertionWrapper(PguAssertion pguAssertion) {
        this.pguAssertion = pguAssertion;
    }

    @Override
    public IPrincipal getPrincipal() {
        return this.pguAssertion.getPrincipal();
    }

    @Override
    public void setPrincipal(IPrincipal principal) {
        this.pguAssertion.setPrincipal(principal);
    }

    @Override
    public Integer getErrorCode() {
        return this.pguAssertion.getErrorCode();
    }

    @Override
    public void setErrorCode(Integer errorCode) {
        this.pguAssertion.setErrorCode(errorCode);
    }

    @Override
    public UserAssertion getUserAssertion() {
        return this.pguAssertion.getUserAssertion();
    }

    @Override
    public PortalVersion getPortalVersion() {
        return this.pguAssertion.getPortalVersion();
    }
}