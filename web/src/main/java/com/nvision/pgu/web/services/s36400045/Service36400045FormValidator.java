package com.nvision.pgu.web.services.s36400045;

import com.nvision.pgu.core.controllers.AbstractServiceOrderFormValidator;
import com.nvision.pgu.core.rules.api.RuleException;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

/**
 * @author Aleksei Balandin (mailto:aleksisha@gmail.com)
 *         Date: 05.10.2010
 *         Time: 18:38:19
 */
@Component
public class Service36400045FormValidator extends AbstractServiceOrderFormValidator<Service36400045Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400045Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400045Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
				break;
			
			case 2:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPasLoad");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "applWorkPlace");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "applWorkPost");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "applWorkPhone");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "applStatus");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "privilegeCategory");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "topPriorityDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "priorityDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "advantageDocLoad");	
				
				break;
			
			case 3:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "parentLastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "parentFirstName");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "parentWorkPlace");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "parentWorkPost");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "parentIdentityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "parentPassSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "parentPassNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "parentPassDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "parentPassFrom");	
				
				break;
			
			case 4:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dou_rd");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "childLastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "childFirstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "childBirthdate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "childGender");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birthCertificateDocLoad");	
				
					
				
				break;
			
        }
    }
}