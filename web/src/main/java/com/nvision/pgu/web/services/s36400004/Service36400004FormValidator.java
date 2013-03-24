package com.nvision.pgu.web.services.s36400004;

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
public class Service36400004FormValidator extends AbstractServiceOrderFormValidator<Service36400004Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400004Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400004Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birsday");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "contactPhone");	
				
	            getRuleRegistry().getValidationRule("phone").validate(form, errors, "contactPhone" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "post_address");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc_type");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc_series");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc_number");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc_entity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc_date");	
				
				break;
			
			case 2:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc0");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc1");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc3");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc4");	
				
					
				
					
				
					
				
				break;
			
        }
    }
}