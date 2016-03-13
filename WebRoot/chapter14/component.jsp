<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>component标签</title>
		
	</head>
	<body>
 
		<s:component  template="mytemplate.jsp" >
		
		    <s:param name="list" value="#{'spring':'Spring2从入门到精通', 
			       'ssh':'Struts、Hibernate、Spring整合实例精解', 
			       'tcpp':'Thinking in C++(2nd)',
			       'jdbc':'Jdbc 3.0 Java Database Connectivity'}"/>
		</s:component>
		
		
		
	</body>
</html>
