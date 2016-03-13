package chapter24;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.apache.commons.dbcp.BasicDataSource;
public class Test
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
		"src\\MyDatasource.xml");
		javax.sql.DataSource dataSource = (javax.sql.DataSource) context.getBean("myDatasource");
		/*
		try
		{
			System.out.println(datasource.getConnection().getCatalog());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}*/
		
		/* BasicDataSource dataSource = new BasicDataSource();
         dataSource.setDriverClassName("com.mysql.jdbc.Driver");
         dataSource.setUrl("jdbc:mysql://localhost:3306/webdb?characterEncoding=UTF8");
         dataSource.setUsername("root");
         dataSource.setPassword("1234");*/
 		try
		{
			//System.out.println(dataSource.getConnection().getCatalog());
 			System.out.println(dataSource.getConnection().getCatalog());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
