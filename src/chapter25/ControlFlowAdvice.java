package chapter25;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ControlFlowAdvice implements MethodInterceptor
{

	public Object invoke(MethodInvocation invocation) throws Throwable
	{
        System.out.println("method:" + invocation.getMethod().getName());		
		return invocation.proceed();
		
	}
}
