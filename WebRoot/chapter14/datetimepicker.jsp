<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>datetimepicker标签</title>
		<s:head theme="ajax" />
	</head>
	<body>
		<s:form theme="ajax">
			<s:datetimepicker name="birthday" labelposition="top" label="日期选择框（toggleType：explode,value：today）"
				toggleType="explode" value="today" />
			<s:datetimepicker name="birthday" labelposition="top" 
				label="日期选择框（toggleType：explode,value：2008-02-14, displayFormat：yyyy年M月d日）"
				toggleType="explode" value="2008-02-14" displayFormat="yyyy年M月d日" />
			<s:datetimepicker name="birthday" labelposition="top"  label="日期选择框（toggleType：explode, weekStartsOn：3）"
				toggleType="explode"  weekStartsOn="3"/>
			<s:datetimepicker language="en-us"  labelposition="top"  label="时间选择框（language：en-us，value=08:30）" type="time"
				value="08:30" />
			

		</s:form>

	</body>
</html>
