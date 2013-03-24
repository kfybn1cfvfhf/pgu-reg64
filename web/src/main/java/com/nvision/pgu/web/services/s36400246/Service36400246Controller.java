package com.nvision.pgu.web.services.s36400246;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
import com.nvision.pgu.core.rules.api.RuleException;
import com.nvision.pgu.web.services.utils.PersonalDataUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.util.version.Version;
import ru.nvg.idecs.identityservice.ws.types.Person;

import java.util.Arrays;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 */
@Controller @RequestMapping("/services/s" + Service36400246Controller.SERVICE_ID)
        @ServiceController(id = Service36400246Controller.SERVICE_ID,
        title = "Осуществление социальных выплат гражданам, признанным в установленном порядке безработными")
@Version("0.1.1")
public class Service36400246Controller extends AbstractServiceOrderControllerEDS24<Service36400246Form> {
public static final Logger LOGGER = LoggerFactory.getLogger(Service36400246Controller.class);
    /**
     * id Осуществление социальных выплат гражданам, признанным в установленном порядке безработными
     */
    public static final int SERVICE_ID = 36400246;
    @Autowired
    private Service36400246FormValidator validator;

    public Service36400246Controller() {
        setStepMetaList(Arrays.asList(new StepMeta(1, "Сведения о заявителе", true, "xml")));
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400246Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400246Form createNewForm() {
        return new Service36400246Form();
    }

    @Override
    public void applyInitRules(Service36400246Form form) throws RuleException {
        Person person = PersonalDataUtils.getPerson(form);
        if (person.getMainDocument() != null) {
            form.setSex(person.getSex().name());
            form.setPassport_type(person.getMainDocument().getDocumentTypeName());
        }
    }
}
