<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.2.1.min.js"></script>
</head>
<body>

	<h1>Lecture Time</h1>
	<hr>

 	<c:forEach items="${lecture }" var="vo">
			${vo } 
	</c:forEach> 

	<hr>

</body>
</html>