package chapter22;
public class HelloServiceImpl implements HelloService	
{
	private String greeting;

	public String getGreeting()
	{
		return "hello " + greeting;
	}

	public void setGreeting(String greeting)
	{
		this.greeting = greeting;
		System.out.println("…Ë÷√greeting Ù–‘");
	}
}
