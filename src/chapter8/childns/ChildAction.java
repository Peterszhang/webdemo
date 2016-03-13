package chapter8.childns;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Namespace;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;

@ParentPackage(value = "parentns")
@Namespace(value = "/mychild")
@Results( { @Result(name = "success", value = "/success.jsp"),
		@Result(name = "error", value = "/error.jsp") })
public class ChildAction
{
	public String execute() throws Exception
	{
		try
		{
			System.out.println("child");
			return "success";
		}
		catch (Exception e)
		{
			return "error";
		}
	}
}