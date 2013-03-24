package com.nvision.pgu.web.services.s36400219;

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
public class Service36400219FormValidator extends AbstractServiceOrderFormValidator<Service36400219Form> {

    @Override
    public boolean supports(Class<?> clazz) {
        return Service36400219Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400219Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {

            case 1:

                getRuleRegistry().getValidationRule("required").validate(form, errors, "stat_zayav");


                break;

            case 2:


                getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "birthdate");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddress");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "address");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPost");


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


                getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPasLoad");

                break;

            case 4:


                getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "birthdate");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddress");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "address");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");

                break;

            case 5:


                getRuleRegistry().getValidationRule("required").validate(form, errors, "nameBankBenefit");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "filialBankBenefit");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "bikBankBenefit");

                getRuleRegistry().getValidationRule("bikbank").validate(form, errors, "bikBankBenefit");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "corrAccBankBenefit");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "codeFilialBankBenefit");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "clientAccBankBenefit");

                break;

            case 6:


                getRuleRegistry().getValidationRule("required").validate(form, errors, "lastNameChild");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "firstNameChild");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "birthdateChild");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "stat_child");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "vospitDocType");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "vospitNo");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "vospitData");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "vospitData_ZS");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "vospitFrom");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "opecDocLoad");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "usinDocLoad");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "priemSDocLoad");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "persDan");

                break;

            case 7:


                getRuleRegistry().getValidationRule("required").validate(form, errors, "sberKnigDocLoad");

                break;

        }
    }
}