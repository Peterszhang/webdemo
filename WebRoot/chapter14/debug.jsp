<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>debug标签</title>
	</head>
	<body>
	<s:bean name="chapter14.Student">
	    <s:param name="name" value="'bill'" />
		<s:param name="grade" value="95" />	   
	    <s:debug/>
	</s:bean>
	</body>
</html> 
