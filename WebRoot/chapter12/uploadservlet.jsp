<%@ page language="java" pageEncoding="UTF-8"%>
  <html>
 <head>
 <title>上传单个文件</title>
 </head>
    <body>       
       <form action="UploadServlet" method = "post" enctype="multipart/form-data" >
           
           上传文件：<input type="file" name="file"/><p/>
           新文件名：<input type="text" name = "filename" /><p/>
           
           <input type="submit" value="上传" style="width:50px"/>
       
                
       </form>    
    </body>
  </html> 