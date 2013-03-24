package com.nvision.pgu.web.services.s36400218;


import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.exceptions.ShowErrorToUserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RequestMapping("/services/s" + Service36400218Controller.SERVICE_ID)
@ServiceController(id = Service36400218Controller.SERVICE_ID, title = "Выдача постановлений по присвоению адреса земельным участкам и объектам капитального строительства")
@Version("2.0")
public class Service36400218Controller extends AbstractServiceOrderControllerEDS24<Service36400218Form> {
    public static final Logger LOGGER = LoggerFactory.getLogger(Service36400218Controller.class);
    /**
     * id Выдача постановлений по присвоению адреса земельным участкам и объектам капитального строительства
     */
    public static final int SERVICE_ID = 36400218;
    @Autowired
    IPrivateRoomDataContainer privateRoomDataContainer;
    @Autowired
    private Service36400218FormValidator validator;

    public Service36400218Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Тип заявителя",
                "Сведения о заявителе",
                "Сведения об объекте недвижимости"
        );
        setStepList(stepList);
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400218Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400218Form createNewForm() {
        return new Service36400218Form();
    }

    @Override
    protected void fillModelByForm(Map<String, Object> model, Service36400218Form form) throws ShowErrorToUserException {
        super.fillModelByForm(model, form);

        model.put("privateRoomData", this.privateRoomDataContainer);
    }

    // сценарий 1
    private boolean isScenario1(Service36400218Form form) {
        return "1".equals(form.getApplType()) &&
                "off".equalsIgnoreCase(form.getDov_enable());
    }

    // сценарий 2
    private boolean isScenario2(Service36400218Form form) {
        return "1".equals(form.getApplType()) &&
                "on".equalsIgnoreCase(form.getDov_enable());
    }

    // сценарий 3
    private boolean isScenario3(Service36400218Form form) {
        if (form.getDovUlType() == null) return false;
        return "2".equals(form.getDovUlType()) &&
                "2".equals(form.getApplType());
    }

    // сценарий 4
    private boolean isScenario4(Service36400218Form form) {
        if (form.getDovUlType() == null) return false;
        return "1".equals(form.getDovUlType()) &&
                "2".equals(form.getApplType());
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400218Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        String step2_2 = "step2-2.html";
        String step2_3 = "step2-3.html";
        String step2_4 = "step2-4.html";
        String step2_5 = "step2-5.html";

        // шаг 2
        if (stepProcessingResult.getStepNum() == 2) {
            // begin step 2 copy
            if (isScenario1(form))
                return new StepProcessingResult(2, step2_2);
            if (isScenario2(form))
                return new StepProcessingResult(2, step2_3);
            if (isScenario3(form))
                return new StepProcessingResult(2, step2_4);
            if (isScenario4(form))
                return new StepProcessingResult(2, step2_5);
            // end step 2 copy
            if (goback)
                stepProcessingResult.setStepNum(1);
        }

        return stepProcessingResult;
    }

    // автоочистка полей
    @Override
    protected Map<String, Object> formToMap(Service36400218Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap = new FormAsMapImpl(formAsMap);

        if (isScenario3(form) || isScenario4(form)) { // clear step 2,3 fields
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
            decoratedFormAsMap.remove("factAddress");
            decoratedFormAsMap.remove("address");
            decoratedFormAsMap.remove("addressEq");
            decoratedFormAsMap.remove("addressPost");
            decoratedFormAsMap.remove("phone");
            decoratedFormAsMap.remove("email");
            decoratedFormAsMap.remove("identityDocType");
            decoratedFormAsMap.remove("otherDocTypeName");
            decoratedFormAsMap.remove("passSeria");
            decoratedFormAsMap.remove("passNo");
            decoratedFormAsMap.remove("passDate");
            decoratedFormAsMap.remove("passFrom");
            decoratedFormAsMap.clearFileLoadField("identityDocLoad");
        }

        if (isScenario1(form) || isScenario2(form)) { // clear step 4,5 fields
            decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovUlPasLoad");
            decoratedFormAsMap.remove("org_opf");
            decoratedFormAsMap.remove("org_FullTitle");
            decoratedFormAsMap.remove("org_SmallTitle");
            decoratedFormAsMap.remove("org_addressUr");
            decoratedFormAsMap.remove("org_factAddressUr");
            decoratedFormAsMap.remove("org_addressEq");
            decoratedFormAsMap.remove("org_addressPost");
            decoratedFormAsMap.remove("org_phone");
            decoratedFormAsMap.remove("org_fax");
            decoratedFormAsMap.remove("org_email");
            decoratedFormAsMap.remove("org_InnUl");
            decoratedFormAsMap.remove("org_OgrnUl");
            decoratedFormAsMap.clearFileLoadField("docMvRegULLoad");
        }

        if (isScenario1(form)) { // clear fields which are specific for step 3
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
        }

        if (isScenario3(form)) { // clear fields which are specific for step 5
            decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
        }

        if (isScenario4(form)) { // clear fields which are specific for step 4
            decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
        }

        if (isScenario1(form) || isScenario2(form))
            if ("5".equals(form.getIdentityDocType())) {
                formAsMap.put("identityDocType", form.getOtherDocTypeName());
            }

        return formAsMap;
    }

    // обработка возврата назад
    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400218Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        // на 3 шаге есть страницы 4Ш и 6Ш, в которых не должно быть автоматически заполненных полей
        if (stepProcessingResult.getStepNum() == 2 && form.getRepresentativeStatusChanged()) {
            if (isScenario1(form))  // эти страницы выпадают на сценариях 2 5 6
                form.fillApplicantAttributesWithPrivateRoomData(privateRoomDataContainer);
            if (isScenario2(form))
                form.clearApplicantAttributes();

            form.setRepresentativeStatusChanged(false);
        }
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400218Form form, Map<String, Object> model) {

        return Arrays.asList(
                "identityDocLoad",
                "dovDovLoad",
                "dovPasLoad",
                "dovUlNonDovLoad",
                "dovUlPasLoad",
                "dovUlDovLoad",
                "docMvRegULLoad",
                "landDocLoad",
                "capitalDocLoad",
                "techDocLoad",
                "schemDocLoad"
        );

    }

}