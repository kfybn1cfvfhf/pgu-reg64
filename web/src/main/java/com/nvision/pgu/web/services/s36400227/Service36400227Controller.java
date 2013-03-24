package com.nvision.pgu.web.services.s36400227;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.rules.api.RuleException;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;


/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 *
 */
@Controller
@RequestMapping("/services/s" + Service36400227Controller.SERVICE_ID)
@ServiceController(id = Service36400227Controller.SERVICE_ID, title = "Подача электронной заявки на выдачу свидетельства о перемене имени")

public class Service36400227Controller extends AbstractNakhodkaController<Service36400227Form> {
    /**
     * id Подача электронной заявки на выдачу свидетельства о перемене имени
     */
    private static final String ZAGS_DICTIONARY = "Nahodka_Zagses";
    public static final int SERVICE_ID = 36400227;

    private String id_agency_in;


    @Autowired
    private Service36400227FormValidator validator;

    public Service36400227Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Выбор органа ЗАГС обращения",
				"Сведения о заявителе",
				"Сведения о факте рождения заявителя",
				"Место жительства заявителя",
				"ФИО после перемены имени",
				"Запись на прием"
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
 		if (binder.getTarget() instanceof Service36400227Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400227Form createNewForm() {
 		return new Service36400227Form();
 	}

    @Override
    public void applyInitRules(Service36400227Form form) throws RuleException {

        String mobile = form.getContact_phone_home();
        String phone = form.getContact_phone_mobile();
        if(!mobile.isEmpty())
            phone = phone + "," + mobile;

        form.setContact_phone(phone);
    }

    @Override
    public void applyStepRules(Service36400227Form form) throws RuleException {
        Integer stepNum = form.getStepNum();

        String grajd;
        if (stepNum == null) {

        } else {
            switch (stepNum) {

                case 1:

                    break;

                case 2:
                    this.id_agency_in = form.getId_agency_in();
                    break;

                case 3:

                    break;
                case 4:

                    break;

                case 5:

                    break;

            }
        }
    }




}