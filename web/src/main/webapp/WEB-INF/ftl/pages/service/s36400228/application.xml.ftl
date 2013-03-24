<#ftl encoding="UTF-8">

<#import '../customTemplates/generic/appiontment.ftl' as appointment />

<#assign timeData=form.time?split('#') />
<@appointment.xml guidSession=form.orderExtId date=form.date time=timeData[1] room=timeData[2] />
