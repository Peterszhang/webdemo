package chapter14.action;

import com.opensymphony.xwork2.*;
import java.util.*;


public class IteratorAction extends ActionSupport
{
    private List<String> poetry = new ArrayList<String>(); 
  
	public List<String> getPoetry()
	{
		return poetry;
	}

	public void setPoetry(List<String> poetry)
	{
		this.poetry = poetry;
	}

	public String execute() throws Exception
	{
		
		poetry.add("日照香炉生紫烟");
		poetry.add("遥看瀑布挂前川");
		poetry.add("飞流直下三千尺");
		poetry.add("疑是银河落九天");
		return SUCCESS;
	}

}