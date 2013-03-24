package com.nvision.pgu.web.services.s36400117;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.blocks.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400117Form extends AbstractServiceOrderForm {


	        public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {
                this.setLastName(privateRoomDataContainer.getLastName());
                this.setFirstName(privateRoomDataContainer.getFirstName());
                this.setMiddleName(privateRoomDataContainer.getMiddleName());
                this.setPhone(privateRoomDataContainer.getPhone());
                this.setEmail(privateRoomDataContainer.getEmail());
                this.setIdentityDocType("");
                this.setOtherDocTypeName("");
                this.setPassDate(null);
                this.setPassFrom("");
                this.setPassNo("");
                this.setPassSeria("");

               this.setBirthdate(privateRoomDataContainer.getBirthdate());

               this.setAddressIndex(privateRoomDataContainer.getAddressIndex());
               this.setAddressRegion(privateRoomDataContainer.getAddressRegion());
               this.setAddressRayon(privateRoomDataContainer.getAddressRayon());
               this.setAddressCity(privateRoomDataContainer.getAddressCity());
               this.setAddressSettlementText(privateRoomDataContainer.getAddressSettlementText());
               this.setAddressSettlementDict(privateRoomDataContainer.getAddressSettlementDict());
               this.setAddressStreetText(privateRoomDataContainer.getAddressStreetText());
               this.setAddressStreetDict(privateRoomDataContainer.getAddressStreetDict());
               this.setAddressHouse(privateRoomDataContainer.getAddressHouse());
               this.setAddressKorpus(privateRoomDataContainer.getAddressKorpus());
               this.setAddressFlat(privateRoomDataContainer.getAddressFlat());
            }
	//Закладка Сведения о заявителе
		
			//Поле <h2>Сведения о заявителе</h2>
			
			//Поле <html><i>Нижеследующие поля заполняются на основании учетной записи на портале и не могут быть изменены. 
	//Если в заявлении указаны неверные данные, необходимо выполнить одно из следующих действий:
	//<br>1. Выйти из учетной записи и авторизоваться заново под вашим логином и паролем;
	//<br>2. В случае необходимости внести изменения в учетную запись в установленном порядке.</i></html>
			
			//Поле Фамилия


			private String lastName;	//По умолчанию: 
//данные из ЛК
//Недоступно для редактирования
//
//Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)
		
			//Поле Имя


			private String firstName;	//По умолчанию: 
//данные из ЛК
//Недоступно для редактирования
//
//Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)
		
			//Поле Отчество (если имеется)

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
			private String middleName;	//По умолчанию: 
//данные из ЛК
//Недоступно для редактирования
//
//Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)
		
			//Поле Дата рождения

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
			private Date birthdate;	//По умолчанию: 
//данные из ЛК
//Недоступно для редактирования
		
			//Поле <html><i>Нижеследующие поля заполняются на основании учетной записи на портале. 
	//Могут быть изменены в ходе заполнения формы заявления.</i></html>
			
			//Поле Адрес регистрации

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS)
			private String address;	//По умолчанию:
//Данные из ЛК

            private String addressIndex;
            private String addressCountry ="643";
            private String addressEnterType;
            private String addressRegion;
            private String addressRayon;
            private String addressSettlementType="1";
            private String addressCity;
            private String addressSettlementText;
            private String addressSettlementDict;
            private String addressStreetText;
            private String addressStreetDict;
            private String addressHouse;
            private String addressKorpus;
            private String addressFlat;
            private String addressCountryCode = "ru";
            private String addressCountryInput;
            private String addressCountrySettlement;

			//Поле Почтовый адрес совпадает с адресом места регистрации
			
			
			private String addressEq;	//По умолчанию не активирован
//Логика
//При активации значение поля #factAddress копируется на поле #addressPost
		
			//Поле Почтовый адрес
			
			
			private String addressPost;	//

            private String addressPostIndex;
            private String addressPostCountry="643";
            private String addressPostEnterType;
            private String addressPostRegion;
            private String addressPostRayon;
            private String addressPostSettlementType="1";
            private String addressPostCity;
            private String addressPostSettlementText;
            private String addressPostSettlementDict;
            private String addressPostStreetText;
            private String addressPostStreetDict;
            private String addressPostHouse;
            private String addressPostKorpus;
            private String addressPostFlat;
            private String addressPostCountryCode = "ru";
            private String addressPostCountryInput;
            private String addressPostCountrySettlement;
		
			//Поле Контактный телефон

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
			private String phone;	//По умолчанию:
