package chapter20;

import hibernate.*;
import org.hibernate.*;
import org.hibernate.criterion.*;
import chapter17.entity.*;
import java.util.*;

public class MyRestrictions
{
	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		Criteria crit = session.createCriteria(MyMessage.class);
		//crit.add(Restrictions.eq("id", 2));  // ==
		//crit.add(Restrictions.ne("id", 2));  // !=
		//crit.add(Restrictions.lt("id", 2));  // <
		//crit.add(Restrictions.gt("id", 2));  // >
		//crit.add(Restrictions.le("id", 2));  // <=
		//crit.add(Restrictions.ge("id", 2));  // >=
		//crit.add(Restrictions.like("name","msg", MatchMode.START));
		//crit.add(Restrictions.ilike("name","msg", MatchMode.ANYWHERE));
		
		//crit.add(Restrictions.isNull("name"));
	/*	Criterion id1 = Restrictions.gt("id", 2);
		Criterion id2 = Restrictions.lt("id", 20);
		Criterion name = Restrictions.like("name","msg", MatchMode.ANYWHERE);
		Conjunction conjunction = Restrictions.conjunction();
		conjunction.add(id1);
		conjunction.add(id2);				
		
		Disjunction disjunction = Restrictions.disjunction();
		disjunction.add(conjunction);
		disjunction.add(name);
		crit.add(disjunction);*/
		
		crit.add(Restrictions.sqlRestriction("{alias}.name like ?", "%d%",new org.hibernate.type.StringType()));		


		List<MyMessage> messages = crit.list();
		for (MyMessage message : messages)
		{
			System.out.print(message.getId() + "  " + message.getName());
			System.out.println();
		}

		session.close();
	}
}
