<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.2.1.min.js"></script>
<script>
$(document).ready(function(){
	
});
</script>
</head>
<body>
<h1>Sugang ShinCheong</h1>
<form action="lecture">
	<select name="major">
		<option value="전자공학"> 전자공학 </option>
		<option value="컴퓨터공학"> 컴퓨터공학 </option>
		<option value="법학과"> 법학과 </option>
		<option value="경영학과"> 경영학과 </option>
		<option value="수학과"> 수학과 </option>
	</select>
	
	<select name="type">
		<option value="교양선택"> 교양선택 </option>
		<option value="교양필수"> 교양필수 </option>
		<option value="전공선택"> 전공선택 </option>
		<option value="전공필수"> 전공필수 </option>
		<option value="기초필수"> 기초필수 </option>
		
	</select>
	
	과목명: <textarea name="search" rows="1sp"></textarea>
	
	<br>
	
	<button type="submit"  >Search</button>
</form>
</body>
</html>