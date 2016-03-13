<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Random"%>
<%
    Random rand = new Random();    
    int n = rand.nextInt(1000);
    int m = rand.nextInt(1000);
    
%>
<html>
<head>
<title>random</title>
</head>
<body>
第一个随机数：<%  out.println(n);  %><br>
<input type="button" value="单击显示第二个随机数" onclick="javascript:alert('<%= m %>')"/> 
</body>
</html> 