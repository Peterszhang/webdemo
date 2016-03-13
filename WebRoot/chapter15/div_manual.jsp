<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>手动控制div标签</title>
		<style type="text/css">
		div {
	       border:1px solid black; 
	       background-color:#bbbbbb;
	       width:550px;
	       padding-top:10px;
	       padding-left:10px;
	   
	       padding-bottom: 10px;
       }
       </style>
		<s:head theme="ajax" />
		
		<script type="text/javascript">
		    var controller= {
				manual: function(){alert("手动更新");},
				start: function(){alert("启动自动更新");},
				stop: function(){alert("停止自动更新");}
					    
		    }

            dojo.event.topic.registerPublisher("/manual",controller, "manual");
            dojo.event.topic.registerPublisher("/start", controller, "start");
            dojo.event.topic.registerPublisher("/stop", controller, "stop");
            
        </script>
	</head>
	<body>
		<s:form id="form">
		    <s:textfield label="您最喜欢的城市" name="city"/>
		</s:form>
		
		
		<input type="button" value="手动更新" onclick="controller.manual()"/>&nbsp;&nbsp;
		<input type="button" value="开始自动更新" onclick="controller.start()"/>&nbsp;&nbsp;
		<input type="button" value="停止自动更新" onclick="controller.stop()"/>
		
		<p/>
		<s:url id="random"  action="city" />
		
		<s:div id="div1"
		       theme="ajax"
		       href="%{random}"
		       loadingText="正在加载服务器的内容..."		       
		       listenTopics="/manual"
		       startTimerListenTopics="/start"
		       stopTimerListenTopics="/stop"
		       updateFreq="3000"  
		       autoStart="false"
		       formId="form"
		       />
		 
		
		
	</body>
</html>
