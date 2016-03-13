package chapter22;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FirstSpring
{
	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src\\applicationContext.xml");
		
		HelloService hello = (HelloService) context.getBean("greeting");
		System.out.println(hello.getGreeting());	
	}
}
