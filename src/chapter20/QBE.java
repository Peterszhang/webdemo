package chapter20;

import hibernate.*;

import org.hibernate.*;
import org.hibernate.criterion.*;
import chapter19.entity.*;

import java.util.*;

public class QBE
{

	private static void print(Criteria crit, String... properties)
			throws Exception
	{
		List result = crit.list();
		for (Object obj : result)
		{
			if (properties.length > 0)
			{
				String s;

				for (int i = 0; i < properties.length; i++)
				{
					String getter = "get"
							+ properties[i].substring(0, 1).toUpperCase()
							+ properties[i].substring(1);
					java.lang.reflect.Method method = obj.getClass().getMethod(
							getter);
					System.out.print(method.invoke(obj) + "  ");
				}

				System.out.println();
			}
		}
	}

	public static void main(String[] args) throws Exception
	{
		Session session = HibernateSessionFactory.getSession();

		Criteria crit = session.createCriteria(Person.class);
		
		Person person = new Person();
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.set(1955, 4, 7);
		person.setBirthday(cal.getTime());
		Name name = new Name();
		name.setFirst("Gannon");
		name.setLast("gates");		
		person.setName(name);		
		Example example = Example.create(person);
		example.excludeZeroes();
        example.excludeProperty("birthday");      
		crit.add(example);
		print(crit, "id", "name");				
		session.close();
	}
}
