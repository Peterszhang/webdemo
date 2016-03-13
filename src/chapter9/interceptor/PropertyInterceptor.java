package chapter9.interceptor;

public class PropertyInterceptor implements Interceptor
{

	public void intercept(MyInvocation invocation) throws Exception
	{

		System.out.println("PropertyInterceptor before invoke");
		Object action = invocation.getAction();
	    if(action instanceof Property)
	    {
	    	Property property = (Property)action;
	    	System.out.println("property value:" + property.getValue());
	    }
		invocation.invoke();
		System.out.println("PropertyInterceptor after invoke");
	}

}
