<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
  <html>
 <head>
 <title>下载文件</title>
 </head>
    <body>       
      <s:form action="DownloadAction" method="post" namespace="/chapter12">
		  <s:textfield label="上传文件路径" name="inputPath" />
		  <s:submit value="下载" />
    </s:form>
    </body>
  </html> 