package chapter21;

import hibernate.*;
import org.hibernate.*;
import chapter17.entity.*;
import chapter19.entity.*;
import java.util.*;
import chapter21.interceptor.*;

public class TestInterceptor
{
	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory
				.getSession(new EntityBeanInterceptor());
		Transaction tx = session.beginTransaction();
		Customer customer = new Customer();
		customer.setName("Bea");
		Order order = new Order();
		order.setNumber("2008012401");
		order.setCustomer(customer);
		session.save(order);

		MyMessage message = new MyMessage();
		message.setId(new Random().nextInt(100000));
		message.setName("bill");
		session.saveOrUpdate(message);
		tx.commit();
		session.close();
	}
}
