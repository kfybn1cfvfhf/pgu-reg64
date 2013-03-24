package com.nvision.pgu.web.services.s36400233;

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
 */
@Controller
@RequestMapping("/services/s" + Service36400233Controller.SERVICE_ID)
@ServiceController(id = Service36400233Controller.SERVICE_ID, title = " Выдача справок гражданам о величине прожиточного минимума на душу населения и по основным социально-демографическим группам населения Саратовской области")
@Version("0.3.1")
public class Service36400233Controller extends AbstractServiceOrderControllerEDS24<Service36400233Form> {
    public static final Logger LOGGER = LoggerFactory.getLogger(Service36400233Controller.class);
    /**
     * id  Выдача справок гражданам о величине прожиточного минимума на душу населения и по основным социально-демографическим группам населения Саратовской области
     */
    public static final int SERVICE_ID = 36400233;
    @Autowired
    private Service36400233FormValidator validator;

    public Service36400233Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Сведения о заявителе",
                "Сведения о запрашиваемой услуге",
                "Сведения о квартале исчисления величины прожиточного минимума",
                "Сведения способе получения справки"
        );
        setStepList(stepList);
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400233Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400233Form createNewForm() {
        return new Service36400233Form();
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400233Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        if (stepProcessingResult.getStepNum() == 3) {

            if (form.getPeriod().equals("1"))
                return new StepProcessingResult(3, "step3-period.html");

            if (form.getPeriod().equals("2"))
                return new StepProcessingResult(3, "step3-quart.html");

            if (goback)
                stepProcessingResult.setStepNum(2);
        }

        return stepProcessingResult;
    }

    // автоочистка полей
    // поля адреса чистятся в data4sign
    @Override
    protected Map<String, Object> formToMap(Service36400233Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap = new FormAsMapImpl(formAsMap);

        if (form.getPeriod().equals("1")) {
            decoratedFormAsMap.remove("quart");
            decoratedFormAsMap.remove("year");
        }

        if (form.getPeriod().equals("2")) {
            decoratedFormAsMap.remove("date");
            decoratedFormAsMap.remove("from");
        }

        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400233Form form, Map<String, Object> model) {

        return Arrays.asList(
        );
    }

}