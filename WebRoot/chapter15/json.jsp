<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<script src="../javascript/prototype.js" type="text/javascript">
</script>
<script language="JavaScript">
    function jsonClick()
    {
        //  定义要请求的Action  
        var url = 'MyJSON.action';
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
        //  将返回的JSON格式信息显示在页面上
        $("response").innerHTML = request.responseText;
        //  将返回的JSON格式的信息转换成JavaScript对象
        var obj = request.responseText.evalJSON();
        //  下面的代码分别取出转换后对象中的属性值，并赋给相应的HTML元素
        $("sum").innerHTML = "<font color='red'>" + obj.sum + "</font>";
        $("cities").innerHTML = "<font color='red'>" + obj.cities + "</font>";
        $("ln").innerHTML = "<font color='red'>" + obj.myProvinces['辽宁'] + "</font>";
        $("hlj").innerHTML = "<font color='red'>" + obj.myProvinces['黑龙江'] + "</font>";
        $("gd").innerHTML = "<font color='red'>" + obj.myProvinces['广东'] + "</font>";
    }    
</script>
<html>
    <head>
        <title>JSON插件测试</title>
    </head>
    <body>
        <form id="form1" name="form1" method="post">
            操作数1：<input TYPE="text" name="num1" id="num1" style="width: 50px" />&nbsp;+&nbsp;
            操作数2：<input TYPE="text" name="num2" id="num2" style="width:50px" />&nbsp;=
            <label id="sum"></label>
            <p/>
            请输入省名：
            <input TYPE="text" name="province" id="province" style="width:100px" />&nbsp;&nbsp;&nbsp;
            <label id="cities"></label>
            <p/>
            辽宁：<label id="ln"></label><br>
            黑龙江：<label id="hlj"></label><br>
            广东：<label id="gd"></label>
            <p/>
            <input TYPE="button" value="提交" onClick="jsonClick();" />
        </form>
        <!--  该标签用于显示JSON格式的响应信息  -->
        <label id="response">
        </label>
    </body>
</html>
