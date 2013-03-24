package com.nvision.pgu.web.services.s36400025;

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
public class Service36400025FormValidator extends AbstractServiceOrderFormValidator<Service36400025Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400025Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400025Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "LastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "FirstName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "MiddleName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "Birthdate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "Citizenship");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "Sex");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "AddrIndex");	
				
	            getRuleRegistry().getValidationRule("fractcount").validate(form, errors, "AddrIndex" , "0");
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "AddrGorod");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "AddrUl");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "AddrDom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "AddrKvart");	
				
					
				
	            getRuleRegistry().getValidationRule("phone").validate(form, errors, "Tel" );
				
					
				
				break;
			
			case 2:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ObrType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ObrOrg");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ObrYear");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ObrProfByObr");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ObrProfMain");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ObrProfMainExp");	
				
	            getRuleRegistry().getValidationRule("fractcount").validate(form, errors, "ObrProfMainExp" , "0");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ObrProfExtra");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ObrProfExtraExp");	
				
	            getRuleRegistry().getValidationRule("fractcount").validate(form, errors, "ObrProfExtraExp" , "0");
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 3:
				
					
				
					
				
					
				
					
				
					
				
	            getRuleRegistry().getValidationRule("fractcount").validate(form, errors, "WorkMoney" , "0");
				
				break;
			
			case 4:
				
					
				
					
				
					
				
					
				
					
				
	            getRuleRegistry().getValidationRule("fractcount").validate(form, errors, "WantMoney" , "0");
				
					
				
				break;
			
			case 5:
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "czn");	
				
					
				
				break;
			
        }
    }
}