package chapter6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends DBServlet
{
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String userName = null;	
		//  下面的语句必须放在try{...}前面，否则会调用finally中的forward,
		//  在调用sendRedirect方法后，不能再调用forward方法
		if(request.getParameter("login") != null)
		{
			response.sendRedirect("login.jsp");//  重定向到login.jsp
			return;
		}
		try
		{
			super.service(request, response);//  调用DBServlet的service方法
			userName = request.getParameter("username");//  获得username
			String password = request.getParameter("password");//  获得password
			String email = request.getParameter("email");//  获得email
			//  获得验证码
			String validationCode = request.getParameter("validation_code");
			// 用户名和密码不能为null
			if(userName == null || password == null || validationCode == null) return;
			// 用户名和密码必须输入
			if(userName.equals("") || password.equals("") || validationCode.equals("")) return;
			//  进行编码转换，以支持中文用户名
			userName = new String(userName.getBytes("ISO-8859-1"), "UTF-8");
			
			//  在result.jsp中要跳转到register.jsp页
			request.setAttribute("page", "register.jsp");
			//  核对验证码
			if(!checkValidationCode(request, validationCode))
			{
				return;
			}			
			
			email = (email == null)?"":email;// 将空值的email赋为空串
			
			// 用MD5算法对密码字符串加密
			String passwordMD5 = common.Encrypter.md5Encrypt(password);
			
			//  定义插入记录的SQL语句
			String sql = "insert into t_users(user_name, password_md5, email) values(?, ?, ?)";
			//  执行SQL语句
			execSQL(sql, userName, passwordMD5, email);			
			request.setAttribute("info", "用户注册成功!");//  定义result.jsp中使用的消息
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			request.setAttribute("info", userName + "已经被使用!");
		}
		finally
		{
			//  转发到result.jsp
			RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
		}
	}
}
