package chapter8.exception;
import com.opensymphony.xwork2.*;

public class LoginAction implements Action
{
	// 封装请求参数的username属性
	private String username;
	// 封装请求参数的password属性
	private String password;
    private String result;

	// result属性的getter方法
	public String getResult()
	{
		return result;
	}

	// result属性的setter方法
	public void setResult(String result)
	{
		this.result = result;
	}

	// username属性的getter方法
	public String getUsername()
	{
		return username;
	}

	// username属性的setter方法
	public void setUsername(String username)
	{
		this.username = username;
	}

	// password属性的getter方法
	public String getPassword()
	{
		return password;
	}

	// password属性的setter方法
	public void setPassword(String password)
	{
		this.password = password;
	}

	public String execute() throws Exception
	{		
		if(getUsername().equals("bill") && getPassword().equals("1234"))
		{			
			setResult("登录成功，进入主界面");
			return SUCCESS;
		}
		else if(getUsername().equals("user"))
		{
			throw new UserException("用户名不能为user，抛出用户异常");
		}
		else if(getUsername().equals("sql"))
		{
			throw new java.sql.SQLException("用户名不能sql，抛出SQL异常");
		}
		else
		{
			return ERROR;
		}				
	}

}