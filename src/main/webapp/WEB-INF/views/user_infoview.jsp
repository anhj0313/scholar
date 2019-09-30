<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1> list.jsp </h1>
	<c:forEach items="${userlist }" var="vo"> <h3>  ${vo.user_id }</a> </h3></c:forEach>
</body>
</html>