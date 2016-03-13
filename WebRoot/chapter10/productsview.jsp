<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>显示Product的属性值</title>
	</head>

	<body>
		<b>产品1</b>
		<p />
			名称：
			<s:property value="product1.name" />
			<br>
			价格：
			<s:property value="product1.price" />
			<br>
			数量：
			<s:property value="product1.count" />
		<p />
			<b>产品2</b>
		<p />
			名称：
			<s:property value="product2.name" />
			<br>
			价格：
			<s:property value="product2.price" />
			<br>
			数量：
			<s:property value="product2.count" />
			<br>
		<p />

			<s:iterator id="product" status="i" value="products">
	      产品数组[${i.index}]<p />
					名称：${product.name}&nbsp;&nbsp; 价格：${product.price}&nbsp;&nbsp;
					数量：${product.count}
				<p />
			</s:iterator>


			<s:iterator id="product" status="i" value="productList">
	      产品列表[${i.index}]<p />
					名称：${product.name}&nbsp;&nbsp; 价格：${product.price}&nbsp;&nbsp;
					数量：${product.count}
				<p />
			</s:iterator>
           ---------List -------------
			<s:iterator id="product" status="i" value="myProductList">
	      产品列表[${i.index}]<p />
					名称：${product.name}&nbsp;&nbsp; 价格：${product.price}&nbsp;&nbsp;
					数量：${product.count}
				<p />
			</s:iterator>

            -----------Map------------
			<s:iterator id="product" value="myProductMap">
	      产品映射[${product.key}]<p />
					名称：${product.value.name}&nbsp;&nbsp;
					价格：${product.value.price}&nbsp;&nbsp; 
					数量：${product.value.count}
				<p />
			</s:iterator>
            ---------set--------------
            <p/>
            产品1<p/>
		  名称：<s:property value="myProductSet('bike').name"/><br/>
		  价格：<s:property value="myProductSet('bike').price"/><br/>
		  数量：<s:property value="myProductSet('bike').count"/><p/>
		  产品2<p/>
		  名称：<s:property value="myProductSet('car').name"/><br/>
		  价格：<s:property value="myProductSet('car').price"/><br/>
		  数量：<s:property value="myProductSet('car').count"/><br/>
	</body>
</html>
