package chapter12.action;

import com.opensymphony.xwork2.*;
import java.util.*;
public class AuthorizationDownloadAction extends DownloadAction
{	
	public String execute() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();		
		Map session = ctx.getSession();
		String username = (String)session.get("username");
		if(username != null && username.equals("mike"))
		{
			return SUCCESS;
		}
		return LOGIN;
	}
}