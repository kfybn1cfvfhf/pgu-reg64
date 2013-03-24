package com.nvision.pgu.web.services.s36400120;

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
@RequestMapping("/services/s" + Service36400120Controller.SERVICE_ID)
@ServiceController(id = Service36400120Controller.SERVICE_ID, title = "Учет граждан, обратившихся за предоставлением жилого помещения по договору социального найма из государственного жилищного фонда области")
@Version("1.6")

public class Service36400120Controller extends AbstractServiceOrderControllerEDS24<Service36400120Form> {
    /**
     * id Учет граждан, обратившихся за предоставлением жилого помещения по договору социального найма из государственного жилищного фонда области
     */
    public static final int SERVICE_ID = 36400120;


    @Autowired
    private Service36400120FormValidator validator;

    public Service36400120Controller() {
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о лице, нуждающемся в государственной услуге",
				"Сведения о составе семьи",
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
 		if (binder.getTarget() instanceof Service36400120Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400120Form createNewForm() {
 		return new Service36400120Form();
 	}

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400120Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if ((form.getDov_enable_changed().booleanValue() || form.getIncapable_enable_changed().booleanValue())) {
            if (stepProcessingResult.getStepNum() == 2 && "off".equalsIgnoreCase(form.getDov_enable())) {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            } else {
                form.clearApplicantAttributes();
            }
            form.setDov_enable_changed(false);
            form.setIncapable_enable_changed(false);
        }
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400120Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);


if (stepProcessingResult.getStepNum()==2){
        if ("off".equalsIgnoreCase(form.getDov_enable())) {         //без доверенности
                    if("off".equalsIgnoreCase(form.getIncapable_enable())) {
                        // Физик
                        stepProcessingResult = new StepProcessingResult(2, "step2persnondov.html");
                    } else {
                        if ("1".equals(form.getDovCategory())) {             //родитель
                            stepProcessingResult = new StepProcessingResult(2, "step2persnondov.html");
                        } else {
                            stepProcessingResult = new StepProcessingResult(2, "step2opeknondov.html");
                        }
                    }
                } else {
                    if("off".equalsIgnoreCase(form.getIncapable_enable())) { //по доверенности
                        // Физик
                        stepProcessingResult = new StepProcessingResult(2, "step2persdov.html");
                    } else {
                        if ("1".equals(form.getDovCategory())) {             //родитель
                            stepProcessingResult = new StepProcessingResult(2, "step2persdov.html");
                        } else {
                            stepProcessingResult = new StepProcessingResult(2, "step2opekdov.html");
                        }
                    }
                }
        }

         if (stepProcessingResult.getStepNum()==3){
                         if(!goback){
                if ("on".equalsIgnoreCase(form.getIncapable_enable())) {
                    stepProcessingResult = new StepProcessingResult(3,"step3.html");

                }else{
                 if("on".equalsIgnoreCase(form.getLonelyCh())){
                  stepProcessingResult = new StepProcessingResult(5,"step5.html");
                 }else{
                  stepProcessingResult = new StepProcessingResult(4,"step4.html");
                 }
                }
                }else{
                  if ("on".equalsIgnoreCase(form.getIncapable_enable())) {
                    stepProcessingResult = new StepProcessingResult(3,"step3.html");

                }else{
                  if ("off".equalsIgnoreCase(form.getDov_enable())) {         //без доверенности
                    if("off".equalsIgnoreCase(form.getIncapable_enable())) {
                        // Физик
                        stepProcessingResult = new StepProcessingResult(2, "step2persnondov.html");
                    } else {
                        if ("1".equals(form.getDovCategory())) {             //родитель
                            stepProcessingResult = new StepProcessingResult(2, "step2persnondov.html");
                        } else {
                            stepProcessingResult = new StepProcessingResult(2, "step2opeknondov.html");
                        }
                    }
                } else {
                    if("off".equalsIgnoreCase(form.getIncapable_enable())) { //по доверенности
                        // Физик
                        stepProcessingResult = new StepProcessingResult(2, "step2persdov.html");
                    } else {
                        if ("1".equals(form.getDovCategory())) {             //родитель
                            stepProcessingResult = new StepProcessingResult(2, "step2persdov.html");
                        } else {
                            stepProcessingResult = new StepProcessingResult(2, "step2opekdov.html");
                        }
                    }
                }
                }
                }
         }

         if (stepProcessingResult.getStepNum()==4){
         if(goback){
         if("on".equalsIgnoreCase(form.getLonelyCh())){
                   if ("on".equalsIgnoreCase(form.getIncapable_enable())) {
                    stepProcessingResult = new StepProcessingResult(3,"step3.html");

                }else{
                   if ("off".equalsIgnoreCase(form.getDov_enable())) {         //без доверенности
                    if("off".equalsIgnoreCase(form.getIncapable_enable())) {
                        // Физик
                        stepProcessingResult = new StepProcessingResult(2, "step2persnondov.html");
                    } else {
                        if ("1".equals(form.getDovCategory())) {             //родитель
                            stepProcessingResult = new StepProcessingResult(2, "step2persnondov.html");
                        } else {
                            stepProcessingResult = new StepProcessingResult(2, "step2opeknondov.html");
                        }
                    }
                } else {
                    if("off".equalsIgnoreCase(form.getIncapable_enable())) { //по доверенности
                        // Физик
                        stepProcessingResult = new StepProcessingResult(2, "step2persdov.html");
                    } else {
                        if ("1".equals(form.getDovCategory())) {             //родитель
                            stepProcessingResult = new StepProcessingResult(2, "step2persdov.html");
                        } else {
                            stepProcessingResult = new StepProcessingResult(2, "step2opekdov.html");
                        }
                    }
                }
                   }
                 }else{
                  stepProcessingResult = new StepProcessingResult(4,"step4.html");
                 }
         }else if(!goback)
             {
                if("on".equalsIgnoreCase(form.getLonelyCh())){
                  stepProcessingResult = new StepProcessingResult(5,"step5.html");
                } else {
                     stepProcessingResult = new StepProcessingResult(4,"step4.html");
                }
             }
         }




        return stepProcessingResult;
    }

