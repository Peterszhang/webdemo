<jsp:include page="/chapter5/processParam.jsp?id=1234&age=30">
	<jsp:param name="name" value="bill" />
	<jsp:param name="age" value="35" />
	<jsp:param name="salary" value="<%=3000 / 1.2%>" />
</jsp:include>
