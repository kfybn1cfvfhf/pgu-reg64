package ru.lanit.samara.pgu.core.util.formasmap.processors.preordering.juridicalperson;

import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;
import ru.lanit.samara.pgu.core.util.formasmap.FormAsMap;
import ru.lanit.samara.pgu.core.util.formasmap.processors.preordering.AbstractPreorderingProcessor;
import ru.lanit.samara.pgu.core.util.formasmap.processors.preordering.naturalperson.NotIndividualEntrepreneurPreorderingProcessor;
import ru.lanit.samara.pgu.core.util.formasmap.processors.preordering.naturalperson.NotRepresentativePreorderingProcessor;

public class JuridicalPersonPreorderingProcessor extends AbstractPreorderingProcessor {

    private IPrivateRoomDataContainer privateRoomDataContainer;

    public JuridicalPersonPreorderingProcessor(FormAsMap formAsMap, IPrivateRoomDataContainer privateRoomDataContainer) {
        super(formAsMap);

        this.decoratedFormAsMap = new NotRepresentativePreorderingProcessor(this.decoratedFormAsMap);
        this.decoratedFormAsMap = new NotIndividualEntrepreneurPreorderingProcessor(this.decoratedFormAsMap);

        this.privateRoomDataContainer = privateRoomDataContainer;
    }

    @Override
    public void clearForOrdering() {
        super.clearForOrdering();

        this.remove("dov_enable");
        this.remove("lastName");
        this.remove("firstName");
        this.remove("middleName");
        this.remove("address");
        this.remove("factAddress");
        this.remove("addressPost");
        this.remove("phone");
        this.remove("identityDocType");
        this.remove("passSeria");
        this.remove("passNo");
        this.remove("passDate");
        this.remove("passFrom");
        this.clearFileLoadField("identityDocLoad");
        this.remove("ip_enable");

        this.put("firstName", this.privateRoomDataContainer.getFirstName());
        this.put("lastName", this.privateRoomDataContainer.getLastName());
        this.put("middleName", this.privateRoomDataContainer.getMiddleName());
        this.put("phone", this.privateRoomDataContainer.getPhone());
        this.put("email", this.privateRoomDataContainer.getEmail());
    }
}
