<%@ page import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="true">
当test为true是输出标签体
</c:if>
<br>
<c:set var="hour"
	value="<%=Calendar.getInstance().get(Calendar.HOUR_OF_DAY)%>" />

<c:if test="${hour < 12}">  上午好 </c:if>
<c:if test="${hour >= 12}"> 下午好 </c:if>
<br>
<c:choose>
	<c:when test="${param.grade >= 90 && param.grade <= 100}">优秀</c:when>
	<c:when test="${param.grade >= 80 && param.grade < 90}">良好</c:when>
	<c:when test="${param.grade >= 70 && param.grade < 80}">中等</c:when>
	<c:when test="${param.grade >= 60 && param.grade < 70}">及格</c:when>
	<c:otherwise>不及格</c:otherwise>
</c:choose>