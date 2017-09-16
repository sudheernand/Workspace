<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calci Input</title>
</head>

<body>
	<form method="post" action="../Calci.do">
		<h1 align="center">Calci</h1>
		param1: <input type="text" name="param1"><br> param2: <input
			type="text" name="param2"><br> operation:<br> add:
		<input type="radio" name="operation" value="addition"><br>
		sub: <input type="radio" name="operation" value="subtration"><br>
		mul: <input type="radio" name="operation" value="multiplicity"><br>
		div: <input type="radio" name="operation" value="division"><br>
		<input type="submit" name="Calculate" value="Calculate">
	</form>
</body>
</html>