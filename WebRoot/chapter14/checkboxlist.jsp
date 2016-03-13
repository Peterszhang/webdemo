<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>checkboxlist标签</title>
		<s:head />
	</head>
	<body>
		<s:bean name="chapter14.Cities">
			<s:form action="investigate" namespace="/chapter14">
				<s:checkboxlist name="hobbies" label="请选择您的兴趣受好" labelposition="top"
				 list="{'登山', '游泳','阅读'}" />
				<s:checkboxlist name="j2eeServers" label="请选择您擅长的J2EE服务器"
					labelposition="top"
					list="#{'weblogic':'Weblogic（Oracle）', 'websphere':'WebSphere（IBM）','jboss':'JBoss（开源）'}" />
				<s:checkboxlist name="cities" label="请选择您最想去的城市" labelposition="top"
					list="cities" listKey="abbreviation" listValue="name" />

				<s:submit value="确定" align="left" />

			</s:form>
		</s:bean>

	</body>
</html>
