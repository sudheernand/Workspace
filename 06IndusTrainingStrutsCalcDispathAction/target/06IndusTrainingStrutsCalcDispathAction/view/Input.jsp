<%@ taglib prefix="sHtml" uri="http://struts.apache.org/tags-html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sHtml:form action="/Calci.do">
param1:
<sHtml:text property="param1" name="calciInputForm"></sHtml:text>
		<br>
param2:
<sHtml:text property="param2" name="calciInputForm"></sHtml:text>
		<br>
       
operation:<br>
		<sHtml:submit property="method" value="add" />
		<sHtml:submit property="method" value="sub" />
		<sHtml:submit property="method" value="mul" />
		<sHtml:submit property="method" value="div" />
	</sHtml:form>
</body>
</html>