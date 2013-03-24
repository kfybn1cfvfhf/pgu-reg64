
package com.nvision.pgu.web.services.s36400221;

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
public class Service36400221FormValidator extends AbstractServiceOrderFormValidator<Service36400221Form>
{

    protected boolean ignoreValidationErrors() {
        return true;
    }


    @Override
    public boolean supports(Class<?> clazz)
    {
        return Service36400221Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400221Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "id_agency");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "reg_date");
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "reg_time");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "reg_hall");
				
				break;
			
			case 2:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "groom_last_name");
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "groom_last_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "groom_first_name");
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "groom_first_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "groom_middle_name");
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "groom_middle_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "groom_date_of_birth");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "groom_citizenship");
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "bride_last_name");
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "bride_last_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "bride_first_name");
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "bride_first_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "bride_middle_name");
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "bride_middle_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "bride_date_of_birth");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "bride_citizenship");
				
					
				
				break;
			
			case 3:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "groom_birth_country");
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "bride_birth_country");
				
					
				
					
				
					
				
					
				
				break;
			
			case 4:
                getRuleRegistry().getValidationRule("required").validate(form, errors, "groom_state");
                getRuleRegistry().getValidationRule("required").validate(form, errors, "bride_state");
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "groom_country");
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "groom_house");
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 5:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "he");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "groom_doc_ser");
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 6:
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 7:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "groom_new_last_name");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "bride_new_last_name");
				
				break;
			
			case 8:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "contact_email");	
				
				break;
			
        }
    }
}
	