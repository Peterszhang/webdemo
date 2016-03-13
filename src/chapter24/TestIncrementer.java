package chapter24;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.support.incrementer.*;

public class TestIncrementer
{

	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				new String[]
				{ "src\\MyDataSource.xml", "src\\incrementer.xml",
						"src\\jdbcTemplate.xml" });
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context
				.getBean("jdbcTemplate");
		// 删除t_message表中的记录
		jdbcTemplate.update("delete from t_message");

		DataFieldMaxValueIncrementer incrementer = (DataFieldMaxValueIncrementer) context
				.getBean("incrementer");
		for (int i = 0; i < 10; i++)	
			jdbcTemplate.update("insert into t_message(id, name) value("
					+ incrementer.nextIntValue() + ",'msg" + i + "')");

		System.out.println("成功插入10条记录!");
	}

}
