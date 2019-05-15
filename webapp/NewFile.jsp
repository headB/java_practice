<%@page import="java.util.Date"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

Canton Time <%=new Date().toLocaleString() %>
<br>
<%=request.getAttribute("six")%>
<br>
${six}

</body>
</html>