package com.nvision.pgu.web.services.s36400014;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.annotations.JsonArrayToList;
import com.nvision.pgu.core.converters.AccessCounterList;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.util.FileBean;
import com.nvision.pgu.core.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.lanit.samara.pgu.core.forms.AbstractMedServiceOrderForm;

import java.util.Date;
import java.util.List;

public class Service36400014Form extends AbstractMedServiceOrderForm {

    private static Logger logger = LoggerFactory.getLogger(Service36400014Form.class);

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
     private String firstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String lastName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String middleName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    private String applType;
    public void setApplType(String applType) {
           this.applType = applType;
     			}

	public String getApplType() {
		return this.applType;
				}

    private  String check_egrp  = "off";

    public String getCheck_egrp() {
        return check_egrp;
    }

    public void setCheck_egrp(String check_egrp) {
        this.check_egrp = check_egrp;
    }


    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String juristic_Person_Fio;


    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String phone_zaja;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String email_zaja;
    private String juristic_Person_Fullname;
    private String org_form;
    private String org_short_name;
    private String firmname;


    private String declarantAdressUL;

    private String post_adress;


    private String zaja_ex;


    private String zaja_boss_name;

    private String doc_label_2;

    private String phone_ul;


    private String email_ul;


    private String is_med_org;


    private String innUL;


    private String ogrnUL;
    private String ogrn_data;


    private List<FileBean> loadDocA1 = AccessCounterList.createEmpty(FileBean.class);
    private FileBean loadDocI1;
    private FileBean sanit;
    private List<FileBean> el_prof = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> el_pravo = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> loadDocB1 = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> loadDocB3 = AccessCounterList.createEmpty(FileBean.class);
    private FileBean lic_med;


    private FileBean loadDocB5;
    private FileBean el_cash;
    private FileBean docegip;

    public FileBean getDocegip() {
        return docegip;
    }

    public void setDocegip(FileBean docegip) {
        this.docegip = docegip;
    }

    public FileBean getEl_cash() {
        return el_cash;
    }

    public void setEl_cash(FileBean el_cash) {
        this.el_cash = el_cash;
    }

    public FileBean getLic_med() {
        return lic_med;
    }

    public void setLic_med(FileBean lic_med) {
        this.lic_med = lic_med;
    }


    public FileBean getDocegul() {
        return docegul;
    }

    public void setDocegul(FileBean docegul) {
        this.docegul = docegul;
    }
     private List<FileBean> el_farmac = AccessCounterList.createEmpty(FileBean.class);

    private FileBean docegul;


    private FileBean loadDocB8;

    public FileBean getLoadDocB8() {
        return loadDocB8;
    }

    public void setLoadDocB8(FileBean loadDocB8) {
        this.loadDocB8 = loadDocB8;
    }

    public void setJuristic_Person_Fio(String juristic_Person_Fio) {
        this.juristic_Person_Fio = juristic_Person_Fio;
    }

    public String getJuristic_Person_Fio() {
        return this.juristic_Person_Fio;
    }


    public void setPhone_zaja(String phone_zaja) {
        this.phone_zaja = phone_zaja;
    }

    public String getPhone_zaja() {
        return this.phone_zaja;
    }


    public void setEmail_zaja(String email_zaja) {
        this.email_zaja = email_zaja;
    }

    public String getEmail_zaja() {
        return this.email_zaja;
    }

    public void setJuristic_Person_Fullname(String juristic_Person_Fullname) {
        this.juristic_Person_Fullname = juristic_Person_Fullname;
    }

    public String getJuristic_Person_Fullname() {
        return this.juristic_Person_Fullname;
    }


    public void setOrg_form(String org_form) {
        this.org_form = org_form;
    }

    public String getOrg_form() {
        return this.org_form;
    }


    public void setOrg_short_name(String org_short_name) {
        this.org_short_name = org_short_name;
    }

    public String getOrg_short_name() {
        return this.org_short_name;
    }

    public void setFirmname(String firmname) {
        this.firmname = firmname;
    }

    public String getFirmname() {
        return this.firmname;
    }


    public void setDeclarantAdressUL(String declarantAdressUL) {
        this.declarantAdressUL = declarantAdressUL;
    }

    public String getDeclarantAdressUL() {
        return this.declarantAdressUL;
    }

