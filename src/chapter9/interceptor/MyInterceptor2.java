package chapter9.interceptor;

public class MyInterceptor2 implements Interceptor
{

	public void intercept(MyInvocation invocation) throws Exception
	{
		System.out.println("MyInterceptor2 before invoke");
		invocation.invoke();
		System.out.println("MyInterceptor2 after invoke");
	}

}
