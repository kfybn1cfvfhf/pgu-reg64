package com.nvision.pgu.web.services.s36400238;

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
public class Service36400238FormValidator extends AbstractServiceOrderFormValidator<Service36400238Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400238Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400238Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovCategory");	
				
				break;
			
			case 2:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
					
				
					
				
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
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
				break;
			
			case 3:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPasLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
					
				
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
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
				break;
			
			case 4:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovOpekLoad");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
					
				
					
				
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
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
				break;
			
			case 5:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPasLoad");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovOpekLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
					
				
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
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
				break;
			
			case 6:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientLastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientFirstName");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "rec_addressCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "rec_addressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "rec_addressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "rec_addressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "rec_addressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "rec_addressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "rec_factAddressCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "rec_factAddressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "rec_factAddressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "rec_factAddressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "rec_factAddressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "rec_factAddressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientIdentityDocLoad");	
				
				break;
			
			case 7:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "wayBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressBenefit");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "nameBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "filialBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "bikBankBenefit");	
				
	            getRuleRegistry().getValidationRule("bikbank").validate(form, errors, "bikBankBenefit" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "corrAccBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "codeFilialBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "clientAccBankBenefit");	
				
				break;
			
			case 8:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_soc");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "wayService");	
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "svidRegDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "trudKnigDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "sprTrudDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "sostFamilyDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "pensDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "pechDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "techPaspDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "trudDogDocLoad");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "agree");	
				
				break;
			
        }
    }
}