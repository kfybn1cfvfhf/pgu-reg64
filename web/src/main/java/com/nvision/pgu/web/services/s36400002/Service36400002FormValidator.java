package com.nvision.pgu.web.services.s36400002;

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
public class Service36400002FormValidator extends AbstractServiceOrderFormValidator<Service36400002Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400002Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400002Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "reason_re");	
				
				break;
			
			case 2:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc0");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc39");	
				
					
				
					
				
					
				
					
				
				break;
			
			case 3:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "checkBox1");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "checkBox2");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "checkBox3");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc0");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc4");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc7");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc5");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc3");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc6");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc39");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 4:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "checkBox2");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "checkBox3");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc0");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc4");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc5");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc3");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc39");	
				
					
				
					
				
					
				
					
				
				break;
			
			case 5:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "checkBox2");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "checkBox3");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc0");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc4");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc5");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc3");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc39");	
				
					
				
					
				
					
				
				break;
			
        }
    }
}