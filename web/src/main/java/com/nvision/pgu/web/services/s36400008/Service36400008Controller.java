package com.nvision.pgu.web.services.s36400008;

import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nvision.pgu.core.controllers.AbstractServiceOrderController;

import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/services/s" + Service36400008Controller.SERVICE_ID)
@ServiceController(id = Service36400008Controller.SERVICE_ID, title = "Предоставление лицензии на медицинскую деятельность индивидуальным предпринимателям")

public class Service36400008Controller extends AbstractServiceOrderController<Service36400008Form> {
    /**
     * id Предоставление лицензии на медицинскую деятельность индивидуальным предпринимателям
     */
    public static final int SERVICE_ID = 36400008;


    @Autowired
    private Service36400008FormValidator validator;

    public Service36400008Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе",
				"Сведения о заявителе (продолжение)",
				"Объекты лицензирования и электронные копии документов",
				"Электронные копии документов (продолжение)"
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
 		if (binder.getTarget() instanceof Service36400008Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400008Form createNewForm() {
        Service36400008Form form = new Service36400008Form();
        return form;
 	}
}