package chapter23;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import chapter22.*;

public class TestBeanFactory
{
	public static void main(String[] args)
	{	
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
				"src\\applicationContext.xml"));
		HelloService hello = (HelloService)factory.getBean("greeting");
		System.out.println(hello.getGreeting());				
	}
}