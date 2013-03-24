package com.nvision.pgu.web.services.s36400052;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.controllers.AbstractServiceOrderController;
import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.util.version.Version;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/services/s" + Service36400052Controller.SERVICE_ID)
@ServiceController(id = Service36400052Controller.SERVICE_ID, title = "Выдача дубликата документа, подтверждающего наличие лицензии на фармацевтическую деятельность")
@Version("0.1")
public class Service36400052Controller extends AbstractServiceOrderControllerEDS24<Service36400052Form> {
    /**
     * id Выдача дубликата лицензии/копии лицензии на осуществление медицинской деятельности (с выбором документа)
     */
    public static final int SERVICE_ID = 36400052;


    @Autowired
    private Service36400052FormValidator validator;

    public Service36400052Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения заявителя – индивидуального предпринимателя",
				"Сведения заявителя – юридического лица"
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
 		if (binder.getTarget() instanceof Service36400052Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400052Form createNewForm() {
 		return new Service36400052Form();
 	}



    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400052Form form, boolean goback, Map<String, Object> model) {
        final StepProcessingResult res = super.determineNextStepNumOnStepProcessing(form, goback, model);
        if (form.getStepNum() == 1)
            if ("2".equalsIgnoreCase(form.getDeclarant())) {
                res.setStepNum(3);
                form.setLastStepNum(3);
            } else {
                res.setStepNum(2);
                form.setLastStepNum(2);
            }

        if (form.getStepNum() > 1 && goback)
            res.setStepNum(1);

        if (form.getStepNum() == 2 && !goback)
            res.setKind(StepProcessingResultKind.TO_ORDERING);

        return res;
    }


           @Override
    protected List<String> getFormFieldsWithFiles(Service36400052Form form, Map<String, Object> model) {
return Arrays.asList(
 "inn",
 "egripLoad",
 "load_doc_a2",
 "load_doc_a1",
 "load_doc_b3",
 "load_doc_a3"
        );
           }
}