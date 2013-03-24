package com.nvision.pgu.web.services.s36400066;

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
public class Service36400066FormValidator extends AbstractServiceOrderFormValidator<Service36400066Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400066Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400066Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastname");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstname");	
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "corp");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "bossName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "adressReg");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
	            getRuleRegistry().getValidationRule("phone").validate(form, errors, "phone" );
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "adressObj");	
				
					
				
					
				
					
				
				break;
			
        }
    }
}