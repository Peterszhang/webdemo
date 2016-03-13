<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>append标签</title>
	</head>
	<body>

		<!--  使用append标签合并两个集合  -->
		<s:append id="newList">
			<s:param value="{'日照香炉生紫烟','遥看瀑布挂前川', '飞流直下三千尺', '疑是银河落九天'}" />
			<s:param value="{'天生我才必有用','千金散尽还复来'}" />
		</s:append>
		<table border="1" width="150" style="text-align: center">
			<!--  扫描新集合，并输出集合中的第一个元素  -->
			<s:iterator id="sentense" status="status" value="#newList">
				<tr <s:if test="#status.odd">style="background-color:#CCCCCC"</s:if>>
					<td>
						<s:property value="sentense" />
					</td>
				</tr>
			</s:iterator>
		</table>

<p/>
		<s:append id="newMap">
			<s:param value="#{'日照香炉生紫烟','遥看瀑布挂前川', '飞流直下三千尺', '疑是银河落九天'}" />
			<s:param
				value="#{'Windows':'操作系统','Office':'办公软件','Visual Studio':'开发工具','Java':'编程语言'}" />
		</s:append>
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
