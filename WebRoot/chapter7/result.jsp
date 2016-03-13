<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
  <html>
    <head>
      <title>查询结果</title>
    </head>
    
    <body>
        
    使用Java代码获得查询结果<br/>
     <table border="1">
     	<tr>
     		<td>书名</td>
     		<td>价格</td>
        </tr>
        <% 
        
            Map<String, Integer> result =(Map<String, Integer>) request.getAttribute("result");
            
            for(Map.Entry<String, Integer> entry: result.entrySet())
            {
        %> 
        <tr><td>
        <%= entry.getKey() %>
        </td><td>
        <%= entry.getValue() %>
        </td>
        </tr>
        <%}%>     

     </table>  
     <p/>   
          使用JSP标签获得查询结果<br/>
          <table border="1">
     	<tr>
     		<td>书名</td>
     		<td>价格</td>
        </tr>
        <c:forEach var="entry" items="${result}">
        <tr><td>
         ${entry.key}
        </td><td>
       ${entry.value}
        </td>
        </tr>
        </c:forEach>  
     
     </table>
     <p/>
          使用Struts2标签获得查询结果<br/>
          <table border="1">
     	<tr>
     		<td>书名</td>
     		<td>价格</td>
        </tr>
 
        <s:iterator value="result" >
        <tr><td>
        <s:property value="key" />

        </td><td>
   <s:property value="value" />
        </td>
        </tr>
        </s:iterator>  
     
     </table>
     
    </body>
  </html> 