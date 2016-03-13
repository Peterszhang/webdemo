package chapter9.interceptor;
import java.util.*;
public class MyInvocation
{
	//  保存拦截器对象
	private List<Interceptor> interceptors = new LinkedList<Interceptor>();	
	private Object action;//  被拦截的对象
	private int interceptorIndex = 0;//  拦截器的调用索引
    //  构造方法，用于注册拦截器和Action对象
	public MyInvocation(Object action, Interceptor... interceptors)
	{
		//  将拦截器对象加到intercetors中
		for (int i = 0; i < interceptors.length; i++)
		{
			this.interceptors.add(interceptors[i]);
		}
		this.action = action;
	}
	//  执行调用链中的拦截器方法和execute方法
	public void invoke() throws Exception
	{
        //  调用链中的所有拦截器方法都执行完了，开始调用execute方法
		if (interceptorIndex == interceptors.size())
		{
			try
			{
				//  在Action对象中寻找execute方法，如果未找到，将抛出异常
				java.lang.reflect.Method method = action.getClass().getMethod(
						"execute");
				method.invoke(getAction());//  调用execute方法
				
			}
			catch (Exception e)
			{
				throw new Exception("在action中未发现execute方法!");
			}
			return;
		}
		//  执行调用链中的拦截器方法，并将拦截器的调用索引增1
		interceptors.get(interceptorIndex++).intercept(this);
	}
    //  获得Action对象
	public Object getAction()
	{
		return this.action;
	}
}
