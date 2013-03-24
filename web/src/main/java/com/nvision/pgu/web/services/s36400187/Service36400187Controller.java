package com.nvision.pgu.web.services.s36400187;

import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
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
@RequestMapping("/services/s" + Service36400187Controller.SERVICE_ID)
@ServiceController(id = Service36400187Controller.SERVICE_ID, title = "Выдача разрешений, переоформление разрешений и выдача дубликатов разрешений на осуществление деятельности по перевозке пассажиров и багажа легковым такси")
@Version("1.3")

public class Service36400187Controller extends AbstractServiceOrderControllerEDS24<Service36400187Form> {
    /**
     * id Выдача разрешений, переоформление разрешений и выдача дубликатов разрешений на осуществление деятельности по перевозке пассажиров и багажа легковым такси
     */
    public static final int SERVICE_ID = 36400187;


    @Autowired
    private Service36400187FormValidator validator;

    public Service36400187Controller() {
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о регистрации заявителя в качестве индивидуального предпринимателя",
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
 		if (binder.getTarget() instanceof Service36400187Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400187Form createNewForm() {
 		return new Service36400187Form();
 	}

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400187Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (stepProcessingResult.getStepNum() == 2 && (form.getDov_enable_changed().booleanValue() || form.getApplType_changed().booleanValue())) {
            if("1".equalsIgnoreCase(form.getApplType()) && "off".equalsIgnoreCase(form.getDov_enable())) {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            } else {
                form.clearApplicantAttributes();
            }

            form.setDov_enable_changed(false);
            form.setApplType_changed(false);
        }
    }

    protected List<String> getFormFieldsWithFiles(Service36400187Form form, Map<String, Object> model) {
        return Arrays.asList(
"identityDocLoad",
"dovDovLoad",
"dovPasLoad",
"dovUlNonDovLoad",
"dovUlPasLoad",
"dovUlDovLoad",
"EGRIPDocLoad",
"EGRULDocLoad",
"gosRegTSDocLoad",
"dogArendaTSDocLoad",
"dovTSDocLoad",
"gosposhDocLoad"
        );
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400187Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        if (stepProcessingResult.getStepNum()==2) {
                if("1".equalsIgnoreCase(form.getApplType())) {
                    // Физик
                    if("off".equalsIgnoreCase(form.getDov_enable())) {
                        stepProcessingResult = new StepProcessingResult(2, "step2fisnondov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2fisdov.html");
                    }
                } else {
                    // Юрик
                    if("1".equalsIgnoreCase(form.getDovUlType())) {
                        stepProcessingResult = new StepProcessingResult(2, "step2ulnondov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2uldov.html");
                    }
                }
        }
        if (stepProcessingResult.getStepNum()==3) {
         if("1".equalsIgnoreCase(form.getApplType())) {

         }else{
            if (!goback){
               stepProcessingResult = new StepProcessingResult(4, "step4.html");
         } else{
               if("1".equalsIgnoreCase(form.getDovUlType())) {
                        stepProcessingResult = new StepProcessingResult(2, "step2ulnondov.html");
         } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2uldov.html");
         }
         }
         }
         }

        return stepProcessingResult;
    }



    @Override
    protected Map<String, Object> formToMap(Service36400187Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

        decoratedFormAsMap.clearForOrdering();

        if("5".equalsIgnoreCase(form.getIdentityDocType())) {
            decoratedFormAsMap.put("identityDocType", form.getOtherDocTypeName());
        }

        if("1".equalsIgnoreCase(form.getApplType()) && "off".equalsIgnoreCase(form.getDov_enable())) {
         decoratedFormAsMap.clearFileLoadField("dovDovLoad");
         decoratedFormAsMap.clearFileLoadField("dovPasLoad");
            decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovUlPasLoad");
         decoratedFormAsMap.remove("org_opf");
         decoratedFormAsMap.remove("otherAddress");
            decoratedFormAsMap.remove("org_phone");
            decoratedFormAsMap.remove("org_fax");
            decoratedFormAsMap.remove("org_email");
            decoratedFormAsMap.remove("org_firstName");
            decoratedFormAsMap.remove("org_lastName");
            decoratedFormAsMap.remove("org_middleName");
            decoratedFormAsMap.remove("org_InnUl");
            decoratedFormAsMap.remove("org_FullTitle");
            decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
            decoratedFormAsMap.clearFileLoadField("EGRULDocLoad");
        }

         if("1".equalsIgnoreCase(form.getApplType()) && "on".equalsIgnoreCase(form.getDov_enable())) {
         decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
         decoratedFormAsMap.clearFileLoadField("dovUlPasLoad");

         decoratedFormAsMap.remove("org_opf");
         decoratedFormAsMap.remove("otherAddress");
            decoratedFormAsMap.remove("org_phone");
            decoratedFormAsMap.remove("org_fax");
            decoratedFormAsMap.remove("org_email");
            decoratedFormAsMap.remove("org_firstName");
            decoratedFormAsMap.remove("org_lastName");
            decoratedFormAsMap.remove("org_middleName");
            decoratedFormAsMap.remove("org_InnUl");
            decoratedFormAsMap.remove("org_FullTitle");
            decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
            decoratedFormAsMap.clearFileLoadField("EGRULDocLoad");
        }

         if("2".equalsIgnoreCase(form.getApplType()) && "1".equalsIgnoreCase(form.getDovUlType())) {
         decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
         decoratedFormAsMap.clearFileLoadField("dovDovLoad");
         decoratedFormAsMap.clearFileLoadField("dovPasLoad");
            decoratedFormAsMap.remove("address");
            decoratedFormAsMap.remove("phone");
            decoratedFormAsMap.remove("email");
            decoratedFormAsMap.remove("otherDocTypeName");
            decoratedFormAsMap.remove("identityDocType");
            decoratedFormAsMap.remove("passSeria");
            decoratedFormAsMap.remove("passNo");
            decoratedFormAsMap.clearFileLoadField("passDate");
            decoratedFormAsMap.clearFileLoadField("passFrom");
                     decoratedFormAsMap.clearFileLoadField("identityDocLoad");
         decoratedFormAsMap.clearFileLoadField("EGRIPDocLoad");
             decoratedFormAsMap.remove("inn");
        }

                 if("2".equalsIgnoreCase(form.getApplType()) && "2".equalsIgnoreCase(form.getDovUlType())) {
         decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
         decoratedFormAsMap.clearFileLoadField("dovDovLoad");
         decoratedFormAsMap.clearFileLoadField("dovPasLoad");
            decoratedFormAsMap.remove("address");
            decoratedFormAsMap.remove("phone");
            decoratedFormAsMap.remove("email");
            decoratedFormAsMap.remove("otherDocTypeName");
            decoratedFormAsMap.remove("identityDocType");
            decoratedFormAsMap.remove("passSeria");
            decoratedFormAsMap.remove("passNo");
            decoratedFormAsMap.clearFileLoadField("passDate");
            decoratedFormAsMap.clearFileLoadField("passFrom");
                     decoratedFormAsMap.clearFileLoadField("identityDocLoad");
         decoratedFormAsMap.clearFileLoadField("EGRIPDocLoad");
             decoratedFormAsMap.remove("inn");
        }

        return formAsMap;
    }

}