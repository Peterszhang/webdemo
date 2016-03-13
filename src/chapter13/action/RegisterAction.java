package chapter13.action;

import chapter13.*;

import com.opensymphony.xwork2.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterAction extends MyActionSupport 
{
	private String username;
	private String password;
	private int age;
	private java.util.Date birthday;
    private String result;
    private String time;
	// time属性的getter方法
	public String getTime()
	{
		return time;
	}

	// time属性的setter方法
	public void setTime(String time)
	{
		this.time = time;
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
	public java.util.Date getBirthday()
	{
		return birthday;
	}

	// birthday属性的setter方法
	public void setBirthday(java.util.Date birthday)
	{
		this.birthday = birthday;
	}

	public String execute() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		setTime( dateFormat.format(new Date()));		
	
		if(getUsername().length() <4)
		{
			//setResult(getText("failResult", new String[]{username}));
			setResult(getText("failResult"));
			return ERROR;
		}
		//setResult(getText("successResult", new String[]{username}));
		setResult(getText("successResult"));
		
		return SUCCESS; 
	}

}