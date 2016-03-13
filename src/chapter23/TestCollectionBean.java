package chapter23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestCollectionBean
{

	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src\\applicationContext.xml");
		CollectionBean collectionBean = (CollectionBean) context
				.getBean("collectionBean");
		System.out.println("-----------------≤‚ ‘List-------------------");
		for (String s : collectionBean.getMyList())
			System.out.println(s);
		System.out.println("-----------------≤‚ ‘Array-------------------");
		for (String s : collectionBean.getMyArray())
			System.out.println(s);
		System.out.println("-----------------≤‚ ‘Set-------------------");
		for (Object obj : collectionBean.getMySet())
			System.out.println(obj.getClass().getName());
		System.out.println("-----------------≤‚ ‘Map-------------------");
		for (Object key : collectionBean.getMyMap().keySet())
		{
			System.out.println(key + "=" + collectionBean.getMyMap().get(key));
		}
		System.out.println("-----------------≤‚ ‘Properties-------------------");
		for(Object key: collectionBean.getMyProperties().keySet())
		{
			System.out.println(key + "=" + collectionBean.getMyProperties().get(key));
		}

	}
}
