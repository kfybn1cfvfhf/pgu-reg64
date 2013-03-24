package com.nvision.pgu.web.services.s36400243;

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
public class Service36400243FormValidator extends AbstractServiceOrderFormValidator<Service36400243Form> {
    @Override
    public boolean supports(Class<?> clazz) {
        return Service36400243Form.class.isAssignableFrom(clazz);
    }

    @Override
    protected void validate(Service36400243Form form, Integer stepNum, Errors errors) throws RuleException {
        Integer step = (stepNum == null ? 1 : stepNum);
        switch (step) {
            case 1:
                getRuleRegistry().getValidationRule("required").validate(form, errors, "org_name");
                getRuleRegistry().getValidationRule("required").validate(form, errors, "ogrn");
                getRuleRegistry().getValidationRule("required").validate(form, errors, "inn");
                break;
            case 2:
                getRuleRegistry().getValidationRule("required").validate(form, errors, "okato");
                getRuleRegistry().getValidationRule("required").validate(form, errors, "locality");
                getRuleRegistry().getValidationRule("required").validate(form, errors, "city");
                getRuleRegistry().getValidationRule("required").validate(form, errors, "addr_ul");
                getRuleRegistry().getValidationRule("required").validate(form, errors, "addr_dom");
                getRuleRegistry().getValidationRule("required").validate(form, errors, "fokato");
                getRuleRegistry().getValidationRule("required").validate(form, errors, "flocality");
                getRuleRegistry().getValidationRule("required").validate(form, errors, "fcity");
                getRuleRegistry().getValidationRule("required").validate(form, errors, "addr_ul");
                getRuleRegistry().getValidationRule("required").validate(form, errors, "addr_dom");
                getRuleRegistry().getValidationRule("required").validate(form, errors, "raion");
                break;
            case 3:
                break;
        }
    }
}
