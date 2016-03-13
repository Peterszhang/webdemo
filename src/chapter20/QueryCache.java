package chapter20;

import hibernate.*;
import org.hibernate.*;
import chapter19.entity.*;
import java.util.*;
public class QueryCache
{

	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		String hql = "from Person where id = :id";
		for (int i = 0; i < 3; i++)  // 共查询三次
		{
			Query query = session.createQuery(hql).setInteger("id", 1);
			query.setCacheable(true);
			List<Person> persons = query.list();
			for (Person person : persons)
			{
				System.out.println(person.getName());
			}
		}
		session.close();
	}

}
