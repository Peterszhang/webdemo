package chapter20;

import hibernate.*;
import org.hibernate.*;
import chapter17.entity.*;
import java.util.*;

public class Pagination
{
	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		Criteria crit = session.createCriteria(MyMessage.class);
        crit.setFirstResult(1);
        crit.setMaxResults(2);
        
		List<MyMessage> messages = crit.list();
		for (MyMessage message : messages)
		{
			System.out.print(message.getId() + "  " + message.getName());
			System.out.println();
		}
		session.close();
	}

}
