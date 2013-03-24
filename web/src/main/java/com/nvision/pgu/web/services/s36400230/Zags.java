package com.nvision.pgu.web.services.s36400230;

/**
 * Created by IntelliJ IDEA.
 * User: MKoshenkova
 * Date: 09.03.11
 * Time: 18:50
 * To change this template use File | Settings | File Templates.
 */
public class  Zags {
    public Zags(){

    }
    public Zags(String idZags,String nameZags){
        setIdZags(idZags);
        setNameZags(nameZags);
    }

    private String idZags;
    private String nameZags;

    public String getIdZags() {
        return idZags;
    }

    public void setIdZags(String idZags) {
        this.idZags = idZags;
    }

    public String getNameZags() {
        return nameZags;
    }

    public void setNameZags(String nameZags) {
        this.nameZags = nameZags;
    }
}
