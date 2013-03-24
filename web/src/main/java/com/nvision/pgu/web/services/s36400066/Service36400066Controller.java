package com.nvision.pgu.web.services.s36400066;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.controllers.AbstractServiceOrderController;
import com.nvision.pgu.core.exceptions.ShowErrorToUserException;
import com.nvision.pgu.core.processors.InitRuleProcessor;
import com.nvision.pgu.core.rules.api.RuleException;
import com.nvision.pgu.core.services.ServiceResponseException;
import com.nvision.pgu.sp.principal.IPrincipal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 *
 */
@Controller
@RequestMapping("/services/s" + Service36400066Controller.SERVICE_ID)
@ServiceController(id = Service36400066Controller.SERVICE_ID, title = "Выдача справки о наличии объекта культурного наследия")

public class Service36400066Controller extends AbstractServiceOrderControllerEDS24<Service36400066Form> {
public static final Logger LOGGER = LoggerFactory.getLogger(Service36400066Controller.class);
    /**
     * id Подача заявления на выдачу справки о наличии объекта культурного наследия
     */
    public static final int SERVICE_ID = 36400066;


    @Autowired
    private Service36400066FormValidator validator;

    public Service36400066Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Заявление и электронные копии документов"
            );
        setStepList(stepList);
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

	@Override
    protected void initBinderInternal(WebDataBinder binder)
 	{
 		if (binder.getTarget() instanceof Service36400066Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400066Form createNewForm() {
 		return new Service36400066Form();
 	}

    @Override
    public String init(@ModelAttribute("form") Service36400066Form form, BindingResult result, Map<String, Object> model, HttpServletRequest request)
            throws RuleException, ServiceResponseException, ShowErrorToUserException {
        String rezult = super.init(form, result, model, request);

        // извлекаем персональные данные из СИА
        IPrincipal principal = form.getPguAssertion().getPrincipal();
        InitRuleProcessor initRuleProcessor = new InitRuleProcessor();
        initRuleProcessor.setRuleRegistry(getRuleRegistry());
        Map map = new HashMap();
        map.put(IPrincipal.class.getSimpleName(), principal);
        PersonalDataForm personalDataForm = new PersonalDataForm();
        initRuleProcessor.process(personalDataForm, map);

        // кладём их в модель, откуда к их можно будет брать из вьюхи
        model.put("applicantPersonalData", personalDataForm);

        // заряжаем эти данные в форму
        form.setLastName(personalDataForm.getLastName());
        form.setFirstName(personalDataForm.getFirstName());
        form.setMidlle(personalDataForm.getMiddleName());
        form.setPhone(personalDataForm.getPhone());

        return rezult;
    }

    protected List<String> getFormFieldsWithFiles(Service36400066Form form, Map<String, Object> model) {
        return Arrays.asList(
"loaddoc"
        );
    }
}