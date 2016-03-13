<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>date标签</title>
	</head>
	<body>
	<%
	  java.util.Calendar calendar = java.util.Calendar.getInstance();
	  calendar.set(2007, 8, 20);
	  request.setAttribute("oldDate", calendar.getTime());	   
	  calendar.set(2012, 8, 20);
	  request.setAttribute("futureDate", calendar.getTime());	   
	
	 %>
	
	<s:bean id = "date" name="java.util.Date"/>
	name属性的值为当前日期，nice="false"，format="yyyy-MM-dd HH:mm:ss"<br>
	<s:date name="#date" format="yyyy-MM-dd HH:mm:ss" nice = "false" /><hr><br>
	name属性的值为当前日期，nice="true"，format="yyyy-MM-dd HH:mm:ss"<br>
	<s:date name="#date" format="yyyy-MM-dd HH:mm:ss" nice = "true" /><hr><br>
	name属性的值为以前的日期，nice="true"，format="yyyy-MM-dd HH:mm:ss"<br>
	<s:date name="#request.oldDate" format="yyyy-MM-dd HH:mm:ss" nice = "true" /><hr><br>
    name属性的值为未来的日期，nice="true"，未指定format属性<br>
	<s:date name="#request.futureDate"  nice = "true" /><hr><br>
	name属性的值为以前的日期，id = "myDate"，nice="false"，未指定format属性<br>
	<s:date id="myDate" name="#request.oldDate"  nice = "false" />
	<s:property value="#myDate"/>


	</body>
</html> 
