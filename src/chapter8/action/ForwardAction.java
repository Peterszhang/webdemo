package chapter8.action;

import com.opensymphony.xwork2.*;

public class ForwardAction implements Action
{
	private String forward;
	// forward属性的getter方法
	public String getForward()
	{
		return forward;
	}
	// forward属性的setter方法
	public void setForward(String forward)
	{
		this.forward = forward;
	}
	public String execute() throws Exception
	{		
		return SUCCESS;
	}

}