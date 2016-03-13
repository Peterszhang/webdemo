package chapter23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMyBean
{

	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src\\applicationContext.xml");

		MyBean my = (MyBean) context.getBean("myBean");
		System.out.println(my.getName());
		System.out.println(my.getHello().getGreeting());

	}

}
