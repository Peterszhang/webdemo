<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<script src="../javascript/prototype.js" type="text/javascript">
</script>
<link type="text/css" rel="stylesheet" href="../css/style.css" />
<s:head theme="ajax"/>
<script language="JavaScript">
    function jsonClick(data, type, request)
    {

        //  定义要请求的Action
        var url = 'firsthibernate.action';
        //  将form1表单域的值转换成请求参数
        var params = Form.serialize('form1');
        //  创建一个Ajax.Request对象来发送请求
        var myAjax = new Ajax.Request(
        url,
        {
            //  指定请求方法为POST
            method:'post',
            //  指定请求参数
            parameters:params, 
            //  指定回调函数
            onComplete: processResponse,
            //  指定通过异步方式发出请求和接收响应信息 
            asynchronous:true
        });
        
    }
    //  该方法为异步处理响应信息的函数
    function processResponse(request)
    {
       var obj = request.responseText.evalJSON();       
       alert(obj.result);      
    }   
    dojo.event.topic.subscribe("/hibernate", jsonClick);
	     
</script>
<html>
    <head>
        <title>第一个Struts 2和Hibernate整合的程序</title>
    </head>
    <body>
    <center>
    <s:label>向t_message表添加记录</s:label>
        <s:form id="form1" name="form1" >
            <s:textfield label="id" id="id" name="id" />
            <s:textfield label="name" id="name" name="name" />                        
        </s:form>
        <s:submit value="提交" align="center"   theme="ajax" notifyTopics="/hibernate"  />


        </center>
    </body>
</html>
