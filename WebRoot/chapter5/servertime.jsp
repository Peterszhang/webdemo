<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.text.*,java.util.*"%>
<html>
	<head>
		<title>显示服务器的当前时间</title>
	</head>
	<body>
		现在服务器的时间是：
		<font color="red"> 
		<%
 			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 			out.println(format.format(new Date()));
 		%> 
 		</font>
	</body>
</html>
