package com.nvision.pgu.web.services.s36400211;

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
public class Service36400211FormValidator extends AbstractServiceOrderFormValidator<Service36400211Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400211Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400211Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "applType");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlType");	
				
				break;
			
			case 2:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birthdate");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birthPlace");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddress");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "address");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPost");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "otherDocTypeName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
				break;
			
			case 3:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovDovLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovLastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovFirstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovBirthDate");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovBirthPlace");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovFactAddress");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovAddress");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPhone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovIdentityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovOtherDocTypeName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPasLoad");	
				
				break;
			
			case 4:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birthdate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birthPlace");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddress");	
				
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
			
			case 5:
				
					
				
					
				
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
				
				break;
			
			case 6:
				
					
				
					
				
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
				
				break;
			
			case 7:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "typeInfo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "forest");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "pieceForest");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "noKvart");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "noVid");	
				
				break;
			
        }
    }
}