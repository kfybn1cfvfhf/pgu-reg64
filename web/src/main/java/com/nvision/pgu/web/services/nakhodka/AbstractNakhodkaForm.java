package com.nvision.pgu.web.services.nakhodka;

import com.nvision.pgu.core.forms.AbstractServiceOrderForm;

/**
 * Created by IntelliJ IDEA.
 * User: ochiruhin
 * Date: 2/21/12
 * Time: 5:28 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractNakhodkaForm extends AbstractServiceOrderForm {
    public static final String REGION_MAPPING_TYPE_DISABLED = "DISABLED";
    public static final String REGION_MAPPING_TYPE_DATABASE = "DATABASE";

    private String okato;
    private String regionMappingType;

    public String getOkato() {
        return okato;
    }

    public void setOkato(String okato) {
        this.okato = okato;
    }

    public String getRegionMappingType() {
        return regionMappingType;
    }

    public void setRegionMappingType(String regionMappingType) {
        this.regionMappingType = regionMappingType;
    }

    // Generic fields

    private String declarant_country = "1";

    public String getDeclarant_country() {
        return declarant_country;
    }

    public void setDeclarant_country(String declarant_country) {
        this.declarant_country = declarant_country;
    }

    // Generic helper fields

    private String declarant_place_m;
    private String declarant_place_gr = "1";

    private String declarant_ident_doc_type_gr = "1";
    private String declarant_ident_doc_type_m;

    private String addr_agency_place_gr = "1";
    private String addr_agency_place_m;

    private String death_place_settlement_type_gr = "1";
    private String death_place_settlement_type_m;
    
    private String death_person_ident_doc_type_gr = "1";
    private String death_person_ident_doc_type_m;

    private String death_person_birth_settlement_type_gr = "1";
    private String death_person_birth_settlement_type_m;
    
    private String death_person_living_settlement_type_gr = "1";
    private String death_person_living_settlement_type_m;
    
    private String death_settlement_type_gr = "1";
    private String death_settlement_type_m;

    public String getDeath_person_ident_doc_type_gr() {
        return death_person_ident_doc_type_gr;
    }

    public void setDeath_person_ident_doc_type_gr(String death_person_ident_doc_type_gr) {
        this.death_person_ident_doc_type_gr = death_person_ident_doc_type_gr;
    }

    public String getDeath_person_ident_doc_type_m() {
        return death_person_ident_doc_type_m;
    }

    public void setDeath_person_ident_doc_type_m(String death_person_ident_doc_type_m) {
        this.death_person_ident_doc_type_m = death_person_ident_doc_type_m;
    }

    public String getDeath_person_birth_settlement_type_gr() {
        return death_person_birth_settlement_type_gr;
    }

    public void setDeath_person_birth_settlement_type_gr(String death_person_birth_settlement_type_gr) {
        this.death_person_birth_settlement_type_gr = death_person_birth_settlement_type_gr;
    }

    public String getDeath_person_birth_settlement_type_m() {
        return death_person_birth_settlement_type_m;
    }

    public void setDeath_person_birth_settlement_type_m(String death_person_birth_settlement_type_m) {
        this.death_person_birth_settlement_type_m = death_person_birth_settlement_type_m;
    }

    public String getDeath_person_living_settlement_type_gr() {
        return death_person_living_settlement_type_gr;
    }

    public void setDeath_person_living_settlement_type_gr(String death_person_living_settlement_type_gr) {
        this.death_person_living_settlement_type_gr = death_person_living_settlement_type_gr;
    }

    public String getDeath_person_living_settlement_type_m() {
        return death_person_living_settlement_type_m;
    }

    public void setDeath_person_living_settlement_type_m(String death_person_living_settlement_type_m) {
        this.death_person_living_settlement_type_m = death_person_living_settlement_type_m;
    }

    public String getDeath_settlement_type_gr() {
        return death_settlement_type_gr;
    }

    public void setDeath_settlement_type_gr(String death_settlement_type_gr) {
        this.death_settlement_type_gr = death_settlement_type_gr;
    }

    public String getDeath_settlement_type_m() {
        return death_settlement_type_m;
    }

    public void setDeath_settlement_type_m(String death_settlement_type_m) {
        this.death_settlement_type_m = death_settlement_type_m;
    }

    public String getDeath_place_settlement_type_gr() {
        return death_place_settlement_type_gr;
    }

    public void setDeath_place_settlement_type_gr(String death_place_settlement_type_gr) {
        this.death_place_settlement_type_gr = death_place_settlement_type_gr;
    }

    public String getDeath_place_settlement_type_m() {
        return death_place_settlement_type_m;
    }

    public void setDeath_place_settlement_type_m(String death_place_settlement_type_m) {
        this.death_place_settlement_type_m = death_place_settlement_type_m;
    }

    public String getDeclarant_place_m() {
        return declarant_place_m;
    }

    public void setDeclarant_place_m(String declarant_place_m) {
        this.declarant_place_m = declarant_place_m;
    }

    public String getDeclarant_place_gr() {
        return declarant_place_gr;
    }

    public void setDeclarant_place_gr(String declarant_place_gr) {
        this.declarant_place_gr = declarant_place_gr;
    }

    public String getDeclarant_ident_doc_type_gr() {
        return declarant_ident_doc_type_gr;
    }

    public void setDeclarant_ident_doc_type_gr(String declarant_ident_doc_type_gr) {
        this.declarant_ident_doc_type_gr = declarant_ident_doc_type_gr;
    }

    public String getDeclarant_ident_doc_type_m() {
        return declarant_ident_doc_type_m;
    }

    public void setDeclarant_ident_doc_type_m(String declarant_ident_doc_type_m) {
        this.declarant_ident_doc_type_m = declarant_ident_doc_type_m;
    }

    public String getAddr_agency_place_gr() {
        return addr_agency_place_gr;
    }

    public void setAddr_agency_place_gr(String addr_agency_place_gr) {
        this.addr_agency_place_gr = addr_agency_place_gr;
    }

    public String getAddr_agency_place_m() {
        return addr_agency_place_m;
    }

    public void setAddr_agency_place_m(String addr_agency_place_m) {
        this.addr_agency_place_m = addr_agency_place_m;
    }
}
