<#import "../customTemplates/generic/switchableDeclarantDocumentDocType.ftl" as switchableDeclarantDocumentDocType>
<#import "../customTemplates/generic/switchableDeclarantDocumentPlace.ftl" as switchableDocumentDeclarantPlace>
<#import "../customTemplates/generic/switchableDeadPersonDocumentDocType.ftl" as switchableDeadPersonDocumentDocType>
<#import "../customTemplates/generic/switchableDeadPersonDocumentBirthPlace.ftl" as switchableDeadPersonDocumentBirthPlace>
<#import "../customTemplates/generic/switchableDeadPersonDocumentLivingPlace.ftl" as switchableDeadPersonDocumentLivingPlace>
<#import "../customTemplates/generic/switchableDeadPersonDocumentDeathPlace.ftl" as switchableDeadPersonDocumentDeathPlace>
<#macro opttag field tagName>
    <#if ((field?eval)?has_content)><${tagName}>${field?eval}</${tagName}><#else><${tagName}/></#if>
</#macro>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:wss="http://wsService.zags.com/"
                  xmlns:typ="http://idecs.nvg.ru/privateoffice/ws/types/">
    <soapenv:Header/>
    <soapenv:Body>
        <wss:putZjvSm>
            <zjv>
                <eServiceHeader>
                    <typ:userId>${cUserID?string("0")}</typ:userId>
                    <typ:eserviceId>36400223</typ:eserviceId>
                    <typ:reestrId>1</typ:reestrId>
                    <typ:sirRequestId>1</typ:sirRequestId>
                    <typ:stateOrgCode>1</typ:stateOrgCode>
                    <typ:orderDate>${currentDate?string('yyyy-MM-dd')}</typ:orderDate>
                </eServiceHeader>
                <needActive>1</needActive>
            <@opttag "form.contact_email" "email"/>
            <@opttag "form.contact_phone" "phone"/>
                <idZags>${form.id_agency_in?split("#")[0]}</idZags>
                <requestHeader>
                    <typ:authToken>${cAuthToken}</typ:authToken>
                    <typ:requestId>${formRaw.orderId?string("computer")}</typ:requestId>
                    <typ:requestInitiatorCode>
                        <typ:regionCode>${userSelectedRegion!''}</typ:regionCode>
                        <typ:serviceOrgCode/>
                        <typ:employee>
                            <typ:sname/>
                            <typ:fname/>
                            <typ:mname/>
                            <typ:position/>
                        </typ:employee>
                    </typ:requestInitiatorCode>
                    <typ:orgRegistrator>
                        <typ:regionCode>${userSelectedRegion!''}</typ:regionCode>
                        <typ:serviceOrgCode/>
                        <typ:employee>
                            <typ:sname/>
                            <typ:fname/>
                            <typ:mname/>
                            <typ:position/>
                        </typ:employee>
                    </typ:orgRegistrator>
                    <typ:requestTypeCode/>
                    <typ:requestDate>${currentDate?string("yyyy-MM-dd")}</typ:requestDate>
                    <typ:documents/>
                </requestHeader>
                <datSm>
                    <dtDay>${form.death_date_day!''}</dtDay>
                    <dtMonth>${form.death_date_month!''}</dtMonth>
                    <dtYear>${form.death_date_year!''}</dtYear>
                </datSm>
                <mestoSm>
                    <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.death_country!'null').name?html}</gos>
                <@opttag "form.death_region" "rayon"/>
                    <subGos>${form.death_state!''}</subGos>
                <@switchableDeadPersonDocumentDeathPlace.switchableNasPun/>
                </mestoSm>
                <timeQue>
                <@opttag "form.date" "datQue"/>
                <#if form.time?has_content>
                    <#assign tqParts = form.time?split("#")>
                    <hourQue>${tqParts[1]?split(":")[0]}</hourQue>
                    <minQue>${tqParts[1]?split(":")[1]}</minQue>
                    <namKabinet>${tqParts[2]}</namKabinet>
                <#else>
                    <hourQue></hourQue>
                    <minQue></minQue>
                    <namKabinet></namKabinet>
                </#if>
                    <typeQue>AZ_SM</typeQue>
                </timeQue>
                <um>
                    <docum>
                        <dat>
                        <#if form.death_person_ident_doc_date?has_content>
                            <dtDay>${form.death_person_ident_doc_date?string("dd")}</dtDay>
                            <dtMonth>${form.death_person_ident_doc_date?string("MM")}</dtMonth>
                            <dtYear>${form.death_person_ident_doc_date?string("yyyy")}</dtYear>
                        </#if>
                        </dat>
                    <@switchableDeadPersonDocumentDocType.requestField/>
                        <num>${form.death_person_ident_doc_num!''}</num>
                        <ovd>${form.death_person_ident_doc_source!''}</ovd>
                        <seria>${form.death_person_ident_doc_ser!''}</seria>
                    </docum>
                    <fio>
                        <fam>${form.death_person_last_name!''}</fam>
                        <nam>${form.death_person_first_name!''}</nam>
                        <otch>${form.death_person_middle_name!''}</otch>
                    </fio>
                    <mestoLive>
                        <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.death_person_living_country!'null').name?html}</gos>
                    <@opttag "form.death_person_living_region" "rayon"/>
                        <subGos>${form.death_person_living_state!''}</subGos>
                    <@switchableDeadPersonDocumentLivingPlace.switchableNasPun/>
                        <house>${form.death_person_living_house!''}</house>
                        <indMal></indMal>
                    <@opttag "form.death_person_living_building" "korp"/>
                    <@opttag "form.death_person_living_flat" "kvart"/>
                    <#if form.death_person_living_street?has_content>
                        <street>${form.death_person_living_street!''}</street>
                        <typeStr>${dicRegistry.getItemByKey('STREET_TYPE_LS', form.death_person_living_street_type).name}</typeStr>
                    </#if>
                    </mestoLive>
                <#if form.death_person_sex = "1" >
                    <pol>MALE</pol>
                <#else>
                    <pol>FEMALE</pol>
                </#if>
                    <datRojd>
                        <dtDay>${form.death_person_birthday_day!""}</dtDay>
                        <dtMonth>${form.death_person_birthday_month!""}</dtMonth>
                        <dtYear>${form.death_person_birthday_year!""}</dtYear>
                    </datRojd>
                <#if form.death_person_citizenship?has_content>
                    <#assign grajd = dicRegistry.getItemByKey('GRAJD_LS', form.death_person_citizenship).name/>
                    <#if grajd = "Иное">
                        <grajd>
                            <gosRod/>
                            <type>GRAJD_NO_ESTABL</type>
                        </grajd>
                    <#elseif grajd = "Лицо без гражданства">
                        <grajd>
                            <gosRod/>
                            <type>GRAJD_WITHOUT</type>
                        </grajd>
                    <#else >
                        <grajd>
                            <gosRod>${grajd}</gosRod>
                            <type>GRAJD_YES_GOS</type>
                        </grajd>
                    </#if>
                <#else >
                    <grajd/>
                </#if>
                    <mestoRojd>
                        <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.death_person_birth_country!'null').name?html}</gos>
                    <@opttag "form.death_person_birth_region" "rayon"/>
                    <@opttag "form.death_person_birth_state" "subGos"/>
                    <@switchableDeadPersonDocumentBirthPlace.switchableNasPun/>
                    </mestoRojd>
                <#if form.death_person_nationality?has_content>
                    <nation>${dicRegistry.getItemByKey('NATIONALITY_LS', form.death_person_nationality?substring(0,1)).name}</nation>
                <#else >
                    <nation/>
                </#if>
                </um>
                <zjvl>
                    <docum>
                        <dat>
                        <#if form.declarant_ident_doc_date?has_content>
                            <dtDay>${form.declarant_ident_doc_date?string("dd")}</dtDay>
                            <dtMonth>${form.declarant_ident_doc_date?string("MM")}</dtMonth>
                            <dtYear>${form.declarant_ident_doc_date?string("yyyy")}</dtYear>
                        </#if>
                        </dat>
                    <@switchableDeclarantDocumentDocType.requestField/>
                        <num>${form.declarant_ident_doc_num!''}</num>
                        <ovd>${form.declarant_ident_doc_source!''}</ovd>
                        <seria>${form.declarant_ident_doc_ser!''}</seria>
                    </docum>
                    <fio>
                        <fam>${form.declarant_last_name!''}</fam>
                        <nam>${form.declarant_first_name!''}</nam>
                        <otch>${form.declarant_middle_name!''}</otch>
                    </fio>
                    <mestoLive>
                        <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.declarant_country!'null').name?html}</gos>
                    <@opttag "form.declarant_region" "rayon"/>
                    <@opttag "form.declarant_state" "subGos"/>
                    <@switchableDocumentDeclarantPlace.switchableNasPun/>
                        <house>${form.declarant_house!''}</house>
                    <@opttag "form.declarant_index" "indMal"/>
                    <@opttag "form.declarant_building" "korp"/>
                    <@opttag "form.declarant_flat" "kvart"/>
                        <street>${form.declarant_street!''}</street>
                        <typeStr>${dicRegistry.getItemByKey('STREET_TYPE_LS', form.declarant_street_type).name}</typeStr>
                    </mestoLive>
                </zjvl>
            </zjv>
        </wss:putZjvSm>
    </soapenv:Body>
</soapenv:Envelope>
