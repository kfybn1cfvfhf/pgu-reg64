package com.nvision.pgu.web.services.s36400220;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.rules.api.RuleException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
import ru.lanit.samara.pgu.core.util.formasmap.FormAsMap;
import ru.lanit.samara.pgu.core.util.formasmap.FormAsMapImpl;
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
@RequestMapping("/services/s" + Service36400220Controller.SERVICE_ID)
@ServiceController(id = Service36400220Controller.SERVICE_ID, title = "Признание граждан участниками подпрограммы \"Обеспечение жильем молодых семей\" федеральной целевой программы \"Жилище\" на 2011 - 2015 годы")
@Version("2.1")
public class Service36400220Controller extends AbstractServiceOrderControllerEDS24<Service36400220Form> {
    /**
     * id Признание граждан участниками подпрограммы "Обеспечение жильем молодых семей" федеральной целевой программы "Жилище" на 2011 - 2015 годы"
     */
    public static final int SERVICE_ID = 36400220;


    @Autowired
    private Service36400220FormValidator validator;

    public Service36400220Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Электронные копии документов"
            );
        setStepList(stepList);
    }

    @Override
    public void applyInitRules(Service36400220Form form) throws RuleException {
        form.setAddressSettlementType("1");
        form.setAddressPostSettlementType("1");
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400220Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        if (stepProcessingResult.getStepNum() == 2) {

            if ("on".equalsIgnoreCase(form.getDov_enable())) {
                stepProcessingResult = new StepProcessingResult(2, "step2Dov.html");
            }   else {
                stepProcessingResult = new StepProcessingResult(2, "step2NoDov.html");
            }
        }

        return stepProcessingResult;
    }

     @Override
    protected void patchModelAndFormOnStepProcessing(Service36400220Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

         if(stepProcessingResult.getStepNum() == 2 && form.getDov_enable_changed().booleanValue()) {
            if("on".equalsIgnoreCase(form.getDov_enable())){
                form.clearApplicantAttributes();
            } else {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            }
             form.setDov_enable_changed(false);
        }
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

	@Override
    protected void initBinderInternal(WebDataBinder binder)
 	{
 		if (binder.getTarget() instanceof Service36400220Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400220Form createNewForm() {
 		return new Service36400220Form();
 	}
    @Override
   protected List<String> getFormFieldsWithFiles(Service36400220Form form, Map<java.lang.String, Object> model) {
        return Arrays.asList(
        "identityDocLoad",
        "dovDovLoad",
        "dovPasLoad",
        "docLoadMarriageCertficate",
        "docDokhod",
        "docLoadNeedingHousing",
        "docLoadDokhod",
        "docLoadDeklENVD"
        );
    }

    @Override
    protected Map<String, Object> formToMap(Service36400220Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

       decoratedFormAsMap.clearForOrdering();

        if("off".equalsIgnoreCase(form.getDov_enable()))
        {
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
        }

        if("5".equalsIgnoreCase(form.getIdentityDocType())) {
            decoratedFormAsMap.put("identityDocType", form.getOtherDocTypeName());
        } else {
            decoratedFormAsMap.put("identityDocType", form.getIdentityDocType());
        }
        decoratedFormAsMap.remove("otherDocTypeName");

        return formAsMap;
    }


}