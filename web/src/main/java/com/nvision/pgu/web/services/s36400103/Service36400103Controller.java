package com.nvision.pgu.web.services.s36400103;


import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.exceptions.ShowErrorToUserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;
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
@RequestMapping("/services/s" + Service36400103Controller.SERVICE_ID)
@ServiceController(id = Service36400103Controller.SERVICE_ID, title = "Выдача градостроительных планов земельных участков")
@Version("1.7.3")
public class Service36400103Controller extends AbstractServiceOrderControllerEDS24<Service36400103Form> {
    /**
     * id Выдача градостроительных планов земельных участков
     */
    public static final int SERVICE_ID = 36400103;
    @Autowired
    IPrivateRoomDataContainer privateRoomDataContainer;
    @Autowired
    private Service36400103FormValidator validator;

    public Service36400103Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Тип заявителя",
                "Сведения о заявителе",
                "Сведения о других правообладателях земельного участка, являющихся физическими лицами",
                "Сведения о других правообладателях земельного участка, являющихся юридическими лицами",
                "Сведения о земельном участке",
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
        if (binder.getTarget() instanceof Service36400103Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400103Form createNewForm() {
        return new Service36400103Form();
    }

    // автоочистка полей
    @Override
    protected Map<String, Object> formToMap(Service36400103Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap = new FormAsMapImpl(formAsMap);

        // очистка полей физлица, если заявитель - юл
        if ("2".equals(form.getApplType())) {
            decoratedFormAsMap.remove("dov_enable");
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
            decoratedFormAsMap.remove("phone");
            decoratedFormAsMap.remove("email");
            decoratedFormAsMap.remove("identityDocType");
            decoratedFormAsMap.remove("otherDocTypeName");
            decoratedFormAsMap.remove("passSeria");
            decoratedFormAsMap.remove("passNo");
            decoratedFormAsMap.remove("passDate");
            decoratedFormAsMap.remove("passFrom");
            decoratedFormAsMap.clearFileLoadField("identityDocLoad");

            decoratedFormAsMap.remove("anotherFl_enable");

            if ("1".equals(form.getDovUlType()))
                decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
            if ("2".equals(form.getDovUlType()))
                decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
        }

        // очистка полей юрлица, если заявитель - фл
        if ("1".equals(form.getApplType())) {
            decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovUlPasLoad");

            decoratedFormAsMap.remove("org_opf");
            decoratedFormAsMap.remove("org_FullTitle");

            decoratedFormAsMap.remove("org_phone");
            decoratedFormAsMap.remove("org_fax");
            decoratedFormAsMap.remove("org_email");

            decoratedFormAsMap.remove("org_lastName");
            decoratedFormAsMap.remove("org_firstName");
            decoratedFormAsMap.remove("org_middleName");

            decoratedFormAsMap.remove("org_InnUl");
            decoratedFormAsMap.remove("org_OgrnUl");

            decoratedFormAsMap.remove("anotherUl_enable");

            if("off".equalsIgnoreCase(form.getDov_enable())) {
                decoratedFormAsMap.clearFileLoadField("dovDovLoad");
                decoratedFormAsMap.clearFileLoadField("dovPasLoad");
            }
        }

        if (form.getIdentityDocType().equals("5"))
            formAsMap.put("identityDocType", form.getOtherDocTypeName());


        return formAsMap;
    }

    @Override
    protected void fillModelByForm(Map<String, Object> model, Service36400103Form form) throws ShowErrorToUserException {
        super.fillModelByForm(model, form);

        model.put("privateRoomData", this.privateRoomDataContainer);
    }

    // выбор страницы второго шага
    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400103Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        if (stepProcessingResult.getStepNum() == 2) {
            // step 2 logic
            if ("1".equalsIgnoreCase(form.getApplType())) {
                if ("off".equalsIgnoreCase(form.getDov_enable()))
                    return new StepProcessingResult(2, "step2-Fiz-noDov.html");
                if ("on".equalsIgnoreCase(form.getDov_enable()))
                    return new StepProcessingResult(2, "step2-Fiz-Dov.html");
            }
            if ("2".equalsIgnoreCase(form.getApplType())) {
                if ("1".equals(form.getDovUlType()))
                    return new StepProcessingResult(2, "step2-Ur-noDov.html");
                if ("2".equals(form.getDovUlType()))
                    return new StepProcessingResult(2, "step2-Ur-Dov.html");
            }
            // /step 2 logic
        }

        if (stepProcessingResult.getStepNum() == 3) {
            // step 3 logic
            if ("on".equalsIgnoreCase(form.getAnotherFl_enable()))
                return stepProcessingResult;
            if ("off".equalsIgnoreCase(form.getAnotherFl_enable()))
                if (!goback)
                    stepProcessingResult.setStepNum(4);
                else {
                    // step 2 logic
                    if ("1".equalsIgnoreCase(form.getApplType())) {
                        if ("off".equalsIgnoreCase(form.getDov_enable()))
                            return new StepProcessingResult(2, "step2-Fiz-noDov.html");
                        if ("on".equalsIgnoreCase(form.getDov_enable()))
                            return new StepProcessingResult(2, "step2-Fiz-Dov.html");
                    }
                    if ("2".equalsIgnoreCase(form.getApplType())) {
                        if ("1".equals(form.getDovUlType()))
                            return new StepProcessingResult(2, "step2-Ur-noDov.html");
                        if ("2".equals(form.getDovUlType()))
                            return new StepProcessingResult(2, "step2-Ur-Dov.html");
                    }
                    // /step 2 logic
                }
            // /step3 logic
        }

        if (stepProcessingResult.getStepNum() == 4) {
            // step 4 logic
            if ("on".equalsIgnoreCase(form.getAnotherUl_enable()))
                return stepProcessingResult;
            if ("off".equalsIgnoreCase(form.getAnotherUl_enable()))
                if (!goback)
                    stepProcessingResult.setStepNum(5);
                else {
                    if (form.getAnotherFl_enable().equalsIgnoreCase("on"))
                        stepProcessingResult.setStepNum(3);
                    else {
                        // step 2 logic
                        if ("1".equalsIgnoreCase(form.getApplType())) {
                            if ("off".equalsIgnoreCase(form.getDov_enable()))
                                return new StepProcessingResult(2, "step2-Fiz-noDov.html");
                            if ("on".equalsIgnoreCase(form.getDov_enable()))
                                return new StepProcessingResult(2, "step2-Fiz-Dov.html");
                        }
                        if ("2".equalsIgnoreCase(form.getApplType())) {
                            if ("1".equals(form.getDovUlType()))
                                return new StepProcessingResult(2, "step2-Ur-noDov.html");
                            if ("2".equals(form.getDovUlType()))
                                return new StepProcessingResult(2, "step2-Ur-Dov.html");
                        }
                        // /step 2 logic
                    }
                }
            ;
        }

        return stepProcessingResult;
    }

    // для очистки полей 2 шага (требуется для обработки возврата назад)
    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400103Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (stepProcessingResult.getStepNum() == 2 && form.getRepresentativeStatusChanged()) {
            if ("on".equalsIgnoreCase(form.getDov_enable())) {
                form.clearApplicantAttributes();
            } else {
                form.fillApplicantAttributesWithPrivateRoomData(privateRoomDataContainer);
            }

            form.setRepresentativeStatusChanged(false);
        }
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400103Form form, Map<String, Object> model) {

        return Arrays.asList(
                "identityDocLoad",
                "dovDovLoad",
                "dovPasLoad",
                "dovUlNonDovLoad",
                "dovUlDovLoad",
                "dovUlPasLoad",
                "fl_owner_identityDocLoad",
                "tuDocLoad",
                "topographyDocLoad",
                "lowLandDocLoad",
                "lowObjDocLoad",
                "techPasDocLoad",
                "kadastrDocLoad"
        );

    }

}