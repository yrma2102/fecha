<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div class = "container mt-4">
		<p class="text-primary text-center fs-3"><c:out value="${hour}"></c:out></p>
		<div class= "row pt-4"><a href="/">Volver</a></div>
	</div>
</body>
</html>