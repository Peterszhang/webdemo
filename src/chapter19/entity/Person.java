package chapter19.entity;


public class Person
{
	private int id;
	private Name name;
	private java.util.Date birthday;

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
	public Name getName()
	{
		return name;
	}

	// name属性的setter方法
	public void setName(Name name)
	{
		this.name = name;
	}

	// birthday属性的getter方法
	public java.util.Date getBirthday()
	{
		return birthday;
	}

	public String formatBirthday()
	{
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat(
				"yyyy-MM-dd");
		return format.format(birthday);
	}

	public void setBirthday(java.util.Date birthday)
	{
		this.birthday = birthday;
	}
}
