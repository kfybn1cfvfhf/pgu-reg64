package com.nvision.pgu.web.services.s36400209;

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
@RequestMapping("/services/s" + Service36400209Controller.SERVICE_ID)
@ServiceController(id = Service36400209Controller.SERVICE_ID, title = "Предоставление земельных участков, на которых расположены здания, строения и сооружения")
@Version("1.2.1")
public class Service36400209Controller extends AbstractServiceOrderControllerEDS24<Service36400209Form> {
    public static final Logger LOGGER = LoggerFactory.getLogger(Service36400209Controller.class);
    /**
     * id Предоставление земельных участков, на которых расположены здания, строения и сооружения
     */
    public static final int SERVICE_ID = 36400209;
    public static String region = "";
    public static final String XML_PREFIX = "req";

    //@Autowired
    //private Service36400209FormValidator validator;

    public Service36400209Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о регистрации заявителя в качестве индивидуального предпринимателя",
				"Характеристики испрашиваемого земельного участка",
				"Электронные копии документов"
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
 		//if (binder.getTarget() instanceof Service36400209Form) {
 		//	super.setValidator(validator);
 		//	binder.setValidator(validator);
 		//}
 	}
	
	@Override
 	protected Service36400209Form createNewForm() {
 		return new Service36400209Form();
 	}

    @Autowired
    IPrivateRoomDataContainer privateRoomDataContainer;

    @Override
    protected void fillModelByForm(Map<String, Object> model, Service36400209Form form) throws ShowErrorToUserException {
        super.fillModelByForm(model, form);

        model.put("privateRoomData", this.privateRoomDataContainer);
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400209Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
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
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400209Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        if(stepProcessingResult.getStepNum() == 2) {

            if("1".equalsIgnoreCase(form.getApplType())) {
                // Физик
                if("off".equalsIgnoreCase(form.getDov_enable())) {
                    stepProcessingResult = new StepProcessingResult(2, "step2-1.html");
                } else {
                    stepProcessingResult = new StepProcessingResult(2, "step2-2.html");
                }
            } else {
                // Юрик
                if("1".equalsIgnoreCase(form.getDovUlType())) {
                    stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
                } else {
                    stepProcessingResult = new StepProcessingResult(2, "step2-4.html");
                }
            }
        }

        if(stepProcessingResult.getStepNum() == 3) {
            if("2".equalsIgnoreCase(form.getApplType()) || "off".equalsIgnoreCase(form.getIp_enable())) {
                if(!goback) {
                    stepProcessingResult.setStepNum(4);
                } else {
                    if("1".equalsIgnoreCase(form.getApplType())) {
                        // Физик
                        if("off".equalsIgnoreCase(form.getDov_enable())) {
                            stepProcessingResult = new StepProcessingResult(2, "step2-1.html");
                        } else {
                            stepProcessingResult = new StepProcessingResult(2, "step2-2.html");
                        }
                    } else {
                        // Юрик
                        if("1".equalsIgnoreCase(form.getDovUlType())) {
                            stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
                        } else {
                            stepProcessingResult = new StepProcessingResult(2, "step2-4.html");
                        }
                    }
                }
            }

        }

        return stepProcessingResult;
    }

    @Override
    protected Map<String, Object> formToMap(Service36400209Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);
        decoratedFormAsMap.clearForOrdering();

        // Очистка полей
        if("off".equals(form.getIp_enable())) {
            decoratedFormAsMap.remove("ogrnip");
            decoratedFormAsMap.remove("inn");
            decoratedFormAsMap.clearFileLoadField("docMvRegIPLoad");
        }

        if("1".equals(form.getDovUlType())) {
            decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
        }

        if("2".equals(form.getDovUlType())) {
            decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
        }

        if("off".equals(form.getDov_enable())) {
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
        }

        if("1".equals(form.getApplType())) {
            decoratedFormAsMap.remove("dovUlType");
            decoratedFormAsMap.remove("org_FullTitle");
            decoratedFormAsMap.remove("org_opf");
            decoratedFormAsMap.remove("org_addressUr");
            decoratedFormAsMap.remove("org_factAddressUr");
            decoratedFormAsMap.remove("org_addressEq");
            decoratedFormAsMap.remove("org_addressPost");
            decoratedFormAsMap.remove("org_phone");
            decoratedFormAsMap.remove("org_fax");
            decoratedFormAsMap.remove("org_email");
            decoratedFormAsMap.remove("org_firstName");
            decoratedFormAsMap.remove("org_lastName");
            decoratedFormAsMap.remove("org_middleName");
            decoratedFormAsMap.remove("org_InnUl");
            decoratedFormAsMap.remove("org_OgrnUl");
            decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovUlPasLoad");
            decoratedFormAsMap.clearFileLoadField("docMvRegULLoad");
            decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
        }

        if("2".equals(form.getApplType())) {
            decoratedFormAsMap.remove("dov_enable");
            decoratedFormAsMap.remove("ip_enable");
            //decoratedFormAsMap.remove("lastName");
            //decoratedFormAsMap.remove("firstName");
            //decoratedFormAsMap.remove("middleName");
            decoratedFormAsMap.remove("factAddress");
            decoratedFormAsMap.remove("address");
            decoratedFormAsMap.remove("addressEq");
            decoratedFormAsMap.remove("addressPost");
            decoratedFormAsMap.remove("phone");
            decoratedFormAsMap.remove("email");
            decoratedFormAsMap.remove("identityDocType");
            decoratedFormAsMap.remove("otherDocTypeName");
            decoratedFormAsMap.remove("passSeria");
            decoratedFormAsMap.remove("passNo");
            decoratedFormAsMap.remove("passDate");
            decoratedFormAsMap.remove("passFrom");
            decoratedFormAsMap.remove("");
            decoratedFormAsMap.clearFileLoadField("identityDocLoad");
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
        }

        if("1".equals(form.getRightKind()) || "2".equals(form.getRightKind()) || "5".equals(form.getRightKind())) {
            decoratedFormAsMap.remove("rentTerm");
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
    protected List<String> getFormFieldsWithFiles(Service36400209Form form, Map<String, Object> model) {
        return Arrays.asList(
                "identityDocLoad",
                "dovDovLoad",
                "dovPasLoad",
                "dovUlNonDovLoad",
                "dovUlPasLoad",
                "docMvRegULLoad",
                "dovUlDovLoad",
                "docMvRegIPLoad",
                "listDocLoad",
                "realtyDocLoad",
                "rightDocLoad",
                "circsDocLoad",
                "realtyEgrpDocLoad",
                "realtyNoDocLoad",
                "landEgrpDocLoad",
                "landNoDocLoad",
                "vipUlDocLoad",
                "kadastrDocLoad"
        );
    }

}