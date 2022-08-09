<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- requestScope는 생략가능. 하지만 어느영역에 저장되어있는 것을 나중에 유지보수하기위해 꼭 붙이는 편 -->
	<h1>test2</h1>
	<h3>data1 : ${requestScope.data1 }</h3>
	<h3>data2 : ${requestScope.data2 }</h3>
	
</body>
</html>