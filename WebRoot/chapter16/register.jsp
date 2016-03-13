<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<link type="text/css" rel="stylesheet" href="../css/style.css" />
		<title>用户注册</title>
		<script type="text/javascript">
        function refresh()
        {
            var img = document.getElementById("img_validation_code")
            img.src = "validate_code.action?" + Math.random();            
        }
        </script>
	</head>
	<body>
		<center>
			<div
				style="margin-top: 20px; margin-left: 20px; font-size: 20px; height: 50px">
				请输入用户注册信息
			</div>

单击此处<a href="login.jsp">登录</a>
			<FONT color="red"><s:actionerror /> </FONT>
			<s:form action="register" namespace="/chapter16" validate="true">
				<s:textfield label="用户名" cssClass="input_list" name="username"
					required="true" value="" />
				<s:password label="密码" name="password" cssClass="input_list"
					required="true" />
				<s:password label="请再次输入密码" name="repassword" cssClass="input_list"
					required="true" />
				<s:textfield label="邮箱地址" name="email" cssClass="input_list" value=""/>
				<s:textfield label="验证码" name="validationCode" cssClass="input_list"
					required="true" value=""/>
				<s:submit value="注册" />
			</s:form>
			用户验证码：
			<img id="img_validation_code" src="validate_code.action" />
			<a href="#" onClick="refresh()">重新获得验证码</a>
		</center>
		<script type="text/javascript">		
			   <s:if test="result!=null">alert('<s:property value="result" escape="false" />');</s:if>
		</script>

	</body>
</html>
