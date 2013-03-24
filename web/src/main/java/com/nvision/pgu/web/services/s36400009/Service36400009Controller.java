package com.nvision.pgu.web.services.s36400009;

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
@RequestMapping("/services/s" + Service36400009Controller.SERVICE_ID)
@ServiceController(id = Service36400009Controller.SERVICE_ID, title = "Переоформление лицензии на медицинскую деятельность")
@Version("1.5.3")
public class Service36400009Controller extends AbstractServiceOrderControllerEDS24<Service36400009Form> {
    /**
     * id Переоформление лицензии на медицинскую деятельность
     */
    public static final int SERVICE_ID = 36400009;


    @Autowired
    private Service36400009FormValidator validator;

    public Service36400009Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о причине переоформления лицензии индивидуального предпринимателя",
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
 		if (binder.getTarget() instanceof Service36400009Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400009Form createNewForm() {
 		return new Service36400009Form();
 	}


    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400009Form form, boolean goback, Map<String, Object> model) {
    StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

    switch (stepProcessingResult.getStepNum()){
    case 2:
    if ("1".equalsIgnoreCase(form.getApplType())) {
    if ("on".equalsIgnoreCase(form.getDov_enable())) {
        stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
    }else{
        stepProcessingResult = new StepProcessingResult(2, "step2-2.html");
    }
    }else{
    if ("1".equalsIgnoreCase(form.getDovUlType())) {
        stepProcessingResult = new StepProcessingResult(2, "step2-4.html");
    }else{
        stepProcessingResult = new StepProcessingResult(2, "step2-5.html");
    }
    }
    break;
    case 3:
    if ("1".equalsIgnoreCase(form.getApplType())) {
       stepProcessingResult = new StepProcessingResult(3, "step3-6.html");
    }else{
       stepProcessingResult = new StepProcessingResult(3, "step3-12.html");
    }
    break;
    case 4:
    if ("1".equalsIgnoreCase(form.getApplType())) {
    if ("1".equalsIgnoreCase(form.getReason_reIP())){
       stepProcessingResult = new StepProcessingResult(4, "step4-7.html");
    }
    else if("2".equalsIgnoreCase(form.getReason_reIP()) || "3".equalsIgnoreCase(form.getReason_reIP()) || "4".equalsIgnoreCase(form.getReason_reIP())){
       stepProcessingResult = new StepProcessingResult(4, "step4-8.html");
    }
    else if("5".equalsIgnoreCase(form.getReason_reIP())){
       stepProcessingResult = new StepProcessingResult(4, "step4-9.html");
    }
    else if("6".equalsIgnoreCase(form.getReason_reIP())){
       stepProcessingResult = new StepProcessingResult(4, "step4-10.html");
    }else{
       stepProcessingResult = new StepProcessingResult(4, "step4-11.html");
    }
    }else{
    if ("1".equalsIgnoreCase(form.getReason_reUL()) || "2".equalsIgnoreCase(form.getReason_reUL()) || "3".equalsIgnoreCase(form.getReason_reUL())){
       stepProcessingResult = new StepProcessingResult(4, "step4-13.html");
    }
    else if("4".equalsIgnoreCase(form.getReason_reUL())){
       stepProcessingResult = new StepProcessingResult(4, "step4-14.html");
    }
    else if("5".equalsIgnoreCase(form.getReason_reUL())){
       stepProcessingResult = new StepProcessingResult(4, "step4-15.html");
    }
    else if("6".equalsIgnoreCase(form.getReason_reUL())){
       stepProcessingResult = new StepProcessingResult(4, "step4-16.html");
    }
    else if("7".equalsIgnoreCase(form.getReason_reUL())){
       stepProcessingResult = new StepProcessingResult(4, "step4-17.html");
    }else{
       stepProcessingResult = new StepProcessingResult(4, "step4-18.html");
    }
    }
    }
     return stepProcessingResult;
    }

