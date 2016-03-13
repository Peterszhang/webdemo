package chapter25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestControlFlow
{
	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src\\aop.xml");
		MyInterface myInterface = (MyInterface) context.getBean("myClassProxy");
		System.out.println(myInterface.getHello("bill"));
		method(myInterface);
	}	
	public static void method(MyInterface my)
	{
		my.getHello("bill");
	}
}