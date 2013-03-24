package com.nvision.pgu.web.services.s36400027;

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
@RequestMapping("/services/s" + Service36700027Controller.SERVICE_ID)
@ServiceController(id = Service36700027Controller.SERVICE_ID, title = "Информирование безработных о социальных выплатах")

public class Service36700027Controller extends AbstractServiceOrderController<Service36700027Form> {
    /**
     * id Информирование безработных о социальных выплатах
     */
    public static final int SERVICE_ID = 36400027;


    @Autowired
    private Service36700027FormValidator validator;

    public Service36700027Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе и запрашиваемой услуге"
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
 		if (binder.getTarget() instanceof Service36700027Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36700027Form createNewForm() {
 		return new Service36700027Form();
 	}

}