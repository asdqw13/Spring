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
	<a href="test1">test1 --이동</a>
	<br />
	<a href="test2?data1=100&data2=200">test2--파라메타전달</a>
	<br />
	<hr />
	<a href="test3">test3-- request객체활용</a>
	<br />
	<hr />
	<a href="test4">test4-- model객체활용 </a>
	<br />
	<hr />
	<a href="test5">test5-- ModelAndView객체활용 </a>
	<br />
	
	<form action="result" method="get">
		이름:<input type="text" name="name" /><br />
		국어:<input type="text" name="kor" /><br />
		수학:<input type="text" name="eng" /><br />
		영어:<input type="text" name="mat" /><br />
		<input type="submit" value="계산" /><br />
	</form>
</body>
</html>