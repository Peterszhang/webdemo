package chapter20;

import hibernate.*;
import org.hibernate.*;
import org.hibernate.criterion.*;
import chapter17.entity.*;

public class UniqueResult
{
	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		Criteria crit = session.createCriteria(MyMessage.class);		
        crit.setMaxResults(1);
        crit.add(Restrictions.eq("id", 1));  
        MyMessage message = (MyMessage)crit.uniqueResult();
		if(message != null)
			System.out.println(message.getName());		
		session.close();
	}

}
