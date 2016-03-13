package chapter20;

import hibernate.*;
import org.hibernate.*;
import org.hibernate.criterion.*;
import chapter17.entity.*;
import java.util.*;

public class MyProjections
{
	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		Criteria crit = session.createCriteria(MyMessage.class);
		crit.setProjection(Projections.rowCount());
        Integer value = (Integer)crit.uniqueResult();
        System.out.println(value);
        crit.setProjection(Projections.max("id"));
        value = (Integer)crit.uniqueResult();
        System.out.println(value);
        crit.setProjection(Projections.sum("id"));
        value = (Integer)crit.uniqueResult();
        System.out.println(value);
        
        ProjectionList projList = Projections.projectionList();
        projList.add(Projections.rowCount());
        projList.add(Projections.max("id"));
        projList.add(Projections.sum("id"));
        crit.setProjection(projList);
        List results = crit.list();
        Object[] array = (Object[]) results.get(0);
        for(int i = 0; i < array.length; i++)
        {
        	 System.out.println(array[i]);	
        }       
		session.close();
	}

}
