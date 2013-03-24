package com.nvision.pgu.web.services.s36400170;

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
public class Service36400170FormValidator extends AbstractServiceOrderFormValidator<Service36400170Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400170Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400170Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "sex");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birthdate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "age");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "sitizenship");	
				
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
			
			case 2:
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "skillLangName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "skillDriverCat");	
				
				break;
			
			case 3:
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "applCatDoc1Load");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "applCatDoc2Load");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "applCatDoc3Load");	
				
				break;
			
        }
    }
}