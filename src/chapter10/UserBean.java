package chapter10;

import java.util.*;

public class UserBean
{
	private String name;
	private String password;
	private int age;
	private Date birthday;

	// name属性的getter方法
	public String getName()
	{
		return name;
	}

	// name属性的setter方法
	public void setName(String name)
	{
		this.name = name;
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

}
