package com.nvision.pgu.web.services.s36400008;

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
public class Service36400008FormValidator extends AbstractServiceOrderFormValidator<Service36400008Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400008Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400008Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "claimant_full_namef");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "fio_IP");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarantadress");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone_fax");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "email");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc_type");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "docser");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "docdate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "docissuer");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "taxpayer_idIP");	
				
	            getRuleRegistry().getValidationRule("innind").validate(form, errors, "taxpayer_idIP" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ogrnip");	
				
	            getRuleRegistry().getValidationRule("ipregno").validate(form, errors, "ogrnip" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ogrnip_org");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "blank_num");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "date_g");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_name2");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc_accept");	
				
					
				
					
				
					
				
				break;
			
			case 2:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ogrnip_org");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "blank_num");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "date_g");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_name2");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc_accept");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "taxpayer_idIP");	
				
	            getRuleRegistry().getValidationRule("innind").validate(form, errors, "taxpayer_idIP" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone_ip");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "email_ip");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn_ser");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn_org");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn_date");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn_req");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_name1");	
				
					
				
				break;
			
			case 3:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "licensadress_1");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc61");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc62");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc63");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc64");	
				
					
				
				break;
			
			case 4:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc65");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc66");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc67");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc68");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loaddoc70");	
				
					
				
				break;
			
        }
    }
}