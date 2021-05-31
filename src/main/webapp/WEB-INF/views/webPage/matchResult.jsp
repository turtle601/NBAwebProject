<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
</head>
<body>
	<ul>
	<c:forEach var = "result" items = "${score}">
		<li> 경기 결과: ${result}</li>
	</c:forEach>
	</ul>
	
	<a href = "${cp}/webPage/match">돌아가기</a>
</body>
</html>