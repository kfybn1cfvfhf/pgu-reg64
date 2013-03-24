package com.nvision.pgu.web.services.s36400081;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.blocks.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400081Form extends AbstractServiceOrderForm {


	
	//Закладка Сведения о заявителе
		
			//Поле <h2>Сведения о заявителе</h2>
			
			//Поле <html><i>Нижеследующие поля заполняются на основании учетной записи на портале и не могут быть изменены. 
	//Если в заявлении указаны неверные данные, необходимо выполнить одно из следующих действий:
	//<br>1. Выйти из учетной записи и авторизоваться заново под вашим логином и паролем;
	//<br>2. В случае необходимости внести изменения в учетную запись в установленном порядке.</i></html>
			
			//Поле Фамилия

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
			private String lastName;	//По умолчанию: 
//данные из ЛК
//Недоступно для редактирования
//
//Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)
		
			//Поле Имя

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
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
		
			//Поле Должность
			
			
			private String post;	//
		
			//Поле Наименование медицинской организации
			
			
			private String orgName;	//
		
			//Поле <html><i>Нижеследующие поля заполняются на основании учетной записи на портале. 
	//Могут быть изменены в ходе заполнения формы заявления.</i></html>
			
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
		
			//Поле <h2>Присваиваемая категория по специальности</h2>
			
			//Поле Категория
			
			
			private String medCategory;	//Виджет заменить на dictionaryLookup. Использовать справочник MED_CATEGOR
//Справочник зашить на форму
//По умолчанию:
//Не заполнен
//Значения:
//1 - Вторая (присвоение)
//2 - Первая (присвоение)
//3 - Высшая (присвоение)
//4 - Вторая (подтверждение)
//5 - Первая (подтверждение)
//6 - Высшая (подтверждение)
		
			//Поле Специальность
			
			
			private String medSpeciality;	//
		
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронных копий документов. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Квалификационный лист
			
			
			private FileBean docLoadQualificationLeaf;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
		
			//Поле Отчет о работе
			
			
			private FileBean docLoadReportOnWork;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
		
			//Поле Дополнительные документы, характеризующие уровень профессиональной подготовки
			

            private List<FileBean> othersDocLoad = AccessCounterList.createEmpty(FileBean.class); //Множественная загрузка
//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
		
	

	
	//Закладка Сведения о заявителе
		
			//Поле <h2>Сведения о заявителе</h2>
			
			//Поле <html><i>Нижеследующие поля заполняются на основании учетной записи на портале и не могут быть изменены. 
	//Если в заявлении указаны неверные данные, необходимо выполнить одно из следующих действий:
	//<br>1. Выйти из учетной записи и авторизоваться заново под вашим логином и паролем;
	//<br>2. В случае необходимости внести изменения в учетную запись в установленном порядке.</i></html>
			
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
		
			//Поле Должность
			
			public void setPost(String post) {
					this.post = post;
				}
			public String getPost() {
				return this.post;
				}
		
			//Поле Наименование медицинской организации
			
			public void setOrgName(String orgName) {
					this.orgName = orgName;
				}
			public String getOrgName() {
				return this.orgName;
				}
		
			//Поле <html><i>Нижеследующие поля заполняются на основании учетной записи на портале. 
	//Могут быть изменены в ходе заполнения формы заявления.</i></html>
			
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
		
			//Поле <h2>Присваиваемая категория по специальности</h2>
			
			//Поле Категория
			
			public void setMedCategory(String medCategory) {
					this.medCategory = medCategory;
				}
			public String getMedCategory() {
				return this.medCategory;
				}
		
			//Поле Специальность
			
			public void setMedSpeciality(String medSpeciality) {
					this.medSpeciality = medSpeciality;
				}
			public String getMedSpeciality() {
				return this.medSpeciality;
				}
		
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронных копий документов. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Квалификационный лист
			
			public void setDocLoadQualificationLeaf(FileBean docLoadQualificationLeaf) {
					this.docLoadQualificationLeaf = docLoadQualificationLeaf;
				}
			public FileBean getDocLoadQualificationLeaf() {
				return this.docLoadQualificationLeaf;
				}
		
			//Поле Отчет о работе
			
			public void setDocLoadReportOnWork(FileBean docLoadReportOnWork) {
					this.docLoadReportOnWork = docLoadReportOnWork;
				}
			public FileBean getDocLoadReportOnWork() {
				return this.docLoadReportOnWork;
				}
		
			//Поле Дополнительные документы, характеризующие уровень профессиональной подготовки

            public void setOthersDocLoad(List<FileBean> othersDocLoad) {
                    this.othersDocLoad = AccessCounterList.decorate(othersDocLoad, FileBean.class);
                }
            public List<FileBean> getOthersDocLoad() {
                    return normalize(this.othersDocLoad);
                }
		
	
		}