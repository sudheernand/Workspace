<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>
	<s:form action="product">
		<s:textfield name="id" label="Product Id"></s:textfield>
		<s:textfield name="name" label="Product Name"></s:textfield>
		<s:textfield name="price" label="Product Price"></s:textfield>
		<s:submit value="save"></s:submit>
	</s:form>
</body>
</html>