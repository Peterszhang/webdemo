package chapter15.action;

import com.opensymphony.xwork2.*;
import java.util.*;

public class AjaxAction extends ActionSupport
{
	private String city;

	// city属性的getter方法
	public String getCity()
	{
		return city;
	}

	// city属性的setter方法
	public void setCity(String city)
	{
		this.city = city;
	}

	public String execute() throws Exception
	{

		if (city != null)
			city = new String(city.getBytes("ISO-8859-1"), "UTF-8");
		return SUCCESS;
	}

}