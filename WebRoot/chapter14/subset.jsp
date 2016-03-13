<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>subset标签</title>
	</head>
	<body>
		<s:subset source="{'日照香炉生紫烟','遥看瀑布挂前川', '飞流直下三千尺', '疑是银河落九天'}"
			start="2" count="2">
			<table border="1" width="200" style="text-align: center">
				<s:iterator status="status">
					<tr
						<s:if test="#status.odd">style="background-color:#CCCCCC"</s:if>>
						<td>
							<s:property />
						</td>
					</tr>
				</s:iterator>
			</table>

		</s:subset>
<p/>
		<s:bean id="regexDecider" name="chapter14.RegexDecider">
			<s:param name="regex" value="'^.*(?i)J2EE.*$'" />
		</s:bean>

		<s:subset source="{'J2EE开发大全','Java大讲堂', '精通J2EE之Struts、Hibernate、Spring整合', 'C#从入门到精通'}"
			decider="#regexDecider" >
			<table border="1" width="350" style="text-align: center">
				<s:iterator status="status">
					<tr
						<s:if test="#status.odd">style="background-color:#CCCCCC"</s:if>>
						<td>
							<s:property />
						</td>
					</tr>
				</s:iterator>
			</table>

		</s:subset>
	</body>
</html>
