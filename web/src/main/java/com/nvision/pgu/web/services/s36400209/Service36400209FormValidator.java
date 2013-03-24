package com.nvision.pgu.web.services.s36400209;

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
public class Service36400209FormValidator extends AbstractServiceOrderFormValidator<Service36400209Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400209Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400209Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "applType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlType");	
				
				break;
			
			case 2:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
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
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPasLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
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
			
			case 4:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlNonDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlPasLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_FullTitle");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_opf");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUr");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_factAddressUr");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPost");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_phone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_firstName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_lastName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_InnUl");	
				
	            getRuleRegistry().getValidationRule("innlegal").validate(form, errors, "org_InnUl" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_OgrnUl");	
				
	            getRuleRegistry().getValidationRule("legalregno").validate(form, errors, "org_OgrnUl" );
				
					
				
					
				
					
				
				break;
			
			case 5:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlPasLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_FullTitle");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_opf");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUr");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_factAddressUr");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPost");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_phone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_firstName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_lastName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_InnUl");	
				
	            getRuleRegistry().getValidationRule("innlegal").validate(form, errors, "org_InnUl" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_OgrnUl");	
				
	            getRuleRegistry().getValidationRule("legalregno").validate(form, errors, "org_OgrnUl" );
				
					
				
					
				
					
				
				break;
			
			case 6:
				
					
				
					
				
	            getRuleRegistry().getValidationRule("innind").validate(form, errors, "inn" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ogrnip");	
				
	            getRuleRegistry().getValidationRule("ipregno").validate(form, errors, "ogrnip" );
				
					
				
					
				
					
				
				break;
			
			case 7:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "rightKind");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "rentTerm");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "squareArea");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "permitUse");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "locationArea");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "capitalRight");	
				
					
				
					
				
				break;
			
			case 8:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "listDocLoad");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
        }
    }
}