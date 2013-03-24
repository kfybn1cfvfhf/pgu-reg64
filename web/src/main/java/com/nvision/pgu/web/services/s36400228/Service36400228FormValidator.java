
package com.nvision.pgu.web.services.s36400228;

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
public class Service36400228FormValidator extends AbstractServiceOrderFormValidator<Service36400228Form>
{

    protected boolean ignoreValidationErrors() {
        return true;
    }


    @Override
    public boolean supports(Class<?> clazz)
    {
        return Service36400228Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400228Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "id_agency.in");	
				
				break;
			
			case 2:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant.last_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant.last_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant.first_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant.first_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant.middle_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant.middle_name" );
				
				break;
			
			case 3:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant.country");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 4:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant.ident_doc_type");	
				
					
				
					
				
					
				
					
				
				break;
			
			case 5:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "husband.last_name_before");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "husband.first_name");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "husband.middle_name");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "wife.last_name_before");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "wife.first_name");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "wife.middle_name");	
				
					
				
					
				
					
				
					
				
				break;
			
			case 6:
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 7:
				
					
				
				break;
			
        }
    }
}
	