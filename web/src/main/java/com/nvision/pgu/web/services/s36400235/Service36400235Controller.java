package com.nvision.pgu.web.services.s36400235;

import com.nvision.pgu.core.annotations.ServiceController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RequestMapping("/services/s" + Service36400235Controller.SERVICE_ID)
@ServiceController(id = Service36400235Controller.SERVICE_ID, title = "Предоставление гражданам компенсации за счет средств областного бюджета на возмещение части расходов по оплате процентов ипотечного займа (кредита) ")
@Version("0.3")
public class Service36400235Controller extends AbstractServiceOrderControllerEDS24<Service36400235Form> {
    public static final Logger LOGGER = LoggerFactory.getLogger(Service36400235Controller.class);
    /**
     * id Предоставление гражданам компенсации за счет средств областного бюджета на возмещение части расходов по оплате процентов ипотечного займа (кредита)
     */
    public static final int SERVICE_ID = 36400235;
    public static final String XML_PREFIX = "req";
    public static String region = "";


    //@Autowired
    //private Service36400235FormValidator validator;

    public Service36400235Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Сведения о заявителе",
                "Сведения о составе семьи",
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
        //if (binder.getTarget() instanceof Service36400235Form) {
        //	super.setValidator(validator);
        //	binder.setValidator(validator);
        //}
    }

    @Override
    protected Service36400235Form createNewForm() {
        return new Service36400235Form();
    }

    @Override
    protected Map<String, Object> formToMap(Service36400235Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap = new FormAsMapImpl(formAsMap);
        decoratedFormAsMap.clearForOrdering();

        // ДУЛ: другой документ
        if ("5".equals(form.getIdentityDocType())) {
            formAsMap.put("identityDocType", form.getOtherDocTypeName());
            decoratedFormAsMap.clearFileLoadField("otherDocTypeName");
        }

        if ("on".equalsIgnoreCase("noEGRP"))
            decoratedFormAsMap.clearFileLoadField("EGRPDocLoad");

        if ("off".equalsIgnoreCase("noEGRP"))
            decoratedFormAsMap.clearFileLoadField("noEGRPDocLoad");

        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400235Form form, Map<String, Object> model) {
        return Arrays.asList(
                "identityDocLoad",
                "identityFamilyDocLoad",
                "compFamilyDocLoad",
                "techInventDocLoad",
                "motherCapDocLoad",
                "noEGRPDocLoad",
                "regPeopleDocLoad",
                "dohodDocLoad",
                "noSobstDocLoad",
                "EGRPDocLoad",
                "uchetNujdaJPDocLoad"
        );
    }

}