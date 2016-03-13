<%@ page language="java" pageEncoding="UTF-8"%>
  <html>
 <head>
 <title>上传多个文件</title>
 <script language="javascript">

function addFile()
{
        var uploadHTML = document.createElement( "<input type='file'  name='upload'/>");
        document.getElementById("files").appendChild(uploadHTML);
        uploadHTML = document.createElement( "<p/>");
        document.getElementById("files").appendChild(uploadHTML);
}
</script>
 
 </head>
    <body>
       <input type="button" onclick="addFile();" value="添加文件" />
           
       <form action="UploadMoreServlet" method = "post" enctype="multipart/form-data" >
           
         <span id="files"> <input type='file' name='upload' />
             <p/>
         </span>           
         <input type="submit" value="上传" style="width:50px"/>
       
                
       </form>    
    </body>
  </html> 