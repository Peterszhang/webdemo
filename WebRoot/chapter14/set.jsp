<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>set标签</title>
	</head>
	<body>

		<s:bean id="student" name="chapter14.Student">
			<s:param name="name" value="'bill'" />
			<s:param name="grade" value="95" />
		</s:bean>
		将student.name保存在application中
		<br>
		<s:set value="#student.name" name="name" scope="application" />
		<s:property value="#application.name" />
		<br>
		将student.grade保存在session中
		<br>
		<s:set value="#student.grade" name="grade" scope="session" />
		<s:property value="#session.grade" />
		<br>
		将student.grade保存在request中
		<br>
		<s:set value="#student.grade" name="grade" scope="request" />
		<s:property value="#request.grade" />
		<br>
		将Student对象保存在page中
		<br>
		<s:set value="#student" name="stu" scope="page" />
		<s:property value="#attr.stu.name" />
		<br>
		<s:property value="#attr.stu.grade" />
		<br>
		 将student对象放到ValueStack的栈顶，并保存在Stack Context中<br>
		<s:push value="#student">
             
			<s:set name="stu" />
			<s:property value="#stu.name" />
			<s:property value="#stu.grade" />
			<s:debug />
		</s:push>

		
	</body>
</html>
