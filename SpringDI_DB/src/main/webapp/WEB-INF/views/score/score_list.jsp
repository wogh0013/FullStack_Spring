<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="com.woori.myhome.score.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
 
<%@include file="../include/nav.jsp" %>

    <div class="container" style="margin-top:80px">
        <h2>게시판 목록</h2>

        <div class="input-group mb-3" style="margin-top:20px;">
            <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown">
                선택하세요
            </button>
            <ul class="dropdown-menu">
              <li><a class="dropdown-item" href="#">제목</a></li>
              <li><a class="dropdown-item" href="#">내용</a></li>
              <li><a class="dropdown-item" href="#">제목+내용</a></li>
            </ul>
            <input type="text" class="form-control" placeholder="Search">
            <button class="btn btn-secondary" type="submit">Go</button>
          </div>

        <table class="table table-hover ">
        	<colgroup>
        		<col width="8%">
        		<col width="*">
        		<col width="12%">
        		<col width="12%">
        		<col width="12%">
        		<col width="12%">
        		<col width="12%">
        		<col width="12%">
        	</colgroup>
            <thead class="table-secondary">
              <tr>
                <th>번호</th>
                <th>이름</th>
                <th>국어</th>
                <th>영어</th>
                <th>수학</th>
                <th>과학</th>
                <th>총점</th>
                <th>평균</th>
              </tr>
            </thead>
            <tbody>
            <%
            
            List<ScoreDto> list = (List<ScoreDto>)request.getAttribute("scoreList");
           	for(ScoreDto tempDto : list){
            %>
              <tr>
                <td><%=tempDto.getId()%></td>
                <%
                String url=request.getContextPath()+"/score/view?id="+tempDto.getId();
                %>
                <td><a href="<%=url%>"><%=tempDto.getName()%></a></td>
                <td><%=tempDto.getKor()%></td>
                <td><%=tempDto.getEng()%></td>
                <td><%=tempDto.getMat()%></td>
                <td><%=tempDto.getSci()%></td>
                <td><%=tempDto.getTotal()%></td>
                <td><%=tempDto.getAverage()%></td>
              </tr>
            <%}%>
            </tbody>
          </table>

 
          <ul class="pagination  justify-content-center">
            <li class="page-item disabled"><a class="page-link" href="#">first</a></li>
            <li class="page-item disabled"><a class="page-link" href="#">Previous</a></li>
            <li class="page-item"><a class="page-link" href="#">1</a></li>
            <li class="page-item"><a class="page-link" href="#">2</a></li>
            <li class="page-item"><a class="page-link" href="#">3</a></li>
            <li class="page-item"><a class="page-link" href="#">4</a></li>
            <li class="page-item"><a class="page-link" href="#">5</a></li>
            <li class="page-item"><a class="page-link" href="#">Next</a></li>
            <li class="page-item"><a class="page-link" href="#">last</a></li>
          </ul>
       
          <div class="container mt-3" style="text-align:right;">
            <a href="<%=request.getContextPath()%>/score/write" 
               class="btn btn-secondary">글쓰기</a>
          </div>
          
    </div>
</body>
</html>




