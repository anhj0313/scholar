<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../jquery-3.2.1.min.js"></script>
<script>
 	$(document).ready(function() {
				
			} 

</script>


</head>

<body  onload = "init(this.form);">

	<h1>전과신청</h1>
	<hr>
	
	
	<h1>현재 전공</h1>
		${userinfo.major }, ${userinfo.user_id }, ${userinfo.name }, ${userinfo.extra_major }
	<hr>
	
	<!-- 신청내역 확인 -->
	<h1>신청 내역</h1>
	<c:forEach items="${requestlistextra }" var="vo">
		<form action="deleterequestextra">
			${vo } <input type="submit" value="취소">
			<input type="hidden" name="user_id" value=${vo.user_id }>
			<input type="hidden" name="request_id" value=${vo.request_id }>

		</form>

	</c:forEach>

	<hr>
	
	
	<h1>신청 폼</h1>
	<form name="form" action="resultrequestextra">
	
	신청구분: <select name="type" >
		<option value="major">전과신청</option>
		<option>부전공신청</option>
		<option>복수전공신청</option>
		</select>	
	<hr>
		전공선택: <select name="major">
		<option value="">선택안함</option>
		<option>컴퓨터공학과</option>
		<option>정보통신 공학과</option>
		<option>전자공학과</option>
		</select>
	<hr>
        복수,부전공 선택: <select  name="extra_major">
        <option value="">선택안함</option>
		<option>컴퓨터공학과</option>
		<option>정보통신공학과</option>
		<option>전자공학과</option>
			</select>
	
	<hr>
		</select> 신청일시:
		<textarea rows="1" cols="20" readonly="readonly">  </textarea>
	   <br> 신청 메모:
		<textarea rows="5" cols="20" name="memo" maxlength="100"></textarea>
		<br> <input type="hidden" name="user_id"
			value=${userinfo.user_id }> <input type="submit" value="신청">
	<input type="hidden" name="accept" value=1>
	</form>

	<hr>
</body>
</html>