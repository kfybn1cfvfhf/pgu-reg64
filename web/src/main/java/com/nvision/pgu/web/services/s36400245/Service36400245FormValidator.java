package com.nvision.pgu.web.services.s36400245;

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
public class Service36400245FormValidator extends AbstractServiceOrderFormValidator<Service36400245Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400245Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400245Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "middle_name");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birth_date");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "sex");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "citizenship");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "unprotected");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "label_2");	
				
					
				
	            getRuleRegistry().getValidationRule("index").validate(form, errors, "addr_Index" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addr_obl");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addr_raion");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addr_gorod");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addr_ul");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addr_dom");	
				
					
				
					
				
					
				
					
				
	            getRuleRegistry().getValidationRule("phone").validate(form, errors, "tel" );
				
					
				
				break;
			
			case 2:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "obr_type");	
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "employment");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addr_raion_info");	
				
				break;
			
        }
    }
}