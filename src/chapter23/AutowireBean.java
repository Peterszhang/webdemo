package chapter23;

import chapter22.*;;

public class AutowireBean 
{
    private HelloService greeting;
    private MyBean bean;
    private Object myBean;

  
	public Object getMyBean()
	{
		return myBean;
	}

	public void setMyBean(Object myBean)
	{
		this.myBean = myBean;
	}

	public MyBean getBean()
	{
		return bean;
	}

	public void setBean(MyBean bean)
	{
		this.bean = bean;
	}

	public HelloService getGreeting()
	{
		return greeting;
	}

	public void setGreeting(HelloService greeting)
	{
		this.greeting = greeting;
	}
}
