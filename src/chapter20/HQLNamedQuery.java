package chapter20;

import hibernate.*;
import org.hibernate.*;
import java.util.*;

public class HQLNamedQuery
{
	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		Query query = session.getNamedQuery("myhql");
		query.setString("name", "bike");
		List<String> messages = query.list();
		for (String name : messages)
		{
			System.out.println(name);
		}

		query = session.getNamedQuery("mysql");
		query.setString("name", "car");
		messages = query.list();
		for (String name : messages)
		{
			System.out.println(name);
		}		
		session.close();
	}

}
