package chapter25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestTransaction
{
	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				new String[] { "src\\transaction.xml", "src\\MyDataSource.xml",
						"src\\jdbctemplate.xml" });
		TransactionTemplate transactionTemplate = (TransactionTemplate) context
				.getBean("transactionTemplate");
		final JdbcTemplate jdbcTemplate = (JdbcTemplate) context
				.getBean("jdbcTemplate");

		transactionTemplate.execute(new TransactionCallback()
		{
			public Object doInTransaction(TransactionStatus status)
			{
				try
				{
					jdbcTemplate.update("delete from t_message");
					jdbcTemplate
							.update("insert into t_message(id, name) values(1, '信息1')");
					jdbcTemplate
							.update("insert into t_message(id, name) values(2, '信息2')");
				}
				catch (Exception e)
				{
					status.setRollbackOnly();
				}
				return null;
			}
		});
	}
}
