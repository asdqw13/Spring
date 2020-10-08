<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제화면</title>
</head>
<body>
<h1>삭제화면</h1>
<form:form action="delete_pro" method="post" modelAttribute="testBean">
id : <form:input path="id"/><br/>
pwd : <form:password path="pwd" showPassword="true"/><br/>
<input type="submit" value="삭제"/>
</form:form>
</body>
</html>