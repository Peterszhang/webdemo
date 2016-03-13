<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
	<body>
	<form name = "form" action="${requestScope.page}" method="post"/>
	<script type="text/javascript">
	<c:if test="${requestScope.info != null}">
	
	    
	   alert('${requestScope.info}');
       form.submit();
	
	</c:if>

	</script>
	
	</body>
</html>
