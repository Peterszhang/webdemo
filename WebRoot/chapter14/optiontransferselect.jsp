<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>optiontransferselect标签</title>

	</head>
	<body>

    ${param.books}<br>
    ${param.selectBooks}<br>
    
	<s:set name="books"  scope="request"
	  value="#{'spring':'Spring2从入门到精通',	  
	  'ssh':'Struts、Hibernate、Spring整合实例精解', 
	  'tcpp':'Thinking in C++(2nd)', 
	  'jdbc':'Jdbc 3.0 Java Database Connectivity',
	  'struts':'Struts.The.Complete.Reference.2nd.Edition'
	  }"
	/>
	<s:form action="/chapter14/optiontransferselect.jsp">
<s:optiontransferselect label="请选择你喜欢的图书"
                        labelposition="top"
	                        name="books" 
	                        leftTitle="待选择的图书"
	                        rightTitle="喜欢的图书"
	                        list="#attr.books" 
	                        multiple="true"
	                        addToRightLabel="向右移动"
	                        addToLeftLabel="向左移动"
	                        selectAllLabel="全部选择"
	                        addAllToRightLabel="全部右移"
	                        addAllToLeftLabel="全部左移"
	                        rightDownLabel="向上"
	                        rightUpLabel="向下"
	                        leftDownLabel="向下"
	                        leftUpLabel="向上"
	                        headerKey="cnKey"
	                        headerValue="----请选择您喜欢的图书----"
	                        emptyOption="true"
	                        doubleList=""
	                        doubleName="selectBooks"
	                        doubleHeaderKey="enKey"
	                        doubleHeaderValue="----喜欢的图书----"
	                        doubleEmptyOption="true"
	                        doubleMultiple="true"
	                        />
        <s:submit  value = "提交"/>
	</s:form>
	</body>
</html>
