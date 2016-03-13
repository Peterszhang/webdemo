<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>使用AJAX技术异步提交表单</title>
		<s:head theme="ajax" />
	</head>
	<body>

		<s:label value="您喜欢的城市：" />
		<s:label cssStyle="color:#FF0000" id="myCity" />

		<s:form action="ajaxAction" theme="ajax">

			<s:textfield name="city" label="请输入您最喜欢的城市" />
			<s:submit value="提交并修改label中的信息" targets="myCity" />
		</s:form>
		<hr>

		<s:label value="您喜欢的城市：" />
		<s:label cssStyle="color:#FF0000" id="myCity1" />
		<s:form action="jsAction" theme="ajax">

			<s:textfield name="city" label="请输入您最喜欢的城市" />
			<s:submit value="提交并修改label中的信息，同时弹出对话框" targets="myCity,myCity1"
				executeScripts="true" />
		</s:form>
	</body>
</html>
