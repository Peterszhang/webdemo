package chapter19;

import hibernate.*;
import org.hibernate.*;
import chapter19.entity.*;

public class OneToOne
{
	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		Address address = new Address("my address");
		Employee employee = new Employee();
		employee.setName("±È¶û");
		address.setEmployee(employee);
		employee.setAddress(address);
		session.save(employee);			 
		tx.commit();
		int id = employee.getId();
		Object obj = session.get(Employee.class, id);
		if(obj != null)
		{
			employee = (Employee)obj;
			System.out.println("employee.id=" + employee.getId());
			System.out.println("employee.name=" + employee.getName());
			System.out.println("address.id=" + employee.getAddress().getId());
			System.out.println("address.address=" + employee.getAddress().getAddress());
		}
		session.close();		
	}
}
