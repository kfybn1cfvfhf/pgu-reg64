package ru.lanit.samara.pgu.core.forms;

import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.util.FileBean;

public class AbstractMedServiceOrderForm extends AbstractServiceOrderForm {

    protected FileBean loaddoc_okpo;

    public FileBean getLoaddoc_okpo() {
        return loaddoc_okpo;
    }

    public void setLoaddoc_okpo(FileBean loaddoc_okpo) {
        this.loaddoc_okpo = loaddoc_okpo;
    }


    protected FileBean loaddoc_building;

    public FileBean getLoaddoc_building() {
        return loaddoc_building;
    }

    public void setLoaddoc_building(FileBean loaddoc_building) {
        this.loaddoc_building = loaddoc_building;
    }

}
