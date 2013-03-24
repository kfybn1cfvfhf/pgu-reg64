package com.nvision.pgu.web.services.s36400203;

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
@RequestMapping("/services/s" + Service36400203Controller.SERVICE_ID)
@ServiceController(id = Service36400203Controller.SERVICE_ID, title = "Возмещение дополнительных расходов на погребение гражданам, осуществляющим захоронение умерших реабилитированных лиц")
@Version("0.1")
public class Service36400203Controller extends AbstractServiceOrderControllerEDS24<Service36400203Form> {
    /**
     * id Возмещение дополнительных расходов на погребение гражданам, осуществляющим захоронение умерших реабилитированных лиц
     */
    public static final int SERVICE_ID = 36400203;
    @Autowired
    IPrivateRoomDataContainer privateRoomDataContainer;
    @Autowired
    private Service36400203FormValidator validator;

    public Service36400203Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Сведения о заявителе",
                "Дополнительные сведения"
        );
        setStepList(stepList);
    }

    @Override
    protected void fillModelByForm(Map<String, Object> model, Service36400203Form form) throws ShowErrorToUserException {
        super.fillModelByForm(model, form);

        model.put("privateRoomData", this.privateRoomDataContainer);
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400203Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400203Form createNewForm() {
        return new Service36400203Form();
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400203Form form, Map<String, Object> model) {

        return Arrays.asList(
                "rehabilitationCertificateLoad",
                "deathCertificateLoad",
                "certificatePaymentLoad"
        );
    }

    @Override
    protected Map<String, Object> formToMap(Service36400203Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap = new FormAsMapImpl(formAsMap);

        // Копирование имени "другого документа"
        if ("2".equals(form.getAccrualMethod())) {
            formAsMap.remove("nameBankBenefit");
            formAsMap.remove("filialBankBenefit");
            formAsMap.remove("bikBankBenefit");
            formAsMap.remove("corrAccBankBenefit");
            formAsMap.remove("codeFilialBankBenefit");
            formAsMap.remove("clientAccBankBenefit");
        }
            if ("1".equals(form.getAccrualMethod())) {
                formAsMap.remove("postOffice");
        }

        return formAsMap;
    }

}