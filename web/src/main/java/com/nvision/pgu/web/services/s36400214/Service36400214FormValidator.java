package com.nvision.pgu.web.services.s36400214;

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
public class Service36400214FormValidator extends AbstractServiceOrderFormValidator<Service36400214Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400214Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400214Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "applType");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlType");	
				
				break;
			
			case 2:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
					
				
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
				
					
				
					
				
				break;
			
			case 3:
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
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
				
					
				
					
				
				break;
			
			case 4:
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_FullTitle");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_opf");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUrCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUrIndex");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUrEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUrSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUrCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUrSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUrSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostIndex");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_phone");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_firstName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_lastName");	
				
					
				
				break;
			
			case 5:
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_FullTitle");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_opf");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUrCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUrIndex");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUrEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUrSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUrCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUrSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressUrSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostIndex");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_phone");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_firstName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_lastName");	
				
					
				
				break;
			
			case 6:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "objectName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "objectEstateAddressCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "objectEstateAddressIndex");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "objectEstateAddressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "objectEstateAddressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "objectEstateAddressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "objectEstateAddressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "objectEstateAddressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 7:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "waydelivery");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostIndex");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
				break;
			
        }
    }
}