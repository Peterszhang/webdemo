package chapter23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestConstructorBean
{

	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src\\ConstructorBean.xml");
		ConstructorBean constructorBean = (ConstructorBean) context.getBean("constructor1");
		System.out.println(constructorBean.getName());

		constructorBean = (ConstructorBean) context.getBean("constructor2");
		System.out.println("name:" + constructorBean.getName());
		System.out.println("message:" + constructorBean.getMessage());
		System.out.println("number:" + constructorBean.getNumber());
		

		constructorBean = (ConstructorBean) context.getBean("constructor3");
		System.out.println(constructorBean.getName());
		System.out.println(constructorBean.getMessage());

	}

}
