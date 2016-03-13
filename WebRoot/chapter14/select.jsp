<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>select标签</title>

	</head>
	<body>
		<s:form>
			<s:select name="books" label="请选择您喜欢的图书" labelposition="top"
				multiple="true"
				list="{'Spring2从入门到精通', 
			       'Struts、Hibernate、Spring整合实例精解', 
			       'Thinking in C++(2nd)',
			       'Jdbc 3.0 Java Database Connectivity'}" />
			<s:select name="books1" label="请选择您喜欢的图书" labelposition="top"
				multiple="true"
				list="#{'spring':'Spring2从入门到精通', 
			       'ssh':'Struts、Hibernate、Spring整合实例精解', 
			       'tcpp':'Thinking in C++(2nd)'}" />
			<s:bean name="chapter14.Cities" id="cities" />
			    <s:select name="cities" label="请选择您喜欢的城市" labelposition="top"
				multiple="true" list="#cities.cities" listKey="abbreviation"
				listValue="name" />			
		</s:form>
	</body>
</html>
