package com.nvision.pgu.web.services.s36400243;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.util.version.Version;

import java.util.Arrays;


/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 */
@Controller
@RequestMapping("/services/s" + Service36400243Controller.SERVICE_ID)
@ServiceController(id = Service36400243Controller.SERVICE_ID,
        title = "Содействие работодателям в подборе необходимых работников")
@Version("0.1")
public class Service36400243Controller extends AbstractServiceOrderControllerEDS24<Service36400243Form> {
public static final Logger LOGGER = LoggerFactory.getLogger(Service36400243Controller.class);
    /**
     * id Содействие работодателям в подборе необходимых работников
     */
    public static final int SERVICE_ID = 36400243;
    @Autowired
    private Service36400243FormValidator validator;

    public Service36400243Controller() {
        setStepMetaList(Arrays.asList(new StepMeta(1, "Сведения о работодателе"),
                new StepMeta(2, "Контактная информация"),
                new StepMeta(3, "Требования к работнику", true, "xml")));
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400243Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400243Form createNewForm() {
        return new Service36400243Form();
    }
}
