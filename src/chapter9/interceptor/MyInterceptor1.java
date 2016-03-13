package chapter9.interceptor;

public class MyInterceptor1 implements Interceptor
{

	public void intercept(MyInvocation invocation) throws Exception
	{
		System.out.println("MyInterceptor1 before invoke");		
		invocation.invoke();
		System.out.println("MyInterceptor1 after invoke");
	}

}
