package com.nvision.pgu.web.services.s36400101;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.blocks.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400101Form extends AbstractServiceOrderForm {
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
            private String lastName;	//По умолчанию:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String firstName;	//По умолчанию:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String middleName;	//По умолчанию:
			private String politicalNationality;	//64_POLITICAL_NATIONALITY_64065
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String phone;	//По умолчанию:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String email;	//По умолчанию:
			private String residenceAdressCountry = "643";	//в АИС соединять в одну строку и передавать в параметре residenceAdress
			private String residenceAdressIndex;	//в АИС соединять в одну строку и передавать в параметре residenceAdress
			private String residenceAdressEnterType;	//в АИС соединять в одну строку и передавать в параметре residenceAdress
			private String residenceAdressRegion;	//в АИС соединять в одну строку и передавать в параметре residenceAdress
			private String residenceAdressRayon;	//в АИС соединять в одну строку и передавать в параметре residenceAdress
			private String residenceAdressSettlementType;	//в АИС соединять в одну строку и передавать в параметре residenceAdress
			private String residenceAdressCity;	//в АИС соединять в одну строку и передавать в параметре residenceAdress
			private String residenceAdressSettlementText;	//в АИС соединять в одну строку и передавать в параметре residenceAdress
			private String residenceAdressSettlementDict;	//в АИС соединять в одну строку и передавать в параметре residenceAdress
			private String residenceAdressStreetText;	//в АИС соединять в одну строку и передавать в параметре residenceAdress
			private String residenceAdressStreetDict;	//в АИС соединять в одну строку и передавать в параметре residenceAdress
			private String residenceAdressHouse;	//в АИС соединять в одну строку и передавать в параметре residenceAdress
			private String residenceAdressKorpus;	//в АИС соединять в одну строку и передавать в параметре residenceAdress
			private String residenceAdressFlat;	//в АИС соединять в одну строку и передавать в параметре residenceAdress
			private String addressSeatCountry = "643";	//в АИС соединять в одну строку и передавать в параметре addressSeat
			private String addressSeatIndex;	//в АИС соединять в одну строку и передавать в параметре addressSeat
			private String addressSeatEnterType;	//в АИС соединять в одну строку и передавать в параметре addressSeat
			private String addressSeatRegion;	//в АИС соединять в одну строку и передавать в параметре addressSeat
			private String addressSeatRayon;	//в АИС соединять в одну строку и передавать в параметре addressSeat
			private String addressSeatSettlementType;	//в АИС соединять в одну строку и передавать в параметре addressSeat
			private String addressSeatCity;	//в АИС соединять в одну строку и передавать в параметре addressSeat
			private String addressSeatSettlementText;	//в АИС соединять в одну строку и передавать в параметре addressSeat
			private String addressSeatSettlementDict;	//в АИС соединять в одну строку и передавать в параметре addressSeat
			private String addressSeatStreetText;	//в АИС соединять в одну строку и передавать в параметре addressSeat
			private String addressSeatStreetDict;	//в АИС соединять в одну строку и передавать в параметре addressSeat
			private String addressSeatHouse;	//в АИС соединять в одну строку и передавать в параметре addressSeat
			private String addressSeatKorpus;	//в АИС соединять в одну строку и передавать в параметре addressSeat
			private String addressSeatFlat;	//в АИС соединять в одну строку и передавать в параметре addressSeat
			private String identityDocType;	//Виджет заменить на dictionaryLookup. Использовать справочник DUL_LS
			private String otherDocTypeName;	//По умолчанию:
			private String passSeria;	//Логика:
			private String passNo;	//Логика:
			private Date passDate;	//Логика:
			private String passFrom;	//Логика:
			private FileBean identityDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private String targetAppeal;	//0364_TARGET_APPEAL_101
			private String materialCapabilities;	//По умолчанию: не активирован
			private String furtherInform;	//
			private FileBean opinionBeGuardLoad;	//По умолчанию: скрыто
			private FileBean certificateEmploymentLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean medicalReportLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean marriageCertificateLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private List<FileBean> writtenConsentLoad = AccessCounterList.createEmpty(FileBean.class);	//Логика:
			private List<FileBean> personalDataConsentLoad = AccessCounterList.createEmpty(FileBean.class);	//Логика:
			private FileBean guardTrainingLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean autobiographyLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean excerptHomeLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean convictionLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean accordingPremisesLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean technicalRulesLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private List<FileBean> certificatePensionLoad = AccessCounterList.createEmpty(FileBean.class);	//Логика:
			private FileBean socialPaymentsLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.

			public void setLastName(String lastName) {
					this.lastName = lastName;
				}
			public String getLastName() {
				return this.lastName;
				}
		
			//Поле Имя
			
			public void setFirstName(String firstName) {
					this.firstName = firstName;
				}
			public String getFirstName() {
				return this.firstName;
				}
		
			//Поле Отчество (если имеется)
			
			public void setMiddleName(String middleName) {
					this.middleName = middleName;
				}
			public String getMiddleName() {
				return this.middleName;
				}
		
			//Поле <html><i>Нижеследующее поле заполняется заявителем</i></html>
			
			//Поле Гражданство
			
			public void setPoliticalNationality(String politicalNationality) {
					this.politicalNationality = politicalNationality;
				}
			public String getPoliticalNationality() {
				return this.politicalNationality;
				}
		
			//Поле <html><i>Нижеследующие поля заполняются на основании учетной записи на портале. 
	//Могут быть изменены в ходе заполнения формы заявления.</i></html>
			
			//Поле <h2>Контакты заявителя</h2>
			
			//Поле Контактный телефон
			
			public void setPhone(String phone) {
					this.phone = phone;
				}
			public String getPhone() {
				return this.phone;
				}
		
			//Поле Адрес электронной почты
			
			public void setEmail(String email) {
					this.email = email;
				}
			public String getEmail() {
				return this.email;
				}
		
			//Поле <h2>Сведения о месте жительства заявителя</h2>
			
			//Поле Страна
			
			public void setResidenceAdressCountry(String residenceAdressCountry) {
					this.residenceAdressCountry = residenceAdressCountry;
				}
			public String getResidenceAdressCountry() {
				return this.residenceAdressCountry;
				}
		
			//Поле Индекс
			
			public void setResidenceAdressIndex(String residenceAdressIndex) {
					this.residenceAdressIndex = residenceAdressIndex;
				}
			public String getResidenceAdressIndex() {
				return this.residenceAdressIndex;
				}
		
			//Поле Ввод адреса
			
			public void setResidenceAdressEnterType(String residenceAdressEnterType) {
					this.residenceAdressEnterType = residenceAdressEnterType;
				}
			public String getResidenceAdressEnterType() {
				return this.residenceAdressEnterType;
				}
		
			//Поле Область (край, республика)
			
			public void setResidenceAdressRegion(String residenceAdressRegion) {
					this.residenceAdressRegion = residenceAdressRegion;
				}
			public String getResidenceAdressRegion() {
				return this.residenceAdressRegion;
				}
		
			//Поле Район
			
			public void setResidenceAdressRayon(String residenceAdressRayon) {
					this.residenceAdressRayon = residenceAdressRayon;
				}
			public String getResidenceAdressRayon() {
				return this.residenceAdressRayon;
				}
		
			//Поле Тип населенного пункта
			
			public void setResidenceAdressSettlementType(String residenceAdressSettlementType) {
					this.residenceAdressSettlementType = residenceAdressSettlementType;
				}
			public String getResidenceAdressSettlementType() {
				return this.residenceAdressSettlementType;
				}
		
			//Поле Город
			
			public void setResidenceAdressCity(String residenceAdressCity) {
					this.residenceAdressCity = residenceAdressCity;
				}
			public String getResidenceAdressCity() {
				return this.residenceAdressCity;
				}
		
			//Поле Населенный пункт
			
			public void setResidenceAdressSettlementText(String residenceAdressSettlementText) {
					this.residenceAdressSettlementText = residenceAdressSettlementText;
				}
			public String getResidenceAdressSettlementText() {
				return this.residenceAdressSettlementText;
				}
		
			//Поле Населенный пункт
			
			public void setResidenceAdressSettlementDict(String residenceAdressSettlementDict) {
					this.residenceAdressSettlementDict = residenceAdressSettlementDict;
				}
			public String getResidenceAdressSettlementDict() {
				return this.residenceAdressSettlementDict;
				}
		
			//Поле Улица
			
			public void setResidenceAdressStreetText(String residenceAdressStreetText) {
					this.residenceAdressStreetText = residenceAdressStreetText;
				}
			public String getResidenceAdressStreetText() {
				return this.residenceAdressStreetText;
				}
		
			//Поле Улица
			
			public void setResidenceAdressStreetDict(String residenceAdressStreetDict) {
					this.residenceAdressStreetDict = residenceAdressStreetDict;
				}
			public String getResidenceAdressStreetDict() {
				return this.residenceAdressStreetDict;
				}
		
			//Поле Дом
			
			public void setResidenceAdressHouse(String residenceAdressHouse) {
					this.residenceAdressHouse = residenceAdressHouse;
				}
			public String getResidenceAdressHouse() {
				return this.residenceAdressHouse;
				}
		
			//Поле Корпус
			
			public void setResidenceAdressKorpus(String residenceAdressKorpus) {
					this.residenceAdressKorpus = residenceAdressKorpus;
				}
			public String getResidenceAdressKorpus() {
				return this.residenceAdressKorpus;
				}
		
			//Поле Квартира
			
			public void setResidenceAdressFlat(String residenceAdressFlat) {
					this.residenceAdressFlat = residenceAdressFlat;
				}
			public String getResidenceAdressFlat() {
				return this.residenceAdressFlat;
				}
		
			//Поле <h2>Сведения о месте пребывания заявителя</h2>
			
			//Поле Страна
			
			public void setAddressSeatCountry(String addressSeatCountry) {
					this.addressSeatCountry = addressSeatCountry;
				}
			public String getAddressSeatCountry() {
				return this.addressSeatCountry;
				}
		
			//Поле Индекс
			
			public void setAddressSeatIndex(String addressSeatIndex) {
					this.addressSeatIndex = addressSeatIndex;
				}
			public String getAddressSeatIndex() {
				return this.addressSeatIndex;
				}
		
			//Поле Ввод адреса
			
			public void setAddressSeatEnterType(String addressSeatEnterType) {
					this.addressSeatEnterType = addressSeatEnterType;
				}
			public String getAddressSeatEnterType() {
				return this.addressSeatEnterType;
				}
		
			//Поле Область (край, республика)
			
			public void setAddressSeatRegion(String addressSeatRegion) {
					this.addressSeatRegion = addressSeatRegion;
				}
			public String getAddressSeatRegion() {
				return this.addressSeatRegion;
				}
		
			//Поле Район
			
			public void setAddressSeatRayon(String addressSeatRayon) {
					this.addressSeatRayon = addressSeatRayon;
				}
			public String getAddressSeatRayon() {
				return this.addressSeatRayon;
				}
		
			//Поле Тип населенного пункта
			
			public void setAddressSeatSettlementType(String addressSeatSettlementType) {
					this.addressSeatSettlementType = addressSeatSettlementType;
				}
			public String getAddressSeatSettlementType() {
				return this.addressSeatSettlementType;
				}
		
			//Поле Город
			
			public void setAddressSeatCity(String addressSeatCity) {
					this.addressSeatCity = addressSeatCity;
				}
			public String getAddressSeatCity() {
				return this.addressSeatCity;
				}
		
			//Поле Населенный пункт
			
			public void setAddressSeatSettlementText(String addressSeatSettlementText) {
					this.addressSeatSettlementText = addressSeatSettlementText;
				}
			public String getAddressSeatSettlementText() {
				return this.addressSeatSettlementText;
				}
		
			//Поле Населенный пункт
			
			public void setAddressSeatSettlementDict(String addressSeatSettlementDict) {
					this.addressSeatSettlementDict = addressSeatSettlementDict;
				}
			public String getAddressSeatSettlementDict() {
				return this.addressSeatSettlementDict;
				}
		
			//Поле Улица
			
			public void setAddressSeatStreetText(String addressSeatStreetText) {
					this.addressSeatStreetText = addressSeatStreetText;
				}
			public String getAddressSeatStreetText() {
				return this.addressSeatStreetText;
				}
		
			//Поле Улица
			
			public void setAddressSeatStreetDict(String addressSeatStreetDict) {
					this.addressSeatStreetDict = addressSeatStreetDict;
				}
			public String getAddressSeatStreetDict() {
				return this.addressSeatStreetDict;
				}
		
			//Поле Дом
			
			public void setAddressSeatHouse(String addressSeatHouse) {
					this.addressSeatHouse = addressSeatHouse;
				}
			public String getAddressSeatHouse() {
				return this.addressSeatHouse;
				}
		
			//Поле Корпус
			
			public void setAddressSeatKorpus(String addressSeatKorpus) {
					this.addressSeatKorpus = addressSeatKorpus;
				}
			public String getAddressSeatKorpus() {
				return this.addressSeatKorpus;
				}
		
			//Поле Квартира
			
			public void setAddressSeatFlat(String addressSeatFlat) {
					this.addressSeatFlat = addressSeatFlat;
				}
			public String getAddressSeatFlat() {
				return this.addressSeatFlat;
				}
		
			//Поле <h2>Сведения о документе, удостоверяющем личность заявителя</h2>
			
			//Поле Тип документа, удостоверяющего личность
			
			public void setIdentityDocType(String identityDocType) {
					this.identityDocType = identityDocType;
				}
			public String getIdentityDocType() {
				return this.identityDocType;
				}
		
			//Поле Название иного документа, удостоверяющего личность
			
			public void setOtherDocTypeName(String otherDocTypeName) {
					this.otherDocTypeName = otherDocTypeName;
				}
			public String getOtherDocTypeName() {
				return this.otherDocTypeName;
				}
		
			//Поле Серия
			
			public void setPassSeria(String passSeria) {
					this.passSeria = passSeria;
				}
			public String getPassSeria() {
				return this.passSeria;
				}
		
			//Поле Номер
			
			public void setPassNo(String passNo) {
					this.passNo = passNo;
				}
			public String getPassNo() {
				return this.passNo;
				}
		
			//Поле Дата выдачи
			
			public void setPassDate(Date passDate) {
					this.passDate = passDate;
				}
			public Date getPassDate() {
				return this.passDate;
				}
		
			//Поле Кем выдан
			
			public void setPassFrom(String passFrom) {
					this.passFrom = passFrom;
				}
			public String getPassFrom() {
				return this.passFrom;
				}
		
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Документ, удостоверяющий личность заявителя
			
			public void setIdentityDocLoad(FileBean identityDocLoad) {
					this.identityDocLoad = identityDocLoad;
				}
			public FileBean getIdentityDocLoad() {
				return this.identityDocLoad;
				}
		
	
	//Закладка Дополнительные сведения
		
			//Поле <h2>Дополнительные сведения, необходимые для предоставления услуги</h2>
			
			//Поле Цель подачи заявления
			
			public void setTargetAppeal(String targetAppeal) {
					this.targetAppeal = targetAppeal;
				}
			public String getTargetAppeal() {
				return this.targetAppeal;
				}
		
			//Поле Материальные возможности, жилищные условия, состояние здоровья и характер работы позволяют мне взять совершеннолетнего недееспособного (или не полностью дееспособного) гражданина под опеку (попечительство)
			
			public void setMaterialCapabilities(String materialCapabilities) {
					this.materialCapabilities = materialCapabilities;
				}
			public String getMaterialCapabilities() {
				return this.materialCapabilities;
				}
		
			//Поле Дополнительно могу сообщить следующее
			
			public void setFurtherInform(String furtherInform) {
					this.furtherInform = furtherInform;
				}
			public String getFurtherInform() {
				return this.furtherInform;
				}
		
			//Поле <html><i>
	//Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Заключение о возможности быть опекуном (попечителем)
			
			public void setOpinionBeGuardLoad(FileBean opinionBeGuardLoad) {
					this.opinionBeGuardLoad = opinionBeGuardLoad;
				}
			public FileBean getOpinionBeGuardLoad() {
				return this.opinionBeGuardLoad;
				}
		
			//Поле Справка с места работы с указанием должности и размера средней заработной платы за последние 12 месяцев, а для граждан, не состоящих в трудовых отношениях, - иной документ, подтверждающий доходы
			
			public void setCertificateEmploymentLoad(FileBean certificateEmploymentLoad) {
					this.certificateEmploymentLoad = certificateEmploymentLoad;
				}
			public FileBean getCertificateEmploymentLoad() {
				return this.certificateEmploymentLoad;
				}
		
			//Поле Медицинское заключение о состоянии здоровья по результатам освидетельствования гражданина, выразившего желание стать опекуном, выданное в порядке, устанавливаемом Министерством здравоохранения Российской Федерации
			
			public void setMedicalReportLoad(FileBean medicalReportLoad) {
					this.medicalReportLoad = medicalReportLoad;
				}
			public FileBean getMedicalReportLoad() {
				return this.medicalReportLoad;
				}
		
			//Поле Копия свидетельства о браке
			
			public void setMarriageCertificateLoad(FileBean marriageCertificateLoad) {
					this.marriageCertificateLoad = marriageCertificateLoad;
				}
			public FileBean getMarriageCertificateLoad() {
				return this.marriageCertificateLoad;
				}
		
			//Поле Письменное согласие совершеннолетних членов семьи с учетом мнения детей, достигших 10-летнего возраста, проживающих совместно с гражданином, выразившим желание стать опекуном, на совместное проживание совершеннолетнего подопечного с опекуном (в случае принятия решения опекуном о совместном проживании совершеннолетнего подопечного с семьей опекуна)
			
			public void setWrittenConsentLoad(List<FileBean> writtenConsentLoad) {
					this.writtenConsentLoad = AccessCounterList.decorate(writtenConsentLoad, FileBean.class);
				}
			public List<FileBean> getWrittenConsentLoad() {
				return normalize(this.writtenConsentLoad);
				}
		
			//Поле Добавить
			
			//Поле Документ подтверждающий согласие на обработку персональных данных всех членов семьи заявителя и полномочия на их передачу
			
			public void setPersonalDataConsentLoad(List<FileBean> personalDataConsentLoad) {
					this.personalDataConsentLoad  = AccessCounterList.decorate(personalDataConsentLoad, FileBean.class);
				}
			public List<FileBean> getPersonalDataConsentLoad() {
				return normalize(this.personalDataConsentLoad);
				}
		
			//Поле Добавить
			
			//Поле Документ о прохождении подготовки гражданином, выразившим желание стать опекуном
			
			public void setGuardTrainingLoad(FileBean guardTrainingLoad) {
					this.guardTrainingLoad = guardTrainingLoad;
				}
			public FileBean getGuardTrainingLoad() {
				return this.guardTrainingLoad;
				}
		
			//Поле Автобиография
			
			public void setAutobiographyLoad(FileBean autobiographyLoad) {
					this.autobiographyLoad = autobiographyLoad;
				}
			public FileBean getAutobiographyLoad() {
				return this.autobiographyLoad;
				}
		
			//Поле <h2>Документы, предоставляемые Заявителем по собственной инициативе</h2>
			
			//Поле Выписка из домой (поквартирной) книги с места жительства или иной документ, подтверждающий право пользования жилым помещением либо право собственности на жилое помещение и копия финансового лицевого счета с места жительства гражданина, выразившего желание стать опекуном
			
			public void setExcerptHomeLoad(FileBean excerptHomeLoad) {
					this.excerptHomeLoad = excerptHomeLoad;
				}
			public FileBean getExcerptHomeLoad() {
				return this.excerptHomeLoad;
				}
		
			//Поле Справка органов внутренних дел, подтверждающая отсутствие у гражданина, выразившего желание стать опекуном, судимости за умышленное преступление против жизни и здоровья граждан
			
			public void setConvictionLoad(FileBean convictionLoad) {
					this.convictionLoad = convictionLoad;
				}
			public FileBean getConvictionLoad() {
				return this.convictionLoad;
				}
		
			//Поле Справки о соответствии жилых помещений санитарным правилам и нормам, выданные соответствующими уполномоченными органами
			
			public void setAccordingPremisesLoad(FileBean accordingPremisesLoad) {
					this.accordingPremisesLoad = accordingPremisesLoad;
				}
			public FileBean getAccordingPremisesLoad() {
				return this.accordingPremisesLoad;
				}
		
			//Поле Справки о соответствии жилых помещений техническим правилам и нормам, выданные соответствующими уполномоченными органами
			
			public void setTechnicalRulesLoad(FileBean technicalRulesLoad) {
					this.technicalRulesLoad = technicalRulesLoad;
				}
			public FileBean getTechnicalRulesLoad() {
				return this.technicalRulesLoad;
				}
		
			//Поле Справка из территориальных органов Пенсионного фонда Российской Федерации, либо иных органов, осуществляющих пенсионное обеспечение, о размере пенсии и иных социальных выплат за последние 12 месяцев
			
			public void setCertificatePensionLoad(List<FileBean> certificatePensionLoad) {
					this.certificatePensionLoad  = AccessCounterList.decorate(certificatePensionLoad, FileBean.class);
				}
			public List<FileBean> getCertificatePensionLoad() {
				return normalize(this.certificatePensionLoad);
				}
		
			//Поле Добавить
			
			//Поле Справка, выданная органами социальной защиты населения, о размере социальных выплат за последние 12 месяцев
			
			public void setSocialPaymentsLoad(FileBean socialPaymentsLoad) {
					this.socialPaymentsLoad = socialPaymentsLoad;
				}
			public FileBean getSocialPaymentsLoad() {
				return this.socialPaymentsLoad;
				}


    private String residenceAdress;
    public void setResidenceAdress(String residenceAdress) {
        this.residenceAdress = residenceAdress;
    }
    public String getResidenceAdress() {
        return this.residenceAdress;
    }

    private String residenceAdressCountryCode = "ru";
    public void setResidenceAdressCountryCode(String residenceAdressCountryCode) {
        this.residenceAdressCountryCode = residenceAdressCountryCode;
    }
    public String getResidenceAdressCountryCode() {
        return this.residenceAdressCountryCode;
    }

    private String residenceAdressCountryInput;
    public void setResidenceAdressCountryInput(String residenceAdressCountryInput) {
        this.residenceAdressCountryInput = residenceAdressCountryInput;
    }
    public String getResidenceAdressCountryInput() {
        return this.residenceAdressCountryInput;
    }

    private String residenceAdressCountrySettlement;
    public void setResidenceAdressCountrySettlement(String residenceAdressCountrySettlement) {
        this.residenceAdressCountrySettlement = residenceAdressCountrySettlement;
    }
    public String getResidenceAdressCountrySettlement() {
        return this.residenceAdressCountrySettlement;
    }

    private String addressSeat;
    public void setAddressSeat(String addressSeat) {
        this.addressSeat = addressSeat;
    }
    public String getAddressSeat() {
        return this.addressSeat;
    }

    private String addressSeatCountryCode = "ru";
    public void setAddressSeatCountryCode(String addressSeatCountryCode) {
        this.addressSeatCountryCode = addressSeatCountryCode;
    }
    public String getAddressSeatCountryCode() {
        return this.addressSeatCountryCode;
    }

    private String addressSeatCountryInput;
    public void setAddressSeatCountryInput(String addressSeatCountryInput) {
        this.addressSeatCountryInput = addressSeatCountryInput;
    }
    public String getAddressSeatCountryInput() {
        return this.addressSeatCountryInput;
    }

    private String addressSeatCountrySettlement;
    public void setAddressSeatCountrySettlement(String addressSeatCountrySettlement) {
        this.addressSeatCountrySettlement = addressSeatCountrySettlement;
    }
    public String getAddressSeatCountrySettlement() {
        return this.addressSeatCountrySettlement;
    }


}