    private void clearDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovDovLoad");
        FAM.clearFileLoadField("dovPasLoad");
    }

    private void clearOpekFields(FormAsMap FAM) {
        FAM.remove("dovCategory");
        FAM.clearFileLoadField("dovOpekLoad");
        FAM.remove("recipientLastName");
        FAM.remove("recipientFirstName");
        FAM.remove("recipientMiddleName");
        FAM.remove("recipientSnils");
        FAM.remove("recipientAddress");
        FAM.remove("recipientIdentityDocType");
        FAM.remove("recipientOtherDocTypeName");
        FAM.remove("recipientPassSeria");
        FAM.remove("recipientPassNo");
        FAM.remove("recipientPassDate");
        FAM.remove("recipientPassFrom");
        FAM.clearFileLoadField("recipientIdentityDocLoad");
    }

    @Override
    protected Map<String, Object> formToMap(Service36400120Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

        decoratedFormAsMap.clearForOrdering();


        if ("off".equalsIgnoreCase(form.getDov_enable())) {         //без доверенности
            clearDovFields(decoratedFormAsMap);
        }
        if("off".equalsIgnoreCase(form.getIncapable_enable())) {
            clearOpekFields(decoratedFormAsMap);                // Физик
        }

        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400120Form form, Map<String, Object> model) {
        return Arrays.asList(
        "identityDocLoad",
        "dovDovLoad",
        "dovPasLoad",
        "dovOpekLoad",
        "recipientIdentityDocLoad",
        "fam_member_identityDocLoad",
        "fam_member_kinDocLoad",
        "regDocLoad",
        "techDocLoad",
        "rightDocLoad",
        "incomeDocLoad",
        "otherDocLoad",
        "gosRegDocLoad",
        "opfDocLoad",
        "socDocLoad",
        "egrpDocLoad",
        "gosRegChangeDocLoad",
        "dogovorDocLoad"
        );
    }

}