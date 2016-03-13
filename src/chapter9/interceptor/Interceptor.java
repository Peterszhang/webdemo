package chapter9.interceptor;

public interface Interceptor
{
	public void intercept(MyInvocation invocation) throws Exception;
}
