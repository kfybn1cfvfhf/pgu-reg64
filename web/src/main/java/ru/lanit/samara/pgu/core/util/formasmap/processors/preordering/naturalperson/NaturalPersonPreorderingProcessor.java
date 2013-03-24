package ru.lanit.samara.pgu.core.util.formasmap.processors.preordering.naturalperson;

import ru.lanit.samara.pgu.core.util.formasmap.FormAsMap;
import ru.lanit.samara.pgu.core.util.formasmap.processors.preordering.AbstractPreorderingProcessor;
import ru.lanit.samara.pgu.core.util.formasmap.processors.preordering.juridicalperson.RepresentativePreorderingProcessor;

public class NaturalPersonPreorderingProcessor extends AbstractPreorderingProcessor {

    public NaturalPersonPreorderingProcessor(FormAsMap formAsMap) {
        super(formAsMap);

        this.decoratedFormAsMap = new RepresentativePreorderingProcessor(this.decoratedFormAsMap);
        this.decoratedFormAsMap = new ru.lanit.samara.pgu.core.util.formasmap.processors.preordering.juridicalperson.NotRepresentativePreorderingProcessor(this.decoratedFormAsMap);
    }

    @Override
    public void clearForOrdering() {
        super.clearForOrdering();

        this.remove("dovUlType");
        this.clearFileLoadField("dovUiPasLoad");
        this.remove("org_FullTitle");
        this.remove("org_opf");
        this.remove("org_AdressUr");
        this.remove("org_AdressPost");
        this.remove("org_InnUl");
        this.remove("org_OgrnUl");
        this.remove("org_firstName");
        this.remove("org_lastName");
        this.remove("org_middleName");
        this.remove("org_phone");
        this.clearFileLoadField("founderDocLoad");
        this.clearFileLoadField("docMvRegUL");
    }

}
