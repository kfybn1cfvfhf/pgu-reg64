package com.nvision.pgu.web.services.s36400012;

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
public class Service36400012FormValidator extends AbstractServiceOrderFormValidator<Service36400012Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400012Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400012Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc_vid");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc_tip");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "reason");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "serie_num");	
				
				break;
			
			case 2:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_name");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_adress");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn");	
				
	            getRuleRegistry().getValidationRule("innind").validate(form, errors, "inn" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn_org");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ogrnip");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ogrnip_org");	
				
	            getRuleRegistry().getValidationRule("ipregno").validate(form, errors, "ogrnip_org" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone_ip");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc_a1");	
				
				break;
			
			case 3:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_name_ul");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_adress");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "post_adress");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "fio_mngr");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "place_leader");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn_ul");	
				
	            getRuleRegistry().getValidationRule("innlegal").validate(form, errors, "inn_ul" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn_org_ul");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ogrn_ul");	
				
	            getRuleRegistry().getValidationRule("legalregno").validate(form, errors, "ogrn_ul" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ogrn_org_ul");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone_ul");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc_b1");	
				
				break;
			
        }
    }
}