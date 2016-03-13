<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>pub-sub事件模型</title>
		<s:head theme="ajax" />
	</head>
	<body>
		<script type="text/javascript">
		
		function subscribe1(data, type, request)
		{
		    alert("数据（subscribe1）：" + data);
		}
		function subscribe2(data, type, request)
		{
		    alert("数据（subscribe2）：" + data);
		}
			   
	    
	    function publishEvent()
	    {
	       dojo.event.topic.publish('abcd',data.value); 
	    }
	    
	     dojo.event.topic.subscribe("abcd", subscribe1);
	     dojo.event.topic.subscribe("abcd", subscribe2);
	     dojo.event.topic.subscribe("/pubsub", subscribe1);
	    
	
	</script>
					
			<p/><s:submit theme="ajax" align="left" value="发布事件" notifyTopics="/pubsub"  name="ajaxSubmit"  /><p/>
	
		随机数：<s:div name="myDiv" theme="ajax" listenTopics="/pubsub"  href="pubsub.action" />

	</body>
</html>
