package chapter11.action;

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

	public String register() throws Exception
	{
		setResult("注册成功（由register方法处理）!");
		return SUCCESS;
	}

	public void validateRegister1()
	{

		if (username == null || username.equals("")
				|| !username.matches("^\\w*$") || username.length() <= 4
				|| username.length() >= 20)
		{
			addFieldError("username",
					"validateRegister方法效验，用户名必须是字母和数字,且长度必须介于4和20之间!");
		}
		if (password == null || password.equals("") || password.length() < 8
				|| password.length() > 30)
		{
			addFieldError("password", "validateRegister方法效验，密码的长度必须介于8和30之间!");
		}
		if (age <= 0 && age <= 200)
		{
			addFieldError("age", "validateRegister方法效验，您必须输入一个有效的年龄!");
		}

		if (birthday == null)
		{
			addFieldError("birthday", "validateRegister方法效验，出生日期必须输入！");
		}
		else
		{
			Calendar endDate = Calendar.getInstance();
			Calendar startDate = Calendar.getInstance();
			startDate.set(1900, 1, 1);
			if (birthday.after(endDate.getTime())
					|| birthday.before(startDate.getTime()))
			{
				addFieldError("birthday",
						"validateRegister方法效验，出生日期必须在一个有效范围内！");
			}

		}

	}

	public void validate1()
	{

		if (username == null || username.equals("")
				|| !username.matches("^\\w*$") || username.length() < 4
				|| username.length() > 20)
		{
			addFieldError("username", "用户名必须是字母和数字,且长度必须介于4和20之间!");
		}
		if (password == null || password.equals("") || password.length() < 8
				|| password.length() > 30)
		{
			addFieldError("password", "密码的长度必须介于8和30之间!");
		}
		if (age <= 0 && age <= 200)
		{
			addFieldError("age", "您必须输入一个有效的年龄!");
		}
		if (birthday == null)
		{
			addFieldError("birthday", "出生日期必须输入！");
		}
		else
		{

			Calendar endDate = Calendar.getInstance();
			Calendar startDate = Calendar.getInstance();

			startDate.set(1900, 1, 1);
			if (birthday.after(endDate.getTime())
					|| birthday.before(startDate.getTime()))
			{
				addFieldError("birthday", "出生日期必须在一个有效范围内！");
			}
		}

	}
}