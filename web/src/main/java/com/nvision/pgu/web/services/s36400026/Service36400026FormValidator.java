package com.nvision.pgu.web.services.s36400026;

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
public class Service36400026FormValidator extends AbstractServiceOrderFormValidator<Service36400026Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400026Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400026Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "BrandName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "OgrnDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "Ogrn");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "OrgFormCode");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "OwnershipCode");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "OkvedCode");	
				
				break;
			
			case 2:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "DecName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "DecMobilePhone");	
				
	            getRuleRegistry().getValidationRule("phone").validate(form, errors, "DecMobilePhone" );
				
					
				
	            getRuleRegistry().getValidationRule("phone").validate(form, errors, "DecFax" );
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "AdrOKATO");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "AdrLocality");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "AdrCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "AdrStreet");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "AdrHouse");	
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "FAdrOKATO");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "FAdrLocality");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "FAdrCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "FAdrStreet");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "FAdrHouse");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "czn");	
				
				break;
			
			case 3:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "Workers");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "Discharge");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "WorkersCount");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 4:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "Prof");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "CountVacancy");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "SystOplat");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
        }
    }
}