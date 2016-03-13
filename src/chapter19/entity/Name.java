package chapter19.entity;

public class Name
{
    private String first;
    private String last;
    
	
	// first属性的getter方法
	public String getFirst()
	{
		return first;
	}


	// first属性的setter方法
	public void setFirst(String first)
	{
		this.first = first;
	}


	// last属性的getter方法
	public String getLast()
	{
		return last;
	}


	// last属性的setter方法
	public void setLast(String last)
	{
		this.last = last;
	}


	public String toString()
	{
		return first + " " + last;
	}
}
