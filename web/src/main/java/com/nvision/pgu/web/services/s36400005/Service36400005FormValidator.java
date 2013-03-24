package com.nvision.pgu.web.services.s36400005;

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
public class Service36400005FormValidator extends AbstractServiceOrderFormValidator<Service36400005Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400005Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400005Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "fio");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "contactPhone");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "contactEmail");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "reason_re");	
				
				break;
			
			case 2:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc0");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc1");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc2");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc4");	
				
				break;
			
			case 3:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc4");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc5");	
				
					
				
					
				
					
				
					
				
				break;
			
			case 4:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc7");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc8");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc9");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc11");	
				
				break;
			
        }
    }
}