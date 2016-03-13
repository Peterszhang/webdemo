package chapter7.action;

import chapter7.dao.*;
import java.util.*;
import  static com.opensymphony.xwork2.Action.*;

public class QueryAction 
{
	private String name;

	private Map<String, Integer> result; 
	public Map<String, Integer> getResult()
	{
		return result;
	}
	public void setResult(Map<String, Integer> result)
	{
		this.result = result;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public String execute() throws Exception
	{
		try
		{
			//org.apache.struts2.StrutsStatics.SERVLET_CONTEXT

			final String HTTP_REQUEST = org.apache.struts2.StrutsStatics.SERVLET_CONTEXT;
			
			/*HttpServletRequest request = (HttpServletRequest) ActionContext
					.getContext().get(
							org.apache.struts2.StrutsStatics.HTTP_REQUEST);
				//  获得默认的编码格式，默认值是UTF-8
				System.out.println(request.getCharacterEncoding());*/
			//String name = request.getParameter("name");
			BookDAO book = new BookDAO();
			Map<String, Integer> books =  book.getBooks(name);			
			setResult(books);

			return SUCCESS;
		}
		catch (Exception e)
		{
			return "error";
		}
	}

}