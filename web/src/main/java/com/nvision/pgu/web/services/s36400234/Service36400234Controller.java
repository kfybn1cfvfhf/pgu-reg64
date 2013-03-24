package com.nvision.pgu.web.services.s36400234;

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

@Controller
@RequestMapping("/services/s" + Service36400234Controller.SERVICE_ID)
@ServiceController(id = Service36400234Controller.SERVICE_ID, title = "Информирование о положении на рынке труда в Саратовской области")
@Version("1.1.1")
public class Service36400234Controller extends AbstractServiceOrderControllerEDS24<Service36400234Form> {
    /**
     * id Информирование о положении на рынке труда в Саратовской области
     */
    public static final int SERVICE_ID = 36400234;
    private static final String APPL_FL = "1";
    private static final String APPL_UL = "2";
    @Autowired
    private Service36400234FormValidator validator;

    public Service36400234Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Тип заявителя",
                "Сведения о заявителе",
                "Сведения о способе получения результата оказания услуги"
        );
        setStepList(stepList);
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400234Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400234Form createNewForm() {
        return new Service36400234Form();
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400234Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        if ((form.getStepNum() == 1) && !goback) {
            if (form.getApplType().equals(APPL_FL)) {
                return new StepProcessingResult(2, "step2-1.html");
            }
            if (form.getApplType().equals(APPL_UL)) {
                return new StepProcessingResult(2, "step2-2.html");
            }
        }

        if ((form.getStepNum() == 3) && goback) {
            if (form.getApplType().equals(APPL_FL)) {
                return new StepProcessingResult(2, "step2-1.html");
            }
            if (form.getApplType().equals(APPL_UL)) {
                return new StepProcessingResult(2, "step2-2.html");
            }
        }

        return stepProcessingResult;
    }

    @Override
    protected Map<String, Object> formToMap(Service36400234Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);

        FormAsMap decoratedFormAsMap = new FormAsMapImpl(formAsMap);

        decoratedFormAsMap.clearForOrdering();

        if (form.getApplType().equals(APPL_FL)) {
            // Физик
            clearUlFields(decoratedFormAsMap);
        } else {
            // Юрик

            decoratedFormAsMap.put("firstName", this.getPrivateRoomDataContainer().getFirstName());
            decoratedFormAsMap.put("lastName", this.getPrivateRoomDataContainer().getLastName());
            decoratedFormAsMap.put("middleName", this.getPrivateRoomDataContainer().getMiddleName());

            clearFisFields(decoratedFormAsMap);
        }

        return decoratedFormAsMap;
    }

    private void clearUlFields(FormAsMap FAM) {
        FAM.remove("org_FullTitle");
        FAM.remove("org_opf");
        FAM.remove("org_sokr");

        FAM.remove("orgPostAddressIndex");
        FAM.remove("orgPostAddressEnterType");
        FAM.remove("orgPostAddressRegion");
        FAM.remove("orgPostAddressRayon");
        FAM.remove("orgPostAddressSettlementType");
        FAM.remove("orgPostAddressCity");
        FAM.remove("orgPostAddressSettlementText");
        FAM.remove("orgPostAddressSettlementDict");
        FAM.remove("orgPostAddressStreetText");
        FAM.remove("orgPostAddressStreetDict");
        FAM.remove("orgPostAddressHouse");
        FAM.remove("orgPostAddressKorpus");
        FAM.remove("orgPostAddressFlat");
        FAM.remove("orgPostAddressCountry");
        FAM.remove("orgPostAddressCountryCode");
        FAM.remove("orgPostAddressCountryInput");
        FAM.remove("orgPostAddressCountrySettlement");

        FAM.remove("org_email");

    }

    private void clearFisFields(FormAsMap FAM) {
        FAM.remove("factAddressIndex");
        FAM.remove("factAddressEnterType");
        FAM.remove("factAddressRegion");
        FAM.remove("factAddressRayon");
        FAM.remove("factAddressSettlementType");
        FAM.remove("factAddressCity");
        FAM.remove("factAddressSettlementText");
        FAM.remove("factAddressSettlementDict");
        FAM.remove("factAddressStreetText");
        FAM.remove("factAddressStreetDict");
        FAM.remove("factAddressHouse");
        FAM.remove("factAddressKorpus");
        FAM.remove("factAddressFlat");
        FAM.remove("factAddressCountry");
        FAM.remove("factAddressCountryCode");
        FAM.remove("factAddressCountryInput");
        FAM.remove("factAddressCountrySettlement");
        FAM.remove("addressPostIndex");

        FAM.remove("addressPostEnterType");
        FAM.remove("addressPostRegion");
        FAM.remove("addressPostRayon");
        FAM.remove("addressPostSettlementType");
        FAM.remove("addressPostCity");
        FAM.remove("addressPostSettlementText");
        FAM.remove("addressPostSettlementDict");
        FAM.remove("addressPostStreetText");
        FAM.remove("addressPostStreetDict");
        FAM.remove("addressPostHouse");
        FAM.remove("addressPostKorpus");
        FAM.remove("addressPostFlat");
        FAM.remove("addressPostCountry");
        FAM.remove("addressPostCountryCode");
        FAM.remove("addressPostCountryInput");
        FAM.remove("addressPostCountrySettlement");

        FAM.remove("phone");
        FAM.remove("email");
    }
}