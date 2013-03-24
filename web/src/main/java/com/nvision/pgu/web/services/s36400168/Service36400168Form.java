package com.nvision.pgu.web.services.s36400168;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;


/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400168Form extends AbstractServiceOrderForm {

    public void clearApplicantAttributes() {

        this.setLastName("");
        this.setFirstName("");
        this.setMiddleName("");
        this.setBirthdate(null);
        this.setSex("");
        this.setAddress("");
        this.setFactAddress("");
        this.setPhone("");
        this.setEmail("");
        this.setIdentityDocType("");
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);
        this.setEmail("");
    }

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {

        this.setLastName(privateRoomDataContainer.getLastName());
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());
        this.setBirthdate(privateRoomDataContainer.getBirthdate());
        this.setSex(privateRoomDataContainer.getSex());
        this.setAddress(privateRoomDataContainer.getAddress());
        this.setFactAddress(privateRoomDataContainer.getAddress());
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setEmail(privateRoomDataContainer.getEmail());
        this.setIdentityDocType(privateRoomDataContainer.getIdentityDocType());
        this.setPassSeria(privateRoomDataContainer.getPassSeria());
        this.setPassNo(privateRoomDataContainer.getPassNo());
        this.setPassFrom(privateRoomDataContainer.getPassFrom());
        this.setPassDate(privateRoomDataContainer.getPassDate());
        this.setEmail(privateRoomDataContainer.getEmail());
    }


	
	//Закладка Тип заявителя
		
			//Поле Заявление подает законный представитель
			
			
			private String dov_enable;	//По умолчанию: Не активирован

    // Флаг изменениия флага доверенности
    private Boolean dov_enable_changed = true;

    public Boolean getDov_enable_changed() {
        return dov_enable_changed;
    }

    public void setDov_enable_changed(Boolean dov_enable_changed) {
        this.dov_enable_changed = dov_enable_changed;
    }
//
//Логика:
//1. При активации чекбокса осуществляется переход на ШАГ 3 (ШАГ 2 пропускается)
//2. При деактивации чекбокса осуществляется переход на ШАГ 2 (ШАГ 3 пропускается)
		
	
	//Закладка Сведения о заявителе
		
			//Поле <h2>Сведения о заявителе</h2>
			
			//Поле <html><i>Нижеследующие поля заполняются на основании учетной записи на портале и не могут быть изменены. 
	//Если в заявлении указаны неверные данные заявителя, необходимо выполнить одно из следующих действий:
	//<br>1. Выйти из учетной записи и авторизоваться заново под вашим логином и паролем;
	//<br>2. В случае необходимости внести изменения в учетную запись в установленном порядке.</i></html>
			
			//Поле Фамилия
			
			
			//private String lastName;	//По умолчанию:
//данные из ЛК
//Недоступно для редактирования
//
//Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)
		
			//Поле Имя
			
			
			//private String firstName;	//По умолчанию:
//данные из ЛК
//Недоступно для редактирования
//
//Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)
		
			//Поле Отчество (если имеется)
			
			
			//private String middleName;	//По умолчанию:
//данные из ЛК
//Недоступно для редактирования
//
//Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)
		
			//Поле Пол:
			
			
			//private String sex;	//сделать radiogroup
//По умолчанию: 
//данные из ЛК
//Недоступно для редактирования
		
			//Поле Дата рождения:
			
			
			//private Date birthdate;	//По умолчанию:
//данные из ЛК
//Недоступно для редактирования
		
			//Поле <html><i>Поля «Адрес регистрации» , «Адрес места жительства (пребывания)», «Контактный телефон», «Адрес электронной почты» заполняются на основании учетной записи на портале. 
	//Могут быть изменены в ходе заполнения формы заявления</i></html>
			
			//Поле Адрес места жительства (пребывания)
			
			
			//private String factAddress;	//По умолчанию:
//Данные из ЛК
		
			//Поле Адрес регистрации
			
			
			//private String address;	//По умолчанию:
//Данные из ЛК
		
			//Поле Почтовый адрес совпадает с адресом места жительства (пребывания)
			
			
			//private String addressEq;	//По умолчанию не активирован
//Логика
//При активации значение поля #factAddress копируется на поле #addressPost
		
			//Поле Почтовый адрес
			
			
			//private String addressPost;	//
		
			//Поле Контактный телефон
			
			
			//private String phone;	//По умолчанию:
//Данные из ЛК - "Домашний телефон"
//
//Валидация: phone (перекрыть)
		
			//Поле Адрес электронной почты
			
			
			//private String email;	//По умолчанию:
