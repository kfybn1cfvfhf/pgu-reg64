package com.nvision.pgu.web.services.s36400207;

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
public class Service36400207FormValidator extends AbstractServiceOrderFormValidator<Service36400207Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400207Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400207Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddress");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "address");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "accNum");	
				
				break;
			
        }
    }
}