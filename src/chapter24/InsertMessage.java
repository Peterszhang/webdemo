package chapter24;

import java.sql.*;

import org.springframework.jdbc.core.*;

public class InsertMessage implements PreparedStatementCreator, SqlProvider
{

	private String sql = "insert into t_message(id, name) value(?, ?)";
	private int id;
	private String name;

	public String getSql()
	{
		return sql;
	}

	public void setParams(int id, String name)
	{

		this.id = id;
		this.name = name;
	}

	public PreparedStatement createPreparedStatement(Connection con)
			throws SQLException
	{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ps.setString(2, name);
		return ps;
	}

}
