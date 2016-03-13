package chapter19;

import hibernate.*;
import org.hibernate.*;
import chapter19.entity.*;

public class OneToMany
{
	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		Order order1 = new Order();
		order1.setNumber("2008012401");
		Order order2 = new Order();
		order2.setNumber("2008012402");
		Customer customer = new Customer();
		customer.setName("Bea");
		order1.setCustomer(customer);
		order2.setCustomer(customer);
		customer.getOrders().add(order1);
		customer.getOrders().add(order2);
		session.save(customer);      
		tx.commit();		
		int id = customer.getId();		
		Object obj = session.get(Customer.class, id);
		if(obj != null)
		{
			customer = (Customer)obj;
			System.out.println("customer.id=" + customer.getId());
			System.out.println("customer.name=" + customer.getName());
			java.util.Set<Order> orders = customer.getOrders();
			for(Order order: orders)
			{
				System.out.println("order.id=" + order.getId());
				System.out.println("order.number=" + order.getNumber());
			}
			
		}
		session.close();		
	}
}
