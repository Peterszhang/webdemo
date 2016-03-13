package chapter24;

import java.sql.*;

import org.springframework.jdbc.core.*;

import java.util.*;

import chapter17.entity.*;

public class QueryMessage
{
	private MyMessage message;
	private String sql = "select * from t_message where id = ?";
	private JdbcTemplate jdbcTemplate;

	public QueryMessage(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	public MyMessage getMessage(final int id)
	{
		jdbcTemplate.query(sql, new Object[]

		{ id }, new RowCallbackHandler()
		{
			public void processRow(ResultSet rs) throws SQLException
			{
				message = new MyMessage();
				message.setId(id);
				message.setName(rs.getString("name"));
			}
		});

		return message;
	}

	public MyMessage getOneMessage(int id)
	{
		List<MyMessage> message = jdbcTemplate.query(sql, new Object[]

		{ id }, new OneMessage());
		if (message.size() > 0)
			return message.get(0);
		else
			return null;
	}

	public class OneMessage implements RowMapper
	{

		public Object mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			message = new MyMessage();
			message.setId(rs.getInt("id"));
			message.setName(rs.getString("name"));
			return message;
		}
	}

	public List<MyMessage> getAllMessages()
	{
		String sql = "select * from t_message";

		return (List<MyMessage>) jdbcTemplate.query(sql,
				new RowMapperResultSetExtractor(new OneMessage()));
	}

	public int getRecordCount()
	{
		return jdbcTemplate.queryForInt("select count(*) from t_message");
	}

	public String getName(int id)
	{
		String sql = "select name from t_message where id = ?";
		String name = null;

		try
		{
			name = (String) jdbcTemplate.queryForObject(sql, new Object[]
			{ id }, String.class);
		}
		catch (Exception e)
		{
			name = null;
		}
		return name;
	}

	public Map getSingleRow(int id)
	{
		Map row = null;
		try
		{
			row = jdbcTemplate.queryForMap(sql, new Object[]
			{ id });
		}
		catch (Exception e)
		{

		}
		return row;
	}
}
