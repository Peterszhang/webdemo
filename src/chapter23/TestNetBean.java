package chapter23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestNetBean
{

	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src\\NetBean.xml");

		NetBean netBean = (NetBean) context.getBean("netBean");
		System.out.println(netBean.getUrl());
	}

}
