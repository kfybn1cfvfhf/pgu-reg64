package ru.lanit.samara.pgu.core.util.formasmap.processors.preordering.juridicalperson;

import ru.lanit.samara.pgu.core.util.formasmap.FormAsMap;
import ru.lanit.samara.pgu.core.util.formasmap.processors.preordering.AbstractPreorderingProcessor;

public class NotRepresentativePreorderingProcessor extends AbstractPreorderingProcessor {

    public NotRepresentativePreorderingProcessor(FormAsMap formAsMap) {
        super(formAsMap);
    }

    @Override
    public void clearForOrdering() {
        super.clearForOrdering();

        this.clearFileLoadField("dovUlDovLoad");
    }
}
