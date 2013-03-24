package com.nvision.pgu.web.services.s36400117;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.rules.api.RuleException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.blocks.AbstractServiceOrderControllerEDS24;
import ru.lanit.samara.pgu.core.util.formasmap.FormAsMap;
import ru.lanit.samara.pgu.core.util.formasmap.FormAsMapImpl;
import ru.lanit.samara.pgu.core.util.version.Version;

import java.util.Arrays;
import java.util.List;
import java.util.Map;



/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 *
 */
@Controller
@RequestMapping("/services/s" + Service36400117Controller.SERVICE_ID)
@ServiceController(id = Service36400117Controller.SERVICE_ID, title = "Выплата социального пособия на погребение")
@Version("1.0")
public class Service36400117Controller extends AbstractServiceOrderControllerEDS24<Service36400117Form> {
    public static final Logger LOGGER = LoggerFactory.getLogger(Service36400117Controller.class);
    /**
     * id Выплата социального пособия на погребение
     */
    public static final int SERVICE_ID = 36400117;
    public static String region = "";
    public static final String XML_PREFIX = "req";

    //@Autowired
    //private Service36400117FormValidator validator;

    public Service36400117Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе",
				"Сведения об умершем",
				"Сведения о способе перечисления социального пособия на погребение",
				"Дополнительные сведения и электронные копии документов"
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
 		//if (binder.getTarget() instanceof Service36400117Form) {
 		//	super.setValidator(validator);
 		//	binder.setValidator(validator);
 		//}
 	}
	
	@Override
 	protected Service36400117Form createNewForm() {
 		return new Service36400117Form();
 	}

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400117Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        // При деактивированном deadChild
        if ("on".equalsIgnoreCase(form.getDeadChild()) != true) {
            // переход на ШАГ 4
            if(stepProcessingResult.getStepNum() == 4) {
                stepProcessingResult = new StepProcessingResult(4, "step4-1.html");
            }

        // При активированном deadChild
        } else {
            // переход на ШАГ 5
            if(stepProcessingResult.getStepNum() == 4) {
                stepProcessingResult = new StepProcessingResult(4, "step4-2.html");
            }
        }

        return stepProcessingResult;
    }

    @Override
    protected Map<String, Object> formToMap(Service36400117Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);
        decoratedFormAsMap.clearForOrdering();

        // Очистка полей

        if("on".equals(form.getDeadChild())) {
            decoratedFormAsMap.clearFileLoadField("sprDeadDocLoad");
        }

        if("off".equals(form.getDeadChild())) {
            decoratedFormAsMap.clearFileLoadField("grrDeadChild");
            decoratedFormAsMap.clearFileLoadField("deadChildDocLoad");
        }

        if("1".equals(form.getWayBenefit())) {
            decoratedFormAsMap.remove("nameBankBenefit");
            decoratedFormAsMap.remove("filialBankBenefit");
            decoratedFormAsMap.remove("bikBankBenefit");
            decoratedFormAsMap.remove("corrAccBankBenefit");
            decoratedFormAsMap.remove("codeFilialBankBenefit");
            decoratedFormAsMap.remove("clientAccBankBenefit");
        }

        if("2".equals(form.getWayBenefit())) {
            decoratedFormAsMap.remove("addressBenefit");
        }


        // ДУЛ: другой документ

        if ("5".equalsIgnoreCase(form.getIdentityDocType()) != true) {
            decoratedFormAsMap.remove("otherDocTypeName");
        }

        if ("5".equals(form.getIdentityDocType())) {
            formAsMap.put("identityDocType", form.getOtherDocTypeName());
        } else {
            formAsMap.put("identityDocType", form.getIdentityDocType());
        }

        return formAsMap;
    }

    @Override
    public void applyInitRules(Service36400117Form form) throws RuleException {
        form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
    }


    @Override
    protected List<String> getFormFieldsWithFiles(Service36400117Form form, Map<String, Object> model) {
        return Arrays.asList(
            "identityDocLoad",
            "sprDeadDocLoad",
            "grrDeadChild",
            "deadChildDocLoad"
        );
    }

}