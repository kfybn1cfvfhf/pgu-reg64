package com.nvision.pgu.web.services.s36400226;

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
public class Service36400226FormValidator extends AbstractServiceOrderFormValidator<Service36400226Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400226Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400226Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "id_agency_in");	
				
					
				
				break;
			
			case 2:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_last_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_last_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_first_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_first_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_middle_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_middle_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_ident_birth_date");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_sex");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_country");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_country" );
				
					
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_state" );
				
					
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_region" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_settlement_type");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_settlement");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_settlement" );
				
				break;
			
			case 3:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_last_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "he_last_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_first_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "he_first_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_middle_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "he_middle_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_birth_date");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_doc_type");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_doc_ser");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_doc_number");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_doc_date");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "he_doc_date" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_doc_place");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_last_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "she_last_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_first_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "she_first_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_middle_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "she_middle_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_birth_date");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_doc_type");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_doc_ser");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_doc_number");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_doc_date");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_doc_place");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "she_doc_place" );
				
				break;
			
			case 4:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_birth_place_country");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "he_birth_place_country" );
				
					
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "he_birth_place_state" );
				
					
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "he_birth_place_region" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_birth_place_settlement_type");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_birth_place_settlement");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "he_birth_place_settlement" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_birth_place_country");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "she_birth_place_country" );
				
					
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "she_birth_place_state" );
				
					
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "she_birth_place_region" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_birth_place_settlement_type");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_birth_place_settlement");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "she_birth_place_settlement" );
				
				break;
			
			case 5:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_living_country");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "he_living_country" );
				
					
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "he_living_state" );
				
					
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "he_living_region" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_living_place");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_living_settlement");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "he_living_settlement" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_living_street_type");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_living_street");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "he_living_street" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he_living_house");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_living_country");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "she_living_country" );
				
					
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "she_living_state" );
				
					
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "she_living_region" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_living_place");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_living_settlement");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "she_living_settlement" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_living_street_type");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_living_street");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "she_living_street" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "she_living_house");	
				
					
				
					
				
				break;
			
			case 6:
				
					
				
					
				
					
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "decision_law" );
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 7:
				
					
				
					
				
					
				
					
				
					
				
				break;
			
        }
    }
}