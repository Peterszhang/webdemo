package chapter20;

import hibernate.*;
import org.hibernate.*;
import org.hibernate.criterion.*;
import chapter17.entity.*;
import java.util.*;

public class ProjectionsGroup
{
	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		Criteria crit = session.createCriteria(MyMessage.class);
		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.rowCount());
		projList.add(Projections.groupProperty("name")); 
		crit.setProjection(projList);
		List list = crit.list();
		Object[] array = null;
		for (int i = 0; i < list.size(); i++)
		{
			array = (Object[]) list.get(i);
			for(int j = 0; j < array.length; j++)
				System.out.print(array[j] + "  ");
			System.out.println();
		}
		session.close();

	}
}
