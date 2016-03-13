<%@ page buffer="1kb" import="java.io.*" contentType="text/html"
	pageEncoding="UTF-8"%>

<%
	out.clear();
	int count = Integer.parseInt(request.getParameter("count"));
	for (int i = 0; i < count; i++)
	{
		out.write("1");

	}
	PrintWriter servletOut = pageContext.getResponse().getWriter();
	servletOut.write("使用PrintWriter对象输出数据!");
%>
