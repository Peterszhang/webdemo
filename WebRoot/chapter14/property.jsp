<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>property标签</title>
	</head>
	<body>
	<s:property value="'name'"/><br>
	<s:property value="'<h2>name</h2>'" escape="true"/><br>
	<s:property value="'<h2>name</h2>'" escape="false"/>
	<s:property  value="#parameters.name"/><br>
	<s:property  value="name" default="default_name"/>
	</body>
</html> 
