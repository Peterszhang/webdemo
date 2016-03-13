<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>tree标签</title>
		<s:head theme="ajax" />

	</head>
	<body>

    	使用s:tree和s:treenode标签生成静态树<p/>
		<s:tree label="省市列表" theme="ajax" showRootGrid="true"  showGrid="true">
			<s:treenode label="辽宁省" theme="ajax">
				<s:treenode label="沈阳市" theme="ajax" />
				<s:treenode label="大连市"  theme="ajax"/>
				<s:treenode label="本溪市"  theme="ajax"/>
				<s:treenode label="抚顺市"  theme="ajax"/>
			</s:treenode>
			<s:treenode label="黑龙江省" theme="ajax">
				<s:treenode  label="哈尔滨市" theme="ajax" />
				<s:treenode label="齐齐哈尔市"  theme="ajax"/>
				<s:treenode label="大庆市"  theme="ajax"/>
			</s:treenode> 
		    <s:treenode label="广东省" theme="ajax">
				<s:treenode  label="深圳市" theme="ajax" />
				<s:treenode label="珠海市"  theme="ajax"/>
				<s:treenode label="江门市"  theme="ajax"/>
			</s:treenode> 
		</s:tree>
		
	</body>
</html>
