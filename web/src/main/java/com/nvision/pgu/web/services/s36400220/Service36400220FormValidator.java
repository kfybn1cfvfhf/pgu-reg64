package com.nvision.pgu.web.services.s36400220;

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
public class Service36400220FormValidator extends AbstractServiceOrderFormValidator<Service36400220Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400220Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400220Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
				break;
			
			case 2:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birthdate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "sex");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "gragdanstvo");	
				
					
				
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
			
			case 3:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovDovLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovLastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovFirstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPhone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovIdentityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovOtherDocTypeName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovIdentityDocLoad");	
				
				break;
			
			case 4:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birthdate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "sex");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "gragdanstvo");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "address");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "otherDocTypeName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
				break;
			
			case 5:
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
        }
    }
}