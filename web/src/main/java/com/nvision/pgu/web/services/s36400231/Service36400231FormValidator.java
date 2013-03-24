
package com.nvision.pgu.web.services.s36400231;

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
public class Service36400231FormValidator extends AbstractServiceOrderFormValidator<Service36400231Form>
{

    protected boolean ignoreValidationErrors() {
        return true;
    }

    @Override
    public boolean supports(Class<?> clazz)
    {
        return Service36400231Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400231Form form, Integer stepNum, Errors errors) throws RuleException {
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
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_ident_doc_source");
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_ident_doc_date");
				break;
			case 3:
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_country");
				break;
			case 4:
				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_last_name");
				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_first_name");
				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_person_middle_name");
				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_date");
				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_place_country");
				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_place_settlement_type");
				getRuleRegistry().getValidationRule("required").validate(form, errors, "death_place_settlement");
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
        }
    }
}
	