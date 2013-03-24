package com.nvision.pgu.web.services.s36400014;

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
public class Service36400014FormValidator extends AbstractServiceOrderFormValidator<Service36400014Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400014Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400014Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "Juristic_Person_Fio");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone_zaja");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "Juristic_Person_Fullname");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "org_form");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarantAdressUL");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "post_adress");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "zaja_boss_name");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "Juristic_Person_Position");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc_label_2");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone_ul");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ser_num");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egipdate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egipogv");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "eg_adr");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "taxnum");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "taxdate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "taxorg");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "innUL");	
				
	            getRuleRegistry().getValidationRule("innlegal").validate(form, errors, "innUL" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ogrnUL");	
				
	            getRuleRegistry().getValidationRule("digits").validate(form, errors, "ogrnUL" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ogrn_data");	
				
				break;
			
			case 2:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "objectLicensKind_1");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "licensAdress_1");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "farmWorks_1");	
				
					
				
				break;
			
			case 3:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loadDocA1");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "sanit");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "el_prof");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "el_pravo");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "el_farmac");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "el_cash");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "opis");	
				
				break;
			
			case 4:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loadDocB1");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loadDocB2");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loadDocB3");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loadDocB4");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "opis2");	
				
				break;
			
        }
    }
}