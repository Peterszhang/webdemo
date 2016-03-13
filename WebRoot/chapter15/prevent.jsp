<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>阻止请求</title>
		<s:head theme="ajax" />
	</head>
	<body>
		<script type="text/javascript">
		
		function subscribe(data, type, request)
		{
		    alert(type);
		    if(prevent.checked)
		        request.cancel = true;
		}

	     dojo.event.topic.subscribe("abcd", subscribe);
	
	</script>
		<s:url id="action" action="ajaxAction" />
		<s:checkbox name="prevent" label="是否阻止请求"    />
        <p/>
        <s:submit align="left" name="ajax" value="提交" theme="ajax" notifyTopics="abcd" href="%{action}" />
	</body>
</html>
