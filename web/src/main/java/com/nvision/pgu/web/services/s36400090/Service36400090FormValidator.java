package com.nvision.pgu.web.services.s36400090;

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
public class Service36400090FormValidator extends AbstractServiceOrderFormValidator<Service36400090Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400090Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400090Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "applType");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlType");	
				
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
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
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
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "warrantPlace");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "warrantDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "warrantSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "warrantNo");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovIdentityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovOtherDocTypeName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPasLoad");	
				
				break;
			
			case 4:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlNonDovLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovLastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovFirstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovIdentityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovOtherDocTypeName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPasLoad");	
				
				break;
			
			case 5:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlDovLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovLastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovFirstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "warrantPlace");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "warrantDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "warrantSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "warrantNo");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovIdentityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovOtherDocTypeName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPassFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPasLoad");	
				
				break;
			
			case 6:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "otherDocTypeName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
				break;
			
			case 7:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_FullTitle");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_opf");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_phone");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_fax");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_InnUl");	
				
	            getRuleRegistry().getValidationRule("innlegal").validate(form, errors, "org_InnUl" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_OgrnUl");	
				
	            getRuleRegistry().getValidationRule("legalregno").validate(form, errors, "org_OgrnUl" );
				
				break;
			
			case 8:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "constructionName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "constructionPlace");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "materialDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "expertDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "agreeDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "accreditationDocLoad");	
				
					
				
					
				
					
				
					
				
				break;
			
        }
    }
}