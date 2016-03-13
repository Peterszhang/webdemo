<%@ page pageEncoding="UTF-8"%>
<%@page import="hibernate.*,chapter17.entity.*,org.hibernate.*"%>

<html>
	<head>
		<title>装载实体Bean对象实例</title>
	</head>
	<body>
		<%
		Session mySession = HibernateSessionFactory.getSession();
		Transaction tx = mySession.beginTransaction();
		MyMessage myMessage = new MyMessage();
        myMessage.setId(200);
        myMessage.setName("carcjgong");
        mySession.saveOrUpdate(myMessage);
	
        
        Object obj = mySession.get(MyMessage.class, 200);
        if(obj != null)
        {
        	myMessage = (MyMessage)obj;
        	out.println("id：" + myMessage.getId() + "&nbsp;&nbsp;name：" + myMessage.getName());
        }
        else
        {
            out.println("未找到id为200的记录!");
        }
		out.println("<br>");        
        obj = mySession.get(MyMessage.class, 12345678);
        if(obj == null)
        {
            out.println("未找到id为12345678的记录!<br>");
        }
        try
        {
            obj = mySession.load(MyMessage.class, 12345678);
            myMessage = (MyMessage)obj;
            myMessage.getName();
        }
        catch(Exception e)
        {
            
            out.println(e.getMessage());
        }
        tx.commit();  
        mySession.close();
		%>
	</body>
</html>
