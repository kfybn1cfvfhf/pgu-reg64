package com.nvision.pgu.web.services.s36400029;

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
@RequestMapping("/services/s" + Service36400029Controller.SERVICE_ID)
@ServiceController(id = Service36400029Controller.SERVICE_ID, title = "Прием заявлений на организацию временного трудоустройства")

public class Service36400029Controller extends AbstractServiceOrderController<Service36400029Form> {
    /**
     * id Прием заявлений на организацию временного трудоустройства
     */
    public static final int SERVICE_ID = 36400029;


    @Autowired
    private Service36400029FormValidator validator;

    public Service36400029Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе",
				"Категория заявителя"
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
 		if (binder.getTarget() instanceof Service36400029Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400029Form createNewForm() {
 		return new Service36400029Form();
 	}

}