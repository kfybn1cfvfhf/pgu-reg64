package ru.lanit.samara.pgu.core.rules;

import com.nvision.pgu.core.exceptions.InitRuleProcessorException;
import com.nvision.pgu.core.rules.api.InitRuleFieldMeta;
import com.nvision.pgu.core.wizard.AbstractWizardForm;
import com.nvision.pgu.sp.principal.IPrincipal;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.nvg.idecs.personaldataservice.ws.common.profile.GetPersonalDataRequest;
import ru.nvg.idecs.personaldataservice.ws.common.profile.GetPersonalDataResponse;
import ru.nvg.idecs.personaldataservice.ws.common.profile.PersonalDataService;
import ru.nvg.idecs.identityservice.ws.types.Person;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@Component("ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy")
public class InitRulePersonalDataStrategy extends com.nvision.pgu.core.rules.InitRulePersonalDataStrategy {

    @Autowired
    @Qualifier("personalDataService")
    protected PersonalDataService personalDataService;

    @Override
    public void setFields(AbstractWizardForm form, Map<Field, InitRuleFieldMeta> fieldMap, Map<String, Object> context) {
        super.setFields(form, fieldMap, context);

        // получаем данные текущего пользователя из СИА
        if(form == null) return;
        if(fieldMap == null || fieldMap.isEmpty()) return;
        IPrincipal principal = (IPrincipal)context.get(IPrincipal.class.getSimpleName());
        if(principal == null) return;
        Long userId = principal.getUserId();
        String userType = principal.getUserType();
        String authToken = principal.getAuthToken();
        if(userId == null) return;
        GetPersonalDataRequest personalDataRequest = new GetPersonalDataRequest();
        personalDataRequest.setAuthToken(authToken);
        personalDataRequest.setUserId(userId);
        GetPersonalDataResponse personalDataResponse = personalDataService.getPersonalData(personalDataRequest);
        Person person = personalDataResponse.getPerson();
        if(person == null) return;
        for (Map.Entry<Field, InitRuleFieldMeta> fieldEntry : fieldMap.entrySet()) {
            if (MAINDOCUMENT_SERNUM.equals(fieldEntry.getValue().getFieldName())) {
                try {
                    BeanUtils.setProperty(form, ((Field)fieldEntry.getKey()).getName(), person.getMainDocument().getDocSeries()+"-"+person.getMainDocument().getDocNumber());
                } catch (IllegalAccessException e) {
                    throw new InitRuleProcessorException((new StringBuilder()).append("Can not set field ").append(form.getClass().getSimpleName()).append(".").append(((Field)fieldEntry.getKey()).getName()).toString(), e);
                } catch (InvocationTargetException e) {
                    throw new InitRuleProcessorException((new StringBuilder()).append("Can not set field ").append(form.getClass().getSimpleName()).append(".").append(((Field)fieldEntry.getKey()).getName()).toString(), e);
                }
            }
        }
    }

    public static final String MAINDOCUMENT_SERNUM = "MAINDOCUMENT.SERNUM";
    public static final String MAINDOCUMENT_TYPENAME = "MAINDOCUMENT.TYPENAME";
}
