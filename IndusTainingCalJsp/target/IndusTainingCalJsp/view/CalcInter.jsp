
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="CalObj" class="com.indus.training.service.Calculator" />
<jsp:useBean id="CalInObj" class="com.indus.training.domain.CalcInputs" />
<jsp:useBean id="CalOutObj"
	class="com.indus.training.domain.CalcOutputs" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Double p1 = Double.parseDouble(request.getParameter("param1"));
		Double p2 = Double.parseDouble(request.getParameter("param2"));

		CalInObj.setParam1(p1);
		CalInObj.setParam2(p2);
		CalOutObj = CalObj.add(CalInObj);
		Double result = CalOutObj.getResult();
		String res = result + "";
		request.setAttribute("inResult", res);
		RequestDispatcher reqObj = request.getRequestDispatcher("CalcOutput.jsp");
		reqObj.forward(request, response);
	%>
</body>
</html>