//Данные из ЛК
//
//Валидация: email
		
			//Поле <h2>Сведения о документе, удостоверяющем личность заявителя</h2>
			
			//Поле Тип документа, удостоверяющего личность
			
			
			//private String identityDocType;	//Данные из ЛК
//
//По умолчанию:
//Выбрано значение указанное в личном кабинете
//
//Логика: 
//1. При выборе значения из справочника отличного от того, что выбран в ЛК:
//поля 
//#passSeria
//#passNo
//#passFrom
//#passDate
//очищаются
//2. При выборе значения идентичного значению указанного в ЛК - по умолчанию
		
			//Поле Серия
			
			
			//private String passSeria;	//Данные из ЛК
//
//По умолчанию:
//Значение из ЛК
//
//Логика: 
//1. При выборе значения из справочника на поле #identityDocType отличного от того, что выбран в ЛК:
//поле очищается 
//2. При выборе значения При выборе значения из справочника на поле #identityDocType идентичного значению указанного в ЛК - по умолчанию
		
			//Поле Номер
			
			
			//private String passNo;	//Данные из ЛК
//
//По умолчанию:
//Значение из ЛК
//
//Логика: 
//1. При выборе значения из справочника на поле #identityDocType отличного от того, что выбран в ЛК:
//поле очищается 
//2. При выборе значения При выборе значения из справочника на поле #identityDocType идентичного значению указанного в ЛК - по умолчанию
		
			//Поле Дата выдачи
			
			
			//private Date passDate;	//Данные из ЛК
//
//По умолчанию:
//Значение из ЛК
//
//Логика: 
//1. При выборе значения из справочника на поле #identityDocType отличного от того, что выбран в ЛК:
//поле очищается 
//2. При выборе значения При выборе значения из справочника на поле #identityDocType идентичного значению указанного в ЛК - по умолчанию
		
			//Поле Кем выдан
			
			
			//private String passFrom;	//Данные из ЛК
//
//По умолчанию:
//Значение из ЛК
//
//Логика: 
//1. При выборе значения из справочника на поле #identityDocType отличного от того, что выбран в ЛК:
//поле очищается 
//2. При выборе значения При выборе значения из справочника на поле #identityDocType идентичного значению указанного в ЛК - по умолчанию
		
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Документ, удостоверяющий личность заявителя
			
			
			//private FileBean identityDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
		
	
	//Закладка Сведения о заявителе
		
			//Поле <h2>Сведения о законном представителе</h2>
			
			//Поле <html><i>
	//Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Документ, подтверждающий право законного представителя
			
			
			private FileBean dovDovLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
		
			//Поле Документ, удостоверяющий личность представителя
			
			
			private FileBean dovPasLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
		
			//Поле <h2>Сведения о заявителе</h2>
			
			//Поле Фамилия

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
			private String lastName;	//По умолчанию: 
//Незаполнено, Доступно для редактирования
//Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)
		
			//Поле Имя

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
			private String firstName;	//По умолчанию: 
//Незаполнено, Доступно для редактирования
//Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)
		
			//Поле Отчество (если имеется)

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
			private String middleName;	//По умолчанию: 
//Незаполнено, Доступно для редактирования
//Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)
		
			//Поле Пол:

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SEX)
			private String sex;	//сделать radiogroup
		
			//Поле Дата рождения:

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
			private Date birthdate;	//
		
			//Поле Адрес места жительства (пребывания)

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS)
			private String factAddress;	//По умолчанию:
//Незаполнено, Доступно для редактирования
		
			//Поле Адрес регистрации

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS)
			private String address;	//По умолчанию:
//Незаполнено, Доступно для редактирования
		
			//Поле Почтовый адрес совпадает с адресом места жительства (пребывания)
			
			
			private String addressEq;	//По умолчанию не активирован
//Логика
//При активации значение поля #factAddress копируется на поле #addressPost
		
			//Поле Почтовый адрес
			
			
			private String addressPost;	//
		
			//Поле Контактный телефон

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
			private String phone;	//По умолчанию:
//Незаполнено, Доступно для редактирования
//Валидация: phone (перекрыть)
		
			//Поле Адрес электронной почты

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
			private String email;	//По умолчанию:
//Незаполнено, Доступно для редактирования
//Валидация: email
		
			//Поле <h2>Сведения о документе, удостоверяющем личность заявителя</h2>
			
			//Поле Тип документа, удостоверяющего личность

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE,
                    overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String identityDocType;	//По умолчанию:
//Незаполнено, Доступно для редактирования
		
			//Поле Серия

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERIES,
                    overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String passSeria;	//По умолчанию:
