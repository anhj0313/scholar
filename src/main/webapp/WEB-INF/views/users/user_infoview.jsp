<%@page import="kitri.main.myapp.UserInfoVO"%>

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
<h1> 회원정보</h1>

 ${user }	




<form action="changePassword">


<input type="hidden" name="user_id" value=${user.user_id }>
비밀번호 수정:<input type="password" name="password"><br> 
<input type="submit" value="수정하기">

</form>
  
</body>
</html>