package com.nvision.pgu.web.services.s36400015;

import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nvision.pgu.core.controllers.AbstractServiceOrderController;

import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/services/s" + Service36400015Controller.SERVICE_ID)
@ServiceController(id = Service36400015Controller.SERVICE_ID, title = "Получение лицензии на фармацевтическую деятельность индивидуальными предпринимателями")

public class Service36400015Controller extends AbstractServiceOrderController<Service36400015Form> {
    /**
     * id Предоставление лицензии на осуществление фармацевтической деятельности для индивидуальных предпринимателей
     */
    public static final int SERVICE_ID = 36400015;


    @Autowired
    private Service36400015FormValidator validator;

    public Service36400015Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе - индивидуальном предпринимателе",
				"Объекты лицензирования",
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
 		if (binder.getTarget() instanceof Service36400015Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400015Form createNewForm() {
 		return new Service36400015Form();
 	}
}