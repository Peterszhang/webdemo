<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ taglib prefix="s" uri="/struts-tags"%>  
<html>  
    <head>  
        <title>form、reset、submit标签</title>  
        <s:head />  
    </head>  
    <body>

        <s:form action="register">  
            <s:textfield  label="姓名" name="name" value="小明"/>
            <s:textfield  label="年龄" name="age" value=""/>
            <s:checkbox label="学生" name="isStudent" />
            <s:submit value="注册"/>
            <s:reset value="重置"/>  
        </s:form>  

    </body>  
</html>   