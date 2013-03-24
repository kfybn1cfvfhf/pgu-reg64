package com.nvision.pgu.web.services.s36400007;

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
@RequestMapping("/services/s" + Service36400007Controller.SERVICE_ID)
@ServiceController(id = Service36400007Controller.SERVICE_ID, title = "Предоставление лицензии на осуществление медицинской деятельности")
@Version("1.4.1")
public class Service36400007Controller extends AbstractServiceOrderControllerEDS24<Service36400007Form> {
    /**
     * id Предоставление лицензии на осуществление медицинской деятельности
     */
    public static final int SERVICE_ID = 36400007;


    @Autowired
    private Service36400007FormValidator validator;

    public Service36400007Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Объекты лицензирования и электронные копии документов"
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
 		if (binder.getTarget() instanceof Service36400007Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400007Form createNewForm() {
 		return new Service36400007Form();
 	}

     @Override
    protected void patchModelAndFormOnStepProcessing(Service36400007Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
         super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

         if (stepProcessingResult.getStepNum() == 2 && (form.getDov_enable_changed().booleanValue() || form.getApplType_changed().booleanValue() || form.getDovUlType_changed().booleanValue())) {

            if(("1".equalsIgnoreCase(form.getApplType()) && "off".equalsIgnoreCase(form.getDov_enable())) ||
                    ("2".equalsIgnoreCase(form.getApplType()))) {
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
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400007Form form, boolean goback, Map<String, Object> model) {
     StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

      if (stepProcessingResult.getStepNum() == 2){
      if("1".equalsIgnoreCase(form.getApplType()))
      {
      if("off".equalsIgnoreCase(form.getDov_enable()))
      {
       stepProcessingResult = new StepProcessingResult(2, "step2-2.html");
      } else {
      stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
      }
      }else{
        if("1".equalsIgnoreCase(form.getDovUlType())) {
      stepProcessingResult = new StepProcessingResult(2, "step2-4.html");
                    } else {
      stepProcessingResult = new StepProcessingResult(2, "step2-5.html");
                    }
      }

      }

      if (stepProcessingResult.getStepNum() == 3){
      if("1".equalsIgnoreCase(form.getApplType())){
      stepProcessingResult = new StepProcessingResult(3, "step3-6.html");
      }else{
      stepProcessingResult = new StepProcessingResult(3, "step3-7.html");
      }
      }

      return stepProcessingResult;
     }

      @Override
    protected Map<String, Object> formToMap(Service36400007Form form) {
          Map<String, Object> formAsMap = super.formToMap(form);
          FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);
          decoratedFormAsMap.clearForOrdering();

                 if("5".equalsIgnoreCase(form.getIdentityDocType())) {
                     decoratedFormAsMap.put("identityDocType", form.getOtherDocTypeName());
                 }

                 if("off".equalsIgnoreCase(form.getDov_enable())){
                 decoratedFormAsMap.clearFileLoadField("dovDovLoad");
                 decoratedFormAsMap.clearFileLoadField("dovPasLoad");
                 }
                 if("1".equalsIgnoreCase(form.getApplType())){
                 decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
                 decoratedFormAsMap.clearFileLoadField("dovUlPasLoad");
                 decoratedFormAsMap.remove("dovUlType");
                 decoratedFormAsMap.remove("org_InnUl");
                 decoratedFormAsMap.remove("org_FullTitle");
                 decoratedFormAsMap.remove("org_SmallTitle");
                 decoratedFormAsMap.remove("org_FirmNazTitle");
                 decoratedFormAsMap.remove("org_OgrnUl");
                 }else{
                  decoratedFormAsMap.remove("dov_enable");
                  decoratedFormAsMap.remove("passSeria");
                  decoratedFormAsMap.remove("passNo");
                  decoratedFormAsMap.remove("passDate");
                  decoratedFormAsMap.remove("passFrom");
                 decoratedFormAsMap.clearFileLoadField("identityDocLoad");
                 decoratedFormAsMap.clearFileLoadField("docMvRegIPLoad");
                 decoratedFormAsMap.clearFileLoadField("docMvRegFNSLoad");
                 }

                 if("on".equalsIgnoreCase(form.getOwnership())) {
                 decoratedFormAsMap.clearFileLoadField("load_doc4");
                 }else{
                 decoratedFormAsMap.clearFileLoadField("load_doc5");
                 }
    return formAsMap;
      }

        protected List<String> getFormFieldsWithFiles(Service36400007Form form, Map<String, Object> model) {
        return Arrays.asList(
    "identityDocLoad",
     "docMvRegIPLoad",
     "docMvRegULLoad",
      "founderDocLoad",
    "docMvRegFNSLoad",
    "dovUlNonDovLoad",
    "dovDovLoad",
    "dovPasLoad",
    "dovUlPasLoad",
    "dovUlDovLoad",
"load_doc1",
"load_doc2",
"load_doc4",
"load_doc6",
"load_doc7",
"load_doc8",
"load_doc9",
"load_doc3",
"load_doc5",
"load_doc10",
"load_doc11",
"load_doc12"
        );
    }

}