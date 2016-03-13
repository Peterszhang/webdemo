package chapter20;

import hibernate.*;
import org.hibernate.*;
import java.util.*;
public class HQLWhere
{

	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		String hql = "select name from MyMessage where id > 1";
		Query query = session.createQuery(hql);
		List<String> messages = query.list();
		for (Object obj : messages)
		{
			System.out.println(obj);
		}
		hql = "select id, name from MyMessage where id > 1 and not (name like '%c%')";
		query = session.createQuery(hql);
		messages = query.list();
		for (Object obj : messages)
		{
			Object[] properties = (Object[])obj;
			System.out.print(properties[0]);
			System.out.println(properties[1]);
		
		}		
		session.close();
	}

}
