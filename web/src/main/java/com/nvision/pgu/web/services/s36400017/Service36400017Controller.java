package com.nvision.pgu.web.services.s36400017;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.controllers.AbstractServiceOrderController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;

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
@RequestMapping("/services/s" + Service36400017Controller.SERVICE_ID)
@ServiceController(id = Service36400017Controller.SERVICE_ID, title = "Узнать мои права")

public class Service36400017Controller extends AbstractServiceOrderControllerEDS24<Service36400017Form> {
public static final Logger LOGGER = LoggerFactory.getLogger(Service36400017Controller.class);
    /**
     * id Получение лицензии на право ведения образовательной деятельности
     */
    public static final int SERVICE_ID = 36400017;


    @Autowired
    private Service36400017FormValidator validator;

    public Service36400017Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе"
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
 		if (binder.getTarget() instanceof Service36400017Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400017Form createNewForm() {
        Service36400017Form form = new Service36400017Form();
        form.setCustomLookupRegistry(getCustomLookupRegistry());
        return form;

 	}


}