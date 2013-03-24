package com.nvision.pgu.web.services.s36400002;

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
@RequestMapping("/services/s" + Service36400002Controller.SERVICE_ID)
@ServiceController(id = Service36400002Controller.SERVICE_ID, title = "Переоформление лицензии на право ведения образовательной деятельности")
@Version("0.0.9")
public class Service36400002Controller extends AbstractServiceOrderControllerEDS24<Service36400002Form> {
    /**
     * id Переоформление лицензии на право ведения образовательной деятельности
     */
    public static final int SERVICE_ID = 36400002;
    @Autowired
    IPrivateRoomDataContainer privateRoomDataContainer;
    @Autowired
    private Service36400002FormValidator validator;

    public Service36400002Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Сведения о заявителе и причина переоформления лицензии",
                "Электронные копии документов"
        );
        setStepList(stepList);
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400002Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400002Form createNewForm() {
        return new Service36400002Form();
    }

    @Override
    protected void fillModelByForm(Map<String, Object> model, Service36400002Form form) throws ShowErrorToUserException {
        super.fillModelByForm(model, form);

        model.put("privateRoomData", this.privateRoomDataContainer);
    }

    // сценарий 1
    // При деактивированном incapable_enable и деактивированном dov_enable
    private boolean isScenario1(Service36400002Form form) {
        return "1".equals(form.getReason_re()) || "2".equals(form.getReason_re()) || "3".equals(form.getReason_re());
    }

    // сценарий 2
    // При деактивированном incapable_enable и активированном dov_enable
    private boolean isScenario2(Service36400002Form form) {
        return "4".equals(form.getReason_re())               ;
    }

    // сценарий 3
    // При активированном incapable_enable и деактивированном dov_enable
    private boolean isScenario3(Service36400002Form form) {
        return "5".equals(form.getReason_re());
    }

    // сценарий 4
    // При выборе "Опекун" или "Попечитель" и деактивированном dov_enable
    private boolean isScenario4(Service36400002Form form) {
        return "6".equals(form.getReason_re());
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400002Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        String step2_2 = "step2-2.html";
        String step2_3 = "step2-3.html";
        String step2_4 = "step2-4.html";
        String step2_5 = "step2-5.html";


        if (stepProcessingResult.getStepNum() == 2) {
            // step 2 copy
            if (isScenario1(form))
                return new StepProcessingResult(2, step2_2);
            if (isScenario2(form))
                return new StepProcessingResult(2, step2_3);
            if (isScenario3(form))
                return new StepProcessingResult(2, step2_4);
            if (isScenario4(form))
                return new StepProcessingResult(2, step2_5);
            // /step 2 copy
            if (!goback)
                stepProcessingResult.setStepNum(3);
            if (goback)
                stepProcessingResult.setStepNum(1);
        }

        // шаг 4(3) 1
        if (stepProcessingResult.getStepNum() == 3) {
            // step 3 copy
            if (isScenario3(form) || isScenario4(form))
                return stepProcessingResult;
            // /step 3 copy
            if (!goback)
                stepProcessingResult.setStepNum(4);
            if (goback) {
                // step 2 copy
                if (isScenario1(form))
                    return new StepProcessingResult(2, step2_2);
                if (isScenario2(form))
                    return new StepProcessingResult(2, step2_3);
                if (isScenario3(form))
                    return new StepProcessingResult(2, step2_4);
                if (isScenario4(form))
                    return new StepProcessingResult(2, step2_5);
                // /step 2 copy

                stepProcessingResult.setStepNum(1); // пропуск шага
            }
        }

        return stepProcessingResult;
    }

    // автоочистка полей
    // поля адреса чистятся в data4sign
    @Override
    protected Map<String, Object> formToMap(Service36400002Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap = new FormAsMapImpl(formAsMap);

        if (isScenario1(form)) {
            if("1".equals(form.getReason_re()) || "3".equals(form.getReason_re())) form.setServiceTargetExtId("Usl_36410015");
            if("2".equals(form.getReason_re())) form.setServiceTargetExtId("Usl_36410016");

            decoratedFormAsMap.remove("checkBox1");
            decoratedFormAsMap.remove("checkBox2");
            decoratedFormAsMap.remove("checkBox3");
        }

        if (isScenario2(form)) {
            form.setServiceTargetExtId("Usl_36410012");
        }

        if (isScenario3(form)) {
            form.setServiceTargetExtId("Usl_36410017");
            decoratedFormAsMap.remove("checkBox1");
        }

        if (isScenario4(form)) {
            form.setServiceTargetExtId("Usl_36410018");
            decoratedFormAsMap.remove("checkBox1");
        }

        if(!"on".equals(form.getCheckBox1())) decoratedFormAsMap.clearFileLoadField("load_doc7");
        if(!"on".equals(form.getCheckBox2())) decoratedFormAsMap.clearFileLoadField("load_doc5");
        if(!"on".equals(form.getCheckBox3())) decoratedFormAsMap.clearFileLoadField("load_doc3");

        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400002Form form, Map<String, Object> model) {

        return Arrays.asList(
                "load_doc0",
                "load_doc39",
                "load_doc38",
                "load_doc40",
                "load_doc1",
                "load_doc4",
                "load_doc7",
                "load_doc5",
                "load_doc3",
                "load_doc6",
                "load_doc28",
                "load_doc37",
                "load_doc35",
                "load_doc29"

        );
    }


}