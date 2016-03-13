<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>使用OGNL表达式进行类型转换</title>
	</head>

	<body>
	  字符串到Product的转换<p/>
      <s:form action="product">      
          <s:textfield label="名称" name="product.name"/>
          <s:textfield label="价格" name="product.price"/>
          <s:textfield label="数量" name="product.count"/>
          <s:submit value="提交"/>
      </s:form>
	</body>
</html>