    public void setPost_adress(String post_adress) {
        this.post_adress = post_adress;
    }

    public String getPost_adress() {
        return this.post_adress;
    }


    public void setZaja_ex(String zaja_ex) {
        if (StringUtils.isValid(zaja_ex))
            this.zaja_ex = zaja_ex;
        else
            this.zaja_ex = "off";
    }

    public String getZaja_ex() {
        return this.zaja_ex;
    }


    public void setZaja_boss_name(String zaja_boss_name) {
        this.zaja_boss_name = zaja_boss_name;
    }

    public String getZaja_boss_name() {
        return this.zaja_boss_name;
    }


    public void setDoc_label_2(String doc_label_2) {
        this.doc_label_2 = doc_label_2;
    }

    public String getDoc_label_2() {
        return this.doc_label_2;
    }


    public void setPhone_ul(String phone_ul) {
        this.phone_ul = phone_ul;
    }

    public String getPhone_ul() {
        return this.phone_ul;
    }


    public void setEmail_ul(String email_ul) {
        this.email_ul = email_ul;
    }

    public String getEmail_ul() {
        return this.email_ul;
    }


    public void setIs_med_org(String is_med_org) {
        if (StringUtils.isValid(is_med_org))
            this.is_med_org = is_med_org;
        else
            this.is_med_org = "off";
    }

    public String getIs_med_org() {
        return this.is_med_org;
    }


    public void setInnUL(String innUL) {
        this.innUL = innUL;
    }

    public String getInnUL() {
        return this.innUL;
    }


    public void setOgrnUL(String ogrnUL) {
        this.ogrnUL = ogrnUL;
    }

    public String getOgrnUL() {
        return this.ogrnUL;
    }


    public void setOgrn_data(String ogrn_data) {
        this.ogrn_data = ogrn_data;
    }

    public String getOgrn_data() {
        return this.ogrn_data;
    }



    public void setLoadDocA1(List<FileBean> loadDocA1) {
        this.loadDocA1 = AccessCounterList.decorate(loadDocA1, FileBean.class);
    }

    public List<FileBean> getLoadDocA1() {
        return normalize(this.loadDocA1);
    }


    public void setLoadDocI1(FileBean loadDocI1) {
        this.loadDocI1 = loadDocI1;
    }

    public FileBean getLoadDocI1() {
        return this.loadDocI1;
    }


    public void setSanit(FileBean sanit) {
        this.sanit = sanit;
    }

    public FileBean getSanit() {
        return this.sanit;
    }


    public void setEl_prof(List<FileBean> el_prof) {
        this.el_prof = AccessCounterList.decorate(el_prof, FileBean.class);
    }

    public List<FileBean> getEl_prof() {
        return normalize(this.el_prof);
    }


    public void setEl_pravo(List<FileBean> el_pravo) {
        this.el_pravo = AccessCounterList.decorate(el_pravo, FileBean.class);
    }

    public List<FileBean> getEl_pravo() {
        return normalize(this.el_pravo);
    }


    public void setEl_farmac(List<FileBean> el_farmac) {
        this.el_farmac = AccessCounterList.decorate(el_farmac, FileBean.class);
    }

    public List<FileBean> getEl_farmac() {
        return normalize(this.el_farmac);
    }


    public void setLoadDocB1(List<FileBean> loadDocB1) {
        this.loadDocB1 = AccessCounterList.decorate(loadDocB1, FileBean.class);
    }

    public List<FileBean> getLoadDocB1() {
        return normalize(this.loadDocB1);
    }

    public void setLoadDocB3(List<FileBean> loadDocB3) {
        this.loadDocB3 = AccessCounterList.decorate(loadDocB3, FileBean.class);
    }

    public List<FileBean> getLoadDocB3() {
        return normalize(this.loadDocB3);
    }


    public void setLoadDocB5(FileBean loadDocB5) {
        this.loadDocB5 = loadDocB5;
    }

    public FileBean getLoadDocB5() {
        return this.loadDocB5;
    }




    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String fio_IP;
    private String place_live;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String tel;
    private String request;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String email;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String doc_type;

