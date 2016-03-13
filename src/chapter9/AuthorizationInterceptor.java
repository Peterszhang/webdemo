package chapter9;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.*;
import com.opensymphony.xwork2.*;
import java.util.*;

public class AuthorizationInterceptor extends AbstractInterceptor
{
	@Override
	public String intercept(ActionInvocation invocation) throws Exception
	{
		ActionContext ctx = invocation.getInvocationContext();
	    Map session = ctx.getSession();
	    String user = (String)session.get("username");	    
	    if(user != null && "bill".equals(user))
	    {
	    	return invocation.invoke();
	    }
	    else
	    {

	    	return Action.LOGIN;
	    }	
	}
}
