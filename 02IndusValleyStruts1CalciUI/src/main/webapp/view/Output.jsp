<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="calciOutputForm"
	class="com.indus.training.ui.model.CalciOutput" scope="request"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center">Calculator Output</h1>
	<h3>Your entered parameters, operation and Result</h3>
	<form>

		Using JSP get parameter:<br> Parameter 1:
		<jsp:getProperty property="param1" name="calciOutputForm" /><br>
		Parameter 2:
		<jsp:getProperty property="param2" name="calciOutputForm" /><br>
		Operation:
		<jsp:getProperty property="operation" name="calciOutputForm" /><br>
		Result:
		<jsp:getProperty property="result" name="calciOutputForm" /><br>
		<a href="CalciInput.do">Home</a>
	</form>
	<%-- THis java comments.... --%>
</body>
</html>