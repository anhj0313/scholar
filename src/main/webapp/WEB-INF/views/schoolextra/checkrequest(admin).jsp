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
	<!-- admin/admin 계정으로만 접근이 가능함. -->
	<h1> request.jsp </h1>
	
	<c:forEach items="${requestlistextra }" var="vo">
		<form action="acceptextra">	
		${vo }  
		<c:choose>
			<c:when test="${vo.accept==0}">
			</c:when>
			<c:otherwise>
				<input type="submit" value="수락">
			</c:otherwise>
		</c:choose>		
		<input type="hidden" name="type" value=${vo.type }>
		<input type="hidden" name="major" value=${vo.major }>
		<input type="hidden" name="extra_major" value=${vo.extra_major }>
		<input type="hidden" name="user_id" value=${vo.user_id }>
		<input type="hidden" name="accept" value=${vo.accept }>
		<input type="hidden" name="request_id" value=${vo.request_id }>
		</form>  
	
	</c:forEach>
	
</body>
</html>