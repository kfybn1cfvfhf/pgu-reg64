package com.nvision.pgu.web.services.s36400002;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400002Form extends AbstractServiceOrderForm {

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String lastName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String firstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String middleName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String phone;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String email;
    private String reason_re;
    private List<FileBean> load_doc1 = AccessCounterList.createEmpty(FileBean.class);
    private String checkBox1;
    private FileBean load_doc7;
    private FileBean load_doc6;
    private List<FileBean> load_doc28 = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> load_doc37 = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> load_doc35 = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> load_doc29 = AccessCounterList.createEmpty(FileBean.class);
    private String checkBox2;
    private String checkBox3;
    private FileBean load_doc0;
    private List<FileBean> load_doc4 = AccessCounterList.createEmpty(FileBean.class);
    private FileBean load_doc5;
    private FileBean load_doc3;
    private FileBean load_doc39;
    private FileBean load_doc38;
    private FileBean load_doc40;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReason_re() {
        return reason_re;
    }

    public void setReason_re(String reason_re) {
        this.reason_re = reason_re;
    }



    public String getCheckBox1() {
        return checkBox1 == null ? "off" : this.checkBox1;

    }

    public void setCheckBox1(String checkBox1) {
        this.checkBox1 = checkBox1;
    }

    public FileBean getLoad_doc7() {
        return load_doc7;
    }

    public void setLoad_doc7(FileBean load_doc7) {
        this.load_doc7 = load_doc7;
    }

    public FileBean getLoad_doc6() {
        return load_doc6;
    }

    public void setLoad_doc6(FileBean load_doc6) {
        this.load_doc6 = load_doc6;
    }

    public List<FileBean> getLoad_doc28() {
        return normalize(this.load_doc28);
    }

    public void setLoad_doc28(List<FileBean> load_doc28) {
        this.load_doc28 = AccessCounterList.decorate(load_doc28, FileBean.class);
    }

    public List<FileBean> getLoad_doc1() {
        return normalize(this.load_doc1);
    }

    public void setLoad_doc1(List<FileBean>load_doc1) {
        this.load_doc1 = AccessCounterList.decorate(load_doc1, FileBean.class);
    }

    public List<FileBean> getLoad_doc37() {
        return normalize(this.load_doc37);
    }

    public void setLoad_doc37(List<FileBean> load_doc37) {
        this.load_doc37 = AccessCounterList.decorate(load_doc37, FileBean.class);
    }

    public List<FileBean> getLoad_doc35() {
        return normalize(this.load_doc35);
    }

    public void setLoad_doc35(List <FileBean> load_doc35) {
        this.load_doc35 = AccessCounterList.decorate(load_doc35, FileBean.class);
    }

    public List<FileBean> getLoad_doc29() {
        return normalize(this.load_doc29);
    }

    public void setLoad_doc29(List<FileBean> load_doc29) {
        this.load_doc29 = AccessCounterList.decorate(load_doc29, FileBean.class);
    }

    public String getCheckBox2() {
        return checkBox2 == null ? "off" : this.checkBox2;
    }

    public void setCheckBox2(String checkBox2) {
        this.checkBox2 = checkBox2;
    }

    public String getCheckBox3() {
        return checkBox3 == null ? "off" : this.checkBox3;
    }

    public void setCheckBox3(String checkBox3) {
        this.checkBox3 = checkBox3;
    }

    public FileBean getLoad_doc0() {
        return load_doc0;
    }

    public void setLoad_doc0(FileBean load_doc0) {
        this.load_doc0 = load_doc0;
    }

    public List<FileBean> getLoad_doc4() {
        return normalize(this.load_doc4);
    }

    public void setLoad_doc4(List<FileBean> load_doc4) {
        this.load_doc4 = AccessCounterList.decorate(load_doc4, FileBean.class);

    }

    public FileBean getLoad_doc5() {
        return load_doc5;
    }

    public void setLoad_doc5(FileBean load_doc5) {
        this.load_doc5 = load_doc5;
    }

    public FileBean getLoad_doc3() {
        return load_doc3;
    }

    public void setLoad_doc3(FileBean load_doc3) {
        this.load_doc3 = load_doc3;
    }

    public FileBean getLoad_doc39() {
        return load_doc39;
    }

    public void setLoad_doc39(FileBean load_doc39) {
        this.load_doc39 = load_doc39;
    }

    public FileBean getLoad_doc38() {
        return load_doc38;
    }

    public void setLoad_doc38(FileBean load_doc38) {
        this.load_doc38 = load_doc38;
    }

    public FileBean getLoad_doc40() {
        return load_doc40;
    }

    public void setLoad_doc40(FileBean load_doc40) {
        this.load_doc40 = load_doc40;
    }
}
