package chapter17.entity;

public class MyMessage extends chapter20.entity.Father
{

	private int id; // 对应id字段
	private String name; // 对应name字段
	// id属性的getter方法
	public int getId()
	{
		return id;
	}
	// id属性的setter方法
	public void setId(int id)
	{
		this.id = id;
	}
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


}
