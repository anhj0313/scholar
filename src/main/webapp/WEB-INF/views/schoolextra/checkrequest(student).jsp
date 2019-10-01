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
	<!-- 신청내역확인. -->
	<h1> 신청 내역 </h1>
	
	<c:forEach items="${requestlistextra }" var="vo"> 
		<form action="update">	${vo.user_id },${vo.major}, ${vo.extra_major }, ${vo.reportingdate },${vo.memo } </form>  
	
	</c:forEach>
	
	<form action="insertrequestextra">
		<input type="hidden" name="user_id" value=${user_id }>
		<input type="submit" value="신청페이지로 돌아가기">
	</form>
</body>
</html>