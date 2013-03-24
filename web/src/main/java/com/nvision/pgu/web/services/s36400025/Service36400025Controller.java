package com.nvision.pgu.web.services.s36400025;

import com.nvision.pgu.core.controllers.AbstractServiceOrderController;
import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;


/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 *
 */
@Controller
@RequestMapping("/services/s" + Service36400025Controller.SERVICE_ID)
@ServiceController(id = Service36400025Controller.SERVICE_ID, title = " Содействие гражданам в поиске подходящей работы")

public class Service36400025Controller extends AbstractServiceOrderController<Service36400025Form> {
    /**
     * id  Содействие гражданам в поиске подходящей работы
     */
    public static final int SERVICE_ID = 36400025;


    @Autowired
    private Service36400025FormValidator validator;

    public Service36400025Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе",
				"Сведения об образовании",
				"Сведения о последнем месте работы",
				"Пожелания к искомой работе",
				"Дополнительные сведения"
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
 		if (binder.getTarget() instanceof Service36400025Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400025Form createNewForm() {
 		return new Service36400025Form();
 	}

}