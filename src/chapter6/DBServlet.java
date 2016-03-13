package chapter6;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class DBServlet extends HttpServlet
{
	//  用于连接数据库的Connection对象
	protected java.sql.Connection conn = null;

	//  执行各种SQL语句的方法
	protected java.sql.ResultSet execSQL(String sql, Object... args)
			throws Exception
	{
		//  建立PreparedStatement对象
		java.sql.PreparedStatement pStmt = conn.prepareStatement(sql);
		//  为pStmt对象设置SQL参数值
		for (int i = 0; i < args.length; i++)
		{
			pStmt.setObject(i + 1, args[i]);
		}
	
		pStmt.execute();//  执行SQL语句
		return pStmt.getResultSet();  // 返回结果集，如果执行的SQL语句不返回结果集，则返回null
	}
    //  核对用户输入的验证码是否合法
	protected boolean checkValidationCode(HttpServletRequest request, String validationCode)
	{
		//  从HttpSession对象中获得系统随机生成的验证码
		String validationCodeSession = (String)request.getSession().getAttribute("validation_code");
		
		//  如果获得的验证码为null，说明验证码过期，用户必须刷新客户端页面，以重新获得新的验证码
		if(validationCodeSession == null)
		{			
			request.setAttribute("info", "验证码过期");//  设置result.jsp需要的结果信息
			request.setAttribute("codeError", "验证码过期");//  设置login.jsp需要我错误信息	
			return false;
		}
		//  将用户输入的验证码和系统随机生成的验证码进行比较
		if(!validationCode.equalsIgnoreCase(validationCodeSession))
		{
			request.setAttribute("info", "验证码不正确");//  设置result.jsp需要的结果信息
			request.setAttribute("codeError", "验证码不正确");//  设置login.jsp需要我错误信息
			return false;
		}
		return true;
	}
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			//  如果conn为null，打开数据库连接
			if (conn == null)
			{
				javax.naming.Context ctx = new javax.naming.InitialContext();
				// 获取数据源
				javax.sql.DataSource ds = (javax.sql.DataSource) ctx
						.lookup("java:/comp/env/jdbc/webdb");
				conn = ds.getConnection(); // 创建一个Connection对象
			}
		}
		catch (Exception e)
		{
		}
	}

	@Override
	public void destroy()
	{
		try
		{
			//  如果数据库连接正常打开，关闭它
			if (conn != null)
				conn.close();
		}
		catch (Exception e)
		{

		}
	}

}
