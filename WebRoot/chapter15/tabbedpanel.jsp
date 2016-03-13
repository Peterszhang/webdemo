<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>tabbedpanel标签</title>
		<s:head theme="ajax" />
		<style type="text/css">
		.div {
	       border:1px solid black; 
	       background-color:#bbbbbb;
	       width:550px;
	       padding-top:10px;
	       padding-left:10px;
	   
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

		<s:tabbedPanel  id="tab1" closeButton="tab" selectedTab="books" >
			<s:div id="city" label="城市列表" theme="ajax">
				<ul>
					<li>
						北京市
					</li>
					<li>
						上海市 
					</li>
					<li>
						沈阳市
					</li>
					<li>
						深圳市
					</li>
				</ul>
			</s:div>
			<s:div id="books" label="我最喜欢的图书" theme="ajax">
			<p/><p/><p/>
				<ul>
					<li>
						Spring2.5从入门到精通
					</li>
					<li>
						ASP.NET3.5实例精解
					</li>
					<li>
						Search.Engine.Optimizations
					</li>
					<li>
						Apache Server 2 Bible
					</li>
				</ul>
			</s:div>

		</s:tabbedPanel>
		
		<s:tabbedPanel id="tab2" closeButton="tab" doLayout="true" cssStyle="width:650px; height:260px" >
			<s:div id="city" label="动态Tab页一" theme="ajax">
			<s:form id="form">
		        <s:textfield label="您最喜欢的城市" name="city"/>
		    </s:form>
		
		
		<input type="button" value="手动更新" onclick="controller.manual()"/>&nbsp;&nbsp;
		<input type="button" value="开始自动更新" onclick="controller.start()"/>&nbsp;&nbsp;
		<input type="button" value="停止自动更新" onclick="controller.stop()"/>
		
		<p/>
		<s:url id="random"  action="city" />
		
		<s:div 
		       theme="ajax"
		       href="%{random}"
		       loadingText="正在加载服务器的内容..."		       
		       listenTopics="/manual"
		       startTimerListenTopics="/start"
		       stopTimerListenTopics="/stop"
		       updateFreq="3000"  
		       autoStart="false"
		       formId="form"
		       cssClass="div"
		       />
			</s:div>
			<s:div id="random" label="动态Tab页二" theme="ajax">
			<s:div id="div1" cssClass="div" />
			<p/>

		<s:url id="random" action="random" />

		
		
		<s:url id="random_image" value="/images/random.jpg" />
		将提交按钮改成图片，type="image"
		<p/>
		<s:submit type="image" theme="ajax" value="显示随即数" targets="div1"	
		src="%{random_image}" align="left" href="%{random}"	
			/>
			</s:div>
		<s:div id="books" label="动态Tab页三" theme="ajax" >
		
				<s:url id="books" action="books" />

        请求books.action<p/>
      
		<s:autocompleter name="book" href="%{books}" theme="ajax" 
			autoComplete="false" searchType="substring" dropdownWidth="500" />
		
		</s:div>
		</s:tabbedPanel>

	</body>
</html>
