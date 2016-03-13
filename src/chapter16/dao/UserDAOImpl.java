package chapter16.dao;

import chapter16.model.*;
import chapter16.dao.interfaces.*;

public class UserDAOImpl extends DAOSupport implements UserDAO
{
	public void addUser(User user) throws Exception
	{
		try
		{
			String password_md5 = common.Encrypter.md5Encrypt(user.getPassword());
			this
					.execSQL(
							"insert into t_users(user_name, password_md5, email) values(?,?,?)",
							user.getUsername(), password_md5, user.getEmail());
		}
		catch (Exception e)
		{
			throw new Exception("注册用户时出现异常!");
		}
		finally
		{
			close();
		}
	}
	public boolean validateUser(User user) throws Exception
	{
		try
		{
			java.sql.ResultSet rs = this.execSQL(
					"select password_md5 from t_users where user_name=?",
					user.getUsername());
			if (rs.next())
			{
				String password_md5 = common.Encrypter
						.md5Encrypt(user.getPassword());
				if (password_md5.equals(rs.getString("password_md5")))
				{
					return true;
				}
			}
		}
		catch (Exception e)
		{
			
		}
		finally
		{
			close();			
		}
		return false;
	}

}
