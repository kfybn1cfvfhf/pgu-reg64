package com.nvision.pgu.web.services.s36400200;

import com.nvision.pgu.core.controllers.AbstractServiceOrderFormValidator;
import com.nvision.pgu.core.rules.api.RuleException;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

/**
 * @author Aleksei Balandin (mailto:aleksisha@gmail.com)
 *         Date: 05.10.2010
 *         Time: 18:38:19
 */
@Component
public class Service36400200FormValidator extends AbstractServiceOrderFormValidator<Service36400200Form>
{

    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400200Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400200Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastname");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "lastname" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstname");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "firstname" );
				
					
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "patronymic" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "snils");	
				
	            getRuleRegistry().getValidationRule("snils").validate(form, errors, "snils" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identDocType");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "serPassport");	
				
	            getRuleRegistry().getValidationRule("digitsexact").validate(form, errors, "serPassport" , "4");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "noPassport");	
				
	            getRuleRegistry().getValidationRule("digitsexact").validate(form, errors, "noPassport" , "6");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dataPassport");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "whoPassport");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "whoPassport" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "typeOtherDoc");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "noOtherDoc");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dataOtherDoc");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "whoOtherDoc");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "whoOtherDoc" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birthday");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "adressKladr");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "adress");	
				
					
				
					
				
					
				
					
				
	            getRuleRegistry().getValidationRule("phone").validate(form, errors, "noPhone" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "person");	
				
				break;
			
			case 2:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "categPatient");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "firstnamePatient");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "firstnamePatient" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lastnamePatient");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "lastnamePatient" );
				
					
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "patronymicPatient" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "snilsPatient");	
				
	            getRuleRegistry().getValidationRule("snils").validate(form, errors, "snilsPatient" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "identDocTypePatient");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "serBirthcertPatient");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "noBirthcertPatient");	
				
	            getRuleRegistry().getValidationRule("digitsexact").validate(form, errors, "noBirthcertPatient" , "6");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dataBirthcertPatient");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "serPassportPatient");	
				
	            getRuleRegistry().getValidationRule("digitsexact").validate(form, errors, "serPassportPatient" , "4");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "noPassportPatient");	
				
	            getRuleRegistry().getValidationRule("digitsexact").validate(form, errors, "noPassportPatient" , "6");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dataPassportPatient");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "whoPassportPatient");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "whoPassportPatient" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "typeOtherDocPatient");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "noOtherDocPatient");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dataOtherDocPatient");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "whoOtherDocPatient");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "whoOtherDocPatient" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "typeApplicantRight");	
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "serCertGuardian");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "noCertGuardian");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dataCertGuardian");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "whoCertGuardian");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "whoCertGuardian" );
				
					
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "typeOtherDocGuardian");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "noOtherDocGuardian");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "dataOtherDocGuardian");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "whoOtherDocGuardian");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "whoOtherDocGuardian" );
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birthdayPatient");	
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "adressKladrPatient");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "adressKladrPatient" );
				
				break;
			
			case 3:
				
					
				
					
				
					
				
					
				
					
				
				break;
			
			case 4:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "lpu");	
				
					
				
					
				
				break;
			
			case 5:
				
					
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "doc");	
				
				break;
			
			case 6:
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "agree");	
				
					
				
				break;
			
        }
    }
}
