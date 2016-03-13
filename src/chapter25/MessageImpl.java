package chapter25;

import org.springframework.jdbc.core.JdbcTemplate;

public class MessageImpl implements Message
{
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate()
	{
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	public void process()
	{
		jdbcTemplate.update("delete from t_message");
		//int i = 1/0; // 将抛出一个java.lang.ArithmeticException异常
		jdbcTemplate.update("insert into t_message(id, name) values(1, '信息1')");
		/*try
		{
			Thread.sleep(70000); 
		}
		catch (Exception e)
		{
			
		}*/
		jdbcTemplate.update("insert into t_message(id, name) values(2, '信息2')");
	}
}
