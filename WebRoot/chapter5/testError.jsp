<%@ page errorPage="error.jsp" contentType=" text/html"  pageEncoding="UTF-8"%>
<%
	java.util.Random rand = null;
	out.println(rand.nextInt());  // 抛出一个NullPointerException异常
%>