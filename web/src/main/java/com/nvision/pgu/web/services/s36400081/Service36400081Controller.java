package com.nvision.pgu.web.services.s36400081;

import com.nvision.pgu.core.annotations.ServiceController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.blocks.AbstractServiceOrderControllerEDS24;
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
@RequestMapping("/services/s" + Service36400081Controller.SERVICE_ID)
@ServiceController(id = Service36400081Controller.SERVICE_ID, title = "Присвоение, подтверждение или снятие квалификационных категорий специалистов, работающих в системе здравоохранения Российской Федерации")
@Version("0.3")
public class Service36400081Controller extends AbstractServiceOrderControllerEDS24<Service36400081Form> {
    public static final Logger LOGGER = LoggerFactory.getLogger(Service36400081Controller.class);
    /**
     * id Присвоение, подтверждение или снятие квалификационных категорий специалистов, работающих в системе здравоохранения Российской Федерации
     */
    public static final int SERVICE_ID = 36400081;
    public static String region = "";
    public static final String XML_PREFIX = "req";

    //@Autowired
    //private Service36400081FormValidator validator;

    public Service36400081Controller() {
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
 		//if (binder.getTarget() instanceof Service36400081Form) {
 		//	super.setValidator(validator);
 		//	binder.setValidator(validator);
 		//}
 	}
	
	@Override
 	protected Service36400081Form createNewForm() {
 		return new Service36400081Form();
 	}

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400081Form form, Map<String, Object> model) {
        return Arrays.asList(
                "docLoadQualificationLeaf",
                "docLoadReportOnWork",
                "othersDocLoad"
        );
    }
}