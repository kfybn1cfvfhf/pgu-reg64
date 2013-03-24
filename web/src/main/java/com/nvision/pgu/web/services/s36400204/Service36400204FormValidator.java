package com.nvision.pgu.web.services.s36400204;

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
public class Service36400204FormValidator extends AbstractServiceOrderFormValidator<Service36400204Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400204Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400204Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovCategory");	
				
				break;
			
			case 2:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birthdate");	
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressCountry");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressCountry");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
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
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birthdate");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressCountry");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressCountry");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
				break;
			
			case 4:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovOpekLoad");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birthdate");	
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressCountry");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressCountry");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
				break;
			
			case 5:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPasLoad");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovOpekLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birthdate");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressCountry");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressCountry");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
				break;
			
			case 6:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientLastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientFirstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientbirthdate");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientaddressCountry");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientaddressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientaddressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientaddressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientaddressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientaddressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientFactAdressCountry");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientFactAdressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientFactAdressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientFactAdressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientFactAdressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientFactAdressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientPassSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientPassNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientPassDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientPassFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientIdentityDocLoad");	
				
				break;
			
			case 7:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "socialSupport");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "accrualMethod");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "nameBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "filialBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "bikBankBenefit");	
				
	            getRuleRegistry().getValidationRule("bikbank").validate(form, errors, "bikBankBenefit" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "corrAccBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "codeFilialBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "clientAccBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressBenefitLabel");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "postOffice");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "honoraryCitizenLoad");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "agreementApplicant");	
				
				break;
			
        }
    }
}