package chapter21;

import hibernate.*;

import org.hibernate.*;

import chapter17.entity.*;

import java.util.*;

public class TestFilter
{
	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		for (int i = 0; i < 5; i++)
		{
			MyMessage message = new MyMessage();
			message.setId(new Random().nextInt(100000));
			message.setName("bill gates");
			session.saveOrUpdate(message); 
		}
		tx.commit();
		Filter filter = session.enableFilter("myFilter");
		filter.setParameter("maxId", 50000);
		Query query = session.createQuery("from MyMessage");
		List<MyMessage> messages = query.list();
		for (MyMessage message : messages)
			System.out.println(message.getId());
		session.close();
	}

}
