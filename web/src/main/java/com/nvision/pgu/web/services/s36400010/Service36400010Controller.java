package com.nvision.pgu.web.services.s36400010;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.controllers.AbstractServiceOrderController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/services/s" + Service36400010Controller.SERVICE_ID)
@ServiceController(id = Service36400010Controller.SERVICE_ID, title = "Переоформление лицензии на медицинскую деятельность индивидуальными предпринимателями")

public class Service36400010Controller extends AbstractServiceOrderController<Service36400010Form> {
    /**
     * id Переоформление документа, подтверждающего наличие лицензии на медицинскую деятельность для ЮЛ
     */
    public static final int SERVICE_ID = 36400010;


    @Autowired
    private Service36400010FormValidator validator;

    public Service36400010Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе",
				"Сведения о лицензиате - индивидуальном предпринимателе",
				"Сведения о причине переоформления лицензии",
				"Электронные копии документов и дополнительные сведения (при необходимости)"
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
 		if (binder.getTarget() instanceof Service36400010Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400010Form createNewForm() {
        Service36400010Form form = new Service36400010Form();
        return form;
 	}
}