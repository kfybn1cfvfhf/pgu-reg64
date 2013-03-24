package com.nvision.pgu.web.services.s36400211;

import com.nvision.pgu.core.annotations.ServiceController;
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
@RequestMapping("/services/s" + Service36400211Controller.SERVICE_ID)
@ServiceController(id = Service36400211Controller.SERVICE_ID, title = "Предоставление государственной услуги по предоставлению выписки из государственного лесного реестра")
@Version("1.2")
public class Service36400211Controller extends AbstractServiceOrderControllerEDS24<Service36400211Form> {
    public static final Logger LOGGER = LoggerFactory.getLogger(Service36400211Controller.class);
    /**
     * id Предоставление государственной услуги по предоставлению выписки из государственного лесного реестра
     */
    public static final int SERVICE_ID = 36400211;
    public static String region = "";
    public static final String XML_PREFIX = "req";


    //@Autowired
    //private Service36400211FormValidator validator;

    public Service36400211Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о запрашиваемой информации"
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
 		//if (binder.getTarget() instanceof Service36400211Form) {
 		//	super.setValidator(validator);
 		//	binder.setValidator(validator);
 		//}
 	}
	
	@Override
 	protected Service36400211Form createNewForm() {
 		return new Service36400211Form();
 	}

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400211Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
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
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400211Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        if(stepProcessingResult.getStepNum() == 2) {
            // Индивидуальный предприниматель
            if ("1".equalsIgnoreCase(form.getApplType())) {
                // При активированном dov_enable, переход на ШАГ 3 (ШАГ 2,4,5 пропускаются)
                if ("on".equalsIgnoreCase(form.getDov_enable())) {
                    stepProcessingResult = new StepProcessingResult(2, "step2-2.html");
                // При деактивированном dov_enable, переход на ШАГ 2 (ШАГ 3,4,5 пропускаются)
                } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2-1.html");
                }
            }

            // Юридическое лицо
            if ("2".equalsIgnoreCase(form.getApplType())) {
                // Заявление подает #dovUlType = 1, переход на ШАГ 4 (ШАГИ 2,3,5,6 пропускаются)
                if ("1".equalsIgnoreCase(form.getDovUlType())) {
                    stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
                }
                // Заявление подает #dovUlType = 2, переход на ШАГ 5 (ШАГИ 2,3,4,6 пропускаются)
                if ("2".equalsIgnoreCase(form.getDovUlType())) {
                        stepProcessingResult = new StepProcessingResult(2, "step2-4.html");
                }
            }
        }

        return stepProcessingResult;
    }

    @Override
    protected Map<String, Object> formToMap(Service36400211Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);
        decoratedFormAsMap.clearForOrdering();

        // Очистка полей
        if ("1".equalsIgnoreCase(form.getApplType()) && "off".equalsIgnoreCase(form.getDov_enable())) {
         decoratedFormAsMap.clearFileLoadField("dovDovLoad");
         decoratedFormAsMap.clearFileLoadField("dovPasLoad");
         decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
         decoratedFormAsMap.clearFileLoadField("dovUlPasLoad");
         decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
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
            decoratedFormAsMap.remove("org_OKPO");

        }
         if ("1".equalsIgnoreCase(form.getApplType()) && "on".equalsIgnoreCase(form.getDov_enable())) {
         decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
         decoratedFormAsMap.clearFileLoadField("dovUlPasLoad");
         decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
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
            decoratedFormAsMap.remove("org_OKPO");
            decoratedFormAsMap.remove("org_phone");
         }

         if ("2".equalsIgnoreCase(form.getApplType()) && "1".equalsIgnoreCase(form.getDovUlType())) {
         decoratedFormAsMap.clearFileLoadField("dovDovLoad");
         decoratedFormAsMap.clearFileLoadField("dovPasLoad");
         decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
         decoratedFormAsMap.clearFileLoadField("identityDocLoad");
            decoratedFormAsMap.remove("address");
            decoratedFormAsMap.remove("identityDocType");
            decoratedFormAsMap.remove("otherDocTypeName");
            decoratedFormAsMap.remove("passSeria");
            decoratedFormAsMap.remove("passNo");
            decoratedFormAsMap.remove("passDate");
            decoratedFormAsMap.remove("passFrom");
             decoratedFormAsMap.remove("phone");
             decoratedFormAsMap.remove("email");
        }

         if ("2".equalsIgnoreCase(form.getApplType()) && "2".equalsIgnoreCase(form.getDovUlType())) {
         decoratedFormAsMap.clearFileLoadField("dovDovLoad");
         decoratedFormAsMap.clearFileLoadField("dovPasLoad");
         decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
         decoratedFormAsMap.clearFileLoadField("identityDocLoad");

            decoratedFormAsMap.remove("address");
            decoratedFormAsMap.remove("identityDocType");
            decoratedFormAsMap.remove("otherDocTypeName");
            decoratedFormAsMap.remove("passSeria");
            decoratedFormAsMap.remove("passNo");
            decoratedFormAsMap.remove("passDate");
            decoratedFormAsMap.remove("passFrom");
            decoratedFormAsMap.remove("phone");
            decoratedFormAsMap.remove("email");
        }

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
    protected List<String> getFormFieldsWithFiles(Service36400211Form form, Map<String, Object> model) {
        return Arrays.asList(
            "identityDocLoad",
            "dovPasLoad",
            "dovDovLoad",
            "dovUlNonDovLoad",
            "dovUlPasLoad",
            "dovUlDovLoad"
        );
    }

}