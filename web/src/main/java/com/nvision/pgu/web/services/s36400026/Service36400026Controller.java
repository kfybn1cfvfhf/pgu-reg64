package com.nvision.pgu.web.services.s36400026;

import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderController;
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
@RequestMapping("/services/s" + Service36400026Controller.SERVICE_ID)
@ServiceController(id = Service36400026Controller.SERVICE_ID, title = " Содействие работодателям в подборе необходимых работников")

public class Service36400026Controller extends AbstractServiceOrderController<Service36400026Form> {
    /**
     * id  Содействие работодателям в подборе необходимых работников
     */
    public static final int SERVICE_ID = 36400026;


    @Autowired
    private Service36400026FormValidator validator;

    public Service36400026Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Основные сведения об организации",
				"Контактная информация",
				"Дополнительные сведения об организации",
				"Сведения о вакансиях"
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
 		if (binder.getTarget() instanceof Service36400026Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400026Form createNewForm() {
 		return new Service36400026Form();
 	}

}