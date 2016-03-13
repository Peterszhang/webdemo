<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>带有AJAX校验功能的用户注册页面</title>
		<style type="text/css">
input {
	width: 200px
}
</style>
<s:head theme="ajax"/>
	</head>
	<body>
		<!--  action = "register" -->
		<s:form action="register" namespace="/chapter15" theme="ajax"
			validate="true">
			<s:textfield label="用户名" name="username" />
			<s:password label="密码" name="password" />
			<s:password label="重新输入密码" name="repassword" />
			<s:textfield label="年龄" name="age" />
			<s:textfield label="生日" name="birthday" />
			<s:submit value="注册" cssStyle="width:50px" />
		</s:form>
	</body>
</html>
