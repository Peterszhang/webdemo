<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

  <html>
    <head>
      <title>用户注册</title>
      <style type="text/css">
          body{font-size: 14px;}
          .input {width: 200px; height: 20px}
          
      </style>
    </head>
    
    <body>
       <form action="register" method="post" >
           用户名：<input type="text" name="name" class="input"/><p/>
           密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" class="input"/><p/>           
           年&nbsp;&nbsp;&nbsp;&nbsp;龄：<input type="text" name="age" class="input"/><p/>
           生&nbsp;&nbsp;&nbsp;&nbsp;日：<input type="text" name="birthday" class="input"/><p/>
           <input type="submit"value="注册"/>
       </form>
    </body>
  </html> 