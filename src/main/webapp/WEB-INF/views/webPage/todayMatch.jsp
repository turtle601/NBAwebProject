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
				
		경기 날짜(년): <form:input path = "year" /> 
		경기 날짜(월): <form:input path = "month"/>
		경기 날짜(일): <form:input path =  "day" />
		
		<h3> 동부 </h3>
		<form:checkbox path = "team" value = "Boston Celtics" /> 보스턴 셀틱스 		
		<form:checkbox path = "team" value = "Milwaukee Bucks" /> 밀워키 벅스 
		<form:checkbox path = "team" value = "Miami Heat" /> 마이애미 히트 
		<form:checkbox path = "team" value = "Brooklyn Nets" /> 브루클린 넷츠 
		<form:checkbox path = "team" value = "Chicago Bulls" /> 시카고 불스 <br>
		
		<form:checkbox path = "team" value = "Washington Wizards" /> 워싱턴 위저즈 
		<form:checkbox path = "team" value = "Cleveland Cavaliers" /> 클리블랜드 캐빌리어스 
		<form:checkbox path = "team" value = "Orlando Magic" /> 올랜도 매직 
		<form:checkbox path = "team" value = "Indiana Pacers" /> 인디애나 패이서스 
		<form:checkbox path = "team" value = "Charlotte Hornets" /> 샬럿 호넷츠 <br>
		
		<form:checkbox path = "team" value = "Toronto Raptors" /> 토론토 랩터스 
		<form:checkbox path = "team" value = "Atlanta Hawks" /> 애틀란타 호크스 
		<form:checkbox path = "team" value = "Detroit Pistons" /> 디트로이트 피스톤스 
		<form:checkbox path = "team" value = "Philadelphia 76ers" /> 필라델피아 76ers 
		<form:checkbox path = "team" value = "New York Knicks" /> 뉴욕 닉스 <br>
			
		<h3> 서부 </h3> 
		<form:checkbox path = "team" value = "Los Angeles Lakers" /> LA 레이커스 
		<form:checkbox path = "team" value = "LA Clippers" /> LA 클리퍼스 
		<form:checkbox path = "team" value = "Dallas Mavericks" /> 댈러스 매버릭스 
		<form:checkbox path = "team" value = "Portland Trail Blazers" /> 포틀랜드 트레일 블레이저스 
		<form:checkbox path = "team" value = "Golden State Warriors" /> 골든 스테이트 워리어스 <br>
				
		<form:checkbox path = "team" value = "San Antonio Spurs" /> 샌안토니오 스퍼스 
		<form:checkbox path = "team" value = "Denver Nuggets" /> 덴버 너겟츠 
		<form:checkbox path = "team" value = "Houston Rockets" /> 휴스턴 로겟츠 
		<form:checkbox path = "team" value = "Oklahoma City Thunder" /> 오클라호마 시티 썬더 
		<form:checkbox path = "team" value = "Utah Jazz" /> 유타 재즈 <br>
		
		<form:checkbox path = "team" value = "Sacramento Kings" /> 새크라멘토 킹스 
		<form:checkbox path = "team" value = "Memphis Grizzlies" /> 맴피스 그리즐리스 
		<form:checkbox path = "team" value = "Minnesota Timberwolves" /> 미네소타 팀버울브즈 
		<form:checkbox path = "team" value = "Phoenix Suns" /> 피닉스 썬즈 
		<form:checkbox path = "team" value = "New Orleans Pelicans" /> 뉴올리언스 펠리컨스 <br>
		
		<input type = "submit" value = "submit" />
		
	</form:form>
	
</body>
</html>
