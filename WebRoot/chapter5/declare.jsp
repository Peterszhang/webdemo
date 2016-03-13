<%@ page language="java" pageEncoding="UTF-8"%>
<%! 
    static
	{
		System.out.println("正在装载由JSP生成的Servlet！");
	}

	private int globalCount = 0;

	public void jspInit()
	{
		System.out.println("正在初始化JSP！");
	}

	public void jspDestroy()
	{
		System.out.println("JSP已经被销毁!");
	}%>
localCount：
<%
	int localCount = 0;
	out.print(++localCount);
%> 
<br> 
globalCount：<%=++globalCount%>

