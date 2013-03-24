package com.nvision.pgu.web.services.s36400170;

import com.nvision.pgu.core.annotations.ServiceController;
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
@RequestMapping("/services/s" + Service36400170Controller.SERVICE_ID)
@ServiceController(id = Service36400170Controller.SERVICE_ID, title = "Организация профессиональной ориентации граждан")
@Version("2.3")

public class Service36400170Controller extends AbstractServiceOrderControllerEDS24<Service36400170Form> {
    /**
     * id Организация профессиональной ориентации граждан
     */
    public static final int SERVICE_ID = 36400170;


    @Autowired
    private Service36400170FormValidator validator;

    public Service36400170Controller() {
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе",
				"Сведения об образовании",
				"Согласие на проведение тестирования и электронные копии документов"
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
 		if (binder.getTarget() instanceof Service36400170Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400170Form createNewForm() {
 		return new Service36400170Form();
 	}

    @Override
    protected Map<String, Object> formToMap(Service36400170Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

        decoratedFormAsMap.clearForOrdering();

        if ("1".equals(form.getSex())) {
            decoratedFormAsMap.put("sex", "male");
        } else {
            decoratedFormAsMap.put("sex", "female");
        }

        if("5".equalsIgnoreCase(form.getIdentityDocType())) {
            decoratedFormAsMap.put("identityDocType", form.getOtherDocTypeName());
        }

        if ("off".equalsIgnoreCase(form.getApplCat1())) {
            decoratedFormAsMap.clearFileLoadField("applCatDoc1Load");
        }
       return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400170Form form, Map<String, Object> model) {
        return Arrays.asList(
        "identityDocLoad",
        "applCatDoc1Load",
        "applCatDoc2Load",
        "applCatDoc3Load"
        );
    }

}