<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

This is myhome

<ul>
	<li><a href="<%=request.getContextPath()%>/getSend.jsp">get방식호출</a></li>
	<li><a href="<%=request.getContextPath()%>/postSend.jsp">post방식호출</a></li>
	
</ul>
</body>
</html>