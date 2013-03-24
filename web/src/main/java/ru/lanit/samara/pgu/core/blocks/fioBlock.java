package ru.lanit.samara.pgu.core.blocks;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: vlyasovich
 * Date: 21.11.12
 * Time: 16:42
 * To change this template use File | Settings | File Templates.
 */
public class fioBlock {
    private Map<String, String> stringBlock;

    public fioBlock(Map<String, String> stringBlock) {
        if(stringBlock != null)
            this.stringBlock = stringBlock;
    }

    public void setLastName(String lastName) {
        this.stringBlock.put("lastName", lastName);
    }

    public String getLastName() {
        return this.stringBlock.get("lastName");
    }

    public void setFirstName(String firstName) {
        this.stringBlock.put("firstName", firstName);
    }

    public String getFirstName() {
        return this.stringBlock.get("firstName");
    }

    public void setMiddleName(String middleName) {
        this.stringBlock.put("middleName", middleName);
    }

    public String getMiddleName() {
        return this.stringBlock.get("middleName");
    }

}
