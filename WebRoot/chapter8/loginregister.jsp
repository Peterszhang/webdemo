<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>用户登录</title>
	</head>

	<body>
通过动态方法处理多个提交请求
		<s:form  action="loginregister" theme="simple">
           用户：<s:textfield name="username" /><p />
		 密码：<s:textfield name="password" />
			<p />
				<s:submit value="登录" />
				<s:submit value="注册" action="loginregister!register" />
		</s:form>
通过method属性处理多个提交请求
		<s:form name="form" theme="simple" >
           用户：<s:textfield name="username" /><p />
		 密码：<s:textfield name="password" />
			<p />
				<s:submit value="登录" onclick="login()" />
				<s:submit value="注册" onclick="register()" />
		</s:form>
		<script type="text/javascript">
		function login()
		{
		    form.action = "mylogin.action";
		    
		    form.submit();
		  
		}
		function register()
		{
		    form.action = "myregister.action";
		    
		    form.submit();
		  
		}
		</script>
	</body>
</html>
