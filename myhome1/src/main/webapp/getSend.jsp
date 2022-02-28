<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- get방식은 url이 보인다. -->
	<!-- post방식은 url이 안 보인다. -->
	<form name="myform">
	아이디 : <input type="text" name="userid" /><br/>
	패스워드 : <input type="password" name="password" /><br/>
	
	<button type="button" id="btnSend">보내기</button>
	</form>
</body>
</html>
<script>
window.onload=()=>{

	var btnSend = document.getElementById("btnSend");
	btnSend.addEventListener("click", ()=>{
		var frm = document.myform;
		frm.method="get";
		frm.action="/myhome1/receive1.jsp";
		frm.submit();
		});
}	
</script>