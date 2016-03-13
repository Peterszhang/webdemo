<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>显示Product的属性值</title>
	</head>

	<body>

	  
	  <s:iterator id="product" value="products">
	      产品映射[${product.key}]<p/>
	      名称：${product.value.name}&nbsp;&nbsp; 
	      价格：${product.value.price}&nbsp;&nbsp;
	      数量：${product.value.count}<p/>
	  </s:iterator>
	</body> 
</html>
