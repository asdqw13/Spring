<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삽입화면</title>
</head>
<body>
<h1>삽입화면</h1>
<form:form action="insert_pro" method="post" modelAttribute="testBean">
code : <form:input path="code"/><br/>
name : <form:input path="name"/><br/>
id : <form:input path="id"/><br/>
pwd : <form:password path="pwd" showPassword="true"/><br/>
age : <form:input path="age"/><br/>
<input type="submit" value="전송"/><br/>
</form:form>
</body>
</html>