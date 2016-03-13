<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
[
    <s:iterator status="status" value="cities" >
    ["<s:property/>"]
    <s:if test="#status.count < cityCount">
    ,
    </s:if>
    </s:iterator>      
] 
  
       