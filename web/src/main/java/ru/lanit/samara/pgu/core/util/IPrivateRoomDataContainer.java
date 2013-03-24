package ru.lanit.samara.pgu.core.util;

import java.util.Date;

public interface IPrivateRoomDataContainer {

    public String getLastName();

    public void setLastName(String lastName);

    public String getFirstName();

    public void setFirstName(String firstName);

    public String getMiddleName();

    public void setMiddleName(String middleName);

    public Date getBirthdate();

    public void setBirthdate(Date birthdate);

    public String getBirthplace();

    public void setBirthplace(String birthplace);

    public String getSex();

    public void setSex(String sex);

    public String getSnils();

    public void setSnils(String snils);

    public String getIdentityDocType();

    public void setIdentityDocType(String identityDocType);

   // public String getIdentityDocTypeName();

   // public void setIdentityDocTypeName(String identityDocTypeName);

    public String getPassSeria();

    public void setPassSeria(String passSeria);

    public String getPassNo();

    public void setPassNo(String passNo);

    public String getPassSerNum();

    public void setPassSerNum(String passSerNum);

    public String getPassFrom();

    public void setPassFrom(String passFrom);

    public Date getPassDate();

    public void setPassDate(Date passDate);

    public String getAddress();

    public void setAddress(String address);

    public String getPhone();

    public void setPhone(String phone);

    public String getEmail();

    public void setEmail(String email);

    public void setInn(String inn);

    public String getInn();

    public void setAddressIndex(String addressIndex);
    public String getAddressIndex();

    public void setAddressRegion(String addressRegion);
    public String getAddressRegion();

    public void setAddressRayon(String addressRayon);
    public String getAddressRayon();

    public void setAddressCity(String addressCity);
    public String getAddressCity();

    public void setAddressSettlementText(String addressSettlementText);
    public String getAddressSettlementText();

    public void setAddressSettlementDict(String addressSettlementDict);
    public String getAddressSettlementDict();

    public void setAddressStreetText(String addressStreetText);
    public String getAddressStreetText();

    public void setAddressStreetDict(String addressStreetDict);
    public String getAddressStreetDict();

    public void setAddressHouse(String addressHouse);
    public String getAddressHouse();

    public void setAddressKorpus(String addressKorpus);
    public String getAddressKorpus();

    public void setAddressFlat(String addressFlat);
    public String getAddressFlat();


}
