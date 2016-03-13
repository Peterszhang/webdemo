package chapter4;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewDictionary extends HttpServlet
{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try
		{
			javax.naming.Context ctx = new javax.naming.InitialContext();
			// 根据webdb数据源获得DataSource对象
			javax.sql.DataSource ds = (javax.sql.DataSource) ctx
					.lookup("java:/comp/env/jdbc/webdb");
			Connection conn = ds.getConnection();
			// 执行SQL语句
			PreparedStatement pstmt = conn
					.prepareStatement("SELECT * FROM t_dictionary");
			ResultSet rs = pstmt.executeQuery();
			StringBuilder table = new StringBuilder();
			table.append("<table border='1'>");
			table.append("<tr><td>书名</td><td>价格</td></tr>");
			while (rs.next()) // 生成查询结果
			{
				table.append("<tr><td>" + rs.getString("english") + "</td><td>");
				table.append(rs.getString("chinese") + "</td></tr>");
			}
			table.append("</table>");
			out.println(table.toString()); // 输出查询结果

			pstmt.close();  // 关闭PreparedStatement对象
		}
		catch (Exception e)
		{
			out.println(e.getMessage());
		}
	}

}
