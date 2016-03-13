<%@ page language="java"  pageEncoding="UTF-8"%>
<html>
	<head>
		<title>在JSP中嵌入Java代码</title>
	</head>
	<body>
		<%
			java.util.Random rand = new java.util.Random();
			for (int i = 0; i < 10; i++)
			{
				out.print(rand.nextInt(1000));
				out.print("<br>");
			}
		%>
	</body>
</html>