<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>url标签</title>
	</head>
	<body>
	    不指定任何属性，输出当前页面的URL<br>
	    <s:url/><br><hr>
	   指定action和namespace属性：action="hello"，namespace="/action"<br>
		<s:url action="hello" namespace="/action" /><br><hr>
	    指定value属性：value="yellow.action"<br>
		<s:url value="yellow.action" /><br><hr>
	    指定value属性：value="/yellow.action"<br>
		<s:url value="/yellow.action"   /><br><hr>
	    指定action属性，并通过param转入请求参数：value="yellow.action"<br>
		<s:url value="action" >
		    <s:param name="name" value="'John'" />
		</s:url> 
		<br><hr>
	    指定action属性，通过param转入请求参数：action="yellow"，并调用process方法<br>
		<s:url action="yellow" method="process" >
		    <s:param name="name" value="'John'" />
		</s:url>
		 
	</body>
</html>
  