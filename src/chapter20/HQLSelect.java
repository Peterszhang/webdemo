package chapter20;
import hibernate.*;

import org.hibernate.*;

import chapter17.entity.*;

import java.util.*;
public class HQLSelect
{

	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		String hql = "select name from MyMessage";
		Query query = session.createQuery(hql);
		List<String> messages = query.list();
	    for(String name: messages)
	    {
	    	System.out.println(name);
	    }

		hql = "select id,name from MyMessage";
		query = session.createQuery(hql);
		messages = query.list();
	    for(Object obj: messages)
	    {
	    	Object[] properties = (Object[])obj;
	    	System.out.println(properties[0] + " " + properties[1]);
	    }
		session.close();

	}

}
