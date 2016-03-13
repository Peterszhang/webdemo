package chapter23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MultiConfig
{
	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				new String[] { "src\\applicationContext.xml",
						"src\\ConstructorBean.xml" });

		Object obj = context.getBean("constructor1");
		System.out.println(obj);

		MyBean myBean = (MyBean) context.getBean("newMyBean");
		System.out.println(myBean.getName());
		System.out.println(myBean.getValue());
	}

}
