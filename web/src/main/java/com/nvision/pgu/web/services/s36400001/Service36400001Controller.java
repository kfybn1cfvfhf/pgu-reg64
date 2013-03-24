package com.nvision.pgu.web.services.s36400001;

import com.nvision.pgu.core.controllers.AbstractServiceOrderController;
import com.nvision.pgu.core.annotations.ServiceController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RequestMapping("/services/s" + Service36400001Controller.SERVICE_ID)
@ServiceController(id = Service36400001Controller.SERVICE_ID, title = "Предоставление лицензии на право ведения образовательной деятельности")
@Version("0.0.0.2")
public class Service36400001Controller extends  AbstractServiceOrderControllerEDS24<Service36400001Form> {
       public static final Logger LOGGER = LoggerFactory.getLogger(Service36400001Controller.class);
    /**
     * id Получение лицензии на право ведения образовательной деятельности
     */
    public static final int SERVICE_ID = 36400001;


    @Autowired
    private Service36400001FormValidator validator;

    public Service36400001Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе и соискателе лицензии",
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
 		if (binder.getTarget() instanceof Service36400001Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400001Form createNewForm() {
 		return new Service36400001Form();
 	}

       @Override
    protected List<String> getFormFieldsWithFiles(Service36400001Form form, Map<String, Object> model) {
        return Arrays.asList(
"load_doc1",
"load_doc0",
"load_doc2",
"load_doc6",
"load_doc13",
"load_doc14",
"load_doc3",
"load_doc4",
"load_doc15",
"load_doc5",
"load_doc7",
"load_doc8"
        );
    }

}