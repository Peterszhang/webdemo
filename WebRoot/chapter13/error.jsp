<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title><s:property value="result" /></title>
	</head>
	<body>
		<s:property value="result" />
		<p />
			<s:text name="message">
			<!-- 	<s:param value="username" />
				<s:param>
					<s:property value="time" />
				</s:param> -->
			</s:text>
	</body>
</html>
