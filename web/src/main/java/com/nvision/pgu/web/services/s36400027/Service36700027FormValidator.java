package com.nvision.pgu.web.services.s36400027;

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
public class Service36700027FormValidator extends AbstractServiceOrderFormValidator<Service36700027Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36700027Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36700027Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "LastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "FirstName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "MiddleName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "Snils");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "date_start");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "date_end");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "czn");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
        }
    }
}