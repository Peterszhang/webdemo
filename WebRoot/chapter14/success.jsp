<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>OGNL表达式</title>
	</head>
	<body>	
	<s:property value="#newProduct.name"/>
	<s:property value="#newProduct.price"/><p/>
	<s:property value="#valueStackAction.value"/>
	<s:property value="#valueStackAction.product.name"/><p/>

	<s:property value="value"/>
	<s:property value="product.name"/><p/>
	
	</body>
</html>
 