package chapter24;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;

import chapter17.entity.MyMessage;

public class CallStoredProcedure
{
	public static class OneMessage implements RowMapper
	{

		public Object mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			MyMessage message = new MyMessage();
			message.setId(rs.getInt("id"));
			message.setName(rs.getString("name"));
			return message;
		}
	}

	public static void main(String[] args) throws Exception
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				new String[]
				{ "src\\MyDataSource.xml", "src\\jdbctemplate.xml" });

		JdbcTemplate jdbcTemplate = (JdbcTemplate) context
				.getBean("jdbcTemplate");
        
		// 使用query方法调用存储过程
		java.util.List<MyMessage> messages = (List<MyMessage>) jdbcTemplate
				.query("call query_message(?,?)", new Object[]
				{ 2, 4 }, new RowMapperResultSetExtractor(new OneMessage()));

		for(MyMessage message: messages)
		{
			System.out.println(message.getId());
			System.out.println(message.getName());
		}
		
		// 使用execute方法调用存储过程
		
		Object result = jdbcTemplate.execute("call query_message(?,?)",
				new PreparedStatementCallback()
				{
					public Object doInPreparedStatement(PreparedStatement ps)
							throws SQLException, DataAccessException
					{
						ps.setInt(1, 3); // 设置存储过程参数
						ps.setInt(2, 5);
						java.sql.ResultSet rs = ps.executeQuery(); // 返回ResultSet对象
						while (rs.next())
						{
							System.out.println(rs.getInt(1));
							System.out.println(rs.getString(2));
						}
						return null;
					}

				});

	}

}
