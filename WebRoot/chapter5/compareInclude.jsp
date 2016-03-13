<%@page pageEncoding="UTF-8"%>
include指令：
<%@include file="included.jsp"%>
<br>
include标签：
<jsp:include page="included.jsp"/>
<br>
include方法：
<%
pageContext.include("included.jsp");
%>
  