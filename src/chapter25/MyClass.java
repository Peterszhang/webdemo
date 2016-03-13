package chapter25;

public class MyClass implements MyInterface
{

	public String getHello(String name)
	{
		System.out.println("调用getHello方法");
		return "hello " + name;
	}

	public int getRandomInt(int max)
	{
		java.util.Random random = new java.util.Random();
		random.nextInt(max);
		System.out.println("调用getRandomInt方法");
		return random.nextInt(max);
	}
}
