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
	
	<c:forEach items="${requestlist }" var="vo"> 
		<form action="acceptrequest">	${vo } <input type="submit" value="수락">
		<input type="hidden" name="user_id" value=${vo.user_id }>
				
		<c:choose>
			<c:when test="${vo.student_register == '복학'}">
				<input type="hidden" name="student_register" value="재학" >	
			</c:when>
			<c:when test="${vo.student_register == '군복학'}">
				<input type="hidden" name="student_register" value="재학" >	
			</c:when>
			<c:otherwise>
				<input type="hidden" name="student_register" value=${vo.student_register }>	
			</c:otherwise>			
		</c:choose>
			
		
		<input type="hidden" name="request_id" value=${vo.request_id }>
		</form>  
	
	</c:forEach>
	
</body>
</html>