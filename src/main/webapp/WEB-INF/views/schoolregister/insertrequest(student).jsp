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
	<!-- user가 학적 변동 신청 -->
	<h1>학적변동신청</h1>
	<hr>
	
	<!-- 현재 학적 상태 -->
	<h1>현재 학적 상태</h1>
		${userinfo.major }, ${userinfo.user_id }, ${userinfo.name }, ${userinfo.student_register }
	<hr>
	
	<!-- 신청내역 확인 -->
	<h1>신청 내역</h1>
	<c:forEach items="${requestlist }" var="vo">
		<form action="deleterequest">
			${vo } <input type="submit" value="취소">
			<input type="hidden" name="user_id" value=${vo.user_id }>
			<input type="hidden" name="reportingdate" value=${vo.reportingdate }>
		</form>

	</c:forEach>

	<hr>
	
	
	<h1>신청 폼</h1>
	<form action="resultrequest">
		신청구분: <select name="student_register">
			<option>휴학</option>
			<option>복학</option>
			<option>군휴학
			<option>군복학
		</select> 신청일시:
		<textarea rows="1" cols="20" readonly="readonly">  </textarea>
		<br> 휴학신청학기: <select name="semester">
			<option>1</option>
			<option>2</option>
		</select> 휴학기간: <br> 학과전공: <input type="text" value=${userinfo.major }
			readonly="readonly"> <br> 학년(학기): <input type="text"
			value=${userinfo.semester } readonly="readonly"> <br> 변경
		전: <br> 신청 메모:
		<textarea rows="5" cols="20" name="memo" maxlength="100"></textarea>
		<br> <input type="hidden" name="user_id"
			value=${userinfo.user_id }> <input type="submit" value="신청">
	</form>

	<hr>
</body>
</html>