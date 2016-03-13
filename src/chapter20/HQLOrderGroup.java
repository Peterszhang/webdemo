package chapter20;
import hibernate.*;
import org.hibernate.*;
import chapter17.entity.*;
import java.util.*;
public class HQLOrderGroup
{
	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		String hql = "select name from MyMessage order by id desc, name asc";
		Query query = session.createQuery(hql);
		List<String> messages = query.list();
	    for(String name: messages)
	    {
	    	System.out.println(name);
	    }
		hql = "select count(*), name from MyMessage group by name order by id";
		query = session.createQuery(hql);
        List result = query.list();
        for(Object obj: result)
        {
        	Object[] properties = (Object[])obj;
        	System.out.print(properties[0]);
        	System.out.println(properties[1]);
        }
                	    
		session.close();

	}

}
