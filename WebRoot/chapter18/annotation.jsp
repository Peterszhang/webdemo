<%@ page pageEncoding="UTF-8"%>
<%@page import="hibernate.*,chapter18.entity.*,org.hibernate.*"%>

<html>
	<head>
		<title>测试Hibernate Annotation</title>
	</head>
	<body>
		<%

			Session mySession = AnnotationSessionFactory.getSession();
			Transaction tx = mySession.beginTransaction();
			MyMessage message = new MyMessage();
			message.setId(Integer.parseInt(request.getParameter("id")));
			message.setName(request.getParameter("name"));
			// 如果记录存在，修改当前记录msg字段值，如果不存在，插入记录 
			mySession.saveOrUpdate(message);
			tx.commit();
			out.println("插入成功!");
			mySession.close();
		%>
	</body>
</html>
