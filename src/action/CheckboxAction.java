package action;

import chapter7.dao.*;
import java.util.*;
import  static com.opensymphony.xwork2.Action.*;

public class CheckboxAction 
{
	private boolean checkbox;
	
	
	public String execute() throws Exception
	{
		System.out.println(checkbox);
		return "success";
	}


	public boolean isCheckbox()
	{
		return checkbox;
	}


	public void setCheckbox(boolean checkbox)
	{
		this.checkbox = checkbox;
	}

}