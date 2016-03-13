<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
    java.util.Random rand = new java.util.Random();
	out.println(rand.nextInt(10000));

%>

