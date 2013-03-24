package com.nvision.pgu.web.services.s36400222;

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
public class Service36400222FormValidator extends AbstractServiceOrderFormValidator<Service36400222Form> {

    protected boolean ignoreValidationErrors() {
        return true;
    }


	@Override
	public boolean supports(Class<?> clazz) {
		return Service36400222Form.class.isAssignableFrom(clazz);
	}

	@Override
	protected void validate(Service36400222Form form, Integer stepNum, Errors errors) throws RuleException {
		Integer step = (stepNum == null ? 1 : stepNum);
		switch (step) {

			case 1:
				getRuleRegistry().getValidationRule("required").validate(form, errors, "id_agency_in");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant");

				break;

			case 2:
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_last_name");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_last_name");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_first_name");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_first_name");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_middle_name");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_middle_name");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_ident_birth_date");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_country");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_country");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_state");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_state");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_region");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_settlement_type");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_settlement");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_settlement");

				break;

			case 3:
				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_last_name");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "father_last_name");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_first_name");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "father_first_name");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_middle_name");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "father_middle_name");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_birth_date");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_citizenship");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_nation");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_doc_type");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_doc_ser");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_doc_number");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_doc_date");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_doc_place");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_last_name");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "mother_last_name");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_first_name");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "mother_first_name");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_middle_name");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "mother_middle_name");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_birth_date");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_citizenship");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_nation");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_doc_type");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_doc_ser");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_doc_number");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_doc_date");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_doc_place");

				break;

			case 4:
				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_birth_place_country");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "father_birth_place_country");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "father_birth_place_state");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "father_birth_place_region");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_birth_place_settlement_type");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_birth_place_settlement");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "father_birth_place_settlement");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_birth_place_country");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "mother_birth_place_country");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "mother_birth_place_state");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "mother_birth_place_region");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_birth_place_settlement_type");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_birth_place_settlement");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "mother_birth_place_settlement");

				break;

			case 5:

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_living_country");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "father_living_country");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "father_living_state");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "father_living_region");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_living_place");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_living_settlement");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "father_living_settlement");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_living_street_type");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_living_street");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "father_living_street");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_living_house");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_living_country");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "mother_living_country");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "mother_living_state");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "mother_living_region");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_living_place");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_living_settlement");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "mother_living_settlement");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_living_street_type");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_living_street");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "mother_living_street");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_living_house");

				break;

			case 6:
				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_cause_doc_type");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_cause_doc_num");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_cause_doc_date");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_cause_doc_source");

				break;

			case 7:
				break;

		}
	}
}
	