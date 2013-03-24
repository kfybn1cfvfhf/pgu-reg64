package com.nvision.pgu.web.services.s36400131;

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
public class Service36400131FormValidator extends AbstractServiceOrderFormValidator<Service36400131Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400131Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400131Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "applType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlType");	
				
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
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
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
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "addressPostSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passSeria");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passNo");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "passFrom");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identityDocLoad");	
				
				break;
			
			case 4:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlNonDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlPasLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_FullTitle");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_opf");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgPostAddressCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgPostAddressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgPostAddressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgPostAddressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgPostAddressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgPostAddressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_phone");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_fax");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_firstName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_lastName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_InnUl");	
				
	            getRuleRegistry().getValidationRule("innlegal").validate(form, errors, "org_InnUl" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_OgrnUl");	
				
	            getRuleRegistry().getValidationRule("legalregno").validate(form, errors, "org_OgrnUl" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "founderDocLoad");	
				
					
				
					
				
				break;
			
			case 5:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlDovLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dovUlPasLoad");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_FullTitle");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_opf");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgAddressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgPostAddressCountry");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgPostAddressEnterType");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgPostAddressSettlementType");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgPostAddressCity");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgPostAddressSettlementText");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "orgPostAddressSettlementDict");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_phone");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_fax");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_firstName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_lastName");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_InnUl");	
				
	            getRuleRegistry().getValidationRule("innlegal").validate(form, errors, "org_InnUl" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_OgrnUl");	
				
	            getRuleRegistry().getValidationRule("legalregno").validate(form, errors, "org_OgrnUl" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "founderDocLoad");	
				
					
				
					
				
				break;
			
			case 6:
				
					
				
					
				
	            getRuleRegistry().getValidationRule("innind").validate(form, errors, "inn" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ogrnip");	
				
	            getRuleRegistry().getValidationRule("ipregno").validate(form, errors, "ogrnip" );
				
					
				
					
				
					
				
				break;
			
			case 7:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "nameBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "filialBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "bikBankBenefit");	
				
	            getRuleRegistry().getValidationRule("bikbank").validate(form, errors, "bikBankBenefit" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "corrAccBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "codeFilialBankBenefit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "clientAccBankBenefit");	
				
				break;
			
			case 8:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "zemAddress");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "squareZem");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "kadastrZem");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "useCh");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "planDocLoad");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "topDocLoad");	
				
					
				
					
				
					
				
					
				
				break;
			
        }
    }
}