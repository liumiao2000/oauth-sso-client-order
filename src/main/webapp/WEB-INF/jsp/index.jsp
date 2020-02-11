<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Member首页</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	</head>
	<body>
		<div>
			<h2><strong>${user}</strong>，Order首页</h2>
			<br/>
			<a href="http://localhost:8081/member/">访问Member系统</a>
			<br/>
			<a href="<c:url value="/logout" />">退出</a>
		</div>
	</body>
</html>