package com.nvision.pgu.web.services.s36400096;

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
public class Service36400096FormValidator extends AbstractServiceOrderFormValidator<Service36400096Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400096Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400096Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "applType");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlType");	
				
					
				
					
				
					
				
				break;
			
			case 2:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "sex");	
				
					
				
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
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovlastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovfirstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovPasLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "sex");	
				
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
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovlastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovfirstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlNonDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlPasLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_FullTitle");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_opf");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPost");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "founderDocLoad");	
				
				break;
			
			case 5:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovlastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovfirstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlPasLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_FullTitle");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_opf");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPost");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "founderDocLoad");	
				
				break;
			
			case 6:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "fl_owner_lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "fl_owner_firstName");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "fl_owner_docType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "fl_owner_docNum");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "fl_owner_docDate");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "fl_owner_DocLoad");	
				
					
				
				break;
			
			case 7:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ul_owner_FullTitle");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ul_owner_opf");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ul_owner_docType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ul_owner_docNum");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ul_owner_docDate");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ul_owner_DocLoad");	
				
					
				
				break;
			
			case 8:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "roomStatusNow");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "roomStatusAfter");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "roomPurpose");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "roomAddress");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "wayOfDelivery");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "decisionDocLoad");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 9:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "agree1Ch");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "agree2Ch");	
				
				break;
			
        }
    }
}