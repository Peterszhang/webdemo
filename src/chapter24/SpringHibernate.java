package chapter24;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import chapter17.entity.MyMessage;

public class SpringHibernate
{

	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src\\applicationContext.xml" );
		HibernateTemplate hibernateTemplate = (HibernateTemplate)context.getBean("hibernateTemplate");
	
		//org.hibernate.Session session = hibernateTemplate.getSessionFactory().openSession();
		
		//MyMessage message = (MyMessage)session.load(MyMessage.class, 1);
	
		
		MyMessage message = (MyMessage)hibernateTemplate.load(MyMessage.class, 1);
		System.out.println(message.getId());
		System.out.println(message.getName());

		
		java.util.List<String> names = hibernateTemplate.find("select name from MyMessage");
		for(String name: names)
			System.out.println(name);			
	}
}
