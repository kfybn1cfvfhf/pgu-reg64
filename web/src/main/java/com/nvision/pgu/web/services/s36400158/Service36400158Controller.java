package com.nvision.pgu.web.services.s36400158;

import ru.lanit.samara.pgu.core.controllers.blocks.AbstractServiceOrderControllerEDS24;
import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/services/s" + Service36400158Controller.SERVICE_ID)
@ServiceController(id = Service36400158Controller.SERVICE_ID, title = "Подтверждение документов государственного образца об образовании, ученых степенях и ученых званиях")
@Version("1.6.1")
public class Service36400158Controller extends AbstractServiceOrderControllerEDS24<Service36400158Form> {
    /**
     * id Подтверждение документов государственного образца об образовании, ученых степенях и ученых званиях
     */
    public static final int SERVICE_ID = 36400158;


    @Autowired
    private Service36400158FormValidator validator;

    public Service36400158Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о представителе заявителя",
				"Сведения о заявителе",
				"Сведения, необходимые для предоставления услуги"
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
 		if (binder.getTarget() instanceof Service36400158Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400158Form createNewForm() {
 		return new Service36400158Form();
 	}

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400158Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

         if(stepProcessingResult.getStepNum() == 2) {
            if(!goback){
            if ("on".equalsIgnoreCase(form.getDov_enable())) {
            stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
            }else{
            stepProcessingResult = new StepProcessingResult(3, "step3-2.html");
            }
            }else{
            if ("on".equalsIgnoreCase(form.getDov_enable())) {
            stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
            }else{
            stepProcessingResult = new StepProcessingResult(1, "step1.html");
            }
            }
         }

            if(stepProcessingResult.getStepNum() == 3) {
            if ("on".equalsIgnoreCase(form.getDov_enable())) {
            stepProcessingResult = new StepProcessingResult(3, "step3-4.html");
            }else{
            stepProcessingResult = new StepProcessingResult(3, "step3-2.html");
            }
            }

      return stepProcessingResult;
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400158Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (stepProcessingResult.getStepNum() == 3 && form.getDov_enable_changed().booleanValue()) {

            if ("off".equalsIgnoreCase(form.getDov_enable())) {

                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            } else {
                form.clearApplicantAttributes();
            }

            form.setDov_enable_changed(false);
        }
    }

    @Override
          protected Map<String, Object> formToMap(Service36400158Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
              Map<String, Object> formAsMap = super.formToMap(form);
              FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);
              decoratedFormAsMap.clearForOrdering();

           if ("off".equals(form.getDov_enable())) {
           decoratedFormAsMap.remove("dovLastName");
           decoratedFormAsMap.remove("dovFirstName");
           decoratedFormAsMap.remove("dovMiddleName");
           decoratedFormAsMap.remove("dovPlace");
           decoratedFormAsMap.remove("dovDate");
           decoratedFormAsMap.remove("dovSeria");
           decoratedFormAsMap.remove("dovNumber");
           decoratedFormAsMap.remove("dovRegNumber");
           decoratedFormAsMap.remove("dovIdentityDocType");
           decoratedFormAsMap.remove("dovOtherDocTypeName");
           decoratedFormAsMap.remove("dovPassSeria");
           decoratedFormAsMap.remove("dovPassNo");
           decoratedFormAsMap.remove("dovPassDate");
           decoratedFormAsMap.remove("dovPassFrom");
           decoratedFormAsMap.clearFileLoadField("dovDovLoad");
           decoratedFormAsMap.clearFileLoadField("dovPasLoad");
           }

           if ("1".equals(form.getWayObtain())) {
           decoratedFormAsMap.remove("addressPostCountryBenefit");
           decoratedFormAsMap.remove("addressPostIndexBenefit");
           decoratedFormAsMap.remove("addressPostEnterTypeBenefit");
           decoratedFormAsMap.remove("addressPostRegionBenefit");
           decoratedFormAsMap.remove("addressPostRayonBenefit");
           decoratedFormAsMap.remove("addressPostSettlementTypeBenefit");
           decoratedFormAsMap.remove("addressPostCityBenefit");
           decoratedFormAsMap.remove("addressPostSettlementTextBenefit");
           decoratedFormAsMap.remove("addressPostSettlementDictBenefit");
           decoratedFormAsMap.remove("addressPostStreetTextBenefit");
           decoratedFormAsMap.remove("addressPostStreetDictBenefit");
           decoratedFormAsMap.remove("addressPostHouseBenefit");
           decoratedFormAsMap.remove("addressPostKorpusBenefit");
           decoratedFormAsMap.remove("addressPostFlatBenefit");
           }

         if("5".equalsIgnoreCase(form.getIdentityDocType())) {
            decoratedFormAsMap.put("identityDocType", form.getOtherDocTypeName());
        } else {
            decoratedFormAsMap.put("identityDocType", form.getIdentityDocType());
        }

         if("5".equalsIgnoreCase(form.getDovIdentityDocType())) {
            decoratedFormAsMap.put("dovIdentityDocType", form.getDovOtherDocTypeName());
        } else {
            decoratedFormAsMap.put("dovIdentityDocType", form.getDovIdentityDocType());
        }

           return formAsMap;

    }
     @Override
    protected List<String> getFormFieldsWithFiles(Service36400158Form form, Map<String, Object> model) {
    return Arrays.asList(
    "identityDocLoad",
    "dovDovLoad",
    "dovPasLoad",
    "surnameDocLoad",
    "eduDocLoad",
    "edu1DocLoad",
    "apostilDocLoad"
        );
    }
}