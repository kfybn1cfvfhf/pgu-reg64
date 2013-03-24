package com.nvision.pgu.web.services.s36400054;

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
public class Service36400054FormValidator extends AbstractServiceOrderFormValidator<Service36400054Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400054Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400054Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
					
				
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
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "otherDocTypeName");	
				
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
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "otherDocTypeName");	
				
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
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
				break;
			
			case 6:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientLastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientFirstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientBirthDate");	
				
					
				
					
				
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
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientIdentityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientOtherDocTypeName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientPassSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientPassNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientPassDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientPassFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "recipientIdentityDocLoad");	
				
				break;
			
			case 7:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "jp_addressCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "jp_addressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "jp_addressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "jp_addressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "jp_addressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "jp_addressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dateDogSocNaim");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "noDogSocNaim");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_soc");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "qt_bed");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "cost_bed");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "qt_table");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "cost_table");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "qt_wardrobe");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "cost_wardrobe");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "qt_chair");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "cost_chair");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "qt_icebox");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "cost_icebox");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "cost_gaz");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "qt_gku");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "cost_gku");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "costGKUdocLoad");	
				
				break;
			
			case 8:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "wayBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressBenefit");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "nameBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "filialBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "bikBankBenefit");	
				
	            getRuleRegistry().getValidationRule("bikbank").validate(form, errors, "bikBankBenefit" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "corrAccBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "codeFilialBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "clientAccBankBenefit");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "agree");	
				
				break;
			
        }
    }
}