package com.nvision.pgu.web.services.s36400005;

import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/services/s" + Service36400005Controller.SERVICE_ID)
@ServiceController(id = Service36400005Controller.SERVICE_ID, title = "Переоформление свидетельства о государственной аккредитации образовательных учреждений (научных организаций)")
@Version("1.2")
public class Service36400005Controller extends AbstractServiceOrderControllerEDS24<Service36400005Form> {
    /**
     * id Переоформление свидетельства о государственной аккредитации образовательных учреждений (организаций) 
     */
    public static final int SERVICE_ID = 36400005;


    @Autowired
    private Service36400005FormValidator validator;

    public Service36400005Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе и причина переоформления",
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
 		if (binder.getTarget() instanceof Service36400005Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400005Form createNewForm() {
 		return new Service36400005Form();
 	}



		@Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400005Form form, boolean goback, Map<String, Object> model) {

        StepProcessingResult result;

        if (form.getStepNum() == 1 && !goback) {
            if (form.getReason_re().equals("1") || form.getReason_re().equals("2")) {
                result = new StepProcessingResult(2, "step2.html");
            } else if (form.getReason_re().equals("3")) {
                result = new StepProcessingResult(2, "step3.html");
            } else if (form.getReason_re().equals("4")) {
                result = new StepProcessingResult(2, "step4.html");
            } else if (form.getReason_re().equals("5")) {
                result = new StepProcessingResult(2, "step5.html");
            } else {
                result = new StepProcessingResult(2, "step6.html");
            }
        } else {
            result = super.determineNextStepNumOnStepProcessing(form, goback, model);
        }

        return result;
    }

         protected List<String> getFormFieldsWithFiles(Service36400005Form form, Map<String, Object> model) {
        return Arrays.asList(
"load_doc2",
"load_doc0",
"load_doc1",
"load_doc3",
"load_doc4",
"load_doc5",
"load_doc8",
"load_doc12",
"load_doc6",
"load_doc9",
"load_doc10",
"load_doc11",
"load_doc13"
        );
    }

}




    
    
    
    
    
    
    
    