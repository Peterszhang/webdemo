<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>action标签</title>
	</head>
	<body>
	    调用Action，将结果包含到本页面中，并将请求参数传入Action<p/>
        <s:action id="myAction" name="my"   namespace="/chapter14" executeResult="true"/>
        <br>
        直接访问Action的属性：MyAction.value：<s:property value="#myAction.value"/>
        <br>
        --------------------------------------------------
         <br>
	    调用Action，将结果包含到本页面中，未将请求参数传入Action<p/>
        <s:action name="my" namespace="/chapter14" executeResult="true" ignoreContextParams="true"/>
        <br>
        --------------------------------------------------
         <br>
	    调用Action，未将结果包含到本页面中，将请求参数传入Action<p/>
        <s:action id ="myAction" name="my" namespace="/chapter14" />
        直接获得请求参数，value=<s:property value="#parameters.value" /><br>
        直接访问Action的属性：MyAction.value：<s:property value="#myAction.value"/>
      
	</body>
</html>
