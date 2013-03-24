package com.nvision.pgu.web.services.s36400238;

import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.blocks.AbstractServiceOrderControllerEDS24;
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
@RequestMapping("/services/s" + Service36400238Controller.SERVICE_ID)
@ServiceController(id = Service36400238Controller.SERVICE_ID, title = "Выплата  ежемесячной  денежной  выплаты на оплату жилого помещения и коммунальных услуг отдельным категориям граждан, проживающих  и работающих  в  сельской  местности,  рабочих поселках (поселках городского типа)")
@Version("1.0")
public class Service36400238Controller extends AbstractServiceOrderControllerEDS24<Service36400238Form> {
    /**
     * id Выплата  ежемесячной  денежной  выплаты на оплату жилого помещения и коммунальных услуг отдельным категориям граждан, проживающих  и работающих  в  сельской  местности,  рабочих поселках (поселках городского типа)
     */
    public static final int SERVICE_ID = 36400238;


    @Autowired
    private Service36400238FormValidator validator;

    public Service36400238Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о лице, нуждающемся в государственной услуге",
				"Сведения о способе социальной выплаты",
				"Сведения о запрашиваемой услуге и электронные копии документов"
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
 		if (binder.getTarget() instanceof Service36400238Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400238Form createNewForm() {
 		return new Service36400238Form();
 	}

     @Override
    protected void patchModelAndFormOnStepProcessing(Service36400238Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (stepProcessingResult.getStepNum() == 2 && form.getDov_enable_changed().booleanValue()) {

            if ("off".equalsIgnoreCase(form.getDov_enable())) {

                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            } else {
                form.clearApplicantAttributes();
            }

            form.setDov_enable_changed(false);
        }
    }

@Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400238Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        // При активированном incapable_enable
        if ("on".equalsIgnoreCase(form.getIncapable_enable())) {
            // активированном dov_enable
            if ("on".equalsIgnoreCase(form.getDov_enable())) {
                // При выборе "Родителя" осуществляется переход на ШАГ 3,6 (ШАГИ 2,4,5 пропускаются)
                if ("1".equalsIgnoreCase(form.getDovCategory())) {
                    if(stepProcessingResult.getStepNum() == 2) {
                        stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
                    }
                }
                // При выборе "Опекун" или "Попечитель" осуществляется переход на ШАГ 5,6 (ШАГИ 2,3,4 пропускаются)
                if ("2".equalsIgnoreCase(form.getDovCategory()) || "3".equalsIgnoreCase(form.getDovCategory())) {
                    if(stepProcessingResult.getStepNum() == 2) {
                        stepProcessingResult = new StepProcessingResult(2, "step2-5.html");
                    }
                }

            // деактивированном dov_enable
            } else {
                // При выборе "Родителя" осуществляется переход на ШАГ 2,6 (ШАГИ 3,4,5 пропускаются)
                if ("1".equalsIgnoreCase(form.getDovCategory())) {
                    if(stepProcessingResult.getStepNum() == 2) {
                        stepProcessingResult = new StepProcessingResult(2, "step2-2.html");
                    }
                }
                // При выборе "Опекун" или "Попечитель" осуществляется переход на ШАГ 4,6 (ШАГИ 2,3,5 пропускаются)
                if ("2".equalsIgnoreCase(form.getDovCategory()) || "3".equalsIgnoreCase(form.getDovCategory())) {
                    if(stepProcessingResult.getStepNum() == 2) {
                        stepProcessingResult = new StepProcessingResult(2, "step2-4.html");
                    }
                }
            }

        // При деактивированном incapable_enable
        } else {
            // активированном dov_enable  осуществляется переход на ШАГ 3 (ШАГ 2,4,5,6 пропускаются)
            if ("on".equalsIgnoreCase(form.getDov_enable())) {
                if(stepProcessingResult.getStepNum() == 2) {
                    stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
                }
                if(stepProcessingResult.getStepNum() == 3) {
                    if (!goback) {
                        stepProcessingResult.setStepNum(4);
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
                    }
                }
            // деактивированном dov_enable  осуществляется переход на ШАГ 2 (ШАГ 3,4,5,6 пропускаются)
            } else {
                if(stepProcessingResult.getStepNum() == 2) {
                    stepProcessingResult = new StepProcessingResult(2, "step2-2.html");
                }
                if(stepProcessingResult.getStepNum() == 3) {
                    if (!goback) {
                        stepProcessingResult.setStepNum(4);
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2-2.html");
                    }
                }
            }
        }

        return stepProcessingResult;
    }

