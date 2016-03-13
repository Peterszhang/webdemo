package chapter25;

import java.lang.reflect.Method;

import org.springframework.aop.support.*;

public class Pointcut extends NameMatchMethodPointcut
{
	@Override
	public boolean matches(Method method, Class targetClass)
	{		
		this.setMappedName("getHell?");
		
		return super.matches(method, targetClass);
	}

}
