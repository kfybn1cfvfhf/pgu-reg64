package com.nvision.pgu.web.services.s36400101;

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
public class Service36400101FormValidator extends AbstractServiceOrderFormValidator<Service36400101Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400101Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400101Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "politicalNationality");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "email");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "residenceAdressCountry");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "residenceAdressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "residenceAdressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "residenceAdressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "residenceAdressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "residenceAdressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
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
			
			case 2:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "targetAppeal");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "materialCapabilities");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "furtherInform");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "opinionBeGuardLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "certificateEmploymentLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "medicalReportLoad");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "autobiographyLoad");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
        }
    }
}