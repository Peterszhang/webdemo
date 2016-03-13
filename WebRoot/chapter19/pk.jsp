<%@ page pageEncoding="UTF-8"%>

<html>
	<head>
		<title>主键与复合主键</title>
				<style type="text/css">
.div {
	border: 1px solid black;
	background-color: #bbbbbb;
	width: 500px;
	padding-top: 10px;
	padding-left: 10px;
	padding-bottom: 10px;
}
</style>
<script src="../javascript/prototype.js" type="text/javascript">
</script>
<script language="JavaScript">
    function jsonClick(data, method)
    {
        //  定义要请求的Action
        var url = 'pk!' + method + '.action';
     
        //  将表单域的值转换成请求参数
        var params = Form.serialize(data);
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
        //  下面的代码分别取出转换后对象中的属性值，并赋给相应的HTML元素
        $("div").innerHTML = $("div").innerHTML + obj.result + "<br>" ;
        
    }    
</script>
	</head>
	<body>
	        <div id="div" class="div" ></div><p/>    
        第一个信息采集区，用于采集用于查询的id主键值<br>
        <div id="data1">
            id:&nbsp;&nbsp;<input type="text" name="id" />
        </div><p/>
        <input type="button" value="查询" onclick="jsonClick('data1', 'querypk')" />
        <hr>
        第二个信息采集区，用于采集用于更新的id主键值和name属性值<br>
        <div id="data2">
            id:&nbsp;&nbsp;<input type="text" name="id" />
            name:&nbsp;&nbsp;<input type="text" name="name"/>
        </div>
        <p/>
        <input type="button" value="更新" onclick="jsonClick('data2', 'updatepk')" />
        <hr>
        第三个信息采集区，用于采集用于查询的复合主键值key1和key2的值<br>
        <div id="data3">
            key1:&nbsp;&nbsp;<input type="text" name="key1" />
            key2:&nbsp;&nbsp;<input type="text" name="key2"/>
        </div>   
        <p/> 
        <input type="button" value="查询" onclick="jsonClick('data3', 'queryCompositePK')" />
        <hr>
        第四个信息采集区，用于采集用于更新的复合主键值key1和key2的值，以及data属性值<br>
        <div id="data4">
            key1:&nbsp;&nbsp;<input type="text" name="key1" />
            key2:&nbsp;&nbsp;<input type="text" name="key2"/><p/>
            data:&nbsp;&nbsp;<input type="text" name="data"/>
        </div>   
        <p/> 
        <input type="button" value="更新" onclick="jsonClick('data4', 'updateCompositePK')" />
    </body>
</html>
