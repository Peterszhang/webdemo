<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>调用成功</title>
	</head>
	<body>

		调用成功，value=
		<s:property value="value" />
		<s:debug/>
		<s:form action="my">
			<s:textfield name="value" />
		</s:form>
	</body>
</html>
