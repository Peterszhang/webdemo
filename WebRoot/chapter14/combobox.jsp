<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>combobox标签</title>
	</head>
	<body>
		使用combobox标签生成下拉列表框
		<s:form>
			<s:combobox  name="book" label="请选择您感兴趣的图书" labelposition="top"
				list="{'EJB3从入门到精通', 'Spring2精解', 'ASP.NET实例开发手册'}"></s:combobox>
            <s:submit value="提交" />
		</s:form>

		<s:form>
			<s:combobox  name="book" label="请选择您感兴趣的图书" labelposition="top"
				list="#{'ejb3':'EJB3从入门到精通', 'spring2':'Spring2精解', 'asp.net':'ASP.NET实例开发手册'}"></s:combobox>
            <s:submit value="提交" />
		</s:form>
        <s:bean id="cities" name="chapter14.Cities"/>
		<s:form>
			<s:combobox  name="city" label="请选择您感兴趣的城市" labelposition="top"
				list="#cities.cities" listKey="abbreviation" listValue="name" />
            <s:submit value="提交" />
		</s:form>
	</body>
</html>
