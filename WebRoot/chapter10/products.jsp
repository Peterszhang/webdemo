<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>字符串到Product的转换</title>
	</head>

	<body>
	  字符串到Product的转换<p/>
      <s:form action="products">      
          <s:textfield label="产品1" name="product1"/>
          <s:textfield label="产品2" name="product2"/>               
          
          <s:textfield label="产品数组[0]" name="products"/>
          <s:textfield label="产品数组[1]" name="products"/>               
          <s:textfield label="产品数组[2]" name="products"/>
                         
          <s:textfield label="产品列表[0]" name="productList"/>
          <s:textfield label="产品列表[1]" name="productList"/>               

          <s:textfield label="产品列表（非泛型）[0]" name="myProductList"/>
          <s:textfield label="产品列表（非泛型）[1]" name="myProductList"/>               

          <s:textfield label="产品映射（非泛型）[bike].name" name="myProductMap['bike'].name"/>
          <s:textfield label="产品映射（非泛型）[bike].price" name="myProductMap['bike'].price"/>
          <s:textfield label="产品映射（非泛型）[bike].count" name="myProductMap['bike'].count"/>

          <s:textfield label="产品Set1（非泛型）" name="myProductSet"/>
          <s:textfield label="产品Set2（非泛型）" name="myProductSet"/>
          <s:submit value="提交"/>
      </s:form>
	</body>
</html>
