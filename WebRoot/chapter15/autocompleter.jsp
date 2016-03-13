<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<head>
		<title>autocompleter标签</title>
		<s:head theme="ajax" />
        <style type="text/css">
            input {
	            width:400px
            }
        </style>
	</head>
	<body>
		<s:url id="books" action="books" />

        请求books.action<br>
       不使用自动完成功能(autocomplete="false")<br>
       使用子串匹配模式(searchType="substring")<br>		
		<s:autocompleter name="book" href="%{books}" theme="ajax" 
			autoComplete="false" searchType="substring" />
		<hr>
		不显示下拉箭头(showDownArrow="false")<br>
		使用自动完成功能(autoComplete="true")<br>
		<s:autocompleter name="book" href="%{books}" theme="ajax" 
			showDownArrow="false" 
			autoComplete="true"  searchType="substring" />
		<hr>
		theme="simple"<br>
		使用list属性设置列表框集合<br>
		<s:autocompleter name="book" list="{'C++网络基础', 'Thinking in java 4th'}" theme="simple" 		
			autoComplete="true" />
		<hr>
		使用startword搜索模式(searchType="startword")<br>
		强迫必须输入下拉列表框项(forceValidOption="true")<br>
		在用户输入时，重新加载下拉列表(loadOnTextChange="true")<br>
		<s:autocompleter name="book" href="%{books}" theme="ajax" 
			 searchType="startword"
			autoComplete="true"  forceValidOption="true" loadOnTextChange="true" />
		<hr>
		禁止下拉列表框(disabled="true")<br>
		<s:autocompleter name="book" href="%{books}" theme="ajax" 
			 disabled="true"
			/>
		<hr>
		设置下拉列表框的宽度和高度<br>
	
		
		<s:autocompleter name="book" href="%{books}" theme="ajax" 			
			autoComplete="true"  dropdownWidth="600"  dropdownHeight="200"/>
	</body>
</html>
