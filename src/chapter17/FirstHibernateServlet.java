package chapter17;

import hibernate.HibernateSessionFactory;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import chapter17.entity.MyMessage;

public class FirstHibernateServlet extends HttpServlet
{

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = null;
		java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
		java.io.BufferedReader br = new java.io.BufferedReader(isr);
		String s = "";

		try
		{
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			MyMessage message = new MyMessage();
			message.setId(id);
			message.setName(name);
			try
			{
				tx = session.beginTransaction(); // 开始事务
				session.save(message); // 保存数据
				tx.commit();
				System.out.println("插入成功!");
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

		session.close(); // 关闭Session对象
	}

}
