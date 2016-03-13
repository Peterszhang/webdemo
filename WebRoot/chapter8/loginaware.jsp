<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
  <html>
    <head>
      <title>用户登录</title>
    </head>
    
    <body>
       <s:form action="loginaware">
           <s:textfield label="用户" name="username"/>
           <s:textfield label="密码" name="password"/>
           <s:submit value="登录" />
       </s:form>    
    </body>
  </html> 