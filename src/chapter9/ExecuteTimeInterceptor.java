package chapter9;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.*;

//public class ExecuteTimeInterceptor extends AbstractInterceptor
public class ExecuteTimeInterceptor extends MethodFilterInterceptor
{
    private String name;
	
	// name属性的getter方法
	public String getName()
	{
		return name;
	}

	// name属性的setter方法
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String doIntercept(ActionInvocation invocation) throws Exception
	{		
		invocation.addPreResultListener(new MyPreResultListener());
		System.out.println(getName() + " 开始执行");
		long start = System.currentTimeMillis();
		invocation.getStack().set("start", start);
		String result = invocation.invoke();
		long end = System.currentTimeMillis();
		System.out.println(getName() + " 执行Action方法的时间：" + (end - start) + "毫秒");
		System.out.println(getName() + " 执行结束");
		return result;
	}

}
