<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
  <html>
    <head>
      <title>异常处理页面</title>
    </head>
    
    <body>
    异常消息<p/>
   <font color="red"> <s:property value="exception.message"/></font><p/>
    异常栈信息<p/>
   <font color="red">  <s:property value="exceptionStack"/></font>

    </body>
  </html>  