<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
 <head>
 <title><s:text name = "registerPage" /></title>
 </head>
    <body>
 <s:i18n name="temp">
        <s:form action = "register" >

            <s:textfield name="username" key = "username" />
            <s:textfield name="password" key = "password" />
            <s:textfield name="age" key = "age" />
            <s:textfield name="birthday" key = "birthday" />
            <s:submit  key="register" />
        </s:form>
        </s:i18n>
    </body> 
  </html> 