package chapter19.servlet;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.hibernate.*; 
import chapter19.entity.*;
import hibernate.*;
public class MyComponent extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
 
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		Person person = new Person();
		person.setId(1234);
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.set(1985, 11, 25);
		person.setBirthday(cal.getTime());
		Name name = new Name();
		name.setFirst("bill");
		name.setLast("gates");
		person.setName(name);
		// 持久化person
		session.saveOrUpdate(person);
		tx.commit();

		tx = session.beginTransaction();

		// 装载持久化对象
		person = (Person)session.get(Person.class, 1234);
        if(person != null)
        	out.println(person.getName().toString() + "&nbsp;&nbsp;Birthday:" + person.formatBirthday());
		tx.commit();

		session.close();
 
		out.close();
	}

}
