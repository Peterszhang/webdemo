package chapter23;

public class ConstructorBean
{
    private String name;
    private String message;
    private int number;
    
    public ConstructorBean(String name)
    {
    	this.name = name;
    }
    public ConstructorBean(String name, int number)
    {
    	this.name = name;
    	
    	this.number = number;
    }
    public ConstructorBean(String name, String message)
    {
    	this.name = name;    	
    	this.message = message;
    }
	public String getName()
	{
		return name;
	}
	public String getMessage()
	{
		return message;
	}
	public int getNumber()
	{
		return number;
	}
    
}
