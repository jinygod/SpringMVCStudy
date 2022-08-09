<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1</h1>
	<!-- 주입받은Bean의 클래스가 들어감(첫 글자는 소문자로 시작함),Request 영역에 저장 -->
	<h3>data1 : ${requestScope.dataBean.data1 }</h3>
	<h3>data2 : ${requestScope.dataBean.data2 }</h3>
	
</body>
</html>