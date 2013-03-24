package com.nvision.pgu.web.services.s36400225;

import com.nvision.pgu.core.rules.api.RuleException;
import com.nvision.pgu.core.controllers.AbstractServiceOrderFormValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import java.text.SimpleDateFormat;

/**
 * @author Aleksei Balandin (mailto:aleksisha@gmail.com)
 *         Date: 05.10.2010
 *         Time: 18:38:19
 */
@Component
public class Service36400225FormValidator extends AbstractServiceOrderFormValidator<Service36400225Form>
{

    protected boolean ignoreValidationErrors() {
        return true;
    }


    @Override
    public boolean supports(Class< ?> clazz)
    {
        return Service36400225Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400225Form form, Integer stepNum, Errors errors) throws RuleException {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
			
			case 1:
				getRuleRegistry().getValidationRule("required").validate(form, errors, "id_agency_in");

                getRuleRegistry().getValidationRule("required").validate(form, errors, "usluga_form");
                /*if (!form.getCertificate_date_year().isEmpty()) {
                    Integer day = form.getCertificate_date_day().isEmpty() ? 1 : Integer.parseInt(form.getCertificate_date_day());
                    Integer month = form.getCertificate_date_month().isEmpty() ? 1 : Integer.parseInt(form.getCertificate_date_month());
                    Integer year = form.getCertificate_date_year().isEmpty() ? 2000 : Integer.parseInt(form.getCertificate_date_year());
                    Calendar calendar = new GregorianCalendar(year,month-1,day);

                    form.setCertificate_date(calendar.getTime());

                    System.out.println("Compare:"+calendar.getTime().compareTo(new Date()));
                    if (calendar.getTime().compareTo(new Date()) > 0) {
                        errors.rejectValue("certificate_date_year", "", "ERROR DATE!!!");
                    }
                }*/
                //Date certificate_date = form.getCertificate_date();
                //getRuleRegistry().getValidationRule("beforeTodayNSpecifiedDate").validate(form, errors, "certificate_date", dateFormat.format(new Date()));

                break;
			
			case 2:
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_birth_date");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_sex");	

				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_country");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_settlement_type");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_settlement");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birth_akt_num");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birth_name");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "birth_zags");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_before_last_name");
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_before_last_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_before_first_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_before_first_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_before_middle_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_before_middle_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_after_last_name");
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_after_last_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_after_first_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_after_first_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "child_after_middle_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "child_after_middle_name" );
				
				break;
			
			case 3:
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_father_last_name");
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_father_last_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_father_first_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_father_first_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_father_middle_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_father_middle_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_father_birth_date");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_father_doc_type");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_father_doc_ser");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_father_doc_number");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_father_doc_date");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_father_doc_date" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_father_doc_place");	

				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_mother_last_name");
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_mother_last_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_mother_first_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_mother_first_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_mother_middle_name");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_mother_middle_name" );
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_mother_birth_date");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_mother_doc_type");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_mother_doc_ser");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_mother_doc_number");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_mother_doc_date");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "declarant_mother_doc_place");	
				
	            getRuleRegistry().getValidationRule("cyrillic").validate(form, errors, "declarant_mother_doc_place" );
				
				break;
			
			case 4:
				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_birth_place_country");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_birth_place_settlement_type");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_birth_place_settlement");	

				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_birth_place_country");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_birth_place_settlement_type");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_birth_place_settlement");	
				
				break;
			
			case 5:
				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_living_country");

				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_living_place");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_living_settlement");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_living_street_type");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_living_street");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "father_living_house");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_living_country");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_living_place");
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_living_settlement");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_living_street_type");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_living_street");	
				
				getRuleRegistry().getValidationRule("required").validate(form, errors, "mother_living_house");	
				
				break;
			
			case 6:
				break;
			
        }
    }
}