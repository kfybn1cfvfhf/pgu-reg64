package ru.lanit.samara.pgu.core.forms;

import java.util.List;

public class AbstractServiceOrderForm extends com.nvision.pgu.core.forms.AbstractServiceOrderForm {

    public static List normalizeCheck(List data) {
        for (int i = 0; i < data.size(); ++i) {
            if (data.get(i) == null) {
                data.set(i,"off");
            }
        }
        return data;
    }
}
