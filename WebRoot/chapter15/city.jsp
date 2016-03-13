<%@ page language="java" pageEncoding="UTF-8"%>
<%
    java.util.Random rand = new java.util.Random();
	out.println("服务端显示的随机数字（0至10000）：" + rand.nextInt(10000));    
%>
${param.city} 
