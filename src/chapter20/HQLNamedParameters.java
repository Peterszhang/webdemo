package chapter20;

import hibernate.*;
import org.hibernate.*;
import chapter17.entity.*;
import chapter19.entity.*;
import java.util.*;

public class HQLNamedParameters
{

	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		String hql = "from MyMessage where id > :id";
		Query query = session.createQuery(hql);
		query.setInteger("id", 1);
		List<MyMessage> messages = query.list();
		for (MyMessage message : messages)
		{
			System.out.print(message.getId() + "  " + message.getName());
			System.out.println();
		}

		Address address = new Address();
		address.setId(1);
		hql = "from Employee e where e.address = :address";
		query = session.createQuery(hql);
		query.setEntity("address", address);
		Object obj = query.uniqueResult();
		if (obj != null)
		{
			Employee employee = (Employee) obj;
			System.out.println(employee.getName());
		}
		session.close();
	}
}
