package com.nvision.pgu.web.services.s36400081;

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
public class Service36400081FormValidator extends AbstractServiceOrderFormValidator<Service36400081Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400081Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400081Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "post");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "MedCategory");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "MedSpeciality");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "DocLoadQualificationLeaf");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "DocLoadReportOnWork");	
				
					
				
				break;
			
        }
    }
}