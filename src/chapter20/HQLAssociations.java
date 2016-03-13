package chapter20;

import hibernate.*;

import org.hibernate.*;

import chapter19.entity.*;

import java.util.*;

public class HQLAssociations
{
	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		String hql = "select c.id, c.name, o.number from Customer c inner join c.orders as o";
		Query query = session.createQuery(hql);
		List<Object[]> result = query.list();
		for (Object[] row : result)
		{
			for (int i = 0; i < row.length; i++)
				System.out.print(row[i] + "  ");
			System.out.println();
		}
		System.out.println("--------------------------------");
        hql = "from Customer c inner join c.orders as o";
		query = session.createQuery(hql);
		result = query.list();
		for (Object[] obj : result)
		{
			Customer customer = (Customer)obj[0];
			Order order = (Order)obj[1];
			System.out.print(customer.getId() + "  " + customer.getName() + "  " + order.getNumber());
			System.out.println();
		}		

		System.out.println("--------------Ê¹ÓÃfetch----------------");
		hql = "from Customer c inner join fetch c.orders as o";
		query = session.createQuery(hql);
		List<Customer> customers = query.list();
		for (Customer customer : customers)
		{		    
			System.out.println(customer.getId() + "  " + customer.getName());
			for(Order order: customer.getOrders())
				System.out.println(order.getNumber());
			System.out.println("---------------------");
		}					
		session.close();

	}

}
