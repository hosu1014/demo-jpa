<%@page import="java.util.List
           " 
%><%@taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core"
%><%@taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions"
%><%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"
%><%@taglib prefix="spring" uri="http://www.springframework.org/tags"
%><%
	response.setHeader("Pragma", "No-cache");
	response.setDateHeader("Expires", 0);
	response.setHeader("Cache-Control", "no-cache");
	
%><%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>Member List</h2>
<c:forEach items="${memberList }" var="member">
<div>
	<li>id : <span>${member.id }</span></li>
	<li>name : <span>${member.name }</span></li>
	<li>age : <span>${member.age }</span></li>
</div>
</c:forEach>
</body>
</html>