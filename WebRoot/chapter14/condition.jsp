<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>if/elseif/else标签</title>
	</head>
	<body>	
<s:if test="${param.grade >= 90 && param.grade <= 100}">
  优秀
</s:if>
<s:elseif test="${param.grade >= 80 && param.grade < 90}">良好</s:elseif>
<s:elseif test="${param.grade >= 70 && param.grade < 80}">中等</s:elseif>
<s:elseif test="${param.grade >= 60 && param.grade < 70}">及格</s:elseif>
<s:else>不及格</s:else>

	</body>
</html>
  