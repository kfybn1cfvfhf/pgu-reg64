package com.nvision.pgu.web.services.s36400215;

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
public class Service36400215FormValidator extends AbstractServiceOrderFormValidator<Service36400215Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400215Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400215Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlType");	
				
				break;
			
			case 2:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlNonDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlPasLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_FullTitle");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_opf");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUr");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPost");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_phone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_firstName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_lastName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_InnUl");	
				
	            getRuleRegistry().getValidationRule("innlegal").validate(form, errors, "org_InnUl" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_OgrnUl");	
				
	            getRuleRegistry().getValidationRule("legalregno").validate(form, errors, "org_OgrnUl" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "founderDocLoad");	
				
					
				
					
				
				break;
			
			case 3:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlPasLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_FullTitle");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_opf");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUr");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPost");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_phone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_firstName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_lastName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_InnUl");	
				
	            getRuleRegistry().getValidationRule("innlegal").validate(form, errors, "org_InnUl" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_OgrnUl");	
				
	            getRuleRegistry().getValidationRule("legalregno").validate(form, errors, "org_OgrnUl" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "founderDocLoad");	
				
					
				
					
				
				break;
			
			case 4:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "goalAppl");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "typeMarket");	
				
					
				
					
				
					
				
				break;
			
        }
    }
}