//Незаполнено, Доступно для редактирования
		
			//Поле Номер

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_NUMBER,
                    overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String passNo;	//По умолчанию:
//Незаполнено, Доступно для редактирования
		
			//Поле Дата выдачи

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE,
                    overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private Date passDate;	//По умолчанию:
//Незаполнено, Доступно для редактирования
		
			//Поле Кем выдан

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG,
                    overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String passFrom;	//По умолчанию:
//Незаполнено, Доступно для редактирования
		
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Документ, удостоверяющий личность заявителя
			
			
			private FileBean identityDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
		
	
	//Закладка Дополнительные сведения
		
			//Поле <h2>Дополнительные сведения</h2>
			
			//Поле Место работы:
			
			
			private String workplace;	//
		
			//Поле Серия, номер полиса обязательного медицинского страхования
			
			
			private String polisSeria;	//Валидация буквы, цифры, дефис
		
			//Поле Дата выдачи полиса обязательного медицинскогострахования
			
			
			private Date polisDate;	//
		
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Страховой полис обязательного медицинского страхования
			
			
			private FileBean polisDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
		
			//Поле <html><i>Прошу рассмотреть возможность направления на медико-социальную экспертизу с целью установления инвалидности</i></html>
			
	

	
	//Закладка Тип заявителя
		
			//Поле Заявление подает законный представитель

            public void setDov_enable(String dov_enable) {
                // если пользователь изменил тип заявителя, поднимаем соответствующий флаг
                if (this.dov_enable != null) { // происходит сохранение данных с вэб-формы, а не заливка данных из драфта
                    if (dov_enable == null) {  // с вэб-формы пришёл off
                        if (!"off".equals(this.getDov_enable())) { // ... а в форме сохранён on
                            this.setDov_enable_changed(true);
                        }
                        this.dov_enable = "off";
                    } else {
                        if (!this.getDov_enable().equals(dov_enable)){
                            this.setDov_enable_changed(true);
                        }
                        this.dov_enable = dov_enable;
                    }
                } else {
                    this.dov_enable = dov_enable;
                }
            }

            public String getDov_enable() {
                return this.dov_enable == null ? "off" : this.dov_enable;
            }
		
	
	//Закладка Сведения о заявителе
		
			//Поле <h2>Сведения о заявителе</h2>
			
			//Поле <html><i>Нижеследующие поля заполняются на основании учетной записи на портале и не могут быть изменены. 
	//Если в заявлении указаны неверные данные заявителя, необходимо выполнить одно из следующих действий:
	//<br>1. Выйти из учетной записи и авторизоваться заново под вашим логином и паролем;
	//<br>2. В случае необходимости внести изменения в учетную запись в установленном порядке.</i></html>
			
			//Поле Фамилия
			/*
			public void setLastName(String lastName) {
					this.lastName = lastName;
				}
			public String getLastName() {
				return this.lastName;
				}*/
		
			//Поле Имя
			/*
			public void setFirstName(String firstName) {
					this.firstName = firstName;
				}
			public String getFirstName() {
				return this.firstName;
				}*/
		
			//Поле Отчество (если имеется)
			/*
			public void setMiddleName(String middleName) {
					this.middleName = middleName;
				}
			public String getMiddleName() {
				return this.middleName;
				}*/
		
			//Поле Пол:
			/*
			public void setSex(String sex) {
					this.sex = sex;
				}
			public String getSex() {
				return this.sex;
				}*/
		
			//Поле Дата рождения:
			/*
			public void setBirthdate(Date birthdate) {
					this.birthdate = birthdate;
				}
			public Date getBirthdate() {
				return this.birthdate;
				}*/
		
			//Поле <html><i>Поля «Адрес регистрации» , «Адрес места жительства (пребывания)», «Контактный телефон», «Адрес электронной почты» заполняются на основании учетной записи на портале. 
	//Могут быть изменены в ходе заполнения формы заявления</i></html>
			
			//Поле Адрес места жительства (пребывания)
			/*
			public void setFactAddress(String factAddress) {
					this.factAddress = factAddress;
				}
			public String getFactAddress() {
				return this.factAddress;
				}*/
		
			//Поле Адрес регистрации
			/*
			public void setAddress(String address) {
					this.address = address;
				}
			public String getAddress() {
				return this.address;
				}*/
		
			//Поле Почтовый адрес совпадает с адресом места жительства (пребывания)
			/*
			public void setAddressEq(String addressEq) {
					this.addressEq = addressEq;
				}
			public String getAddressEq() {
				return this.addressEq;
				}*/
		
			//Поле Почтовый адрес
			/*
			public void setAddressPost(String addressPost) {
					this.addressPost = addressPost;
				}
			public String getAddressPost() {
				return this.addressPost;
				}*/
		
			//Поле Контактный телефон
			/*
			public void setPhone(String phone) {
					this.phone = phone;
				}
			public String getPhone() {
				return this.phone;
				}*/
		
			//Поле Адрес электронной почты
			/*
			public void setEmail(String email) {
					this.email = email;
				}
			public String getEmail() {
				return this.email;
				}*/
		
			//Поле <h2>Сведения о документе, удостоверяющем личность заявителя</h2>
			
			//Поле Тип документа, удостоверяющего личность
			/*
			public void setIdentityDocType(String identityDocType) {
					this.identityDocType = identityDocType;
				}
			public String getIdentityDocType() {
				return this.identityDocType;
				}*/
		
			//Поле Серия
			/*
			public void setPassSeria(String passSeria) {
					this.passSeria = passSeria;
				}
			public String getPassSeria() {
				return this.passSeria;
				}*/
		
			//Поле Номер
			/*
            public void setPassNo(String passNo) {
                    this.passNo = passNo;
                }
            public String getPassNo() {
                return this.passNo;
                }*/

            //Поле Дата выдачи
            /*
            public void setPassDate(Date passDate) {
                    this.passDate = passDate;
                }
            public Date getPassDate() {
                return this.passDate;
                }*/

            //Поле Кем выдан
            /*
            public void setPassFrom(String passFrom) {
                    this.passFrom = passFrom;
                }
            public String getPassFrom() {
                return this.passFrom;
                }*/

            //Поле <html><i>
    //Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа.
    //Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
    //</i></html>

            //Поле Документ, удостоверяющий личность заявителя
            /*
            public void setIdentityDocLoad(FileBean identityDocLoad) {
                    this.identityDocLoad = identityDocLoad;
                }
            public FileBean getIdentityDocLoad() {
                return this.identityDocLoad;
                }*/


    //Закладка Сведения о заявителе

            //Поле <h2>Сведения о законном представителе</h2>

            //Поле <html><i>
    //Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов.
    //Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
    //</i></html>

            //Поле Документ, подтверждающий право законного представителя

            public void setDovDovLoad(FileBean dovDovLoad) {
                    this.dovDovLoad = dovDovLoad;
                }
            public FileBean getDovDovLoad() {
                return this.dovDovLoad;
                }

            //Поле Документ, удостоверяющий личность представителя

            public void setDovPasLoad(FileBean dovPasLoad) {
                    this.dovPasLoad = dovPasLoad;
                }
            public FileBean getDovPasLoad() {
                return this.dovPasLoad;
                }

            //Поле <h2>Сведения о заявителе</h2>

            //Поле Фамилия

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

            //Поле Пол:

            public void setSex(String sex) {
                    this.sex = sex;
                }
            public String getSex() {
                return this.sex;
                }

            //Поле Дата рождения:

            public void setBirthdate(Date birthdate) {
                    this.birthdate = birthdate;
                }
            public Date getBirthdate() {
                return this.birthdate;
                }

            //Поле Адрес места жительства (пребывания)

            public void setFactAddress(String factAddress) {
                    this.factAddress = factAddress;
                }
            public String getFactAddress() {
                return this.factAddress;
                }

            //Поле Адрес регистрации

            public void setAddress(String address) {
                    this.address = address;
                }
            public String getAddress() {
                return this.address;
                }

            //Поле Почтовый адрес совпадает с адресом места жительства (пребывания)

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

            //Поле <h2>Дополнительные сведения</h2>

            //Поле Место работы:

            public void setWorkplace(String workplace) {
                    this.workplace = workplace;
                }
            public String getWorkplace() {
                return this.workplace;
                }

            //Поле Серия, номер полиса обязательного медицинского страхования

            public void setPolisSeria(String polisSeria) {
                    this.polisSeria = polisSeria;
                }
            public String getPolisSeria() {
                return this.polisSeria;
                }

            //Поле Дата выдачи полиса обязательного медицинскогострахования

            public void setPolisDate(Date polisDate) {
                    this.polisDate = polisDate;
                }
            public Date getPolisDate() {
                return this.polisDate;
                }

            //Поле <html><i>
    //Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа.
    //Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
    //</i></html>

            //Поле Страховой полис обязательного медицинского страхования

            public void setPolisDocLoad(FileBean polisDocLoad) {
                    this.polisDocLoad = polisDocLoad;
                }
            public FileBean getPolisDocLoad() {
                return this.polisDocLoad;
                }

            //Поле <html><i>Прошу рассмотреть возможность направления на медико-социальную экспертизу с целью установления инвалидности</i></html>


        }
