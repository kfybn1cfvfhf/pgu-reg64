package com.nvision.pgu.web.services.s36400009;

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
public class Service36400009FormValidator extends AbstractServiceOrderFormValidator<Service36400009Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400009Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400009Form form, Integer stepNum, Errors errors) throws RuleException {
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
				
					
				
					
				
					
				
					
				
	            getRuleRegistry().getValidationRule("innind").validate(form, errors, "inn" );
				
					
				
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
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
					
				
	            getRuleRegistry().getValidationRule("innind").validate(form, errors, "inn" );
				
					
				
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
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlNonDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlPasLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_FullTitle");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_opf");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_InnUl");	
				
	            getRuleRegistry().getValidationRule("innlegal").validate(form, errors, "org_InnUl" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_OgrnUl");	
				
	            getRuleRegistry().getValidationRule("legalregno").validate(form, errors, "org_OgrnUl" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostIndex");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_phone");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 5:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstName");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlPasLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_FullTitle");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_opf");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_InnUl");	
				
	            getRuleRegistry().getValidationRule("innlegal").validate(form, errors, "org_InnUl" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_OgrnUl");	
				
	            getRuleRegistry().getValidationRule("legalregno").validate(form, errors, "org_OgrnUl" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostIndex");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_addressPostSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_phone");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 6:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "licenseNumber");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "startDateLicense");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "nameLicensingAuthority");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "reason_reIP");	
				
					
				
				break;
			
			case 7:
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc1");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc4");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc6");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc7");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc9");	
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 8:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "documentNumber");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dateIssue");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "issuingAuthority");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc15");	
				
					
				
					
				
					
				
				break;
			
			case 9:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc14");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc6");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc7");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc15");	
				
					
				
					
				
					
				
				break;
			
			case 10:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc16");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc15");	
				
					
				
					
				
					
				
				break;
			
			case 11:
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc18");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc4");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc15");	
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 12:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "licenseNumberUL");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "startDateLicenseUL");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "nameLicensingAuthorityUL");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "reason_reUL");	
				
				break;
			
			case 13:
				
					
				
					
				
					
				
					
				
				break;
			
			case 14:
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc21");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc4");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc6");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc7");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc9");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc15");	
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 15:
				
					
				
					
				
					
				
					
				
				break;
			
			case 16:
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc14");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc4");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc6");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc7");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc9");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc15");	
				
					
				
					
				
					
				
					
				
				break;
			
			case 17:
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc22");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc4");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc15");	
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 18:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc23");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc15");	
				
					
				
					
				
					
				
				break;
			
        }
    }
}