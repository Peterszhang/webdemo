<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<head>
		<title>两个autocompleter标签联动</title>
		<s:head theme="ajax" />
		<style type="text/css">
input {
	width: 200px
}
</style>
	</head>
	<body>
		<s:url id="provinces" action="provinces"/>
		<s:form id="form">
			<s:autocompleter theme="ajax" autoComplete="true" name="province" href="%{provinces}"
				notifyTopics="/provinces" forceValidOption="true" />
		</s:form>
		<s:url id="cities" action="cities" />
		<s:autocompleter theme="ajax" href="%{cities}" autoComplete="true"
			formId="form" listenTopics="/provinces" forceValidOption="true" />
	</body>
</html> 
