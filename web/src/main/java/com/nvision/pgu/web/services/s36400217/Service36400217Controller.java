package com.nvision.pgu.web.services.s36400217;

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
 */
@Controller
@RequestMapping("/services/s" + Service36400217Controller.SERVICE_ID)
@ServiceController(id = Service36400217Controller.SERVICE_ID, title = "Изменение цели разрешенного использования земельного участка и (при наличии) объекта капитального строительства")
@Version("1.3.5")

public class Service36400217Controller extends AbstractServiceOrderControllerEDS24<Service36400217Form> {
    /**
     * id Изменение цели разрешенного использования земельного участка и (при наличии) объекта капитального строительства
     */
    public static final int SERVICE_ID = 36400217;
    @Autowired
    private Service36400217FormValidator validator;

    public Service36400217Controller() {
        List<String> stepList = Arrays.asList(
                "Тип заявителя",
                "Сведения о заявителе",
                "Сведения о земельном участке и (при наличии) объекте капитального строительства",
                "Электронные копии документов"
        );
        setStepList(stepList);
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400217Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400217Form createNewForm() {
        return new Service36400217Form();
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400217Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (stepProcessingResult.getStepNum() == 2 && (form.getDov_enable_changed().booleanValue() || form.getApplType_changed().booleanValue())) {
            if ("1".equalsIgnoreCase(form.getApplType()) && "off".equalsIgnoreCase(form.getDov_enable())) {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            } else {
                form.clearApplicantAttributes();
            }

            form.setDov_enable_changed(false);
            form.setApplType_changed(false);
        }
    }

    protected List<String> getFormFieldsWithFiles(Service36400217Form form, Map<String, Object> model) {
        return Arrays.asList(

                "identityDocLoad",
                "dovDovLoad",
                "dovPasLoad",
                "dovUlPasLoad",
                "dovUlNonDovLoad",
                "dovUlDovLoad",
                "docITS_Obj",
                "docSoglasie",
                "docVypKadastr",
                "docShemRasp"

        );
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400217Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        if (stepProcessingResult.getStepNum() == 2) {
            if ("1".equalsIgnoreCase(form.getApplType())) {
                // Физик
                if ("off".equalsIgnoreCase(form.getDov_enable())) {
                    stepProcessingResult = new StepProcessingResult(2, "step2fisnondov.html");
                } else {
                    stepProcessingResult = new StepProcessingResult(2, "step2fisdov.html");
                }
            } else {
                // Юрик
                if ("1".equalsIgnoreCase(form.getDovUlType())) {
                    stepProcessingResult = new StepProcessingResult(2, "step2ulnondov.html");
                } else {
                    stepProcessingResult = new StepProcessingResult(2, "step2uldov.html");
                }
            }
        }

        return stepProcessingResult;
    }

    private void clearFisDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovPasLoad");
        FAM.clearFileLoadField("dovDovLoad");
    }

    private void clearFisFields(FormAsMap FAM) {
        FAM.remove("dov_enable");
        FAM.remove("phone");
        FAM.remove("fax");
        FAM.remove("email");
        FAM.remove("identityDocType");
        FAM.remove("passSeria");
        FAM.remove("passNo");
        FAM.remove("passDate");
        FAM.remove("passFrom");
        FAM.remove("otherDocTypeName");
        FAM.clearFileLoadField("identityDocLoad");
        clearFisDovFields(FAM);
    }

    private void clearUlDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovUlDovLoad");
    }

    private void clearUlNonDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovUlNonDovLoad");
    }

    private void clearUlFields(FormAsMap FAM) {
        FAM.remove("dovUlType");
        FAM.remove("org_FullTitle");
        FAM.remove("org_opf");
        FAM.remove("org_SmallTitle");
        FAM.remove("org_phone");
        FAM.remove("org_fax");
        FAM.remove("org_email");
        FAM.remove("org_firstName");
        FAM.remove("org_lastName");
        FAM.remove("org_middleName");
        FAM.clearFileLoadField("dovUlPasLoad");
        clearUlDovFields(FAM);
        clearUlNonDovFields(FAM);
    }

    @Override
    protected Map<String, Object> formToMap(Service36400217Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap = new FormAsMapImpl(formAsMap);

        decoratedFormAsMap.clearForOrdering();

        if ("5".equalsIgnoreCase(form.getIdentityDocType())) {
            decoratedFormAsMap.put("identityDocType", form.getOtherDocTypeName());
        }

        if ("1".equalsIgnoreCase(form.getApplType())) {
            // Физик
            clearUlFields(decoratedFormAsMap);
            if ("off".equalsIgnoreCase(form.getDov_enable())) {
                // Без доверенности
                clearFisDovFields(decoratedFormAsMap);
            }
        } else {
            // Юрик
            clearFisFields(decoratedFormAsMap);
            if ("1".equalsIgnoreCase(form.getDovUlType())) {
                // Без доверенности
                clearUlDovFields(decoratedFormAsMap);
            } else {
                // по доверенности
                clearUlNonDovFields(decoratedFormAsMap);
            }
        }
        return formAsMap;
    }

}