<%@ page contentType="text/html; charset=UTF-8"%>
全局初始化参数值：
<%= application.getInitParameter("globalArg") %>
<br>
testApplication.jsp的绝对路径：
<%= application.getRealPath("testApplicaiton.jsp") %>
<br>
Servlet引擎的版本号:
<%= application.getMajorVersion() + "." + application.getMinorVersion() %>
<br>
Web工程路径：
<%= application.getContextPath() %>

