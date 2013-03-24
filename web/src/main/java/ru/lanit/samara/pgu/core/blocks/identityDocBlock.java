package ru.lanit.samara.pgu.core.blocks;

import java.util.Date;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: vlyasovich
 * Date: 20.11.12
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */
public class identityDocBlock {
    private Map<String, String> stringBlock;
    private Map<String, Date> dateBlock;

    public identityDocBlock(Map<String, String> stringBlock, Map<String, Date> dateBlock) {
        if(stringBlock != null)
            this.stringBlock = stringBlock;
        if(dateBlock != null)
            this.dateBlock = dateBlock;
    }

    public String getIdentityDocType() {
        return this.stringBlock.get("identityDocType");
    }

    public void setIdentityDocType(String identityDocType) {
        this.stringBlock.put("identityDocType", identityDocType);
    }

    public void setPassSeria(String passSeria) {
        this.stringBlock.put("passSeria", passSeria);
    }

    public String getPassSeria() {
        return this.stringBlock.get("passSeria");
    }

    public void setPassNo(String passNo) {
        this.stringBlock.put("passNo", passNo);
    }

    public String getPassNo() {
        return this.stringBlock.get("passNo");
    }

    public void setPassDate(Date passDate) {
        this.dateBlock.put("passDate", passDate);
    }

    public Date getPassDate() {
       return this.dateBlock.get("passDate");
    }

    public void setPassFrom(String passFrom) {
        this.stringBlock.put("passFrom", passFrom);
    }

    public String getPassFrom() {
        return this.stringBlock.get("passFrom");
    }
}
