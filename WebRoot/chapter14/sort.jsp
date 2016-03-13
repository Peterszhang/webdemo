<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>sort标签</title>
	</head>
	<body>

		<s:bean id="myComparator" name="chapter14.MyComparator"/>

		<s:sort source="{'J2EE开发大全','Java大讲堂', '精通J2EE之Struts、Hibernate、Spring整合', 'C#从入门到精通'}"
			comparator="#myComparator" >
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

		</s:sort>
	</body>
</html>
