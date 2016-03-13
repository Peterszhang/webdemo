package chapter25;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvice implements ThrowsAdvice
{
	public void afterThrowing(java.lang.reflect.Method method, Object[] args,
			Object target, IllegalArgumentException e)
	{
		System.out.println(method.getName() + "Å×³öÒì³£!");
	}
	public void afterThrowing(IllegalArgumentException e)
	{
		System.out.println(e.getMessage());
	}
}
