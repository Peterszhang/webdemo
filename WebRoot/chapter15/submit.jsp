<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>submit标签</title>
		<s:head theme="ajax" />
		<style type="text/css">
.div_style {
	border: 1px solid black;
	background-color: #bbbbbb;
	width: 500px;
	padding-top: 10px;
	padding-left: 10px;
	padding-bottom: 10px;
}
</style>
		<script type="text/javascript">
        function myEvent(data, type, request)
        {
            alert("发布事件，类型：" + type);
            if(prevent.checked)
                request.cancel = true;
        }
        dojo.event.topic.subscribe("/event", myEvent);
    
    </script>
	</head>
	<body>
		<s:div id="div1" cssClass="div_style" />

		<s:url id="random" action="random" />

		
		<s:url id="image" value="/images/indicator.gif" />
		<s:url id="random_image" value="/images/random.jpg" />
		<img id="indicator" src="<s:property value='image'/>"
			style="display: none;" />
		<p />
		通过简单提交请求random.action，指定了indicator属性
			<s:submit theme="ajax" value="显示随机数" targets="div1" href="%{random}"
				align="left" indicator="indicator" />
		<hr>
		通过pub-sub事件模型请求random.action，notifyTopics="/event"
		<s:submit theme="ajax" value="显示随机数（发布事件）" targets="div1"
			href="%{random}" align="left" indicator="indicator"
			notifyTopics="/event" />
		<br>
		是否阻止请求
		<input type="checkbox" name="prevent" />
		
			<hr>
		将提交按钮改成图片，type="image"
		<s:submit type="image" theme="ajax" value="显示随即数" targets="div1"	
		src="%{random_image}" indicator="indicator" align="left" href="%{random}"	
			/>
		<hr>
		提交表单
	    <s:form id="form" action="city">
	        <s:textfield label="请输入您喜欢的城市" name="city" />
		    
		</s:form>	
		<s:submit  theme="ajax" align="left" formId="form" value="提交" targets="div1"/>		
		提交表单
	    <s:form id="form1" action="pkquery1" namespace="/chapter19" >
	        <s:textfield label="请输入您喜欢的城市" name="id" />
		    
		</s:form>	
		<s:submit  theme="ajax" align="left" formId="form1"  value="提交" targets="div1"/>

	</body>
</html> 
