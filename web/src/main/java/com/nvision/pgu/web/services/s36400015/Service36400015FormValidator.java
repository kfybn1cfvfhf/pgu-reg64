package com.nvision.pgu.web.services.s36400015;

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
public class Service36400015FormValidator extends AbstractServiceOrderFormValidator<Service36400015Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400015Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400015Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarantName");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "phone_z");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "fio_IP");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "place_live");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "tel");	
				
					
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc_type");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "docSer");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "docDate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "docIssuer");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egipogv");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egipadress");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egipdate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "egipser");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "ogrn");	
				
	            getRuleRegistry().getValidationRule("digits").validate(form, errors, "ogrn" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "regogv");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "regdate");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "regser");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "inn");	
				
	            getRuleRegistry().getValidationRule("digits").validate(form, errors, "inn" );
				
				break;
			
			case 2:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "objectLicensKind_1");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "licensAdress_1");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "farmWorks_1");	
				
					
				
				break;
			
			case 3:
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loadsan");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loadDocF1");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loadDocG1");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loadDocH1");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loadDocZ1");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "loadDocdov2");	
				
				break;
			
        }
    }
}