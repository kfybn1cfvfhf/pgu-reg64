package com.nvision.pgu.web.services.s36400004;                                  import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.util.version.Version;

import java.util.*;

import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/services/s" + Service36400004Controller.SERVICE_ID)
@ServiceController(id = Service36400004Controller.SERVICE_ID, title = "Выдача свидетельства о государственной аккредитации образовательных учреждений (научных организаций)")
@Version("1.2.2")
public class Service36400004Controller extends AbstractServiceOrderControllerEDS24<Service36400004Form> {
    /**
     * id Выдача свидетельства о государственной аккредитации образовательных учреждений (организаций)
     */
    public static final int SERVICE_ID = 36400004;


    @Autowired
    private Service36400004FormValidator validator;

    public Service36400004Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе",
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
 		if (binder.getTarget() instanceof Service36400004Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400004Form createNewForm() {
 		return new Service36400004Form();
 	}

         protected List<String> getFormFieldsWithFiles(Service36400004Form form, Map<String, Object> model) {
        return Arrays.asList(
"load_doc1",
"load_doc0",
"load_doc3",
"load_doc4",
"load_doc6",
"load_doc2"
        );
    }

}