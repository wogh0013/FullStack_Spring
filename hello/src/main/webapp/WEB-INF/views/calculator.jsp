<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="myform">
		x : <input type="text" name="x"><br/>
		y : <input type="text" name="y"><br/>
		<button type="button" onClick="goAdd()">더하기</button>
	</form>
</body>
</html>
<script>
function goAdd()
{
	var frm = document.myform;
	frm.action="<%=request.getContextPath()%>/calcu_proc"
	frm.submit();
}
</script>

