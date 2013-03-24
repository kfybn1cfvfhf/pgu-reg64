package com.nvision.pgu.web.services.s36400129;

import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
import ru.lanit.samara.pgu.core.util.version.Version;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 *
 */
@Controller
@RequestMapping("/services/s" + Service36400129Controller.SERVICE_ID)
@ServiceController(id = Service36400129Controller.SERVICE_ID, title = "Предоставление информации о текущей успеваемости учащегося, ведение электронного дневника и электронного журнала успеваемости")
@Version("0.2")
public class Service36400129Controller extends AbstractServiceOrderControllerEDS24<Service36400129Form> {
    /**
     * id Предоставление информации о текущей успеваемости учащегося, ведение электронного дневника и электронного журнала успеваемости
     */
    public static final int SERVICE_ID = 36400129;


    @Autowired
    private Service36400129FormValidator validator;

    public Service36400129Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе",
				"Сведения о ребенке"
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
 		if (binder.getTarget() instanceof Service36400129Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400129Form createNewForm() {
 		return new Service36400129Form();
 	}

     @Override
    protected List<String> getFormFieldsWithFiles(Service36400129Form form, Map<String, Object> model) {
        return Arrays.asList(

        );
    }

}