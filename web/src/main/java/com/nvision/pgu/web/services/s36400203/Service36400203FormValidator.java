package com.nvision.pgu.web.services.s36400203;

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
public class Service36400203FormValidator extends AbstractServiceOrderFormValidator<Service36400203Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400203Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400203Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressCountry");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "factAddressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 2:
				
					
				
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
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "rehabilitationCertificateLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "deathCertificateLoad");	
				
					
				
					
				
				break;
			
        }
    }
}