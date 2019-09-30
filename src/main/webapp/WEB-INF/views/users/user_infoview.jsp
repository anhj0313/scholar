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
  
  <form action="insertrequest">


<input type="hidden" name="user_id" value=${user.user_id }>
<input type="submit" value="학적변동">

</form>

  <form action="insertrequestextra">


<input type="hidden" name="user_id" value=${user.user_id }>
<input type="submit" value="전과,복수전공 신청">

</form>
  
</body>
</html>