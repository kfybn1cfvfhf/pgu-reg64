package com.nvision.pgu.web.services.s36400214;

import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/services/s" + Service36400214Controller.SERVICE_ID)
@ServiceController(id = Service36400214Controller.SERVICE_ID, title = "Предоставление выписок и сведений из реестра государственного имущества Саратовской области по запросам граждан и юридических лиц")
@Version("0.5")
public class Service36400214Controller extends AbstractServiceOrderControllerEDS24<Service36400214Form> {
    /**
     * id Предоставление выписок и сведений из реестра государственного имущества Саратовской области по запросам граждан и юридических лиц
     */
    public static final int SERVICE_ID = 36400214;


    @Autowired
    private Service36400214FormValidator validator;

    public Service36400214Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения об уполномоченном представителе",
				"Сведения о заявителе",
				"Информация о месте нахождения объекта недвижимости",
				"Сведения о способе получения информации (результата оказания услуги)"
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
 		if (binder.getTarget() instanceof Service36400214Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400214Form createNewForm() {
 		return new Service36400214Form();
 	}

    @Override
        protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400214Form form, boolean goback, Map<String, Object> model) {
               StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

                if(stepProcessingResult.getStepNum() == 2) {

                    if("1".equalsIgnoreCase(form.getApplType())) {
                        // Физик

                        if("off".equalsIgnoreCase(form.getDov_enable())) {
                            if(!goback){
                            stepProcessingResult = new StepProcessingResult(3, "step3-2.html");
                            }else{
                            stepProcessingResult = new StepProcessingResult(1, "step1.html");
                            }
                        } else {
                            stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
                        }
                    } else {
                        // Юрик
                        if(!goback){
                        if("1".equalsIgnoreCase(form.getDovUlType())) {
                            stepProcessingResult = new StepProcessingResult(3, "step3-4.html");
                        } else {
                            stepProcessingResult = new StepProcessingResult(3, "step3-5.html");
                        }}else{
                        stepProcessingResult = new StepProcessingResult(1, "step1.html");
                        }
                    }
                }

         if(stepProcessingResult.getStepNum() == 3) {
          if("1".equalsIgnoreCase(form.getApplType())) {
                        // Физик
          if("off".equalsIgnoreCase(form.getDov_enable())) {
          stepProcessingResult = new StepProcessingResult(3, "step3-2.html");
                        } else {
                            if(!goback){
                            stepProcessingResult = new StepProcessingResult(4, "step4.html");
                            } else {
                            stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
                            }
                        }
         }else{
            if("1".equalsIgnoreCase(form.getDovUlType())) {
                            stepProcessingResult = new StepProcessingResult(3, "step3-4.html");
                        } else {
                            stepProcessingResult = new StepProcessingResult(3, "step3-5.html");
                        }
          }
         }

            return stepProcessingResult;
        }

            @Override
    protected void patchModelAndFormOnStepProcessing(Service36400214Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
    super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

    if ((stepProcessingResult.getStepNum() == 2 || stepProcessingResult.getStepNum()==3) && (form.getDov_enable_changed().booleanValue() || form.getApplType_changed().booleanValue() || form.getDovUlType_changed().booleanValue())) {

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


    private void clearFisDovFields(FormAsMap FAM) {
         FAM.clearFileLoadField("dovDovLoad");
         FAM.clearFileLoadField("dovPasLoad");
    }

     private void clearFisFields(FormAsMap FAM) {
         FAM.remove("dov_enable");
         FAM.remove("phone");
         FAM.remove("email");
         FAM.remove("identityDocType");
         FAM.remove("passSeria");
         FAM.remove("passNo");
         FAM.remove("passDate");
         FAM.remove("passFrom");
         FAM.clearFileLoadField("identityDocLoad");

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
         FAM.remove("org_phone");
         FAM.remove("org_fax");
         FAM.remove("org_email");
         FAM.clearFileLoadField("dovUiPasLoad");
         FAM.clearFileLoadField("orderDocLoad");
     }

   @Override
    protected Map<String, Object> formToMap(Service36400214Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

       decoratedFormAsMap.clearForOrdering();

       if("5".equalsIgnoreCase(form.getIdentityDocType())) {
           formAsMap.put("identityDocType", form.getOtherDocTypeName());
       }


       if("1".equalsIgnoreCase(form.getApplType())) {
           // Физик
         clearUlFields(decoratedFormAsMap);
         clearUlDovFields(decoratedFormAsMap);
         clearUlNoDovFields(decoratedFormAsMap);
           if("off".equalsIgnoreCase(form.getDov_enable())) {
              // Без доверенности
            clearFisDovFields(decoratedFormAsMap);
           }
       } else {
           // Юрик
            clearFisFields(decoratedFormAsMap);
           if("1".equalsIgnoreCase(form.getDovUlType())) {
               // Без доверенности
               clearUlDovFields(decoratedFormAsMap);
           } else {
               // по доверенности
             clearUlNoDovFields(decoratedFormAsMap);
           }
       }

        return formAsMap;
    }


    @Override
    protected List<String> getFormFieldsWithFiles(Service36400214Form form, Map<String, Object> model) {

        return Arrays.asList(
                "identityDocLoad",
                "dovDovLoad",
                "dovPasLoad",
                "dovUlNonDovLoad",
                "dovUlPasLoad",
                "dovUlDovLoad",
                "dovApplicantDoc"
            );

    }


}