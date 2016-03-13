<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

  <html>
    <head>
      <title>成功失败</title>
    </head>
    
    <body>
        用户名：${sessionScope.username}<p/>
      ${requestScope.info}     
    </body>
  </html> 