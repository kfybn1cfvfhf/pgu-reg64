package com.nvision.pgu.web.services.s36400212;

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
@RequestMapping("/services/s" + Service36400212Controller.SERVICE_ID)
@ServiceController(id = Service36400212Controller.SERVICE_ID, title = "Аттестация педагогических и руководящих работников государственных и муниципальных  образовательных учреждений")
@Version("1.1")

public class Service36400212Controller extends AbstractServiceOrderControllerEDS24<Service36400212Form> {
    /**
     * id Аттестация педагогических и руководящих работников государственных и муниципальных  образовательных учреждений
     */
    public static final int SERVICE_ID = 36400212;


    @Autowired
    private Service36400212FormValidator validator;

    public Service36400212Controller() {
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
 		if (binder.getTarget() instanceof Service36400212Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400212Form createNewForm() {
 		return new Service36400212Form();
 	}

}