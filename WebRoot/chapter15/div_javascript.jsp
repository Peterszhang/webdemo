<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>div标签执行JavaScript代码</title>
		<style type="text/css">
		div {
	       border:1px solid black; 
	       background-color:#bbbbbb;
	       width:350px;
	       padding-top:10px;
	       padding-left:10px;
	   
	       padding-bottom: 10px;
       }
       </style>
		<s:head theme="ajax" />
		
		<script type="text/javascript">
            function msg()
            {
                div1.innerText = "您最喜欢的哪一个城市？";
                alert("您最喜欢哪一个城市？");
                
            }
        </script>
	</head>
	<body>
		<s:url id="js" action="javascript" />
		<br>
		执行客户端的JavaScript代码
		<s:div id="div1" name="div1" theme="ajax" updateFreq="2000" handler="msg"
			href="%{js}" /><br>
		<hr>
		<br>
		执行服务端返回的JavaScript代码
		<s:div id="div2" name = "div2" theme="ajax" updateFreq="2000" executeScripts="true"
			href="%{js}" />
		
	</body>
</html>
