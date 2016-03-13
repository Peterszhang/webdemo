package chapter25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class TestAdvice
{

	public static void main(String[] args)
	{
		
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src\\aop.xml");
	  //MyClass myClass = (MyClass) context.getBean("myClass");
		//System.out.println(myClass.getHello("bill"));
		//System.out.println(myClass.getRandomInt(100));
		
		MyInterface myInterface = (MyInterface) context.getBean("myClass");
		System.out.println(myInterface.getHello("bill"));
		System.out.println(myInterface.getRandomInt(100));		
	}
}
