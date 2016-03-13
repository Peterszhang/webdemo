package chapter11.visitor.action;

import com.opensymphony.xwork2.*;
import java.util.*;
import chapter11.visitor.*;

public class RegisterAction extends ActionSupport
{
	private User user = new User();
    private String result;

	// user属性的getter方法
	public User getUser()
	{
		return user;
	}

	// user属性的setter方法
	public void setUser(User user)
	{
		this.user = user;
	}

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


	public String execute() throws Exception
	{
		System.out.println(user.getName());
		setResult("注册成功!");
		return SUCCESS;
	}

}