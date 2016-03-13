package chapter23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAutowireBean
{

	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src\\applicationContext.xml");

		AutowireBean autowire = (AutowireBean) context.getBean("autowireBean");
		System.out.println("greeting:" + autowire.getGreeting());
		System.out.println("bean:" + autowire.getBean());
		System.out.println("myBean:" + autowire.getMyBean());
	}
}