//Данные из ЛК - "Домашний телефон"
//
//Валидация: phone (перекрыть)
		
			//Поле Адрес электронной почты

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
			private String email;	//По умолчанию:
//Данные из ЛК
//
//Валидация: email
		
			//Поле <h2>Сведения о документе, удостоверяющем личность заявителя</h2>
			
			//Поле Тип документа, удостоверяющего личность
			
			
			private String identityDocType;	//Виджет заменить на dictionaryLookup. Использовать справочник DUL_LS
//По умолчанию:
//Не заполнен
//Значения:
//1 - Паспорт гражданина РФ
//2 - Временное удостоверение личности гражданина РФ
//3 - Вид на жительство (лица без гражданства)/ (иностранного гражданина)
//4 - Иностранный паспорт
//5 - Иной документ, удостоверяющий личность
//Логика: 
//1. При выборе значения из справочника 5 отображается поле #otherDocTypeName
		
			//Поле Название иного документа, удостоверяющего личность
			
			
			private String otherDocTypeName;	//По умолчанию:
//Скрыт
//
//Логика: 
//1. Отображается при выборе значения  5 из справочника #identityDocType
//
//Разработчику: При интеграции передавать в параметре identityDocType
		
			//Поле Серия
			
			
			private String passSeria;	//Логика: 
//1. Обязателен при выборе из справочника #identityDocType значений 1,3,4
//2. Не обязателен при выборе из справочника #identityDocType значений 2,5
//3. При выборе из справочника #identityDocType значения 1, валидация: 4 цифры
//4. При выборе из справочника #identityDocType значения 3, валидация: допустимо для ввода 80 или 81 или 82 или 83
//5. При выборе из справочника #identityDocType значения 2,4,5, валидация отсутствует
		
			//Поле Номер
			
			
			private String passNo;	//Логика: 
//1. Обязателен всегда
//2. При выборе из справочника #identityDocType значения 1, валидация: 6 цифр
//3. При выборе из справочника #identityDocType значения 2 или 3, валидация: 7 цифр
//4. При выборе из справочника #identityDocType значения 4,5, валидация отсутствует
		
			//Поле Дата выдачи
			
			
			private Date passDate;	//Логика: 
//1. Обязателен всегда
		
			//Поле Кем выдан
			
			
			private String passFrom;	//Логика: 
//1. Обязателен всегда
		
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Документ, удостоверяющий личность заявителя
			
			
			private FileBean identityDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
		
	
	//Закладка Сведения об умершем
		
			//Поле <h2>Сведения об умершем</h2>
			
			//Поле Фамилия
			
			
			private String deadLastName;	//Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)
		
			//Поле Имя
			
			
			private String deadFirstName;	//Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)
		
			//Поле Отчество (если имеется)
			
			
			private String deadMiddleName;	//Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)
		
			//Поле Погребение мертворожденного ребенка по истечении 154 дней беременности
			
			
			private String deadChild;	//По умолчанию не активирован.
//
//Логика:
//1. При активации на ШАГ 4 отображаются поля #grrDeadChild и #deadChildDocLoad
//2. При деактивации на ШАГ 4 отображается поле #sprDeadDocLoad
		
			//Поле Умерший не подлежал обязательному социальному страхованию на случай временной нетрудоспособности и в связи с материнством на день смерти и не являлся пенсионером


			
			private String noSocStrah;	//
		
			//Поле Погребение осуществлялось за счет заявителя
			
			
			private String deadMoney;	//
		
	
	//Закладка Сведения о способе перечисления социального пособия по погребение
		
			//Поле <h2>Сведения о способе перечисления социального пособия по погребение</h2>
			
			//Поле Способ перечисления назначенного пособия
			
			
			private String wayBenefit;	//03_METHOD_ DELIVERY_BENEFIT_64
