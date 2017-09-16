<%@ taglib prefix="sHtml" uri="http://struts.apache.org/tags-html"%>

     <%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sHtml:form action="/Calci.do">
param1:
<sHtml:text property="param1" ></sHtml:text>
		<br>
param2:
<sHtml:text property="param2" name="calciInputForm"></sHtml:text>
		<br>
       
operation:<br>
		
		<sHtml:submit property="method"    >
		<bean:message key = "UserForm.add"/>
		</sHtml:submit>
		
		<sHtml:submit property="method" >
		<bean:message key = "UserForm.sub"/>
		</sHtml:submit>
		
		<sHtml:submit property="method"   >
		<bean:message key = "UserForm.mul"/>
		</sHtml:submit>
		
		<sHtml:submit property="method"   >
		<bean:message key = "UserForm.div"/>
		</sHtml:submit>
		

	</sHtml:form>
</body>
</html>