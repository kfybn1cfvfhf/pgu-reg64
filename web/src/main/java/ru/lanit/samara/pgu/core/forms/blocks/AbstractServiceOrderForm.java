package ru.lanit.samara.pgu.core.forms.blocks;

import com.nvision.pgu.core.util.FileBean;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbstractServiceOrderForm extends ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm {

    // Зайчатки блочной реализации
    private Map<String, String> stringBlock = new HashMap<String, String>();
    private Map<String, Date> dateBlock = new HashMap<String, Date>();
    private Map<String, FileBean> fileBlock = new HashMap<String, FileBean>();

    public Map<String, String> getStringBlock() {
        return stringBlock;
    }

    public void setStringBlock(Map<String, String> stringBlock) {
        if((stringBlock != null) && (!stringBlock.isEmpty()))
            this.stringBlock = stringBlock;
    }

    public Map<String, Date> getDateBlock() {
        return dateBlock;
    }

    public void setDateBlock(Map<String, Date> dateBlock) {
        if((dateBlock != null) && (!dateBlock.isEmpty()))
        this.dateBlock = dateBlock;
    }

    public Map<String, FileBean> getFileBlock() {
        return fileBlock;
    }

    public void setFileBlock(Map<String, FileBean> fileBlock) {
        if((fileBlock != null) && (!fileBlock.isEmpty()))
            this.fileBlock = fileBlock;
    }


    public static List normalizeCheck(List data) {
        for (int i = 0; i < data.size(); ++i) {
            if (data.get(i) == null) {
                data.set(i,"off");
            }
        }
        return data;
    }
}
