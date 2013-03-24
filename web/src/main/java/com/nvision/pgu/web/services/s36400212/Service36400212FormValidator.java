package com.nvision.pgu.web.services.s36400212;

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
public class Service36400212FormValidator extends AbstractServiceOrderFormValidator<Service36400212Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400212Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400212Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "post");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduCategoria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduPost");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduRealPost");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduRealPostData");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduOsnAttestat");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "email");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduOrg");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduNargady");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduModernKvalif");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduStagSpec");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduStagPost");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduStagOrg");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduGak");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduGakAgree");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduAttestAgree");	
				
				break;
			
        }
    }
}