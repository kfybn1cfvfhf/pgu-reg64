package com.nvision.pgu.web.services.s36400191;

import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
import ru.lanit.samara.pgu.core.util.version.Version;

import java.util.Arrays;
import java.util.List;


/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 *
 */
@Controller
@RequestMapping("/services/s" + Service36400191Controller.SERVICE_ID)
@ServiceController(id = Service36400191Controller.SERVICE_ID, title = "Заполнение и направление в аптеки электронных рецептов")
@Version("0.1")
public class Service36400191Controller extends AbstractServiceOrderControllerEDS24<Service36400191Form> {
    /**
     * id Заполнение и направление в аптеки электронных рецептов
     */
    public static final int SERVICE_ID = 36400191;


    @Autowired
    private Service36400191FormValidator validator;

    public Service36400191Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе",
				"Сведения об искомом препарате"
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
 		if (binder.getTarget() instanceof Service36400191Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400191Form createNewForm() {
 		return new Service36400191Form();
 	}

}