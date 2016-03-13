package chapter25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestDeclarationTransaction
{
	public static void main(String[] args) throws Exception
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				new String[] { "src\\MyDataSource.xml", "src\\transaction.xml",
						"src\\jdbctemplate.xml" });
		Message message = (Message) context.getBean("message");
		message.process();
	}
}
