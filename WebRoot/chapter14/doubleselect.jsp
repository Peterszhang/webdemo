<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>doubleselect标签</title>

	</head>
	<body>
	<s:form action="xyz">
		<s:doubleselect name="province" list="{'辽宁省','广东省'}"
			doubleList="top == '辽宁省'?{'沈阳市', '大连市','抚顺市'}:{'深圳市', '珠海市', '汕头市'}"
			doubleName="city"></s:doubleselect>
			<s:submit value="提交" />
	</s:form>
    <p/><p/>
    <s:set name="pc" 
    value = "#{'辽宁省':{'沈阳市', '大连市','抚顺市'}, 
               '广东省':{'深圳市', '珠海市', '汕头市'}, 
               '浙江省':{'杭州市', '宁波市', '温州市'}}"
    />

	<s:form action="myAction">
		<s:doubleselect name="province" list="#pc.keySet()"
		    size="3"
			doubleList="#pc[top]"
			doubleName="city"
			doubleSize="3"/>
			<s:submit value="提交" />
	</s:form>


	</body>
</html>
