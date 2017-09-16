<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center">Calculator</h1>
	<h3>Enter parameters and requiured operation</h3>

	<form method="post" action="CalciProcess.do">

		<ul>
			<li><p>
					Enter Parameter1 : <input type="text" name="param1"><br>
				</p></li>
			<li><p>
					Enter Parameter2 : <input type="text" name="param2">
				</p></li>
			<li>
				<p>
					Select Operation:<br> <input type="radio" name="operation"
						value="addition" checked> Addition<br> <input
						type="radio" name="operation" value="subtraction">Subtraction<br>
					<input type="radio" name="operation" value="Multiplication">
					Multiplication<br> <input type="radio" name="operation"
						value="Division"> Division
				</p>
			</li>

			<html:submit>Compute</html:submit>
			
			
		</ul>
	</form>
	<br>
</body>
</html>