    public String getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }


    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERNUM)
    private String docSer;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date docDate;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String docIssuer;

    private FileBean inn;
    private List<String> objectLicensKind_1 = AccessCounterList.createEmpty(String.class);
    private List<String> licensAdress_1 = AccessCounterList.createEmpty(String.class);

    @JsonArrayToList
    private List<String> farmWorks_1 = AccessCounterList.createEmpty(String.class);

    private FileBean loadsan;
    private List<FileBean> loadDocF1 = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> loadDocG1 = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> loadDocH1 = AccessCounterList.createEmpty(String.class);
    private FileBean loadDocZ1;
    private FileBean loadDocdov1;
    private FileBean loadDocdov2;

    private FileBean loaddoc_manager;

    public FileBean getLoaddoc_manager() {
        return loaddoc_manager;
    }

    public void setLoaddoc_manager(FileBean loaddoc_manager) {
        this.loaddoc_manager = loaddoc_manager;
    }


    public void setFio_IP(String fio_IP) {
        this.fio_IP = fio_IP;
    }

    public String getFio_IP() {
        return this.fio_IP;
    }


    public void setPlace_live(String place_live) {
        this.place_live = place_live;
    }

    public String getPlace_live() {
        return this.place_live;
    }


    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return this.tel;
    }


    public void setRequest(String request) {
        if (org.apache.commons.lang.StringUtils.isNotEmpty(request)) {
            this.request = request;
        } else {
            this.request = "off";
        }
    }

    public String getRequest() {
        return this.request;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }



    public void setDocSer(String docSer) {
        this.docSer = docSer;
    }

    public String getDocSer() {
        return this.docSer;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public Date getDocDate() {
        return this.docDate;
    }

    public void setDocIssuer(String docIssuer) {
        this.docIssuer = docIssuer;
    }

    public String getDocIssuer() {
        return this.docIssuer;
    }


    public void setInn(FileBean inn) {
        this.inn = inn;
    }

    public FileBean getInn() {
        return this.inn;
    }




    public void setObjectLicensKind_1(List<String> objectLicensKind_1) {
        this.objectLicensKind_1 = AccessCounterList.decorate(objectLicensKind_1, String.class);
    }

    public List<String> getObjectLicensKind_1() {
        return normalize(this.objectLicensKind_1);
    }


    public void setLicensAdress_1(List<String> licensAdress_1) {
        this.licensAdress_1 = AccessCounterList.decorate(licensAdress_1, String.class);
    }

    public List<String> getLicensAdress_1() {
        return normalize(this.licensAdress_1);
    }


    public void setFarmWorks_1(List<String> farmWorks_1) {
        this.farmWorks_1 = AccessCounterList.decorate(farmWorks_1, String.class);
    }

    public List<String> getFarmWorks_1() {
        return normalize(this.farmWorks_1);
    }



    public void setLoadsan(FileBean loadsan) {
        this.loadsan = loadsan;
    }

    public FileBean getLoadsan() {
        return this.loadsan;
    }



    public void setLoadDocF1(List<FileBean> loadDocF1) {
        this.loadDocF1 = AccessCounterList.decorate(loadDocF1, FileBean.class);
    }

    public List<FileBean> getLoadDocF1() {
        return normalize(this.loadDocF1);
    }


    public void setLoadDocG1(List<FileBean> loadDocG1) {
        this.loadDocG1 = AccessCounterList.decorate(loadDocG1, FileBean.class);
    }

    public List<FileBean> getLoadDocG1() {
        return normalize(this.loadDocG1);
    }


    public void setLoadDocH1(List<FileBean> loadDocH1) {
        this.loadDocH1 = AccessCounterList.decorate(loadDocH1, String.class);
    }

    public List<FileBean> getLoadDocH1() {
        return normalize(this.loadDocH1);
    }


    public void setLoadDocZ1(FileBean loadDocZ1) {
        this.loadDocZ1 = loadDocZ1;
    }

    public FileBean getLoadDocZ1() {
        return this.loadDocZ1;
    }


    public void setLoadDocdov1(FileBean loadDocdov1) {
        this.loadDocdov1 = loadDocdov1;
    }

    public FileBean getLoadDocdov1() {
        return this.loadDocdov1;
    }


    public void setLoadDocdov2(FileBean loadDocdov2) {
        this.loadDocdov2 = loadDocdov2;
    }

    public FileBean getLoadDocdov2() {
        return this.loadDocdov2;
    }

}
