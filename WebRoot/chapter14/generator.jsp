<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>generator标签</title>
	</head>
	<body>


			<s:generator id="software" count="3" converter="myConverter" separator=";"  val="str">

				<table border="1" width="300" style="text-align: center">
					<s:iterator id="element" value="#attr.software" status="status">
						<tr
							<s:if test="#status.odd">style="background-color:#CCCCCC"</s:if>>
							<td>
								<s:property value="#element.str" />
							</td>
						</tr>
					</s:iterator>
				</table>
			</s:generator>
	</body>
</html>
