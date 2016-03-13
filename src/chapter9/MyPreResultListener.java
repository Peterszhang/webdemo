package chapter9;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.*;

public class MyPreResultListener  implements PreResultListener
{

	public void beforeResult(ActionInvocation invocation, String resultCode) 
	{
		System.out.println("execute方法的返回值：" + resultCode);
		long start = (Long)invocation.getStack().findValue("start");
		long end = System.currentTimeMillis();
		System.out.println("执行Action方法的时间：" + (end - start) + "毫秒");

		System.out.println("执行结束");

	}

}
