package com.nvision.pgu.web.services.s36400014;

import com.nvision.pgu.core.controllers.AbstractCommonServiceOrderController;
import com.nvision.pgu.core.controllers.AbstractServiceOrderController;
import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/services/s" + Service36400014Controller.SERVICE_ID)
@ServiceController(id = Service36400014Controller.SERVICE_ID, title = "Предоставление лицензии на осуществление фармацевтической деятельности для юридических лиц")

public class Service36400014Controller extends AbstractServiceOrderControllerEDS24<Service36400014Form> {
    /**
     * id Предоставление лицензии на осуществление фармацевтической деятельности для юридических лиц
     */
    public static final int SERVICE_ID = 36400014;


    @Autowired
    private Service36400014FormValidator validator;

    public Service36400014Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Тип заявителя",
				"Сведения о заявителе",
				"Объекты лицензирования",
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
 		if (binder.getTarget() instanceof Service36400014Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400014Form createNewForm() {
 		return new Service36400014Form();
 	}


    @Override
    protected AbstractCommonServiceOrderController.StepProcessingResult determineNextStepNumOnStepProcessing(Service36400014Form form, boolean goback, Map<String, Object> model) {
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
                       if (form.getIs_med_org().equals("on")) {
                stepProcessingResult = new StepProcessingResult(4, "step4UlMed.html");
            } else {
                stepProcessingResult = new StepProcessingResult(4, "step4UlNoMed.html");
            }

                }
            }



           return stepProcessingResult;
       }

      @Override
     protected List<String> getFormFieldsWithFiles(Service36400014Form form, Map<String, Object> model) {
        return Arrays.asList(
"loadsan",
"loadDocG1",
"loadDocH1",
"loadDocF1",
"loadDocZ1",
"el_cash",
"el_prof",
"docegip",
"loadDocdov2",
"loaddoc_okpo",
"loaddoc_building",
"loaddoc_manager",
"loadDocB1",
"loadDocB5",
"loadDocB3",
"lic_med",
"loadDocB8",
"loadDocA1",
"loadDocI1",
"el_pravo",
"sanit",
"docegul",
"el_farmac"
        );
    }
}