package com.nvision.pgu.web.services.s36400202;

import com.nvision.pgu.core.annotations.ServiceController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RequestMapping("/services/s" + Service36400202Controller.SERVICE_ID)
@ServiceController(id = Service36400202Controller.SERVICE_ID, title = "Выплата пособия по беременности и родам, единовременного пособия женщинам, вставшим на учет в медицинских учреждениях в ранние сроки беременности")
@Version("0.0.0.7")
public class Service36400202Controller extends AbstractServiceOrderControllerEDS24<Service36400202Form> {
    public static final Logger LOGGER = LoggerFactory.getLogger(Service36400202Controller.class);
    /**
     * id Получение субсидий на поддержку элитного семеноводства
     */
    public static final int SERVICE_ID = 36400202;
    public static String region = "";
    public static final String XML_PREFIX = "req";

    @Autowired
    private Service36400202FormValidator validator;

    public Service36400202Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о лице, нуждающемся в государственной услуге",
				"Сведения об оказываемой услуге",
				"Сведения о способе получения пособия",
				"Соглашения с заявителем"
            );
        setStepList(stepList);
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400202Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
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
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400202Form form, boolean goback, Map<String, Object> model) {
           StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

            if(stepProcessingResult.getStepNum() == 2) {
                if("off".equalsIgnoreCase(form.getIncapable_enable())) {
                    if("off".equalsIgnoreCase(form.getDov_enable())) {
                        stepProcessingResult = new StepProcessingResult(2, "step2fisnodov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2fisdov.html");
                    }
                } else {
                    if("off".equalsIgnoreCase(form.getDov_enable())) {
                        stepProcessingResult = new StepProcessingResult(2, "step2opeknodov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2opekdov.html");
                    }
                }
            }
            if(stepProcessingResult.getStepNum() == 3) {
                if("off".equalsIgnoreCase(form.getIncapable_enable())) {
                    if(!goback) {
                        stepProcessingResult.setStepNum(4);
                    } else {
                        if("off".equalsIgnoreCase(form.getDov_enable())) {
                            stepProcessingResult = new StepProcessingResult(2, "step2fisnodov.html");
                        } else {
                            stepProcessingResult = new StepProcessingResult(2, "step2fisdov.html");
                        }
                    }
                }
            }

        return stepProcessingResult;
    }

   private void clearRecOpekDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovOpekLoad");
   }

   private void clearRecOpekFields(FormAsMap FAM) {
       FAM.remove("recipientLastName");
       FAM.remove("recipientFirstName");
       FAM.remove("recipientMiddleName");
       FAM.remove("recipientBirthdate");
       FAM.remove("recipientpoliticalNationality");
       FAM.remove("recipientaddress");
       FAM.remove("recFactAddress");
       FAM.remove("addressRecReg");
       FAM.remove("recipientIentityDocType");
       FAM.remove("recipientOtherDocTypeName");
       FAM.remove("recipientPassSeria");
       FAM.remove("recipientPassNo");
       FAM.remove("recipientPassDate");
       FAM.remove("recipientPassFrom");
       FAM.clearFileLoadField("recipientIdentityDocLoad");
   }

   private void clearDovFields(FormAsMap FAM) {
       FAM.clearFileLoadField("dovDovLoad");
       FAM.clearFileLoadField("dovPasLoad");
   }

   private void clearRecipientFields(FormAsMap FAM) {
    FAM.remove("address");
    FAM.remove("factAddress");
    FAM.remove("birthdate");
    FAM.remove("politicalNationality");

   }

   @Override
   protected Map<String, Object> formToMap(Service36400202Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
       Map<String, Object> formAsMap = super.formToMap(form);
       FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

      if("5".equalsIgnoreCase(form.getIdentityDocType())) {
          formAsMap.put("identityDocType", form.getOtherDocTypeName());
      }

      if("5".equalsIgnoreCase(form.getRecipientOtherDocTypeName())) {
          formAsMap.put("recipientIentityDocType", form.getRecipientOtherDocTypeName());
      }

       if("off".equalsIgnoreCase(form.getIncapable_enable())) {
            clearRecOpekFields(decoratedFormAsMap);
           clearRecOpekDovFields(decoratedFormAsMap);
       }

       if("off".equalsIgnoreCase(form.getDov_enable())) {
            clearRecipientFields(decoratedFormAsMap);

            clearDovFields(decoratedFormAsMap);
       }

       if("off".equalsIgnoreCase(form.getDismissedCh())) {
            decoratedFormAsMap.remove("workLastName");
            decoratedFormAsMap.remove("workFirstName");
            decoratedFormAsMap.remove("workMiddleName");
            decoratedFormAsMap.remove("workBirthdate");
       }

       if("2".equalsIgnoreCase(form.getGoalAppl())) {
           decoratedFormAsMap.clearFileLoadField("socDocLoad");
       }

       if("1".equalsIgnoreCase(form.getGoalAppl())) {
           decoratedFormAsMap.clearFileLoadField("womanDocLoad");
           decoratedFormAsMap.clearFileLoadField("socMedDocLoad");
       }

       if("2".equalsIgnoreCase(form.getWayBenefit())) {
            decoratedFormAsMap.remove("addressBenefit");
       }

       if("1".equalsIgnoreCase(form.getWayBenefit())) {
           decoratedFormAsMap.remove("nameBankBenefit");
           decoratedFormAsMap.remove("filialBankBenefit");
           decoratedFormAsMap.remove("bikBankBenefit");
           decoratedFormAsMap.remove("corrAccBankBenefit");
           decoratedFormAsMap.remove("codeFilialBankBenefit");
           decoratedFormAsMap.remove("clientAccBankBenefit");
       }

       if("1".equalsIgnoreCase(form.getPoliticalNationality())) {
            decoratedFormAsMap.clearFileLoadField("foreignerDocLoad");
            decoratedFormAsMap.clearFileLoadField("residenceDocLoad");
            decoratedFormAsMap.clearFileLoadField("refugeeDocLoad");
       }

       if("2".equalsIgnoreCase(form.getPoliticalNationality())) {
           decoratedFormAsMap.clearFileLoadField("refugeeDocLoad");
       }

       if("3".equalsIgnoreCase(form.getPoliticalNationality())) {
           decoratedFormAsMap.clearFileLoadField("refugeeDocLoad");
       }

       if("4".equalsIgnoreCase(form.getPoliticalNationality())) {
           decoratedFormAsMap.clearFileLoadField("foreignerDocLoad");
           decoratedFormAsMap.clearFileLoadField("residenceDocLoad");
       }

       if("1".equalsIgnoreCase(form.getRecipientpoliticalNationality())) {
           decoratedFormAsMap.clearFileLoadField("recRefugeeDocLoad");
       }

       if("2".equalsIgnoreCase(form.getRecipientpoliticalNationality())) {
           decoratedFormAsMap.clearFileLoadField("recRefugeeDocLoad");
       }

       if("3".equalsIgnoreCase(form.getRecipientpoliticalNationality())) {
           decoratedFormAsMap.clearFileLoadField("recRefugeeDocLoad");
       }

       if("4".equalsIgnoreCase(form.getRecipientpoliticalNationality())) {
           decoratedFormAsMap.clearFileLoadField("recResidenceDocLoad");
       }

       return formAsMap;
   }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400202Form form, Map<String, Object> model) {
        return Arrays.asList(
"identityDocLoad",
"foreignerDocLoad",
"residenceDocLoad",
"refugeeDocLoad",
"dovDovLoad",
"dovPasLoad",
"dovOpekLoad",
"recipientIdentityDocLoad",
"doc1",
"recResidenceDocLoad",
"recRefugeeDocLoad",
"disabilityDocLoad",
"employDocLoad",
"womanDocLoad",
"nalogDocLoad",
"unemployedDocLoad",
"socDocLoad",
"socMedDocLoad"                
        );
    }


    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

	@Override
    protected void initBinderInternal(WebDataBinder binder)
 	{
 		if (binder.getTarget() instanceof Service36400202Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400202Form createNewForm() {
 		return new Service36400202Form();
 	}

}