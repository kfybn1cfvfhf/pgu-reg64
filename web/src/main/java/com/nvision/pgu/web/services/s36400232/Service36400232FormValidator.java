
package com.nvision.pgu.web.services.s36400232;

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
public class Service36400232FormValidator extends AbstractServiceOrderFormValidator<Service36400232Form>
{

    protected boolean ignoreValidationErrors() {
        return true;
    }


    @Override
    public boolean supports(Class<?> clazz)
    {
        return Service36400232Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400232Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "id_agency_in");	
				
				break;
			
			case 2:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_last_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_last_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_first_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_first_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_middle_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_middle_name" );
				
					
				
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
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_last_name");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_first_name");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_middle_name");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_birthday");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_birth_place_country");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_birth_place_settlement_type");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_birth_place_settlement");	
				
				break;
			
			case 5:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_affiliation_last_name");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_affiliation_first_name");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_affiliation_middle_name");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_last_name");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_first_name");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_middle_name");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "affiliation_doc_num");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "affiliation_doc_date");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "affiliation_doc_source");	
				
				break;
			
			case 6:
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 7:
				
					
				
				break;
			
        }
    }
}
	