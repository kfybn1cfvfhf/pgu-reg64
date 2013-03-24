package com.nvision.pgu.web.services.s36400028;

import com.nvision.pgu.core.controllers.AbstractServiceOrderController;
import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/services/s" + Service36400028Controller.SERVICE_ID)
@ServiceController(id = Service36400028Controller.SERVICE_ID, title = "Прием заявлений на участие в общественных работах")

public class Service36400028Controller extends AbstractServiceOrderController<Service36400028Form> {
    /**
     * id Прием заявлений на участие в общественных работах
     */
    public static final int SERVICE_ID = 36400028;


    @Autowired
    private Service36400028FormValidator validator;

    public Service36400028Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе",
				"Сведения об образовании",
				"Сведения о последнем месте работы",
				"Пожелания к общественной работе"
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
 		if (binder.getTarget() instanceof Service36400028Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400028Form createNewForm() {
 		return new Service36400028Form();
 	}

}