<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>类型转换结果</title>

	</head>

	<body >
	 <b>产品</b><br>
     <s:property value="products[0]"/>
     <s:property value="products[1]"/>
     <s:property value="products[2]"/><p/>
     <b>数字</b><br>
     <s:property value="numbers[0]"/>
     <s:property value="numbers[1]"/>
     <s:property value="numbers[2]"/><p/>
     <b>集合</b><br>
     <s:property value="collections[0]"/>
     <s:property value="collections[1]"/>
     <s:property value="collections[2]"/>
	</body>
</html>
