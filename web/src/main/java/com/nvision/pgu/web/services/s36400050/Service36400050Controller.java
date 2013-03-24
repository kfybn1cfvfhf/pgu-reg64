package com.nvision.pgu.web.services.s36400050;

import com.nvision.pgu.core.controllers.AbstractCommonServiceOrderController;
import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
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
@RequestMapping("/services/s" + Service36400050Controller.SERVICE_ID)
@ServiceController(id = Service36400050Controller.SERVICE_ID, title = "Переоформление документа, подтверждающего наличие лицензии на лицензируемую деятельность для ЮЛ")
@Version("1.4")
public class Service36400050Controller extends AbstractServiceOrderControllerEDS24<Service36400050Form> {
    /**
     * id Переоформление документа, подтверждающего наличие лицензии на медицинскую деятельность для ЮЛ
     */
    public static final int SERVICE_ID = 36400050;


    @Autowired
    private Service36400050FormValidator validator;

    public Service36400050Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Тип заявителя",
				"Сведения о заявителе",
				"Сведения о заявителе (продолжение)",
				"Сведения о причине переоформления лицензии",
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
 		if (binder.getTarget() instanceof Service36400050Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400050Form createNewForm() {
 		return new Service36400050Form();
 	}

    @Override
    protected AbstractCommonServiceOrderController.StepProcessingResult determineNextStepNumOnStepProcessing(Service36400050Form form, boolean goback, Map<String, Object> model) {
           StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

            if(stepProcessingResult.getStepNum() == 2) {
                if("1".equalsIgnoreCase(form.getApplType())) {

                        stepProcessingResult = new StepProcessingResult(2, "step2Ip.html");
                    }
                 else {
                        stepProcessingResult = new StepProcessingResult(2, "step2Ul.html");

                }
            }

              if(stepProcessingResult.getStepNum() == 3) {
                if("1".equalsIgnoreCase(form.getApplType())) {

                        stepProcessingResult = new StepProcessingResult(3, "step3Ip.html");
                    }
                 else {
                        stepProcessingResult = new StepProcessingResult(3, "step3Ul.html");

                }
            }

              if(stepProcessingResult.getStepNum() == 4) {
                if("1".equalsIgnoreCase(form.getApplType())) {

                        stepProcessingResult = new StepProcessingResult(4, "step4Ip.html");
                    }
                 else {
                        stepProcessingResult = new StepProcessingResult(4, "step4Ul.html");

                }
            }

              if(stepProcessingResult.getStepNum() == 5) {
                if("1".equalsIgnoreCase(form.getApplType())) {

                        stepProcessingResult = new StepProcessingResult(5, "step5Ip.html");
                    }
                 else {
                        stepProcessingResult = new StepProcessingResult(5, "step5Ul.html");

                }
            }


           return stepProcessingResult;
       }

    @Override
 protected List<String> getFormFieldsWithFiles(Service36400050Form form, Map<String, Object> model) {
        return Arrays.asList(
                "dovLicLoad",
                "taxPayLoad",
                "medActLicenseCopy",
                "copyLicPravo",
                "loaddoc61",
                "loaddoc65",
                "managerEducationDocs",
                "staffEducationDocs",
                "staffAdditionalEducationDocs" ,
                "copyLicLoad",
                "loaddoc71",
                "loaddoc81",
                "loaddoc91",
                "egrulLoad",
                "sanCopyLoad",
                "loaddoc71"

        );
    }
}