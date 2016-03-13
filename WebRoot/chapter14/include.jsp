<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>include标签</title>
	</head>
	<body>
	<font style="font-style: italic">
	    css.html页面的内容
	</font><br><br>
	<s:include value="/chapter3/css.html"/><hr>
	<font style="font-style: italic">
	included.jsp页面的内容
	</font><br>
	<s:include id="included" value="included.jsp">
	    <s:param  name="name" value="'Mike'" />	  

	</s:include>	

	</body>
</html> 
