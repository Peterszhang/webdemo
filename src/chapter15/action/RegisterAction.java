package chapter15.action;

import com.opensymphony.xwork2.*;
import java.util.*;

public class RegisterAction extends ActionSupport
{
	private String username;
	private String password;
	private int age;
	private Date birthday;
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

	// age属性的getter方法
	public int getAge()
	{
		return age;
	}

	// age属性的setter方法
	public void setAge(int age)
	{
		this.age = age;
	}

	// birthday属性的getter方法
	public Date getBirthday()
	{
		return birthday;
	}

	// birthday属性的setter方法
	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}

	public String execute() throws Exception
	{
		setResult("注册成功!");
		return SUCCESS;
	}



}