package com.nvision.pgu.web.services.s36400223;

import com.nvision.pgu.core.rules.api.RuleException;
import com.nvision.pgu.core.controllers.AbstractServiceOrderFormValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

/**
 * @author Aleksei Balandin (mailto:aleksisha@gmail.com)
 *         Date: 05.10.2010
 *         Time: 18:38:19
 */
@Component
public class Service36400223FormValidator extends AbstractServiceOrderFormValidator<Service36400223Form> {

    protected boolean ignoreValidationErrors() {
        return true;
    }


	@Override
	public boolean supports(Class<?> clazz) {
		return Service36400223Form.class.isAssignableFrom(clazz);
	}

	@Override
	protected void validate(Service36400223Form form, Integer stepNum, Errors errors) throws RuleException {
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

				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_middle_name");

				getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_middle_name");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_ident_doc_type");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_ident_doc_ser");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_ident_doc_num");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_ident_doc_date");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_ident_doc_source");

				break;

			case 3:
				getRuleRegistry().getValidationRule("index").validate(form, errors, "declarant_index");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_country");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_settlement_type");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_settlement");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_street_type");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_street");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_house");

				break;

			case 4:
				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_last_name");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_first_name");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_middle_name");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_sex");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_birthday");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_date");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_citizenship");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_ident_doc_type");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_ident_doc_ser");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_ident_doc_num");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_ident_doc_source");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_ident_doc_date");

				break;

			case 5:
				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_birth_country");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_birth_settlement_type");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_birth_settlement");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_living_country");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_living_state");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_living_settlement_type");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_living_settlement");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_living_street_type");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_living_street");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_living_house");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_country");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_state");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_settlement_type");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_settlement");

				break;

			case 6:
				break;

		}
	}
}
	