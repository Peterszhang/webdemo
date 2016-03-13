<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>iterator标签</title>
	</head>
	<body>
		<table border="1" width="150" style="text-align: center">

			<s:iterator id="sentense"
				value="{'日照香炉生紫烟','遥看瀑布挂前川', '飞流直下三千尺', '疑是银河落九天'}">
				<tr>
					<td>
						<s:property value="sentense" />
					</td>
				</tr>
			</s:iterator>
		</table>
		<p />
		<table border="1" width="200" style="text-align: center">
			<s:iterator id="sentense" value="poetry" status="status">
				<tr <s:if test="#status.odd">style="background-color:#CCCCCC"</s:if>>
					<td width="15%">
						<s:property value="#status.index" />
					</td>
					<td>
						<s:property value="sentense" />
					</td>
				</tr>
			</s:iterator>
		</table>
<p />
		<table border="1" width="200" style="text-align: center">
			<tr>
				<th>
					软件
				</th>
				<th>
				    类型
				</th>
			</tr>
			<s:iterator id="software" status="status"
				value="#{'Windows':'操作系统','Office':'办公软件','Visual Studio':'开发工具','Java':'编程语言'}">
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
