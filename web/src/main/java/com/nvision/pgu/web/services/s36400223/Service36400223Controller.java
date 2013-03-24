package com.nvision.pgu.web.services.s36400223;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.rules.api.RuleException;

import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 */
@Controller @RequestMapping("/services/s36400223") @ServiceController(id = Service36400223Controller.SERVICE_ID,
        title = "Подача электронной заявки на выдачу свидетельства о смерти")
public class Service36400223Controller extends AbstractNakhodkaController<Service36400223Form> {
    /**
     * id Подача электронной заявки на регистрацию смерти
     */
    public static final int SERVICE_ID = 36400223;
    @Autowired
    private Service36400223FormValidator validator;

    public Service36400223Controller() {
        // TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Выбор органа ЗАГС обращения",
                "Сведения о заявителе",
                "Место жительства заявителя",
                "Сведения об умершем",
                "Место рождения, место жительства и смерти",
                "Запись на прием");
        setStepList(stepList);
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400223Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    public void applyInitRules(Service36400223Form form) throws RuleException {
        String defaultCountry = "1";
        form.setDeclarant_country(defaultCountry);
        form.setDeath_person_birth_country(defaultCountry);
        form.setDeath_person_living_country(defaultCountry);
        form.setDeath_country(defaultCountry);
		form.setDeclarant_ident_doc_type_gr("1"); // второй шаг

        String mobile = form.getContact_phone_home();
        String phone = form.getContact_phone_mobile();
        if(!mobile.isEmpty())
            phone = phone + "," + mobile;

        form.setContact_phone(phone);
    }

    @Override
    protected Service36400223Form createNewForm() {
        Service36400223Form form = new Service36400223Form();
        try {
            // form.setDeath_person_nationality(getDicRegistry().listItemsByName("NATIONALITY", "Русский", 0, 10).getList().getItem().get(0).getKey().getCode());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
        }

        return form;
    }

    @Override
    public void applyStepRules(Service36400223Form form) throws RuleException {
        Integer stepNum = form.getStepNum();
        if (stepNum == null) {
        } else {
            switch (stepNum) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }
    }
}
