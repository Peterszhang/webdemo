<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<head>
		<title>查询图书信息</title>
	</head>

	<body>	
		<s:form action="query">
			<s:textfield label="书名" name="name" />			
			<s:submit value="查询"/>
		</s:form>
	</body>
</html>
