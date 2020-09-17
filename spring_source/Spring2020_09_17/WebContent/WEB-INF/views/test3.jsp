<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>test3</h1>
<h2>결과</h2>
<form:form modelAttribute="testBean" action="result">
	이름 : <form:input path="user_name" /><br />
	아이디 : <form:input path="user_id" /><br />
	비밀번호 : <form:password path="user_pw" showPassword="true" /><br />
	우편번호 : <form:input path="user_postcode" /><br />
	주소 : <form:input path="user_address" /><br />
</form:form>
</body>
</html>