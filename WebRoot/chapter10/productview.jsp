<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>显示Product的属性值</title>
	</head>

	<body>
	  <s:property value="product.name" /><p/>
	  <s:property value="product.price" /><p/>
	  <s:property value="product.count" /><p/>
	</body>
</html>
