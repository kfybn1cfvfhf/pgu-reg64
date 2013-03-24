package com.nvision.pgu.web.services.s36400201;

import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.util.formasmap.FormAsMap;
import ru.lanit.samara.pgu.core.util.formasmap.FormAsMapImpl;
import ru.lanit.samara.pgu.core.util.version.Version;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
@RequestMapping("/services/s" + Service36400201Controller.SERVICE_ID)
@ServiceController(id = Service36400201Controller.SERVICE_ID, title = "Прием документов органами опеки и попечительства от лиц, желающих принять детей")
@Version("0.6.2")
public class Service36400201Controller extends AbstractServiceOrderControllerEDS24<Service36400201Form> {
    public static final Logger LOGGER = LoggerFactory.getLogger(Service36400201Controller.class);
    /**
     * id Получение субсидий на поддержку элитного семеноводства
     */
    public static final int SERVICE_ID = 36400201;
    public static String region = "";
    public static final String XML_PREFIX = "req";


    @Autowired
    private Service36400201FormValidator validator;

    public Service36400201Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе",
				"Сведения о запрашиваемой услуге",
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
 		if (binder.getTarget() instanceof Service36400201Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400201Form createNewForm() {
 		return new Service36400201Form();
 	}

    @Override
    protected Map<String, Object> formToMap(Service36400201Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);
        decoratedFormAsMap.clearForOrdering();

        // ДУЛ: другой документ
        if ("5".equals(form.getIdentityDocType())) {
            formAsMap.put("identityDocType", form.getOtherDocTypeName());
        } else {
            formAsMap.put("identityDocType", form.getIdentityDocType());
        }

        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400201Form form, Map<String, Object> model) {
        return Arrays.asList(
                "identityDocLoad",
                "emplDocLoad",
                "rightHousingExplDocLoad",
                "rightHousingNonEgrpDocLoad",
                "medicalReportDocLoad",
                "certMarriageDocLoad",
                "writtenConsentDocLoad",
                "trainingDocLoad",
                "autobiographyDocLoad",
                "certCznMvDocLoad",
                "rightHousingOmsuMvDocLoad",
                "rightHousingEgrpMvDocLoad",
                "certMvdMvDocLoad",
                "sanNormsMvDocLoad",
                "certPensMvDocLoad",
                "techNormsMvDocLoad"
        );
    }

}