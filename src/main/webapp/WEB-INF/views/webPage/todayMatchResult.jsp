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
		<c:forEach var = "team" items = "${member.team}">
		<li>선택한 팀: ${team}</li>
		</c:forEach>
	</ul>
	${member.year} 년도
	${member.month} 달
	${member.day} 일
</body>
</html>