<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>optgroup标签</title>
	</head>
	<body>
		<s:form>
			<s:select name="books" labelposition="top" label="你选择您喜欢的图书"
				list="#{'spring':'Spring2从入门到精通',	  
	  'ssh':'Struts、Hibernate、Spring整合实例精解' 	  
	  }">

				<s:optgroup label="Java"
					list="#{'jsp':'Apress.Pro.JSP.Third.Edition', 'jsf':'JavaServer Faces in Action'}" />
				<s:optgroup label="C#" list="#{'csharp':'begin c# 2008 databases'}" />
				<s:bean name="chapter14.Cities">
					<s:optgroup label="请选择您喜欢的城市" list="cities" listKey="abbreviation"
						listValue="name" />
				</s:bean> 
			</s:select>

		</s:form>
	</body>
</html>
