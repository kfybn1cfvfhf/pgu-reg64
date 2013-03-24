package com.nvision.pgu.web.services.s36400213;

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
@RequestMapping("/services/s" + Service36400213Controller.SERVICE_ID)
@ServiceController(id = Service36400213Controller.SERVICE_ID, title = "Лицензирование заготовки, переработки и реализации лома черных и цветных металлов на территории Саратовской области")
@Version("1.4.6")
public class Service36400213Controller extends AbstractServiceOrderControllerEDS24<Service36400213Form> {
    public static final Logger LOGGER = LoggerFactory.getLogger(Service36400213Controller.class);
    /**
     * id Лицензирование заготовки, переработки и реализации лома черных и цветных металлов на территории Саратовской области
     */
    public static final int SERVICE_ID = 36400213;
    public static String region = "";
    public static final String XML_PREFIX = "req";

    //@Autowired
    //private Service36400213FormValidator validator;

    public Service36400213Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о регистрации заявителя в качестве индивидуального предпринимателя",
				"Дополнительные сведения"
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
 		//if (binder.getTarget() instanceof Service36400213Form) {
 		//	super.setValidator(validator);
 		//	binder.setValidator(validator);
 		//}
 	}

    @Override
    protected Service36400213Form createNewForm() {
        return new Service36400213Form();
    }

    @Autowired
    IPrivateRoomDataContainer privateRoomDataContainer;

    @Override
    protected void fillModelByForm(Map<String, Object> model, Service36400213Form form) throws ShowErrorToUserException {
        super.fillModelByForm(model, form);

        model.put("privateRoomData", this.privateRoomDataContainer);
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400213Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
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
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400213Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        // Индивидуальный предприниматель
        if ("1".equalsIgnoreCase(form.getApplType())) {

            // При активированном dov_enable, переход на ШАГ 3 (ШАГ 2,4,5 пропускаются)
            if ("on".equalsIgnoreCase(form.getDov_enable())) {
                if(stepProcessingResult.getStepNum() == 2) {
                    stepProcessingResult = new StepProcessingResult(2, "step2-2.html");
                }
            // При деактивированном dov_enable, переход на ШАГ 2 (ШАГ 3,4,5 пропускаются)
            } else {
                if(stepProcessingResult.getStepNum() == 2) {
                    stepProcessingResult = new StepProcessingResult(2, "step2-1.html");
                }
            }
        }

        // Юридическое лицо
        if ("2".equalsIgnoreCase(form.getApplType())) {
            // Заявление подает #dovUlType = 1, переход на ШАГ 4 (ШАГИ 2,3,5,6 пропускаются)
            if ("1".equalsIgnoreCase(form.getDovUlType())) {
                if(stepProcessingResult.getStepNum() == 2) {
                    stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
                }
                if(stepProcessingResult.getStepNum() == 3) {
                    if (!goback) {
                        stepProcessingResult.setStepNum(4);
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
                    }
                }
            }
            // Заявление подает #dovUlType = 2, переход на ШАГ 5 (ШАГИ 2,3,4,6 пропускаются)
            if ("2".equalsIgnoreCase(form.getDovUlType())) {
                if(stepProcessingResult.getStepNum() == 2) {
                    stepProcessingResult = new StepProcessingResult(2, "step2-4.html");
                }
                if(stepProcessingResult.getStepNum() == 3) {
                    if (!goback) {
                        stepProcessingResult.setStepNum(4);
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2-4.html");
                    }
                }
            }
        }

        return stepProcessingResult;
    }

    @Override
    protected Map<String, Object> formToMap(Service36400213Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);
        decoratedFormAsMap.clearForOrdering();

        // Очистка полей
        if(form.getApplType().equals("1") && form.getDov_enable().equalsIgnoreCase("off")) {
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
            decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovUlPasLoad");
            decoratedFormAsMap.remove("org_FullTitle");
            decoratedFormAsMap.remove("org_opf");
            decoratedFormAsMap.remove("org_SmallTitle");
            decoratedFormAsMap.remove("org_phone");
            decoratedFormAsMap.remove("org_fax");
            decoratedFormAsMap.remove("org_email");
            decoratedFormAsMap.remove("org_firstName");
            decoratedFormAsMap.remove("org_lastName");
            decoratedFormAsMap.remove("org_middleName");
            decoratedFormAsMap.remove("org_InnUl");
            decoratedFormAsMap.remove("org_OgrnUl");
            decoratedFormAsMap.clearFileLoadField("founderDocLoad");
            decoratedFormAsMap.clearFileLoadField("EGRULDocLoad");
            decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
        }

        if(form.getApplType().equals("1") && form.getDov_enable().equalsIgnoreCase("on")) {
            decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");

            decoratedFormAsMap.remove("org_FullTitle");
            decoratedFormAsMap.remove("org_opf");
            decoratedFormAsMap.remove("org_SmallTitle");
            decoratedFormAsMap.remove("orgAddress");
            decoratedFormAsMap.remove("orgFactAddress");
            decoratedFormAsMap.remove("orgPostAddress");
            decoratedFormAsMap.remove("org_phone");
            decoratedFormAsMap.remove("org_fax");
            decoratedFormAsMap.remove("org_email");
            decoratedFormAsMap.remove("org_firstName");
            decoratedFormAsMap.remove("org_lastName");
            decoratedFormAsMap.remove("org_middleName");
            decoratedFormAsMap.remove("org_InnUl");
            decoratedFormAsMap.remove("org_OgrnUl");

            decoratedFormAsMap.clearFileLoadField("founderDocLoad");
            decoratedFormAsMap.clearFileLoadField("EGRULDocLoad");
            decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
        }

        if(form.getApplType().equals("2") && form.getDovUlType().equals("1")) {
            decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
//            decoratedFormAsMap.remove("lastName");
//            decoratedFormAsMap.remove("firstName");
//            decoratedFormAsMap.remove("middleName");
            decoratedFormAsMap.remove("phone");
            decoratedFormAsMap.remove("email");
            decoratedFormAsMap.remove("identityDocType");
            decoratedFormAsMap.remove("otherDocTypeName");
            decoratedFormAsMap.remove("passSeria");
            decoratedFormAsMap.remove("passNo");
            decoratedFormAsMap.remove("passDate");
            decoratedFormAsMap.remove("passFrom");
            decoratedFormAsMap.clearFileLoadField("identityDocLoad");
            decoratedFormAsMap.remove("inn");
            decoratedFormAsMap.remove("OgrnIp");
            decoratedFormAsMap.clearFileLoadField("EGRIPDocLoad");
        }

        if(form.getApplType().equals("2") && form.getDovUlType().equals("2")) {
            decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
//            decoratedFormAsMap.remove("lastName");
//            decoratedFormAsMap.remove("firstName");
//            decoratedFormAsMap.remove("middleName");
            decoratedFormAsMap.remove("phone");
            decoratedFormAsMap.remove("email");
            decoratedFormAsMap.remove("identityDocType");
            decoratedFormAsMap.remove("otherDocTypeName");
            decoratedFormAsMap.remove("passSeria");
            decoratedFormAsMap.remove("passNo");
            decoratedFormAsMap.remove("passDate");
            decoratedFormAsMap.remove("passFrom");
            decoratedFormAsMap.clearFileLoadField("identityDocLoad");
            decoratedFormAsMap.remove("inn");
            decoratedFormAsMap.remove("OgrnIp");
            decoratedFormAsMap.clearFileLoadField("EGRIPDocLoad");
        }

        if (form.getApplType().equals("2"))
            decoratedFormAsMap.remove("dov_enable");

        // ДУЛ: другой документ
        if ("5".equals(form.getIdentityDocType())) {
            formAsMap.put("identityDocType", form.getOtherDocTypeName());
        } else {
            formAsMap.put("identityDocType", form.getIdentityDocType());
            decoratedFormAsMap.remove("otherDocTypeName");
        }

        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400213Form form, Map<String, Object> model) {
        return Arrays.asList(
                "identityDocLoad",
                "dovDovLoad",
                "dovPasLoad",
                "dovUlNonDovLoad",
                "dovUlPasLoad",
                "dovUlDovLoad",
                "founderDocLoad",
                "EGRULDocLoad",
                "EGRIPDocLoad",
                "EGRPDocLoad",
                "kadVipDocLoad",
                "gosposhDocLoad"

        );
    }

}