//1. Через организацию федеральной почтовой связи
//#addressBenefit
//2. Через кредитное учреждение
//#bankBenefitLabel
//#nameBankBenefit
//#filialBankBenefit
//#bikBankBenefit
//#corrAccBankBenefit
//#codeFilialBankBenefit
//#clientAccBankBenefit
		
			//Поле Номер почтового отделения на которое будет осуществлятся перечисление социального пособия на погребение
			
			
			private String addressBenefit;	//По умолчанию: скрыто
//Логика: отображается в случае выбора значения справочника #wayBenefit
//1. Через организацию федеральной почтовой связи
		
			//Поле <h2>Сведения о кредитной организации и номер лицевого счета заявителя</h2>
			
			//Поле Наименование кредитной организации
			
			
			private String nameBankBenefit;	//По умолчанию: скрыто
//Логика: отображается в случае выбора значения справочника #wayBenefit
//2. Через кредитное учреждение
		
			//Поле Наименование филиала и/или номер отделения
			
			
			private String filialBankBenefit;	//По умолчанию: скрыто
//Логика: отображается в случае выбора значения справочника #wayBenefit
//2. Через кредитное учреждение
		
			//Поле Банковский идентификационный код
			
			
			private String bikBankBenefit;	//По умолчанию: скрыто
//Логика: отображается в случае выбора значения справочника #wayBenefit
//2. Через кредитное учреждение
//Валидатор: XXXXXXXXX, где X - одна обязательная цифра (9 цифр)
		
			//Поле Корреспондентский счет
			
			
			private String corrAccBankBenefit;	//По умолчанию: скрыто
//Логика: отображается в случае выбора значения справочника #wayBenefit
//2. Через кредитное учреждение
//Валидатор: XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)
		
			//Поле Код подразделения
			
			
			private String codeFilialBankBenefit;	//По умолчанию: скрыто
//Логика: отображается в случае выбора значения справочника #wayBenefit
//2. Через кредитное учреждение
//Валидатор: XXXXXXXXXXXX где X - одна обязательная цифра (12 цифр)
		
			//Поле Номер лицевого счета
			
			
			private String clientAccBankBenefit;	//По умолчанию: скрыто
//Логика: отображается в случае выбора значения справочника #wayBenefit
//2. Через кредитное учреждение
//Валидатор: XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)
		
	
	//Закладка Электронные копии документов
		
			//Поле <html><i>
	//Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Справка о смерти, выданная органами ЗАГСа
			private String socialSupport;
			
			private FileBean sprDeadDocLoad;	//Логика:
//1. Отображается при не активной отметке #deadChild
//2. Скрыто при активной отметке #deadChild
//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
		
			//Поле Документ, подтверждающий факт государственной регистрации рождения ребенка, родившегося мертвым/умершим на первой неделе жизни, который выдается органами ЗАГС
			
			
			private FileBean grrDeadChild;	//Логика:
//1. Отображается при активной отметке #deadChild
//2. Скрыто при не активной отметке #deadChild
//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
		
			//Поле Документ, подтверждающий факт погребения мертвого ребенка
			
			
			private FileBean deadChildDocLoad;	//Логика:
