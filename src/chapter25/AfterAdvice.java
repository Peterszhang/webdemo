package chapter25;

import java.lang.reflect.Method;
import org.springframework.aop.*;

public class AfterAdvice implements AfterReturningAdvice
{

	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable
	{
		System.out.println("AfterAdvice：" + target.getClass().getName() + "." + method.getName()
				+ "的返回值：" + returnValue + "  参数值：" + args[0]);

	}

}
