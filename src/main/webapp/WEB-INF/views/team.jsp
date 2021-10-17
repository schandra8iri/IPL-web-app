<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IPL Team</title>
</head>
<body>
TEAM
<ol>
<li>Team Name : ${team.teamName}</li>
<li>Team Total Six : ${team.totalSix}</li>
<li>Team Run Rate : ${team.netRunRate}</li>
<li>Team IS knockOut? : NO</li>
</ol>
PLAYERS
<ol>
<c:forEach items="${team.players}" var="player">
<li>${player}</li>
</c:forEach>
</ol>

MEMBERS
<ol>
<c:forEach items="${team.members}" var="member">
<li>${member}</li>
</c:forEach>
</ol>


</body>
</html>