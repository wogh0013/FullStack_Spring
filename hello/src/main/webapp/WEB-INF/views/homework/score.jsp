<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/myapp/score_proc" method="POST" name="myform">
		이름 : <input type="text" name="name"> <br>
		국어 : <input type="text" name="kor"> <br>
		영어 : <input type="text" name="eng"> <br>
		수학 : <input type="text" name="mat"> <br>
		
		<input type="submit" value="확인">
	</form>
	
	
	<!-- 
	<form name="form">
		이름 : <input type="text" name="name"> <br/>
		국어 : <input type="text" name="kor"> <br/>
		영어 : <input type="text" name="eng"> <br/>
		수학 : <input type="text" name="mat"> <br/>
		
		<button type="button" id="btnSend>결과확인</button>
	</form>	
	 -->
	
</body>
</html>

<script>
//	window.onload=function(){
//		var btnSend = document.getElementById("btnSend");
		
//		btnSend.addEventListener("click", ()=>{
//			var frm = document.form;
//			frm.action="<%=request.getContextPath()%>/homework/score_proc";
//			frm.method="post";
//			frm.submit();
//		});
//	}
</script>
