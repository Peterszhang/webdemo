<%@ page isErrorPage="true" contentType=" text/html" pageEncoding="UTF-8"%>
<%
    out.println("错误跟踪信息：<br>");
    exception.printStackTrace(new java.io.PrintWriter(out));
    
%>