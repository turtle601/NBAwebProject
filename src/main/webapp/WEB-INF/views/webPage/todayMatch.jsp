<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<h1>해당 날짜의 경기기록을 확인해보세요</h1>
	<form:form action="todayMatchResult" method = "post" modelAttribute = "member">
	
		팀명 : <br> 
		<form:checkbox path = "team" value = "Brooklyn Nets" /> 브루클린 네츠 <br>
		<form:checkbox path = "team" value = "Boston celtics" /> 보스턴 셀틱스 <br>
		
		경기 날짜(년): <form:input path = "year" /> 
		경기 날짜(월): <form:input path = "month"/>
		경기 날짜(일): <form:input path =  "day" />
		<input type = "submit" value = "submit" />
		
	</form:form>
	
</body>
</html>
