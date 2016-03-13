package chapter6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.sql.*;

public class Login extends DBServlet
{

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		//  如果存在register请求参数，重定向到register.jsp页面
		if (request.getParameter("register") != null)
		{
			response.sendRedirect("register.jsp");
			return;
		}
		String page = "login.jsp";
		String userName = "";
		try
		{			
			super.service(request, response);
			userName = request.getParameter("username");		
			String password = request.getParameter("password");
			String validationCode = request.getParameter("validation_code");
			if (userName == null || password == null || validationCode == null)
				return;
			if (userName.equals("") || password.equals("") || validationCode.equals(""))
				return;
			// 进行了编码转换，以便支持中文用户名
			userName = new String(userName.getBytes("ISO-8859-1"), "UTF-8");
			// 核对验证码
			if(!checkValidationCode(request, validationCode))
			{
				return;
			}	 			
			String sql = "select user_name, password_md5 from t_users where user_name = ?";
			// 查询登录用户是否存在
			ResultSet rs = execSQL(sql, new Object[] { userName });
			if (rs.next() == false)
			{
				//  设置用于在login.jsp中显示的用户名错误信息
				request.setAttribute("userError", userName + "不存在");
			}
			else
			{
				//  得到登录用户的MD5加密字符串
				String passwordMD5 = common.Encrypter.md5Encrypt(password);
				if(!rs.getString("password_md5").equals(passwordMD5))
				{
				//  设置用于在login.jsp中显示的密码错误信息
					request.setAttribute("passwordError", "密码不正确");
				}
				else
				{
					//  登录成功，设置要转发的页面
					page = "/WEB-INF/chapter6/main.jsp";
				}
			}

		}
		catch (Exception e)
		{
			
		}
		finally		
		{
			// 将用户名只在在request中
			request.setAttribute("username", userName);			
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);//  转发相应的页面（默认是login.jsp）
		}
	}
}
