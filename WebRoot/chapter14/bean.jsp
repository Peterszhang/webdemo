<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>bean标签</title>
	</head>
	<body>
		<s:bean name="chapter14.Student">
			<s:param name="name" value="'bill'" />
			<s:param name="grade" value="95" />
	      Student的属性值：<br>
	      name：<s:property value="name" />
			<br>
	      grade：<s:property value="grade" />
		</s:bean>

		<s:bean id = "student" name="chapter14.Student">
			<s:param name="name" value="'bill'" />
			<s:param name="grade" value="95" />	     
		</s:bean>
		<br>
		 Student的属性值：<br>
		 name：<s:property value="#student.name"/><br>
		 grade：<s:property value="#student.grade"/>
	</body>
</html>
