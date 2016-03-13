package chapter14.action;

import com.opensymphony.xwork2.*;
import org.apache.struts2.util.IteratorGenerator.Converter;

public class MyAction extends ActionSupport
{
	private String value;

	public String getValue()
	{
		return value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}

	@Override
	public String execute() throws Exception
	{
		return SUCCESS;
	}
}