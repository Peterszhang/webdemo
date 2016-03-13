package chapter19.entity;

public class Address
{
    private int id;
    private String address;
    private Employee employee;
    
    public Address(String address)
    {
    	this.address = address;
    }
    public Address()
    {
    	
    }
	public Employee getEmployee()
	{
		return employee;
	}
	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}


}
