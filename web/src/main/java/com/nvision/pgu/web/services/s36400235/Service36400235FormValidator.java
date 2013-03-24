package com.nvision.pgu.web.services.s36400235;

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
public class Service36400235FormValidator extends AbstractServiceOrderFormValidator<Service36400235Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400235Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400235Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddress");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "address");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPost");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "otherDocTypeName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
				break;
			
			case 2:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "familyInf");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "famIdentityDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "sostavDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "agree1DocLoad");	
				
				break;
			
			case 3:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "techDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "motherDocLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "regDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "incomeDocLoad");	
				
					
				
					
				
					
				
					
				
				break;
			
        }
    }
}