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
		userid : <input type="text" name="userid"> <br/>
		password : <input type="text" name="password"> <br/>
		
		<button type="button" onclick="goLogin()" id="btnLogin">로그인</button>
	</form>
</body>
</html>

<script>
	window.onload=function(){
		var btnLogin = document.getElementById("btnLogin");
		btnLogin.addEventListener("click", ()=>{
			var frm = document.myform;
			frm.method = "post";
			frm.action = "<%=request.getContextPath()%>/login_proc";
			frm.submit();
		})
	}
</script>