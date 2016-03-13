package chapter20;

import hibernate.*;
import org.hibernate.*;
import org.hibernate.criterion.*;
import chapter19.entity.Order;
import java.util.*;

public class Associations
{
	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		Criteria crit1 = session.createCriteria(Order.class);
		Criteria crit2 = crit1.createCriteria("customer");
		crit1.add(Restrictions.ne("number", "2008012402"));
		crit2.add(Restrictions.eq("name", "bea"));
		crit2.addOrder(org.hibernate.criterion.Order.desc("name"));
		List<Order> orders = crit1.list();
		for (Order order : orders)
		{
			System.out.print(order.getNumber() + "  " + order.getCustomer().getName());
			System.out.println();
		}
		session.close();
	}

}
