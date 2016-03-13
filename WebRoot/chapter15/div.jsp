<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>div标签</title>
		<s:head theme="ajax" />
		<style type="text/css">
		div {
	       border:1px solid black; 
	       background-color:#bbbbbb;
	       width:500px;
	       padding-top:10px;
	       padding-left:10px;
	   
	       padding-bottom: 10px;
}
		</style>
	</head>
	<body>
	    <s:url id="random" action="random" /> 
	    <br>仅第一次获得服务端的内容 
	    <s:div id="div1" theme="ajax"  href="%{random}"/>	  
	    <hr>
	    每隔2秒刷新一次（指定updateFreq属性为2000）<br>
	   indicator="indicator1"
	    <s:div id="div2" 
	           theme="ajax"	            
	           href="%{random}"
	           updateFreq="2000"	           
	           indicator="indicator1"/>
	   <s:url id="image" value="/images/indicator.gif"/>
	   <img id="indicator1" src="<s:property value='image'/>" />
	    <hr>
	   5秒后开始更新（指定delay属性为5000）<br>
	   loadingText="正在加裁服务端数据..."<br>
	   indicator="indicator2"	   
	   <s:div id="div3" 
	           theme="ajax"	            
	           href="%{random}"
	           updateFreq="2000"	
	           delay="5000"         
	           loadingText = "正在加裁服务端数据..." 
	          
	           />
	    <img id="indicator2" src="<s:property value='image'/>" />
	   
	  	    <hr>
	   显示系统错误信息，每3秒更新一次<br>
	   updateFreq="3000"<br>
	   showErrorTransportText="true"
	   <s:div id="div4" 
	           theme="ajax"	            
	           href="/error.html"
	           updateFreq="3000"	
	           showErrorTransportText="true"
	         
	         />
	   
	  
	           
	    
	</body>
</html>
