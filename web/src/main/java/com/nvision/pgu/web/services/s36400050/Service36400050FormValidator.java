package com.nvision.pgu.web.services.s36400050;

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
public class Service36400050FormValidator extends AbstractServiceOrderFormValidator<Service36400050Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400050Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400050Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "fio_zaja");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone_zaja");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "fio_boss");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "boss_platform");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "full");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "form");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "place");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone");	
				
					
				
					
				
				break;
			
			case 2:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ogrn");	
				
	            getRuleRegistry().getValidationRule("ogrnlegal").validate(form, errors, "ogrn" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn");	
				
	            getRuleRegistry().getValidationRule("innlegal").validate(form, errors, "inn" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egrul_num");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egrul_org");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "date_give");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egrul_place");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn_num");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn_name");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn_date");	
				
					
				
					
				
					
				
					
				
				break;
			
			case 3:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lic_num");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lic_date_st");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lic_org");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "change_reason");	
				
				break;
			
			case 4:
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc52");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc53");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc54");	
				
				break;
			
			case 5:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc61");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc63");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc64");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc65");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc66");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc67");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc68");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc69");	
				
				break;
			
			case 6:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc71");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc73");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc74");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc75");	
				
				break;
			
			case 7:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc81");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc83");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc84");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc85");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc86");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc87");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc88");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc89");	
				
				break;
			
			case 8:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc91");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc93");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc94");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc95");	
				
				break;
			
        }
    }
}