    @Override
        protected void patchModelAndFormOnStepProcessing(Service36400009Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
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
    protected Map<String, Object> formToMap(Service36400009Form form) {
     Map<String, Object> formAsMap = super.formToMap(form);
          FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);
          decoratedFormAsMap.clearForOrdering();

            if("5".equalsIgnoreCase(form.getIdentityDocType())) {
                     decoratedFormAsMap.put("identityDocType", form.getOtherDocTypeName());
                 }

           if("1".equalsIgnoreCase(form.getApplType())){
           decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
           decoratedFormAsMap.clearFileLoadField("dovUlPasLoad");
           decoratedFormAsMap.clearFileLoadField("docMvRegULLoad");
           decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
           decoratedFormAsMap.remove("org_FullTitle");
           decoratedFormAsMap.remove("org_opf");
           decoratedFormAsMap.remove("org_SmallTitle");
           decoratedFormAsMap.remove("org_FirmNazTitle");
           decoratedFormAsMap.remove("org_InnUl");
           decoratedFormAsMap.remove("org_OgrnUl");
           decoratedFormAsMap.remove("org_phone");
           decoratedFormAsMap.remove("org_email");
           decoratedFormAsMap.remove("documentNumberUL");
           decoratedFormAsMap.remove("dateIssueUL");
           decoratedFormAsMap.remove("issuingAuthorityUL");
           decoratedFormAsMap.remove("founderDocLabel");
           decoratedFormAsMap.remove("licenseNumberUL");
           decoratedFormAsMap.remove("startDateLicenseUL");
           decoratedFormAsMap.remove("nameLicensingAuthorityUL");
           decoratedFormAsMap.remove("reason_reUL");
           }
           if("2".equalsIgnoreCase(form.getApplType())){
           decoratedFormAsMap.clearFileLoadField("identityDocLoad");
           decoratedFormAsMap.clearFileLoadField("docMvRegIPLoad");
           decoratedFormAsMap.clearFileLoadField("docMvRegFNSLoad");
           decoratedFormAsMap.clearFileLoadField("dovDovLoad");
           decoratedFormAsMap.clearFileLoadField("dovPasLoad");
           decoratedFormAsMap.remove("licenseNumber");
           decoratedFormAsMap.remove("startDateLicense");
           decoratedFormAsMap.remove("nameLicensingAuthority");
           decoratedFormAsMap.remove("reason_reIP");
           decoratedFormAsMap.remove("documentBase");
           }
           if("off".equalsIgnoreCase(form.getDov_enable())){
           decoratedFormAsMap.clearFileLoadField("dovDovLoad");
           decoratedFormAsMap.clearFileLoadField("dovPasLoad");
           }
           if("1".equalsIgnoreCase(form.getDovUlType())){
           decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
           }
           if("2".equalsIgnoreCase(form.getDovUlType())){
           decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
           }


           if("1".equalsIgnoreCase(form.getReason_reIP())){
           decoratedFormAsMap.clearFileLoadField("load_doc15");
           decoratedFormAsMap.clearFileLoadField("load_doc2");
           decoratedFormAsMap.clearFileLoadField("load_doc14");
           decoratedFormAsMap.clearFileLoadField("load_doc15");
           decoratedFormAsMap.clearFileLoadField("load_doc16");
           decoratedFormAsMap.clearFileLoadField("load_doc18");
           decoratedFormAsMap.clearFileLoadField("load_doc20");
           decoratedFormAsMap.clearFileLoadField("load_doc21");
           decoratedFormAsMap.clearFileLoadField("load_doc22");
           decoratedFormAsMap.clearFileLoadField("load_doc23");
           decoratedFormAsMap.remove("documentNumber");
           decoratedFormAsMap.remove("dateIssue");
           decoratedFormAsMap.remove("issuingAuthority");
           } else if("2".equalsIgnoreCase(form.getReason_reIP()) || "3".equalsIgnoreCase(form.getReason_reIP()) || "4".equalsIgnoreCase(form.getReason_reIP())){
           decoratedFormAsMap.remove("ownership");
           decoratedFormAsMap.clearFileLoadField("load_doc1");
           decoratedFormAsMap.clearFileLoadField("load_doc4");
           decoratedFormAsMap.clearFileLoadField("load_doc6");
           decoratedFormAsMap.clearFileLoadField("load_doc7");
           decoratedFormAsMap.clearFileLoadField("load_doc9");
           decoratedFormAsMap.clearFileLoadField("load_doc3");
           decoratedFormAsMap.clearFileLoadField("load_doc5");
           decoratedFormAsMap.clearFileLoadField("load_doc14");
           decoratedFormAsMap.clearFileLoadField("load_doc16");
           decoratedFormAsMap.clearFileLoadField("load_doc18");
           decoratedFormAsMap.clearFileLoadField("load_doc4");
           decoratedFormAsMap.clearFileLoadField("load_doc20");
           decoratedFormAsMap.clearFileLoadField("load_doc21");
           decoratedFormAsMap.clearFileLoadField("load_doc22");
           decoratedFormAsMap.clearFileLoadField("load_doc23");
           } else if(("5".equalsIgnoreCase(form.getReason_reIP()))){
           decoratedFormAsMap.remove("documentNumber");
           decoratedFormAsMap.remove("dateIssue");
           decoratedFormAsMap.remove("issuingAuthority");
           decoratedFormAsMap.remove("ownership");
           decoratedFormAsMap.clearFileLoadField("load_doc1");
           decoratedFormAsMap.clearFileLoadField("load_doc4");
           decoratedFormAsMap.clearFileLoadField("load_doc9");
           decoratedFormAsMap.clearFileLoadField("load_doc3");
           decoratedFormAsMap.clearFileLoadField("load_doc5");
           decoratedFormAsMap.clearFileLoadField("load_doc16");
           decoratedFormAsMap.clearFileLoadField("load_doc18");
           decoratedFormAsMap.clearFileLoadField("load_doc20");
           decoratedFormAsMap.clearFileLoadField("load_doc21");
           decoratedFormAsMap.clearFileLoadField("load_doc22");
           decoratedFormAsMap.clearFileLoadField("load_doc23");
           } else if("6".equalsIgnoreCase(form.getReason_reIP())){
           decoratedFormAsMap.remove("documentNumber");
           decoratedFormAsMap.remove("dateIssue");
           decoratedFormAsMap.remove("issuingAuthority");
           decoratedFormAsMap.remove("ownership");
           decoratedFormAsMap.clearFileLoadField("load_doc1");
           decoratedFormAsMap.clearFileLoadField("load_doc4");
           decoratedFormAsMap.clearFileLoadField("load_doc6");
           decoratedFormAsMap.clearFileLoadField("load_doc7");
           decoratedFormAsMap.clearFileLoadField("load_doc9");
           decoratedFormAsMap.clearFileLoadField("load_doc3");
           decoratedFormAsMap.clearFileLoadField("load_doc5");
           decoratedFormAsMap.clearFileLoadField("load_doc14");
           decoratedFormAsMap.clearFileLoadField("load_doc18");
           decoratedFormAsMap.clearFileLoadField("load_doc20");
           decoratedFormAsMap.clearFileLoadField("load_doc21");
           decoratedFormAsMap.clearFileLoadField("load_doc22");
           decoratedFormAsMap.clearFileLoadField("load_doc23");
           } else if("7".equalsIgnoreCase(form.getReason_reIP())){
           decoratedFormAsMap.remove("documentNumber");
           decoratedFormAsMap.remove("dateIssue");
           decoratedFormAsMap.remove("issuingAuthority");
           decoratedFormAsMap.clearFileLoadField("load_doc1");
           decoratedFormAsMap.clearFileLoadField("load_doc7");
           decoratedFormAsMap.clearFileLoadField("load_doc6");
           decoratedFormAsMap.clearFileLoadField("load_doc9");
           decoratedFormAsMap.clearFileLoadField("load_doc16");
           decoratedFormAsMap.clearFileLoadField("load_doc20");
           decoratedFormAsMap.clearFileLoadField("load_doc21");
           decoratedFormAsMap.clearFileLoadField("load_doc14");
           decoratedFormAsMap.clearFileLoadField("load_doc22");
           decoratedFormAsMap.clearFileLoadField("load_doc23");
           }

           if("1".equalsIgnoreCase(form.getReason_reUL()) || "2".equalsIgnoreCase(form.getReason_reUL()) || "3".equals(form.getReason_reUL())){
           decoratedFormAsMap.remove("documentNumber");
           decoratedFormAsMap.remove("dateIssue");
           decoratedFormAsMap.remove("issuingAuthority");
           decoratedFormAsMap.remove("ownership");
           decoratedFormAsMap.clearFileLoadField("load_doc1");
           decoratedFormAsMap.clearFileLoadField("load_doc4");
           decoratedFormAsMap.clearFileLoadField("load_doc6");
           decoratedFormAsMap.clearFileLoadField("load_doc7");
           decoratedFormAsMap.clearFileLoadField("load_doc9");
           decoratedFormAsMap.clearFileLoadField("load_doc3");
           decoratedFormAsMap.clearFileLoadField("load_doc5");
           decoratedFormAsMap.clearFileLoadField("load_doc13");
           decoratedFormAsMap.clearFileLoadField("load_doc15");
           decoratedFormAsMap.clearFileLoadField("load_doc14");
           decoratedFormAsMap.clearFileLoadField("load_doc16");
           decoratedFormAsMap.clearFileLoadField("load_doc18");
           decoratedFormAsMap.clearFileLoadField("load_doc21");
           decoratedFormAsMap.clearFileLoadField("load_doc22");
           decoratedFormAsMap.clearFileLoadField("load_doc23");
           } else if("4".equalsIgnoreCase(form.getReason_reUL())){
           decoratedFormAsMap.remove("documentNumber");
           decoratedFormAsMap.remove("dateIssue");
           decoratedFormAsMap.remove("issuingAuthority");
           decoratedFormAsMap.remove("ownership");
           decoratedFormAsMap.clearFileLoadField("load_doc1");
           decoratedFormAsMap.clearFileLoadField("load_doc14");
           decoratedFormAsMap.clearFileLoadField("load_doc16");
           decoratedFormAsMap.clearFileLoadField("load_doc18");
           decoratedFormAsMap.clearFileLoadField("load_doc20");
           decoratedFormAsMap.clearFileLoadField("load_doc22");
           decoratedFormAsMap.clearFileLoadField("load_doc23");
           } else if("5".equalsIgnoreCase(form.getReason_reUL())){
           decoratedFormAsMap.remove("documentNumber");
           decoratedFormAsMap.remove("dateIssue");
           decoratedFormAsMap.remove("issuingAuthority");
           decoratedFormAsMap.remove("ownership");
           decoratedFormAsMap.clearFileLoadField("load_doc1");
           decoratedFormAsMap.clearFileLoadField("load_doc4");
           decoratedFormAsMap.clearFileLoadField("load_doc6");
           decoratedFormAsMap.clearFileLoadField("load_doc7");
           decoratedFormAsMap.clearFileLoadField("load_doc9");
           decoratedFormAsMap.clearFileLoadField("load_doc3");
           decoratedFormAsMap.clearFileLoadField("load_doc5");
           decoratedFormAsMap.clearFileLoadField("load_doc13");
           decoratedFormAsMap.clearFileLoadField("load_doc15");
           decoratedFormAsMap.clearFileLoadField("load_doc14");
           decoratedFormAsMap.clearFileLoadField("load_doc16");
           decoratedFormAsMap.clearFileLoadField("load_doc18");
           decoratedFormAsMap.clearFileLoadField("load_doc21");
           decoratedFormAsMap.clearFileLoadField("load_doc22");
           decoratedFormAsMap.clearFileLoadField("load_doc23");
           } else if("6".equalsIgnoreCase(form.getReason_reUL())){
           decoratedFormAsMap.remove("documentNumber");
           decoratedFormAsMap.remove("dateIssue");
           decoratedFormAsMap.remove("issuingAuthority");
           decoratedFormAsMap.remove("ownership");
           decoratedFormAsMap.clearFileLoadField("load_doc1");
           decoratedFormAsMap.clearFileLoadField("load_doc3");
           decoratedFormAsMap.clearFileLoadField("load_doc16");
           decoratedFormAsMap.clearFileLoadField("load_doc18");
           decoratedFormAsMap.clearFileLoadField("load_doc20");
           decoratedFormAsMap.clearFileLoadField("load_doc21");
           decoratedFormAsMap.clearFileLoadField("load_doc22");
           decoratedFormAsMap.clearFileLoadField("load_doc23");
           } else if("7".equalsIgnoreCase(form.getReason_reUL())){
           decoratedFormAsMap.remove("documentNumber");
           decoratedFormAsMap.remove("dateIssue");
           decoratedFormAsMap.remove("issuingAuthority");
           decoratedFormAsMap.clearFileLoadField("load_doc1");
           decoratedFormAsMap.clearFileLoadField("load_doc6");
           decoratedFormAsMap.clearFileLoadField("load_doc7");
           decoratedFormAsMap.clearFileLoadField("load_doc9");
           decoratedFormAsMap.clearFileLoadField("load_doc14");
           decoratedFormAsMap.clearFileLoadField("load_doc16");
           decoratedFormAsMap.clearFileLoadField("load_doc18");
           decoratedFormAsMap.clearFileLoadField("load_doc20");
           decoratedFormAsMap.clearFileLoadField("load_doc21");
           decoratedFormAsMap.clearFileLoadField("load_doc23");
           } else if("8".equalsIgnoreCase(form.getReason_reUL())){
           decoratedFormAsMap.remove("documentNumber");
           decoratedFormAsMap.remove("dateIssue");
           decoratedFormAsMap.remove("issuingAuthority");
           decoratedFormAsMap.remove("ownership");
           decoratedFormAsMap.clearFileLoadField("load_doc1");
           decoratedFormAsMap.clearFileLoadField("load_doc4");
           decoratedFormAsMap.clearFileLoadField("load_doc6");
           decoratedFormAsMap.clearFileLoadField("load_doc7");
           decoratedFormAsMap.clearFileLoadField("load_doc9");
           decoratedFormAsMap.clearFileLoadField("load_doc3");
           decoratedFormAsMap.clearFileLoadField("load_doc5");
           decoratedFormAsMap.clearFileLoadField("load_doc14");
           decoratedFormAsMap.clearFileLoadField("load_doc16");
           decoratedFormAsMap.clearFileLoadField("load_doc18");
           decoratedFormAsMap.clearFileLoadField("load_doc20");
           decoratedFormAsMap.clearFileLoadField("load_doc21");
           decoratedFormAsMap.clearFileLoadField("load_doc22");
           }

          return formAsMap;
     }




    @Override
     protected List<String> getFormFieldsWithFiles(Service36400009Form form, Map<String, Object> model) {
        return Arrays.asList(
    "identityDocLoad",
     "docMvRegIPLoad",
     "docMvRegULLoad",
    "docMvRegFNSLoad",
     "docMvRegFNSLoad",
    "dovUlNonDovLoad",
    "dovDovLoad",
    "dovPasLoad",
    "dovUlPasLoad",
    "dovUlDovLoad",
"load_doc1",
"load_doc4",
"load_doc6",
"load_doc7",
"load_doc9",
"load_doc3",
"load_doc5",
"load_doc17",
"load_doc13",
"load_doc15",
"load_doc14",
"load_doc16",
"load_doc18",
"load_doc20",
"load_doc21",
"load_doc22"
        );
    }

}