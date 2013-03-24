package com.nvision.pgu.web.services.s36400216;

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
@RequestMapping("/services/s" + Service36400216Controller.SERVICE_ID)
@ServiceController(id = Service36400216Controller.SERVICE_ID, title = "Признание помещений жилыми помещениями, жилых помещений пригодными (непригодными) для проживания и многоквартирных домов аварийными и подлежащими сносу или реконструкции или о признании необходимости проведения ремонтно-восстановительных работ")
@Version("1.0")
public class Service36400216Controller extends AbstractServiceOrderControllerEDS24<Service36400216Form> {
    /**
     * id Признание помещений жилыми помещениями, жилых помещений пригодными (непригодными) для проживания и многоквартирных домов аварийными и подлежащими сносу или реконструкции или о признании необходимости проведения ремонтно-восстановительных работ
     */
    public static final int SERVICE_ID = 36400216;


    @Autowired
    private Service36400216FormValidator validator;

    public Service36400216Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения об уполномоченном представителе",
				"Сведения о заявителе",
				"Сведения о жилом помещении",
				"Сведения об объекте недвижимости"
            );
        setStepList(stepList);
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400216Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
    super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

    if (stepProcessingResult.getStepNum() == 3 && (form.getDov_enable_changed().booleanValue() || form.getApplType_changed().booleanValue() || form.getDovUlType_changed().booleanValue())) {

        if("1".equalsIgnoreCase(form.getApplType()) && "off".equalsIgnoreCase(form.getDov_enable())) {
            form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
        } else {
            form.clearApplicantAttributes();
        }

        form.setDov_enable_changed(false);
        form.setApplType_changed(false);
        form.setDovUlType_changed(false);
    }
    }


    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400216Form form, boolean goback, Map<String, Object> model) {
           StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

            // Обход второго шага по условию
            if(stepProcessingResult.getStepNum() == 2)
            if(!goback) {
                // Вперёд
                if("1".equalsIgnoreCase(form.getApplType())) {
                    // Физик
                    if("off".equalsIgnoreCase(form.getDov_enable())) {
                        stepProcessingResult = new StepProcessingResult(3, "step3fisnodov.html");
                    }
                } else {
                    // Юрик
                    if("1".equalsIgnoreCase(form.getDovUlType())) {
                        stepProcessingResult = new StepProcessingResult(3, "step3ulnodov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(3, "step3uldov.html");
                    }
                }

            } else {
                // назад
                if (("1".equalsIgnoreCase(form.getApplType()) && "off".equalsIgnoreCase(form.getDov_enable()) ) || "2".equalsIgnoreCase(form.getApplType())) {
                    stepProcessingResult.setStepNum(1);
                }

            }

            if(stepProcessingResult.getStepNum() == 3) {

                if("1".equalsIgnoreCase(form.getApplType())) {
                    // Физик
                    if("off".equalsIgnoreCase(form.getDov_enable())) {
                        stepProcessingResult = new StepProcessingResult(3, "step3fisnodov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(3, "step3fisdov.html");
                    }
                } else {
                    // Юрик
                    if("1".equalsIgnoreCase(form.getDovUlType())) {
                        stepProcessingResult = new StepProcessingResult(3, "step3ulnodov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(3, "step3uldov.html");
                    }
                }
            }

        return stepProcessingResult;
    }

    private void clearFisDovFields(FormAsMap FAM) {
         FAM.clearFileLoadField("dovDovLoad");
         FAM.clearFileLoadField("dovPasLoad");
         FAM.remove("docType");
         FAM.remove("dovNo");
         FAM.remove("dovDate");
    }

     private void clearFisFields(FormAsMap FAM) {
         FAM.remove("phone");
         FAM.remove("email");
         FAM.remove("identityDocType");
         FAM.remove("passSeria");
         FAM.remove("passNo");
         FAM.remove("passDate");
         FAM.remove("passFrom");
         FAM.clearFileLoadField("identityDocLoad");
         clearFisDovFields(FAM);
     }


     private void clearUlDovFields(FormAsMap FAM) {
         FAM.clearFileLoadField("dovUlDovLoad");
     }

     private void clearUlNoDovFields(FormAsMap FAM) {
         FAM.clearFileLoadField("dovUlNonDovLoad");
     }

     private void clearUlFields(FormAsMap FAM) {
         FAM.remove("dovUlType");
         FAM.remove("org_FullTitle");
         FAM.remove("org_opf");
         FAM.remove("org_SmallTitle");
         FAM.remove("org_phone");
         FAM.remove("org_email");

         FAM.clearFileLoadField("dovUlPasLoad");

         clearUlDovFields(FAM);
         clearUlNoDovFields(FAM);
     }

    @Override
    protected Map<String, Object> formToMap(Service36400216Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

       decoratedFormAsMap.clearForOrdering();

       if("5".equalsIgnoreCase(form.getIdentityDocType())) {
           formAsMap.put("identityDocType", form.getOtherDocTypeName());
       }


       if("1".equalsIgnoreCase(form.getApplType())) {
           // Физик
           clearUlFields(decoratedFormAsMap);
           if("off".equalsIgnoreCase(form.getDov_enable())) {
              // Без доверенности
               clearFisDovFields(decoratedFormAsMap);
           }
       } else {
           // Юрик

           formAsMap.put("firstName", this.getPrivateRoomDataContainer().getFirstName());
           formAsMap.put("lastName", this.getPrivateRoomDataContainer().getLastName());
           formAsMap.put("middleName", this.getPrivateRoomDataContainer().getMiddleName());

           clearFisFields(decoratedFormAsMap);
           if("1".equalsIgnoreCase(form.getDovUlType())) {
               // Без доверенности
               clearUlDovFields(decoratedFormAsMap);
           } else {
               // по доверенности
               clearUlNoDovFields(decoratedFormAsMap);
           }
       }

        if(form.getBasisFlat() == "1") {
            decoratedFormAsMap.clearFileLoadField("socDocLoad");
        }

        return formAsMap;
    }


    @Override
    protected List<String> getFormFieldsWithFiles(Service36400216Form form, Map<String, Object> model) {

        return Arrays.asList(
                "identityDocLoad",
                "dovDovLoad",
                "dovPasLoad",
                "dovUlNonDovLoad",
                "dovUlPasLoad",
                "dovUlDovLoad",
                "socDocLoad",
                "egrpDocLoad",
                "techDocLoad",
                "actDocLoad",
                "gosDocLoad"

            );

    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

	@Override
    protected void initBinderInternal(WebDataBinder binder)
 	{
 		if (binder.getTarget() instanceof Service36400216Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400216Form createNewForm() {
 		return new Service36400216Form();
 	}

}