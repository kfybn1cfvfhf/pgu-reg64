package com.nvision.pgu.web.services.s36400010;

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
public class Service36400010FormValidator extends AbstractServiceOrderFormValidator<Service36400010Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400010Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400010Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "fio_zaja");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone_zaja");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "fio_boss");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ip_adress");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ip_phone");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc_type");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc_num");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc_date");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc_org");	
				
					
				
				break;
			
			case 2:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ogrnip");	
				
	            getRuleRegistry().getValidationRule("digits").validate(form, errors, "ogrnip" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn_ip");	
				
	            getRuleRegistry().getValidationRule("digits").validate(form, errors, "inn_ip" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egrul_num");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egrul_date");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egrul_org");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "tax_num");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "tax_org");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "tax_date");	
				
				break;
			
			case 3:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lic_num");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lic_start");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lic_finish");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lic_org");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lic_reason");	
				
				break;
			
			case 4:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc52");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc53");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc54");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc55");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc56");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc57");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc58");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc59");	
				
				break;
			
			case 5:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egrip_new");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egrip_date");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egrip_org");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc62");	
				
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
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc82");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc83");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc84");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc86");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc87");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc88");	
				
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