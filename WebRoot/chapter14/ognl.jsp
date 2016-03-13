<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="chapter14.*"%>
<html>
	<head>
		<title>用OGNL表达式访问内置对象</title>
	</head>
	<body>	
	<%
	    Product product = new Product();
	    product.setName("空调");
	    product.setPrice(3200);
	    
	    request.setAttribute("product", product);
	    session.setAttribute("product", product);
	    application.setAttribute("product", product);
	    pageContext.setAttribute("product", product);
	 %>
	
	parameters：<s:property value="#parameters['name']"/><p/>
	request：<s:property value="#request.product.name"/>
	<s:property value="#request.product.price"/><p/>
	session：<s:property value="#session['product']['name']"/>
	<s:property value="#session.product.price"/><p/>
	application：<s:property value="#application.product.name"/>
	<s:property value="#application.product.price"/><p/>
	pageContext：<s:property value="#attr.product.name"/>
	<s:property value="#attr.product.price"/><p/>
	</body>
</html>
 