<%@ page language="java" pageEncoding="UTF-8"%>

<html>
	<head>
		<title>在JSP中使用EL</title>
	</head>
	<body>
		<form method="post">
			&nbsp; key：
			<input type="text" name="key" />
			<p>
				value：
				<input type="text" name="value" />
			<p>
				<input type="submit" value="提交" />
			<p>
		</form>
		&nbsp; key：${param.key}
		<p>
			value:${param.value }
			<jsp:useBean id="t" class="java.util.Date" scope="request" />
		<p>
			自1970年1月1日 00:00:00 GMT 到现在的毫秒数：${t.time}
	</body>
</html>
