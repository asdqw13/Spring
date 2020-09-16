<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index</h1>
	<hr />
	test1
	<br />
	<form action="test1" method="post">
		id:<input type="text" name="id" /><br />
		name:<input type="text" name="name" /><br />
		hobby:
		<input type="checkbox" name="hobby" value="study" />공부
		<input type="checkbox" name="hobby" value="reading" />독서 
		<input type="checkbox" name="hobby" value="music" />음악<br />
		<input type="submit" value="테스트1" /><br />
	</form>
	<hr />
	<a href="test2?id=100&name=111&hobby=reading&hobby=music">test2</a>
	<hr />
	<a href="test3?id=100&name=222&hobby=222&hobby=223">test3</a>
	<hr />
	<a href="test4/100/200/300">test4</a>
	<hr />
	<a href="test6?id=100&name=333&hobby=333&hobby=334">test6</a>
	<hr />
	<a href="test7?id=100&name=leee&hobby=444">test7</a>
	<hr />
	<a href="test8?id=100&name=lee">test8</a>
	<hr />
	
	<form action="board/write" method="post">
		이름:<input type="text" name="name" /><br />
		국어:<input type="text" name="kor" /><br />
		수학:<input type="text" name="eng" /><br />
		영어:<input type="text" name="mat" /><br />
		<input type="submit" value="계산" /><br />
	</form>
</body>
</html>