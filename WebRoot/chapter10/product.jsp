<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>字符串到Product的转换</title>
	</head>
 
	<body>
	  字符串到Product的转换<p/>

      <s:form action="product">      
          <s:textfield label="产品信息" name="product"/>               
          <s:submit value="提交"/>
      </s:form>
	</body>
</html>
