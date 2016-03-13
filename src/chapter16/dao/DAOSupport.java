package chapter16.dao;


public class DAOSupport
{
	// 用于连接数据库的Connection对象
	protected java.sql.Connection conn = null;

	// 执行各种SQL语句的方法
	protected java.sql.ResultSet execSQL(String sql, Object... args)
			throws Exception
	{
		//  打开数据库连接
		openConnection();
		// 建立PreparedStatement对象
		java.sql.PreparedStatement pStmt = conn.prepareStatement(sql);
		// 为pStmt对象设置SQL参数值
		for (int i = 0; i < args.length; i++)
		{
			pStmt.setObject(i + 1, args[i]);
		}

		pStmt.execute();// 执行SQL语句
		return pStmt.getResultSet(); // 返回结果集，如果执行的SQL语句不返回结果集，则返回null
	}

	private void openConnection()
	{
		try
		{
			// 如果conn为null，打开数据库连接
			if (conn == null)
			{
				javax.naming.Context ctx = new javax.naming.InitialContext();
				// 获取数据源
				javax.sql.DataSource ds = (javax.sql.DataSource) ctx
						.lookup("java:/comp/env/jdbc/webdb");
				conn = ds.getConnection(); // 创建一个Connection对象
			}
		}
		catch (Exception e)
		{
		}
	}

	public void close()
	{
		try
		{
			// 如果数据库连接正常打开，关闭它
			if (conn != null)
				conn.close();
		}
		catch (Exception e)
		{

		}
	}
}
