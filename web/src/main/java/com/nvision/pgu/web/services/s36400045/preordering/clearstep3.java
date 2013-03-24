package com.nvision.pgu.web.services.s36400045.preordering;

import ru.lanit.samara.pgu.core.util.formasmap.FormAsMap;
import ru.lanit.samara.pgu.core.util.formasmap.processors.preordering.AbstractPreorderingProcessor;

public class clearstep3 extends AbstractPreorderingProcessor {

     public clearstep3(FormAsMap formAsMap) {
        super(formAsMap);
    }

    @Override
    public void clearForOrdering() {
        super.clearForOrdering();

        this.remove("parentLastName");
        this.remove("parentFirstName");
        this.remove("parentMiddleName");
        this.remove("parentEmployedCh");
        this.remove("parentWorkPlace");
        this.remove("parentWorkPost");
        this.remove("parentIdentityDocType");
        this.remove("parentPassSeria");
        this.remove("parentPassNo");
        this.remove("parentPassDate");
        this.remove("parentPassFrom");
    }
}
