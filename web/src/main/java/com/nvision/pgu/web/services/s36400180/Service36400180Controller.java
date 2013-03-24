package com.nvision.pgu.web.services.s36400180;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.exceptions.ShowErrorToUserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.blocks.AbstractServiceOrderControllerEDS24;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;
import ru.lanit.samara.pgu.core.util.version.Version;
import ru.lanit.samara.pgu.core.util.formasmap.FormAsMap;
import ru.lanit.samara.pgu.core.util.formasmap.FormAsMapImpl;

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
@RequestMapping("/services/s" + Service36400180Controller.SERVICE_ID)
@ServiceController(id = Service36400180Controller.SERVICE_ID, title = "Выдача удостоверений тракториста-машиниста (тракториста)")
@Version("1.1")
public class Service36400180Controller extends AbstractServiceOrderControllerEDS24<Service36400180Form> {
    public static final Logger LOGGER = LoggerFactory.getLogger(Service36400180Controller.class);
    /**
     * id Выдача удостоверений тракториста-машиниста (тракториста)
     */
    public static final int SERVICE_ID = 36400180;
    public static String region = "";
    public static final String XML_PREFIX = "req";

    //@Autowired
    //private Service36400180FormValidator validator;

    public Service36400180Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о запрашиваемой услуге"
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
 		//if (binder.getTarget() instanceof Service36400180Form) {
 		//	super.setValidator(validator);
 		//	binder.setValidator(validator);
 		//}
 	}
	
	@Override
 	protected Service36400180Form createNewForm() {
 		return new Service36400180Form();
 	}

    @Autowired
    IPrivateRoomDataContainer privateRoomDataContainer;

    @Override
    protected void fillModelByForm(Map<String, Object> model, Service36400180Form form) throws ShowErrorToUserException {
        super.fillModelByForm(model, form);

        model.put("privateRoomData", this.privateRoomDataContainer);
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400180Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (stepProcessingResult.getStepNum() == 2 && form.getDov_enable_changed().booleanValue()) {

            if ("off".equalsIgnoreCase(form.getDov_enable())) {

                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            } else {
                form.clearApplicantAttributes();
            }

            form.setDov_enable_changed(false);
        }
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400180Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        // При деактивированном dov_enable
        if ("on".equalsIgnoreCase(form.getDov_enable())) {
            // переход на шаг 2,4
            if(stepProcessingResult.getStepNum() == 2) {
                stepProcessingResult = new StepProcessingResult(2, "step2-2.html");
            }
            if(stepProcessingResult.getStepNum() == 3) {
                if (!goback) {
                    stepProcessingResult.setStepNum(3);
                } else {
                    stepProcessingResult = new StepProcessingResult(2, "step2-2.html");
                }
            }

        // При активированном dov_enable
        } else {
            // переход на шаг 3,4
            if(stepProcessingResult.getStepNum() == 2) {
                stepProcessingResult = new StepProcessingResult(2, "step2-1.html");
            }
            if(stepProcessingResult.getStepNum() == 3) {
                if (!goback) {
                    stepProcessingResult.setStepNum(3);
                } else {
                    stepProcessingResult = new StepProcessingResult(2, "step2-1.html");
                }
            }
        }

        return stepProcessingResult;
    }

    @Override
    protected Map<String, Object> formToMap(Service36400180Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);
        decoratedFormAsMap.clearForOrdering();

        // Шаг 2

        if ("5".equalsIgnoreCase(form.getIdentityDocType()) != true) {
            decoratedFormAsMap.remove("otherDocTypeName");
        }

        // ДУЛ: другой документ
        if ("5".equals(form.getIdentityDocType())) {
            formAsMap.put("identityDocType", form.getOtherDocTypeName());
        } else {
            formAsMap.put("identityDocType", form.getIdentityDocType());
        }

        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400180Form form, Map<String, Object> model) {
        return Arrays.asList(
                "identityDocLoad",
                "dovDovLoad",
                "dovPasLoad",
                "meddocLoad",
                "edudocLoad",
                "drivingdocLoad",
                "dutydocLoad"
        );
    }

}