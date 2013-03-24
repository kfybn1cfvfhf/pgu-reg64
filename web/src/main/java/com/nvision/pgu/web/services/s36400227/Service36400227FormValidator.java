package com.nvision.pgu.web.services.s36400227;

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
public class Service36400227FormValidator extends AbstractServiceOrderFormValidator<Service36400227Form> {
    @Override
    public boolean supports(Class<?> clazz) {
        return Service36400227Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400227Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
            case 1:

                getRuleRegistry().getValidationRule("required").validate(form, errors, "id_agency_in");


                break;

            case 2:


                getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_last_name");

                getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_last_name");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_first_name");

                getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_first_name");

//              getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_middle_name");
//
//              getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_middle_name" );

                getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_birth_date");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_ident_doc_type");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_ident_doc_ser");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_ident_doc_num");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_ident_doc_date");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_ident_doc_source");


                break;

            case 3:


                getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "birth_doc_org");
                getRuleRegistry().getValidationRule("required").validate(form, errors, "birth_doc_org");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_birth_place_country");

                getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_birth_place_country");


                getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_birth_place_state");


                getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_birth_place_region");

                getRuleRegistry().getValidationRule("required").validate(form, errors,
                        "declarant_birth_place_settlement_type");

                getRuleRegistry().getValidationRule("required").validate(form, errors,
                        "declarant_birth_place_settlement");

                getRuleRegistry().getValidationRule("cyrillic").validate(form, errors,
                        "declarant_birth_place_settlement");
                getRuleRegistry().getValidationRule("required").validate(form, errors, "birth_doc_date");
                getRuleRegistry().getValidationRule("required").validate(form, errors, "birth_doc_num");

                break;

            case 4:


                getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_country");


                getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_settlement_type");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_settlement");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_street_type");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_street");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_house");


                break;

            case 5:


                getRuleRegistry().getValidationRule("required").validate(form, errors, "person_new_last_name");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "person_new_first_name");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "person_new_middle_name");
                break;

            case 6:
                getRuleRegistry().getValidationRule("email").validate(form, errors, "contact_email");

                break;

        }
    }
}
