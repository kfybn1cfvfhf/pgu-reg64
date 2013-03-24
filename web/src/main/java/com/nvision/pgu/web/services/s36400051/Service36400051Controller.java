package com.nvision.pgu.web.services.s36400051;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.controllers.AbstractServiceOrderController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("/services/s" + Service36400051Controller.SERVICE_ID)
@ServiceController(id = Service36400051Controller.SERVICE_ID, title = "Переоформление документа, подтверждающего наличие лицензии на медицинскую деятельность для ЮЛ")

public class Service36400051Controller extends AbstractServiceOrderController<Service36400051Form> {
    /**
     * id Переоформление документа, подтверждающего наличие лицензии на медицинскую деятельность для ЮЛ
     */
    public static final int SERVICE_ID = 36400051;


    @Autowired
    private Service36400051FormValidator validator;

    public Service36400051Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе",
				"Сведения о лицензиате - индивидуальном предпринимателе",
				"Сведения о причине переоформления лицензии",
				"Электронные копии документов и дополнительные сведения (при необходимости)"
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
 		if (binder.getTarget() instanceof Service36400051Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400051Form createNewForm() {
        Service36400051Form form = new Service36400051Form();
        form.setDicRegistry(getDicRegistry());
        return form;
 	}

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400051Form form, boolean goback, Map<String, Object> model) {
        final StepProcessingResult res = super.determineNextStepNumOnStepProcessing(form, goback, model);
        /*
        if (form.getStepNum() == 3)
            if ("1".equals(form.getLic_reason())) {
                res.setStepNum(4);
                form.setLastStepNum(4);
            } else if ("2".equals(form.getLic_reason()) || "3".equals(form.getLic_reason()) || "4".equals(form.getLic_reason())) {
                res.setStepNum(5);
                form.setLastStepNum(5);
            } else if ("7".equals(form.getLic_reason())) {
                res.setStepNum(6);
                form.setLastStepNum(6);
            } else if ("5".equals(form.getLic_reason())) {
                res.setStepNum(7);
                form.setLastStepNum(7);
            } else if ("6".equals(form.getLic_reason())) {
                res.setStepNum(8);
                form.setLastStepNum(8);
            }

        if (form.getStepNum() > 3 && goback)
            res.setStepNum(3);

        if (form.getStepNum() > 3 && !goback)
            res.setKind(StepProcessingResultKind.TO_ORDERING);
        */
        return res;
    }

}