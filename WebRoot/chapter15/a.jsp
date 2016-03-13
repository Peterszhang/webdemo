<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
	<head>
		<title>a标签</title>
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
		<p/>
        <s:div id="div2" cssClass="div_style" />
		<s:url id="random" action="random" />
		
		<s:url id="javascript" action="javascript" />
		<s:url id="image" value="/images/indicator.gif" />
		
<img id="indicator" src="<s:property value='image'/>"
			style="display: none;" />

			<img id="loadingImage" src="images/loadingAnimation.gif" style="display:none"/>
			<p/>
<sx:a href="%{random}" indicator="indicator" targets="div1,div2">
 
	同时更新div1和div2
   </sx:a>
   <p/>   
   <sx:a href="%{random}"
         indicator="indicator"
         notifyTopics="/event"
         targets="div1,div2">
        同时更新div1和div2（使用Dojo事件模型）
   </sx:a> 
    <p/>    
   <sx:a href="%{random}"
         indicator="indicator"
         loadingText="正在加载数据..."
         notifyTopics="/event"
         targets="div1,div2">
        同时更新div1和div2（loadingText="正在加载数据..."）
   </sx:a>
       <p/>    
   <sx:a href="%{javascript}"
         indicator="indicator"
         loadingText="正在加载数据..."
         notifyTopics="/event"
         executeScripts="true"
         targets="div1,div2">
        同时更新div1和div2（executeScripts="true"）
   </sx:a>
   <p/>
   提交表单
   <s:form id="form" action="city">
	     <s:textfield label="请输入您喜欢的城市" name="city" />		    
	</s:form>	
    <sx:a 
         indicator="indicator"
         loadingText="正在加载数据..."
         formId="form"
         targets="div1,div2">
        提交表单（formId="form"）
   </sx:a>
	</body>
</html>
