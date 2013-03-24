package com.nvision.pgu.web.services.s36400016;

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


@Controller
@RequestMapping("/services/s" + Service36400016Controller.SERVICE_ID)
@ServiceController(id = Service36400016Controller.SERVICE_ID, title = "Предоставление лицензии на осуществление деятельности, связанной с оборотом наркотических средств и психотропных веществ")
@Version("0.0.0.1")
public class Service36400016Controller extends AbstractServiceOrderControllerEDS24<Service36400016Form> {
    public static final Logger LOGGER = LoggerFactory.getLogger(Service36400016Controller.class);
    /**
     * id Подача документов на предоставление лицензии на ведение деятельности, связанной с оборотом наркотических средств и психотропных веществ
     */
    public static final int SERVICE_ID = 36400016;


    @Autowired
    private Service36400016FormValidator validator;

    public Service36400016Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о  юридическом лице",
				"Сведения об объектах лицензирования",
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
 		if (binder.getTarget() instanceof Service36400016Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400016Form createNewForm() {
 		return new Service36400016Form();
 	}

    protected List<String> getFormFieldsWithFiles(Service36400016Form form, Map<String, Object> model) {
        return Arrays.asList(
"load_doc2",
"load_doc13",
"load_doc5",
"load_doc6",
"load_doc7",
"load_doc8",
"load_doc16",
"load_doc17",
"load_doc18",
"load_doc10",
"load_doc19",
"load_doc20",
"load_doc21",
"load_doc22",
"load_doc12"
        );
    }
}