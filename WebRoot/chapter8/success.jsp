<%@ page language="java" pageEncoding="UTF-8"%>

  <html>
    <head>
      <title>成功登录</title>
    </head>
    
    <body>
        本站访问次数：${ applicationScope.counter}<p/>
        用户名：${sessionScope.username}<p/>
      ${requestScope.info}     
    </body>
  </html> 