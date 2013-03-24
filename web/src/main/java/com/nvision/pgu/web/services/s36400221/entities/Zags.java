package com.nvision.pgu.web.services.s36400221.entities;

/**
 * Created by IntelliJ IDEA.
 * User: MKoshenkova
 * Date: 09.03.11
 * Time: 18:50
 * To change this template use File | Settings | File Templates.
 */
public class Zags {

    private String idZags;
    private String nameZags;

    public Zags(){}

    public Zags(String idZags,String nameZags){

        setIdZags(idZags);
        setNameZags(nameZags);
    }

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
