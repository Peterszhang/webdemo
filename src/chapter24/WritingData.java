package chapter24;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class WritingData
{

	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				new String[] { "src\\MyDataSource.xml", "src\\jdbctemplate.xml" });
		
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context
				.getBean("jdbcTemplate");
		// 删除t_message表中的记录
		jdbcTemplate.update("delete from t_message");

		// 使用接口方式来插入数据
		InsertMessage insertMessage = new InsertMessage();
		insertMessage.setParams(1, "msg1");		
		System.out.println("插入" + jdbcTemplate.update(insertMessage) + "条记录");
		insertMessage.setParams(2, "msg2");
		System.out.println("插入" + jdbcTemplate.update(insertMessage) + "条记录");

		System.out
				.println("插入"
						+ jdbcTemplate
								.update("insert into t_message(id, name) value(3, 'msg3')")
						+ "条记录");

		Object[] params = new Object[] { 4, "msg4" };
		System.out.println("插入"
				+ jdbcTemplate.update(
						"insert into t_message(id, name) value(?, ?)", params)
				+ "条记录");

		params = new Object[] { 5, "msg5" };
		int[] types = new int[] { java.sql.Types.INTEGER,
				java.sql.Types.VARCHAR };
		System.out.println("插入"
				+ jdbcTemplate.update(
						"insert into t_message(id, name) value(?, ?)", params,
						types) + "条记录");

		String[] sqls = new String[] {
				"insert into t_message(id, name) value(6, 'msg6')",
				"insert into t_message(id, name) value(7, 'msg7')" };
		int[] count = jdbcTemplate.batchUpdate(sqls);
		for (int c : count)
			System.out.println("插入" + c + "条记录");
	}
}
