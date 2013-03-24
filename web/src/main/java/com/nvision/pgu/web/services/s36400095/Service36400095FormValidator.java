package com.nvision.pgu.web.services.s36400095;

import com.nvision.pgu.core.controllers.AbstractServiceOrderFormValidator;
import com.nvision.pgu.core.rules.api.RuleException;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

/**
 * @author Aleksei Balandin (mailto:aleksisha@gmail.com)
 *         Date: 05.10.2010
 *         Time: 18:38:19
 */
@Component
public class Service36400095FormValidator extends AbstractServiceOrderFormValidator<Service36400095Form> {

    @Override
    public boolean supports(Class<?> clazz) {
        return Service36400095Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400095Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {

            case 1:

                getRuleRegistry().getValidationRule("required").validate(form, errors, "applType");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlType");

                break;

            case 2:


                getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "address");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPost");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocType");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "otherDocTypeName");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");

                break;

            case 3:


                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovDovLoad");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovLastName");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovFirstName");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPhone");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovIdentityDocType");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovOtherDocTypeName");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassSeria");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassNo");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassDate");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassFrom");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPasLoad");

                break;

            case 4:


                getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "address");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocType");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "otherDocTypeName");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");

                break;

            case 5:


                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlNonDovLoad");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlPasLoad");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_FullTitle");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_opf");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUr");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressFact");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPost");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_phone");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_firstName");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_lastName");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_InnUl");

                getRuleRegistry().getValidationRule("innlegal").validate(form, errors, "org_InnUl");


                break;

            case 6:


                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlDovLoad");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlPasLoad");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_FullTitle");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_opf");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUr");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressFact");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPost");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_phone");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_firstName");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_lastName");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_InnUl");

                getRuleRegistry().getValidationRule("innlegal").validate(form, errors, "org_InnUl");


                break;

            case 7:


                getRuleRegistry().getValidationRule("innind").validate(form, errors, "inn");


                break;

            case 8:


                getRuleRegistry().getValidationRule("required").validate(form, errors, "addressReklConstr");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "kadastrNoReklConstr");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "expRekl");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "typeRekl");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "kolStorRekl");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "areaRekl");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "lightRekl");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "dogRekl");


                break;

            case 9:


                getRuleRegistry().getValidationRule("required").validate(form, errors, "dogReklDocLoad");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "sobSobstDocLoad");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "eskizReklDocLoad");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "soglSobstDocLoad");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "proektReklDocLoad");


                break;

        }
    }
}