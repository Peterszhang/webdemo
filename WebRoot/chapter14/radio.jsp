<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>radio标签</title>
	</head>
	<body>
	使用radio标签生成多个单选框
	<s:bean name="chapter14.Cities">
			<s:form action="investigate" namespace="/chapter14">
				<s:radio name="hobbies" label="请选择您的兴趣受好" labelposition="top"
				 list="{'登山', '游泳','阅读'}" />
				<s:radio name="j2eeServers" label="请选择您擅长的J2EE服务器"
					labelposition="top"
					list="#{'weblogic':'Weblogic（Oracle）', 'websphere':'WebSphere（IBM）','jboss':'JBoss（开源）'}" />
				<s:radio name="cities" label="请选择您最想去的城市" labelposition="top"
					list="cities" listKey="abbreviation" listValue="name" />
				<s:submit value="确定" align="left" />
			</s:form>
		</s:bean>
	</body>
</html>
