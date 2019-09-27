<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> list.jsp </h1>
	<c:forEach items="${calendarlist }" var="vo"> <h3>  ${vo.cal_date }</a> </h3></c:forEach>
</body>
</html>