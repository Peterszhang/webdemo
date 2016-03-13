<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
[
    <s:iterator status="status" value="provinces" >
    ["<s:property/>"]
    <s:if test="#status.count < provinceCount">
    ,
    </s:if>
    </s:iterator>      
] 
  
       