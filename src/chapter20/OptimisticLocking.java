package chapter20;

import hibernate.*;

import org.hibernate.*;

import chapter21.entity.*;

public class OptimisticLocking
{
	public static void main(String[] args) throws Exception
	{
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from MyMessageLock where id = 1");
		MyMessageLock message = (MyMessageLock) query.uniqueResult();
		if (message != null)
		{
			message.setName("message1");
			session.saveOrUpdate(message);
		}
		System.in.read();
		tx.commit();
		session.close();

	}
}
