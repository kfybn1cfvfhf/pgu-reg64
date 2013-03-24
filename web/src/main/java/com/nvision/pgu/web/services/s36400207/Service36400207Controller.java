package com.nvision.pgu.web.services.s36400207;

import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.util.version.Version;
import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;

import java.util.Arrays;
import java.util.List;


/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 *
 */
@Controller
@RequestMapping("/services/s" + Service36400207Controller.SERVICE_ID)
@ServiceController(id = Service36400207Controller.SERVICE_ID, title = "Предоставление информации об очередности предоставления жилых помещений на условиях социального найма")
@Version("0.3.3")
public class Service36400207Controller extends AbstractServiceOrderControllerEDS24<Service36400207Form> {
    /**
     * id Предоставление информации об очередности предоставления жилых помещений на условиях социального найма
     */
    public static final int SERVICE_ID = 36400207;


    @Autowired
    private Service36400207FormValidator validator;

    public Service36400207Controller() {
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
 		if (binder.getTarget() instanceof Service36400207Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400207Form createNewForm() {
 		return new Service36400207Form();
 	}

}