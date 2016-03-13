package chapter20;

import hibernate.*;
import org.hibernate.*;
import chapter17.entity.*;
import java.util.*;

public class FirstHQL
{
	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		String hql = "from MyMessage";
		Query query = session.createQuery(hql);
		
		List<MyMessage> messages = query.list();
		for (MyMessage message : messages)
		{
			System.out.print(message.getId() + "  " + message.getName());
			System.out.println();
		}
		session.close();
	}
}
