package com.nvision.pgu.web.services.s36400129;

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
public class Service36400129FormValidator extends AbstractServiceOrderFormValidator<Service36400129Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400129Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400129Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "address");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");	
				
				break;
			
			case 2:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "rayon");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "nameSchool");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "childLastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "childFirstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "childBirthdate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "childGrade");	
				
					
				
				break;
			
        }
    }
}