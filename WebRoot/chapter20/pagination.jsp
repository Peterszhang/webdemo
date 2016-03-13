<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>分页</title>
	</head>
	<body>   
	   <center>
		<table border="1" width="150" style="text-align: center">
		    <thead>
			<s:iterator id="field" value="fieldList">
				
					<td>
						<s:property value="field" />
					</td>				
			</s:iterator>
			</thead>
			<s:iterator id="row" value="records">
			    <tr>				
			        <s:iterator id="field" value="fieldList">
					<td>
						<s:property value="#row[#field]"  />
					</td>
					</s:iterator>
				</tr>				 
			</s:iterator>
			
		</table> 
		<p/>
		<s:iterator id="page" value="{1,2,3,4,5}">
	        <a href="pagination.action?currentPage=<s:property value="#page"/>">
	            <s:property value="#page"/>
	        </a>&nbsp;		&nbsp;				
		</s:iterator>
	  </center>
    </body>
</html>
