package chapter20;

import hibernate.*;

import org.hibernate.*;

import chapter17.entity.*;

import java.util.*;

public class NativeSQL
{
	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		String sql = "select * from t_message m";
		SQLQuery sqlQuery = session.createSQLQuery(sql);		
		sqlQuery.addEntity("m", MyMessage.class);
		List<MyMessage> messages = sqlQuery.list();
		for (MyMessage message : messages)
		{
			System.out.println(message.getId() + "  " + message.getName());
		}
		sql = "select c.*, o.order_number as n from t_customers c , t_orders o where c.id = o.customer_id";
		sqlQuery = session.createSQLQuery(sql);		
		List<Object[]> result = sqlQuery.list();

		for (Object[] obj : result)
		{
			for (int i = 0; i < obj.length; i++)
				System.out.print(obj[i] + " ");
			System.out.println();
		}

		sql = "select count(*) as c from t_message";
		sqlQuery = session.createSQLQuery(sql);
		sqlQuery.addScalar("c", Hibernate.LONG);
		Long count = (Long)sqlQuery.uniqueResult();
		System.out.println(count);

		session.close();

	}

}
