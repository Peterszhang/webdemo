<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>merge标签</title>
	</head>
	<body>


		<s:merge  id="newMap">
			<s:param value="#{'日照香炉生紫烟','遥看瀑布挂前川', '飞流直下三千尺', '疑是银河落九天'}" />
			<s:param
				value="#{'Windows':'操作系统','Office':'办公软件','Visual Studio':'开发工具','Java':'编程语言'}" />
		</s:merge>
		<table border="1" width="200" style="text-align: center">

			<s:iterator id="element" status="status" value="#newMap">
				<tr <s:if test="#status.odd">style="background-color:#CCCCCC"</s:if>>
					<td>
						<s:property value="key" />
					</td>
					<td>
						<s:property value="value" />
					</td>
				</tr>
			</s:iterator>
		</table>
	</body>
</html>
