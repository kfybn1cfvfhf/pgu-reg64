package com.nvision.pgu.web.services.s36400165;

import com.nvision.pgu.core.annotations.ServiceController;
import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
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
@RequestMapping("/services/s" + Service36400165Controller.SERVICE_ID)
@ServiceController(id = Service36400165Controller.SERVICE_ID, title = "Лицензирование розничной продажи алкогольной продукции в Саратовской области")
@Version("1.2")
public class Service36400165Controller extends AbstractServiceOrderControllerEDS24<Service36400165Form> {
    /**
     * id Лицензирование розничной продажи алкогольной продукции в Саратовской области
     */
    public static final int SERVICE_ID = 36400165;


    @Autowired
    private Service36400165FormValidator validator;

    public Service36400165Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о банковских реквизитах организации",
				"Сведения о запрашиваемой услуге"
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
 		if (binder.getTarget() instanceof Service36400165Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400165Form createNewForm() {
 		return new Service36400165Form();
 	}

    @Override
       protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400165Form form, boolean goback, Map<String, Object> model) {
              StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

               if(stepProcessingResult.getStepNum() == 2) {


                       if("1".equalsIgnoreCase(form.getDovUlType())) {
                           stepProcessingResult = new StepProcessingResult(2, "step2NoDov.html");
                       } else {
                           stepProcessingResult = new StepProcessingResult(2, "step2Dov.html");
                       }

               }
           return stepProcessingResult;
    }


       @Override
    protected List<String> getFormFieldsWithFiles(Service36400165Form form, Map<String, Object> model) {
        return Arrays.asList(
 "dovUlNonDovLoad",
 "dovUlPasLoad",
 "docMvRegULLoad",
 "dovUlDovLoad",
 "dutyDocLoad"
        );
    }

}