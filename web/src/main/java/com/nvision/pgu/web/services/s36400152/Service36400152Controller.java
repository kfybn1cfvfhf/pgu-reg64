package com.nvision.pgu.web.services.s36400152;

import com.nvision.pgu.core.annotations.ServiceController;
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
@RequestMapping("/services/s" + Service36400152Controller.SERVICE_ID)
@ServiceController(id = Service36400152Controller.SERVICE_ID, title = "Выдача копий архивных документов, подтверждающих право на владение землей")
@Version("1.4.4.2")

public class Service36400152Controller extends AbstractServiceOrderControllerEDS24<Service36400152Form> {
    /**
     * id Выдача копий архивных документов, подтверждающих право на владение землей
     */
    public static final int SERVICE_ID = 36400152;

    @Autowired
    private Service36400152FormValidator validator;

    public Service36400152Controller() {
        List<String> stepList = Arrays.asList(
                "Тип заявителя",
                "Сведения о заявителе",
                "Сведения о запрашиваемом документе"
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
        if (binder.getTarget() instanceof Service36400152Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400152Form createNewForm() {
        return new Service36400152Form();
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400152Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (stepProcessingResult.getStepNum() == 2 && (form.getDov_enable_changed().booleanValue() || form.getApplType_changed().booleanValue() || form.getDovUlType_changed().booleanValue())) {

            if("1".equalsIgnoreCase(form.getApplType()) && "off".equalsIgnoreCase(form.getDov_enable())) {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            } else {
                form.clearApplicantAttributes();
            }

            form.setDov_enable_changed(false);
            form.setApplType_changed(false);
            form.setDovUlType_changed(false);
        }
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400152Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        if(stepProcessingResult.getStepNum() == 2) {

            if("1".equalsIgnoreCase(form.getApplType())) {
                // Физик
                if("off".equalsIgnoreCase(form.getDov_enable())) {
                    stepProcessingResult = new StepProcessingResult(2, "step2fisnondov.html");
                } else {
                    stepProcessingResult = new StepProcessingResult(2, "step2fisdov.html");
                }
            } else {
                // Юрик
                if("1".equalsIgnoreCase(form.getDovUlType())) {
                    stepProcessingResult = new StepProcessingResult(2, "step2ulnondov.html");
                } else {
                    stepProcessingResult = new StepProcessingResult(2, "step2uldov.html");
                }
            }
        }

        return stepProcessingResult;
    }

    private void clearFisDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovDovLoad");
        FAM.clearFileLoadField("dovPasLoad");
    }

    private void clearFisFields(FormAsMap FAM) {
        FAM.remove("dov_enable");
        FAM.remove("address");
        FAM.remove("factAddressEq");
        FAM.remove("factAddress");
        FAM.remove("addressEq");
        FAM.remove("addressPost");
        FAM.remove("phone");
        FAM.remove("identityDocType");
        FAM.remove("passSeria");
        FAM.remove("passNo");
        FAM.remove("passDate");
        FAM.remove("passFrom");
        FAM.clearFileLoadField("identityDocLoad");
        clearFisDovFields(FAM);
    }


    private void clearUlDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovUlDovLoad");
    }

    private void clearUlNoDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovUlNonDovLoad");
    }

    private void clearUlFields(FormAsMap FAM) {
        FAM.remove("dovUlType");
        FAM.remove("org_FullTitle");
        FAM.remove("org_opf");
        FAM.remove("org_addressUr");
        FAM.remove("org_phone");
        FAM.remove("org_fax");
        FAM.remove("org_middleName");
        FAM.remove("org_lastName");
        FAM.remove("org_firstName");
        FAM.clearFileLoadField("dovUlPasLoad");
        clearUlDovFields(FAM);
        clearUlNoDovFields(FAM);
    }

    @Override
    protected Map<String, Object> formToMap(Service36400152Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

        decoratedFormAsMap.clearForOrdering();

        if("5".equalsIgnoreCase(form.getIdentityDocType())) {
            formAsMap.put("identityDocType", form.getOtherDocTypeName());
        }


        if("1".equalsIgnoreCase(form.getApplType())) {
            // Физик
            clearUlFields(decoratedFormAsMap);
            if("off".equalsIgnoreCase(form.getDov_enable())) {
                // Без доверенности
                clearFisDovFields(decoratedFormAsMap);
            }
        } else {
            // Юрик
            clearFisFields(decoratedFormAsMap);
            if("1".equalsIgnoreCase(form.getDovUlType())) {
                // Без доверенности
                clearUlDovFields(decoratedFormAsMap);
            } else {
                // по доверенности
                clearUlNoDovFields(decoratedFormAsMap);
            }
        }

        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400152Form form, Map<String, Object> model) {
        return Arrays.asList(
                "identityDocLoad",
                "dovDovLoad",
                "dovPasLoad",
                "dovUlNonDovLoad",
                "dovUlPasLoad",
                "dovUlDovLoad",
                "actDocLoad"
        );
    }


}