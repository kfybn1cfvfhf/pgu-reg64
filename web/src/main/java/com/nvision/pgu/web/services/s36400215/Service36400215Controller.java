package com.nvision.pgu.web.services.s36400215;

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
@RequestMapping("/services/s" + Service36400215Controller.SERVICE_ID)
@ServiceController(id = Service36400215Controller.SERVICE_ID, title = "Предоставление разрешения на право организации розничного рынка, продление срока его действия, переоформление разрешения")
@Version("1.3")
public class Service36400215Controller extends AbstractServiceOrderControllerEDS24<Service36400215Form> {
    /**
     * id Предоставление разрешения на право организации розничного рынка, продление срока его действия, переоформление разрешения
     */
    public static final Logger LOGGER = LoggerFactory.getLogger(Service36400215Controller.class);/**
     * id Предоставление в соответствии с законодательством земельных участков, находящихся в государственной собственности Саратовской области
     */
    public static String region = "";
    public static final String XML_PREFIX = "req";


    public static final int SERVICE_ID = 36400215;



    @Autowired
    private Service36400215FormValidator validator;

    public Service36400215Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения об услуге"
            );
        setStepList(stepList);
    }


    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400215Form form, boolean goback, Map<String, Object> model) {
           StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);
            if(stepProcessingResult.getStepNum() == 2) {
                    // Юрик
                    if("1".equalsIgnoreCase(form.getDovUlType())) {
                        stepProcessingResult = new StepProcessingResult(2, "step2ulnodov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2uldov.html");
                    }
                }
        return stepProcessingResult;
    }


         private void clearUlDovFields(FormAsMap FAM) {
             FAM.clearFileLoadField("dovUlDovLoad");
         }

         private void clearUlNoDovFields(FormAsMap FAM) {
             FAM.clearFileLoadField("dovUlNonDovLoad");
         }

        @Override
        protected Map<String, Object> formToMap(Service36400215Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
            Map<String, Object> formAsMap = super.formToMap(form);
            FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

           decoratedFormAsMap.clearForOrdering();

           formAsMap.put("firstName", this.getPrivateRoomDataContainer().getFirstName());
           formAsMap.put("lastName", this.getPrivateRoomDataContainer().getLastName());
           formAsMap.put("middleName", this.getPrivateRoomDataContainer().getMiddleName());

               if("1".equalsIgnoreCase(form.getDovUlType())) {
                   // Без доверенности
                   clearUlDovFields(decoratedFormAsMap);
               } else {
                   // по доверенности
                   clearUlNoDovFields(decoratedFormAsMap);
               }

            return formAsMap;
        }


        @Override
        protected List<String> getFormFieldsWithFiles(Service36400215Form form, Map<String, Object> model) {

            return Arrays.asList(
                    "dovUlNonDovLoad",
                    "dovUlPasLoad",
                    "docMvRegULLoad",
                    "dovUlDovLoad",
                    "founderDocLoad",
                    "marketDocLoad"
                );

        }


    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

	@Override
    protected void initBinderInternal(WebDataBinder binder)
 	{
 		if (binder.getTarget() instanceof Service36400215Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400215Form createNewForm() {
 		return new Service36400215Form();
 	}

}