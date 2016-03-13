package chapter10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

public class Register extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		//  设置Content-Type字段值
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try
		{
            // 获得四个请求参数值
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			String strAge = request.getParameter("age");
			String strBirthday = request.getParameter("birthday");
            //  对age请求参数值进行类型转换
			int age = Integer.parseInt(strAge);
            //  定义格式化日期的类
			java.text.SimpleDateFormat format = new java.text.SimpleDateFormat(
					"yyyy-MM-DD");
			//  对birthday请求参数值进行类型转换
			Date birthday = format.parse(strBirthday);
			
			UserBean user = new UserBean();//  建立UserBean对象实例
			//  为UserBean对象实例的属性赋值
			user.setName(name);
			user.setPassword(password);
			user.setAge(age);
			user.setBirthday(birthday);
			
            //  定义要输出到客户端的HTML代码    
			String html = "";
			html += "<h2>输出UserBean的属性值</h2>";
			html += "<b>";
			html += user.getName() + "<p/>";
			html += user.getPassword() + "<p/>";
			html += user.getAge() + "<p/>";
			html += user.getBirthday() + "<p/>";
			html += "<b/>";
			out.println(html);
		}
		catch (Exception e)
		{
			out.println(e.getMessage());
		}

	}

}
