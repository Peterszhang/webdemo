package chapter9.interceptor;

public class TestInterceptor
{

	public static void main(String[] args) throws Exception
	{
		MyInterceptor1 myInterceptor1 = new MyInterceptor1();
		MyInterceptor2 myInterceptor2 = new MyInterceptor2();
		PropertyInterceptor propertyInterceptor = new PropertyInterceptor();

		MyAction myAction = new MyAction();

		MyInvocation myInvocation = new MyInvocation(myAction, myInterceptor1,
				myInterceptor2,propertyInterceptor);
		myInvocation.invoke();


	}

}
