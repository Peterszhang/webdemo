package chapter19.entity;

public class Order
{
	private int id;
	private String number;
	private Customer customer;
	
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
	// number属性的getter方法
	public String getNumber()
	{
		return number;
	}
	// number属性的setter方法
	public void setNumber(String number)
	{
		this.number = number;
	}
	// customer属性的getter方法
	public Customer getCustomer()
	{
		return customer;
	}
	// customer属性的setter方法
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}


}
