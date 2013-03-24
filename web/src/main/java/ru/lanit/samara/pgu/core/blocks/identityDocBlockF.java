package ru.lanit.samara.pgu.core.blocks;

import com.nvision.pgu.core.util.FileBean;

import java.util.Date;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: vlyasovich
 * Date: 21.11.12
 * Time: 10:43
 * To change this template use File | Settings | File Templates.
 */
public class identityDocBlockF extends identityDocBlock {

    private Map<String, FileBean> fileBlock;
    public identityDocBlockF(Map<String, String> stringBlock, Map<String, Date> dateBlock, Map<String, FileBean> fileBlock) {
        super(stringBlock, dateBlock);

        if(fileBlock != null) {
            this.fileBlock = fileBlock;
        }
    }
    /*
    public identityDocBlockF(Map<String, String> stringBlock, Map<String, Date> dateBlock, Map<String, FileBean> fileBlock) {
        super(stringBlock, dateBlock);

        if(fileBlock != null) {
            this.fileBlock = fileBlock;
        }
    }
     */
    public void setIdentityDocLoad(FileBean identityDocLoad) {
        //this.fileBlock.put("identityDocLoad", identityDocLoad);
        identityDocLoad.setFileID("identityDocLoad");
        this.fileBlock.put("identityDocLoad", identityDocLoad);
    }

    public FileBean getIdentityDocLoad() {
        return this.fileBlock.get("identityDocLoad");
    }

}
