<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/elfun.tld" prefix="elfun" %>
 
<html>
	<head> 
 
		<title>调用EL函数</title>
	</head> 
	<body>
		<form method="post"> 
			请输入一个字符串：
			<input type="text" name="text" />
			<p>
				<input type="submit" value="提交" />
		</form> 
  
		<p>  
			直接输出文本框中的内容： 
		<p>         
			${param.text}
		<p>
			使用定制函数输出文本框中的内容：
		<p>
			${elfun:ps(param.text)}
	</body>
</html>