<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>push标签</title>
	</head>
	<body>
		<s:bean id = "student" name="chapter14.Student">
			<s:param name="name" value="'bill'" />
			<s:param name="grade" value="95" />	     
		</s:bean>
		使用push标签将student对象放到ValueStack栈顶<p/>
		<s:push  value="#student">
		    <s:property value="name" />
		    <s:property value="grade" />
		    <s:debug/>
		</s:push>		
	</body>
</html> 
