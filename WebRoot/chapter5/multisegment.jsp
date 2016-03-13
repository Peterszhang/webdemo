<%@ page language="java" pageEncoding="UTF-8"%>
<html>
	<head>
		<title>在JSP中嵌入多段不完整的Java代码，但总体是完整的</title>
	</head>
	<body>
		<%
			java.util.Random rand = new java.util.Random();
			for (int i = 0; i < 10; i++)
			{
				out.print(rand.nextInt(1000));
		%>
		<br>
		<%
		}
		%>
		<%
			int n = rand.nextInt(100);
			if (n >= 0 && n <= 30)
			{
		%>
		small
		<%
			} else if (n > 30 && n <= 60)
			{
		%>
		middle
		<%
			} else
			{
		%>
		large
		<%
		}
		%>
	</body>
</html>
