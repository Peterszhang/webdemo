<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>字符串到Product的转换</title>
	</head>

	<body>
	  字符串到Product的转换<p/>
      <s:form action="products_ognl">      
          <s:textfield label="产品映射[bike].name" name="products['bike'].name"/>
          <s:textfield label="产品映射[bike].price" name="products['bike'].price"/>
          <s:textfield label="产品映射[bike].count" name="products['bike'].count"/>
          <s:textfield label="产品映射[car].name" name="products['car'].name"/>
          <s:textfield label="产品映射[car].price" name="products['car'].price"/>
          <s:textfield label="产品映射[car].count" name="products['car'].count"/>

          <s:submit value="提交"/>
      </s:form>
	</body>
</html>
