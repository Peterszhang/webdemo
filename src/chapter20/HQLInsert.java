package chapter20;
import hibernate.*;

import org.hibernate.*;
public class HQLInsert
{

	public static void main(String[] args)
	{
    	Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		String hqlDelete = "delete MyMessage where id=20";
		Query query = session.createQuery(hqlDelete);
		query.executeUpdate();
		String hql = "insert into MyMessage(id,name) select 20, name from MyMessage where id = 1";
		query = session.createQuery(hql);	
		int count = query.executeUpdate();	
		tx.commit();			
		System.out.println(count);		

		session.close();

	}

}
