package chapter25.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestRMI
{

	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
		"src\\rmiclient.xml");
		MessageService ms = (MessageService)context.getBean("messageServiceClient");
		System.out.println(ms.getMessage());
	}
}
