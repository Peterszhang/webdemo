<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>类型转换演示</title>
	</head>

	<body>
      <s:form action="type_conversion">
          <s:textfield label="产品1" name="products"/>
          <s:textfield label="产品2" name="products"/>
          <s:textfield label="产品3" name="products"/>
          <s:textfield label="数字1" name="numbers"/>
          <s:textfield label="数字2" name="numbers"/>
          <s:textfield label="数字3" name="numbers"/>
          <s:textfield label="集合1" name="collections"/>
          <s:textfield label="集合2" name="collections"/>
          <s:textfield label="集合3" name="collections"/>          
          <s:submit value="提交"/>
      </s:form>
	</body>
</html>
