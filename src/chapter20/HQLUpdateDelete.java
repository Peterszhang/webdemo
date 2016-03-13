package chapter20;
import hibernate.*;

import org.hibernate.*;

import chapter19.entity.*;

import java.util.*;
public class HQLUpdateDelete
{

	public static void main(String[] args)
	{
		chapter19.OneToMany.main(args);
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		String hql = "update Customer set name = 'sun' where name='bea'";
		Query query = session.createQuery(hql);	
		int count = query.executeUpdate();	
		tx.commit();			
		System.out.println(count);		
		hql = "delete from Customer where name='sun'";
		tx = session.beginTransaction();
		query = session.createQuery(hql);	
		count = query.executeUpdate();	
		tx.commit();
		System.out.println(count);
		session.close();
	}
}
