package chapter25;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor
{

	public Object invoke(MethodInvocation invocation) throws Throwable
	{
		if(invocation.getMethod().getName().equals("getHello"))
			invocation.getArguments()[0] = "Mike";
		else if(invocation.getMethod().getName().equals("getRandomInt"))	
			invocation.getArguments()[0] = 1000;
		    // invocation.getArguments()[0] = -1;
	
		return invocation.proceed();
		
	}
}
