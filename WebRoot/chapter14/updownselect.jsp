<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>updownselect标签</title>
		<s:head/>
	</head>
	<body>
		<s:form>
		    <s:updownselect name="books1" label="请选择您喜欢的图书" labelposition="top"
		    moveUpLabel="向上移动"  moveDownLabel="向下移动"
		    list="{'Spring2从入门到精通', 
			       'Struts、Hibernate、Spring整合实例精解', 
			       'Thinking in C++(2nd)',
			       'Jdbc 3.0 Java Database Connectivity'}"/>
		    <s:updownselect name="books2" label="请选择您喜欢的图书" labelposition="top"
		    moveUpLabel="向上移动"  selectAllLabel="全选"
		    list="#{'spring':'Spring2从入门到精通', 
			       'ssh':'Struts、Hibernate、Spring整合实例精解', 
			       'tcpp':'Thinking in C++(2nd)',
			       'jdbc':'Jdbc 3.0 Java Database Connectivity'}"/>
			<s:bean name="chapter14.Cities" id="cities" />
			<s:updownselect name="cities" label="请选择您喜欢的城市" labelposition="top"
		    moveDownLabel="向下移动"  selectAllLabel="全选"
		    list="#cities.cities" emptyOption="true"  listKey="abbreviation" listValue="name"/>
		</s:form>
		
	</body>
</html>
