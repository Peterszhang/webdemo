<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<head>
		<title>用OGNL表达式操作集合</title>
	</head>
	<body>	
	<s:if test="'自行车' in {'自行车','电冰箱'}">
	    包含<br>
	</s:if>
	<s:if test="'自行车' not in {'自行车','电冰箱'}">
	    不包含<br>
	</s:if>
	------------------------------------<br>
	<s:iterator id="element" value="{'自行车','电冰箱'}">
	    <s:property value="#element" /><br>
	</s:iterator>
	------------------------------------<br>
	<s:iterator id="element" value="{'自行车','电冰箱'}.{? #this =='自行车'}">
	    <s:property value="#element" /><br>
	</s:iterator>
	------------------------------------<br>
	<s:iterator id="element" value="#{'bike':'自行车','refrigerator': '电冰箱'}">
	    <s:property value="#element.key" /> :<s:property value="#element.value" /><br>
	</s:iterator>
	</body>
</html>
 