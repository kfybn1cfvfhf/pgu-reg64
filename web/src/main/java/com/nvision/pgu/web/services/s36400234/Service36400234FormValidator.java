package com.nvision.pgu.web.services.s36400234;

import com.nvision.pgu.core.rules.api.RuleException;
import com.nvision.pgu.core.controllers.AbstractServiceOrderFormValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class Service36400234FormValidator extends AbstractServiceOrderFormValidator<Service36400234Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400234Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400234Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "applType");	
				
				break;
			
			case 2:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddress");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "address");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPost");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "email");	
				
				break;
			
			case 3:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_FullTitle");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_opf");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPost");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_email");	
				
				break;
			
			case 4:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "wayResult");	
				
				break;
			
        }
    }
}