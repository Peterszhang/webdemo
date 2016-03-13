<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
  <html>
 <head>
 <title>上传单个文件</title>
 </head>
    <body>       

   
    <s:form action="UploadAction" method="post" namespace="/chapter12" enctype="multipart/form-data">
		<s:file label="上传文件" name="upload" />
		<s:textfield label="新文件名" name="filename" />
		<s:submit value="上传" />    
    </s:form>
 
    </body>
  </html> 