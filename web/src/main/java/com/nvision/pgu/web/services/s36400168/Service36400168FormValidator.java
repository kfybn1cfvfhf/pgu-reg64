package com.nvision.pgu.web.services.s36400168;

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
public class Service36400168FormValidator extends AbstractServiceOrderFormValidator<Service36400168Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400168Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400168Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
				break;
			
			case 2:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "sex");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birthdate");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddress");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "address");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
				break;
			
			case 3:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPasLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "sex");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birthdate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddress");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "address");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
				break;
			
			case 4:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "workplace");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "polisSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "polisDate");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "polisDocLoad");	
				
					
				
				break;
			
        }
    }
}