    @Override
       protected List<String> getFormFieldsWithFiles(Service36400238Form form, Map<String, Object> model) {
           return Arrays.asList(
    "identityDocLoad",
    "dovDovLoad",
    "dovPasLoad",
    "dovOpekLoad",
    "recipientIdentityDocLoad",
    "svidRegDocLoad",
    "trudKnigDocLoad",
    "sprTrudDocLoad",
    "sostFamilyDocLoad",
    "pensDocLoad",
    "pechDocLoad",
    "techPaspDocLoad",
    "trudDogDocLoad",
    "sprSocRabDocLoad"
           );
       }

        protected Map<String, Object> formToMap(Service36400238Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);
        decoratedFormAsMap.clearForOrdering();

        // Очистка полей
        if ("off".equals(form.getDov_enable())) {
        decoratedFormAsMap.clearFileLoadField("dovDovLoad");
        decoratedFormAsMap.clearFileLoadField("dovPasLoad");
        }

        if ("off".equals(form.getIncapable_enable())) {
        decoratedFormAsMap.remove("recipientLastName");
        decoratedFormAsMap.remove("recipientFirstName");
        decoratedFormAsMap.remove("recipientMiddleName");
        decoratedFormAsMap.clearFileLoadField("recipientIdentityDocLoad");
        }

        if ("0".equals(form.getDovCategory())) {
        decoratedFormAsMap.clearFileLoadField("dovOpekLoad");
        }

        if ("1".equals(form.getDovCategory())) {
        decoratedFormAsMap.clearFileLoadField("dovOpekLoad");
        }

         if ("1".equals(form.getWayService())) {
        decoratedFormAsMap.clearFileLoadField("svidRegDocLoad");
        }

        if ("on".equals(form.getNoTrudKnig())) {
        decoratedFormAsMap.clearFileLoadField("trudKnigDocLoad");
        } else
        {
            decoratedFormAsMap.clearFileLoadField("sprTrudDocLoad ");
        }

        if ("off".equals(form.getPens())) {
        decoratedFormAsMap.clearFileLoadField("pensDocLoad");
        }

        if ("off".equals(form.getNoCentrOtoplen())) {
        decoratedFormAsMap.clearFileLoadField("pechDocLoad");
        decoratedFormAsMap.clearFileLoadField("techPaspDocLoad");
        }

        if ("off".equals(form.getSocRab())) {
        decoratedFormAsMap.clearFileLoadField("trudDogDocLoad");
        decoratedFormAsMap.clearFileLoadField("sprSocRabDocLoad");
        }

        if ("1".equals(form.getWayBenefit())) {
        decoratedFormAsMap.remove("nameBankBenefit");
        decoratedFormAsMap.remove("filialBankBenefit");
        decoratedFormAsMap.remove("bikBankBenefit");
        decoratedFormAsMap.remove("corrAccBankBenefit");
        decoratedFormAsMap.remove("codeFilialBankBenefit");
        decoratedFormAsMap.remove("clientAccBankBenefit");
                                                  }

        if ("2".equals(form.getWayBenefit())) {
        decoratedFormAsMap.remove("addressBenefit");
                                                  }

        if ("1".equals(form.getAddressEnterType())) {
        decoratedFormAsMap.remove("addressSettlementType");
                                                  }

        if ("1".equals(form.getFactAddressEnterType())) {
        decoratedFormAsMap.remove("factAddressSettlementType");
                                                  }

        if ("1".equals(form.getRec_addressEnterType())) {
        decoratedFormAsMap.remove("rec_addressSettlementType");
                                                  }

        if ("1".equals(form.getRec_factAddressEnterType())) {
        decoratedFormAsMap.remove("rec_factAddressSettlementType");
                                                  }

        return formAsMap;
    }

}