//1. Отображается при активной отметке #deadChild
//2. Скрыто при не активной отметке #deadChild
//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
		
	

	
	//Закладка Сведения о заявителе
		
			//Поле <h2>Сведения о заявителе</h2>
			
			//Поле <html><i>Нижеследующие поля заполняются на основании учетной записи на портале и не могут быть изменены. 
	//Если в заявлении указаны неверные данные, необходимо выполнить одно из следующих действий:
	//<br>1. Выйти из учетной записи и авторизоваться заново под вашим логином и паролем;
	//<br>2. В случае необходимости внести изменения в учетную запись в установленном порядке.</i></html>
			
			//Поле Фамилия


    public String getAddressIndex() {
        return addressIndex;
    }

    public void setAddressIndex(String addressIndex) {
        this.addressIndex = addressIndex;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressEnterType() {
        return addressEnterType;
    }

    public void setAddressEnterType(String addressEnterType) {
        this.addressEnterType = addressEnterType;
    }

    public String getAddressRegion() {
        return addressRegion;
    }

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public String getAddressRayon() {
        return addressRayon;
    }

    public void setAddressRayon(String addressRayon) {
        this.addressRayon = addressRayon;
    }

    public String getAddressSettlementType() {
        return addressSettlementType;
    }

    public void setAddressSettlementType(String addressSettlementType) {
        this.addressSettlementType = addressSettlementType;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressSettlementText() {
        return addressSettlementText;
    }

    public void setAddressSettlementText(String addressSettlementText) {
        this.addressSettlementText = addressSettlementText;
    }

    public String getAddressSettlementDict() {
        return addressSettlementDict;
    }

    public void setAddressSettlementDict(String addressSettlementDict) {
        this.addressSettlementDict = addressSettlementDict;
    }

    public String getAddressStreetText() {
        return addressStreetText;
    }

    public void setAddressStreetText(String addressStreetText) {
        this.addressStreetText = addressStreetText;
    }

    public String getAddressStreetDict() {
        return addressStreetDict;
    }

    public void setAddressStreetDict(String addressStreetDict) {
        this.addressStreetDict = addressStreetDict;
    }

    public String getAddressHouse() {
        return addressHouse;
    }

    public void setAddressHouse(String addressHouse) {
        this.addressHouse = addressHouse;
    }

    public String getAddressKorpus() {
        return addressKorpus;
    }

    public void setAddressKorpus(String addressKorpus) {
        this.addressKorpus = addressKorpus;
    }

    public String getAddressFlat() {
        return addressFlat;
    }

    public void setAddressFlat(String addressFlat) {
        this.addressFlat = addressFlat;
    }

    public String getAddressCountryCode() {
        return addressCountryCode;
    }

    public void setAddressCountryCode(String addressCountryCode) {
        this.addressCountryCode = addressCountryCode;
    }

    public String getAddressCountryInput() {
        return addressCountryInput;
    }

    public void setAddressCountryInput(String addressCountryInput) {
        this.addressCountryInput = addressCountryInput;
    }

    public String getAddressCountrySettlement() {
        return addressCountrySettlement;
    }

    public void setAddressCountrySettlement(String addressCountrySettlement) {
        this.addressCountrySettlement = addressCountrySettlement;
    }

        public String getAddressPostIndex() {
        return addressPostIndex;
    }

    public void setAddressPostIndex(String addressPostIndex) {
        this.addressPostIndex = addressPostIndex;
    }

    public String getAddressPostCountry() {
        return addressPostCountry;
    }

    public void setAddressPostCountry(String addressPostCountry) {
        this.addressPostCountry = addressPostCountry;
    }

    public String getAddressPostEnterType() {
        return addressPostEnterType;
    }

    public void setAddressPostEnterType(String addressPostEnterType) {
        this.addressPostEnterType = addressPostEnterType;
    }

    public String getAddressPostRegion() {
        return addressPostRegion;
    }

    public void setAddressPostRegion(String addressPostRegion) {
        this.addressPostRegion = addressPostRegion;
    }

    public String getAddressPostRayon() {
        return addressPostRayon;
    }

    public void setAddressPostRayon(String addressPostRayon) {
        this.addressPostRayon = addressPostRayon;
    }

    public String getAddressPostSettlementType() {
        return addressPostSettlementType;
    }

    public void setAddressPostSettlementType(String addressPostSettlementType) {
        this.addressPostSettlementType = addressPostSettlementType;
    }

    public String getAddressPostCity() {
        return addressPostCity;
    }

    public void setAddressPostCity(String addressPostCity) {
        this.addressPostCity = addressPostCity;
    }

    public String getAddressPostSettlementText() {
        return addressPostSettlementText;
    }

    public void setAddressPostSettlementText(String addressPostSettlementText) {
        this.addressPostSettlementText = addressPostSettlementText;
    }

    public String getAddressPostSettlementDict() {
        return addressPostSettlementDict;
    }

    public void setAddressPostSettlementDict(String addressPostSettlementDict) {
        this.addressPostSettlementDict = addressPostSettlementDict;
    }

    public String getAddressPostStreetText() {
        return addressPostStreetText;
    }

    public void setAddressPostStreetText(String addressPostStreetText) {
        this.addressPostStreetText = addressPostStreetText;
    }

    public String getAddressPostStreetDict() {
        return addressPostStreetDict;
    }

    public void setAddressPostStreetDict(String addressPostStreetDict) {
        this.addressPostStreetDict = addressPostStreetDict;
    }

    public String getAddressPostHouse() {
        return addressPostHouse;
    }

    public void setAddressPostHouse(String addressPostHouse) {
        this.addressPostHouse = addressPostHouse;
    }

    public String getAddressPostKorpus() {
        return addressPostKorpus;
    }

    public void setAddressPostKorpus(String addressPostKorpus) {
        this.addressPostKorpus = addressPostKorpus;
    }

    public String getAddressPostFlat() {
        return addressPostFlat;
    }

    public void setAddressPostFlat(String addressPostFlat) {
        this.addressPostFlat = addressPostFlat;
    }

    public String getAddressPostCountryCode() {
        return addressPostCountryCode;
    }

    public void setAddressPostCountryCode(String addressPostCountryCode) {
        this.addressPostCountryCode = addressPostCountryCode;
    }

    public String getAddressPostCountryInput() {
        return addressPostCountryInput;
    }

    public void setAddressPostCountryInput(String addressPostCountryInput) {
        this.addressPostCountryInput = addressPostCountryInput;
    }

    public String getAddressPostCountrySettlement() {
        return addressPostCountrySettlement;
    }

    public void setAddressPostCountrySettlement(String addressPostCountrySettlement) {
        this.addressPostCountrySettlement = addressPostCountrySettlement;
    }

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
		
			//Поле Дата рождения
			
			public void setBirthdate(Date birthdate) {
					this.birthdate = birthdate;
				}
			public Date getBirthdate() {
				return this.birthdate;
				}
		
			//Поле <html><i>Нижеследующие поля заполняются на основании учетной записи на портале. 
	//Могут быть изменены в ходе заполнения формы заявления.</i></html>
			
			//Поле Адрес регистрации
			
			public void setAddress(String address) {
					this.address = address;
				}
			public String getAddress() {
				return this.address;
				}
		
			//Поле Почтовый адрес совпадает с адресом места регистрации
			
			public void setAddressEq(String addressEq) {
					this.addressEq = addressEq;
				}
			public String getAddressEq() {
				return this.addressEq;
				}
		
			//Поле Почтовый адрес
			
			public void setAddressPost(String addressPost) {
					this.addressPost = addressPost;
				}
			public String getAddressPost() {
				return this.addressPost;
				}
		
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
		
	
	//Закладка Сведения об умершем
		
			//Поле <h2>Сведения об умершем</h2>
			
			//Поле Фамилия
			
			public void setDeadLastName(String deadLastName) {
					this.deadLastName = deadLastName;
				}
			public String getDeadLastName() {
				return this.deadLastName;
				}
		
			//Поле Имя
			
			public void setDeadFirstName(String deadFirstName) {
					this.deadFirstName = deadFirstName;
				}
			public String getDeadFirstName() {
				return this.deadFirstName;
				}
		
			//Поле Отчество (если имеется)
			
			public void setDeadMiddleName(String deadMiddleName) {
					this.deadMiddleName = deadMiddleName;
				}
			public String getDeadMiddleName() {
				return this.deadMiddleName;
				}
		
			//Поле Погребение мертворожденного ребенка по истечении 154 дней беременности
			
			public void setDeadChild(String deadChild) {
					this.deadChild = deadChild;
				}
			public String getDeadChild() {
				return this.deadChild;
				}
		
			//Поле Умерший не подлежал обязательному социальному страхованию на случай временной нетрудоспособности и в связи с материнством на день смерти и не являлся пенсионером
			
			public void setNoSocStrah(String noSocStrah) {
					this.noSocStrah = noSocStrah;
				}
			public String getNoSocStrah() {
				return this.noSocStrah;
				}
		
			//Поле Погребение осуществлялось за счет заявителя
			
			public void setDeadMoney(String deadMoney) {
					this.deadMoney = deadMoney;
				}
			public String getDeadMoney() {
				return this.deadMoney;
				}
		
	
	//Закладка Сведения о способе перечисления социального пособия по погребение
		
			//Поле <h2>Сведения о способе перечисления социального пособия по погребение</h2>
			
			//Поле Способ перечисления назначенного пособия
			
			public void setWayBenefit(String wayBenefit) {
					this.wayBenefit = wayBenefit;
				}
			public String getWayBenefit() {
				return this.wayBenefit;
				}
		
			//Поле Номер почтового отделения на которое будет осуществлятся перечисление социального пособия на погребение
			
			public void setAddressBenefit(String addressBenefit) {
					this.addressBenefit = addressBenefit;
				}
			public String getAddressBenefit() {
				return this.addressBenefit;
				}
		
			//Поле <h2>Сведения о кредитной организации и номер лицевого счета заявителя</h2>
			
			//Поле Наименование кредитной организации
			
			public void setNameBankBenefit(String nameBankBenefit) {
					this.nameBankBenefit = nameBankBenefit;
				}
			public String getNameBankBenefit() {
				return this.nameBankBenefit;
				}
		
			//Поле Наименование филиала и/или номер отделения
			
			public void setFilialBankBenefit(String filialBankBenefit) {
					this.filialBankBenefit = filialBankBenefit;
				}
			public String getFilialBankBenefit() {
				return this.filialBankBenefit;
				}
		
			//Поле Банковский идентификационный код
			
			public void setBikBankBenefit(String bikBankBenefit) {
					this.bikBankBenefit = bikBankBenefit;
				}
			public String getBikBankBenefit() {
				return this.bikBankBenefit;
				}
		
			//Поле Корреспондентский счет
			
			public void setCorrAccBankBenefit(String corrAccBankBenefit) {
					this.corrAccBankBenefit = corrAccBankBenefit;
				}
			public String getCorrAccBankBenefit() {
				return this.corrAccBankBenefit;
				}
		
			//Поле Код подразделения
			
			public void setCodeFilialBankBenefit(String codeFilialBankBenefit) {
					this.codeFilialBankBenefit = codeFilialBankBenefit;
				}
			public String getCodeFilialBankBenefit() {
				return this.codeFilialBankBenefit;
				}
		
			//Поле Номер лицевого счета
			
			public void setClientAccBankBenefit(String clientAccBankBenefit) {
					this.clientAccBankBenefit = clientAccBankBenefit;
				}
			public String getClientAccBankBenefit() {
				return this.clientAccBankBenefit;
				}
		
	
	//Закладка Электронные копии документов
		
			//Поле <html><i>
	//Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>



            public void setSocialSupport(String socialSupport) {
					this.socialSupport = socialSupport;
				}
			public String getSocialSupport() {
				return this.socialSupport;
				}
			
			//Поле Справка о смерти, выданная органами ЗАГСа
			
			public void setSprDeadDocLoad(FileBean sprDeadDocLoad) {
					this.sprDeadDocLoad = sprDeadDocLoad;
				}
			public FileBean getSprDeadDocLoad() {
				return this.sprDeadDocLoad;
				}
		
			//Поле Документ, подтверждающий факт государственной регистрации рождения ребенка, родившегося мертвым/умершим на первой неделе жизни, который выдается органами ЗАГС
			
			public void setGrrDeadChild(FileBean grrDeadChild) {
					this.grrDeadChild = grrDeadChild;
				}
			public FileBean getGrrDeadChild() {
				return this.grrDeadChild;
				}
		
			//Поле Документ, подтверждающий факт погребения мертвого ребенка
			
			public void setDeadChildDocLoad(FileBean deadChildDocLoad) {
					this.deadChildDocLoad = deadChildDocLoad;
				}
			public FileBean getDeadChildDocLoad() {
				return this.deadChildDocLoad;
				}
		
	
		}
