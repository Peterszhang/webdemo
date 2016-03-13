package chapter4;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class ExploreResponseHeader extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		response.setHeader("Content-Length", "1234");
		response.addHeader("NewField1", "value1");
		Calendar cal = Calendar.getInstance();
		cal.set(2008, 11, 25); // 月从0 至 11，也就是说1月用0表示
		response.addDateHeader("MyDate", cal.getTimeInMillis());
		response.setIntHeader("NewField2", 3000);
	}
}
