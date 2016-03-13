<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<head>
		<title>Lamdba表达式</title>
	</head>
	<body>	
	<s:property value="#jc =: [#this == 0?1: #jc(#this - 1)*#this], #jc(10)"/>
	</body>
</html>
 