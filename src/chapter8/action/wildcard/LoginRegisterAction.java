package chapter8.action.wildcard;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;
import java.util.*;

import javax.servlet.http.*;

public class LoginRegisterAction extends ActionSupport implements ServletRequestAware
{
	// 封装请求参数的username属性
	private String username;
	// 封装请求参数的password属性
	private String password;

	private HttpServletRequest request;


	public void setServletRequest(HttpServletRequest request)
	{
		this.request = request;		
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

	public String register() throws Exception
	{
		request.setAttribute("info", "您已经注册成功");
		return SUCCESS;
	}

	public String login() throws Exception
	{
		try
		{
			if (getUsername().equals("bill") && getPassword().equals("1234"))
			{
				request.setAttribute("info", "登录成功");
				return SUCCESS;
			}
			else
			{
				request.setAttribute("info", "登录失败");
				return ERROR;
			}		
		}
		catch (Exception e)
		{
			return ERROR;
		}
	}

}