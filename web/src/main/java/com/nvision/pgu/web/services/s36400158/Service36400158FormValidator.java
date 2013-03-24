package com.nvision.pgu.web.services.s36400158;

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
public class Service36400158FormValidator extends AbstractServiceOrderFormValidator<Service36400158Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400158Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400158Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dov_enable");	
				
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
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSeatCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSeatIndex");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSeatEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSeatSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSeatCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSeatSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSeatSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "otherDocTypeName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
					
				
				break;
			
			case 3:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovLastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovFirstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPlace");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovNumber");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovNumber");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovIdentityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovOtherDocTypeName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPasLoad");	
				
				break;
			
			case 4:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressCountry");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSeatCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSeatIndex");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSeatEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSeatSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSeatCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSeatSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSeatSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "otherDocTypeName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
					
				
				break;
			
			case 5:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "documentAgree");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduLastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduFirstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "kindAttestat");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduFrom");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduDate");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "apostil");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "wayObtain");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressBenefitLabel");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostCountryBenefit");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostEnterTypeBenefit");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementTypeBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostCityBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementTextBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementDictBenefit");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "agreeCh");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "agree1Ch");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eduDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "edu1DocLoad");	
				
					
				
					
				
				break;
			
        }
    }
}