package com.nvision.pgu.web.services.s36400240;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.exceptions.ShowErrorToUserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;
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
 */
@Controller
@RequestMapping("/services/s" + Service36400240Controller.SERVICE_ID)
@ServiceController(id = Service36400240Controller.SERVICE_ID, title = "Предоставление гражданам жилых помещений по договорам социального найма из государственного жилищного фонда")
@Version("0.5.3")
public class Service36400240Controller extends AbstractServiceOrderControllerEDS24<Service36400240Form> {
    /**
     * id Предоставление гражданам жилых помещений по договорам социального найма из государственного жилищного фонда
     */
    public static final int SERVICE_ID = 36400240;
    @Autowired
    private Service36400240FormValidator validator;
    @Autowired
    private IPrivateRoomDataContainer privateRoomDataContainer;

    public Service36400240Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Тип заявителя",
                "Сведения о заявителе",
                "Сведения о лице, нуждающемся в государственной услуге",
                "Сведения о запрашиваемой услуге"
        );
        setStepList(stepList);
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400240Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400240Form createNewForm() {
        return new Service36400240Form();
    }

    @Override
    protected void fillModelByForm(Map<String, Object> model, Service36400240Form form) throws ShowErrorToUserException {
        super.fillModelByForm(model, form);

        model.put("privateRoomData", this.privateRoomDataContainer);
    }

    // сценарий 1
    // При активированном incapable_enable
    private boolean isScenario1(Service36400240Form form) {
        return "on".equalsIgnoreCase(form.getIncapable_enable());
    }

    // сценарий 2
    // При деактивированном incapable_enable
    private boolean isScenario2(Service36400240Form form) {
        return "off".equalsIgnoreCase(form.getIncapable_enable());
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400240Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        String step2_2 = "step2_2.html";
        String step2_3 = "step2_3.html";

        // шаг 2(step2_2)-3(step2_3) 2-1
        if (stepProcessingResult.getStepNum() == 2) {
            // step 2 copy
            if (isScenario1(form))
                return new StepProcessingResult(2, step2_3);
            if (isScenario2(form))
                return new StepProcessingResult(2, step2_2);
            // /step 2 copy
            if (!goback)
                stepProcessingResult.setStepNum(3);
            if (goback)
                stepProcessingResult.setStepNum(1);
        }

        // шаг 4(3) 1
        if (stepProcessingResult.getStepNum() == 3) {
            // step 3 copy
            if (isScenario1(form))
                return stepProcessingResult;
            // /step 3 copy
            if (!goback)
                stepProcessingResult.setStepNum(4);
            if (goback) {
                // step 2 copy
                if (isScenario1(form))
                    return new StepProcessingResult(3, step2_3);
                if (isScenario2(form))
                    return new StepProcessingResult(2, step2_2);
                // /step 2 copy

                stepProcessingResult.setStepNum(1); // пропуск шага
            }
        }

        return stepProcessingResult;
    }

    // автоочистка полей
   @Override
    protected Map<String, Object> formToMap(Service36400240Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap = new FormAsMapImpl(formAsMap);

        // сценарий 1
        if (isScenario1(form)) {
            // ничего
        }

        // сценарий 2
        if (isScenario2(form)) {
            // основные поля:
            // 4
            decoratedFormAsMap.remove("recipientLastName");
            decoratedFormAsMap.remove("recipientFirstName");
            decoratedFormAsMap.remove("recipientMiddleName");
            decoratedFormAsMap.remove("recipientIdentityDocType");
            decoratedFormAsMap.remove("recipientPassSeria");
            decoratedFormAsMap.remove("recipientPassNo");
            decoratedFormAsMap.remove("recipientPassDate");
            decoratedFormAsMap.remove("recipientFrom");
            decoratedFormAsMap.clearFileLoadField("recipientIdentityDocLoad");
            // 3
            decoratedFormAsMap.clearFileLoadField("dovOpekLoad");
        }

        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400240Form form, Map<String, Object> model) {

        return Arrays.asList(
                "dovOpekLoad",
                "identityDocLoad",
                "recipientIdentityDocLoad"
        );
    }

}