package ru.lanit.samara.pgu.core.util.formasmap.processors.preordering.naturalperson;

import ru.lanit.samara.pgu.core.util.formasmap.FormAsMap;
import ru.lanit.samara.pgu.core.util.formasmap.processors.preordering.AbstractPreorderingProcessor;

public class NotIndividualEntrepreneurPreorderingProcessor extends AbstractPreorderingProcessor {

    public NotIndividualEntrepreneurPreorderingProcessor(FormAsMap formAsMap) {
        super(formAsMap);
    }

    @Override
    public void clearForOrdering() {
        super.clearForOrdering();

        this.remove("inn");
        this.remove("ogrnip");
        this.clearFileLoadField("docMvRegIP");
    }
}
