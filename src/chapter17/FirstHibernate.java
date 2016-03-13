package chapter17;

import org.hibernate.*;
import hibernate.*;
import chapter17.entity.*;

public class FirstHibernate
{
	public static void main(String[] args) throws Exception
	{
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = null;
		java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
		java.io.BufferedReader br = new java.io.BufferedReader(isr);
		String s = "";
		System.out.print("请输入id和name（以逗号分隔,输入q退出程序）：");
		while (!(s = br.readLine()).trim().equals(""))
		{
			if (s.equalsIgnoreCase("q"))
				break;
			String[] input = s.split(",");  // 分隔字符串
			if (input.length > 1)
			{
				try
				{
					int id = Integer.parseInt(input[0]);
					String name = input[1];
					MyMessage message = new MyMessage();
					message.setId(id);
					message.setName(name);
					try
					{
						tx = session.beginTransaction();  // 开始事务
						session.save(message);  // 保存数据
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
			}
			System.out.print("请输入id和name（以逗号分隔,输入q退出程序）：");
		}
		session.close();  // 关闭Session对象
	}
}
