package com.nvision.pgu.web.services.s36400016;

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
public class Service36400016FormValidator extends AbstractServiceOrderFormValidator<Service36400016Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400016Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400016Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_name_ul");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_post_ul");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_name_ul");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_form");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firm_name");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "tel_ul");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_adress");	
				
				break;
			
			case 2:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ogrn");	
				
	            getRuleRegistry().getValidationRule("innlegal").validate(form, errors, "ogrn" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn");	
				
	            getRuleRegistry().getValidationRule("digits").validate(form, errors, "inn" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egrul_num");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egrul_date");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egrul_org");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn_num");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn_org");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn_date");	
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 3:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "precursors");	
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 4:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc2");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc10");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc13");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc5");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc6");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc7");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc8");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc9");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc11");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "load_doc12");	
				
					
				
					
				
					
				
				break;
			
        }
    }
}