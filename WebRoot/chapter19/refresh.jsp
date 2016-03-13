
<%@ page pageEncoding="UTF-8"%>
<%@page import="hibernate.*,chapter17.entity.*,org.hibernate.*"%>
<%
		Session mySession = HibernateSessionFactory.getSession();
		MyMessage myMessage = new MyMessage();
        Object obj = mySession.get(MyMessage.class, 200);
        if(obj != null)
        {
        	myMessage = (MyMessage)obj;
        	myMessage.setName("abcdcjgong");
        	
            out.println("name属性的新值;" + myMessage.getName() + "<hr>");
            mySession.refresh(myMessage);
            out.println("刷新后的name属性值;" + myMessage.getName() + "");
        }
        mySession.close();
		%>

