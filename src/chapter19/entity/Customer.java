package chapter19.entity;

import java.util.*;


public class Customer
{
    private int id;
    private String name; 
    private Set<Order> orders = new HashSet<Order>();
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
	// orders属性的getter方法
	public Set<Order> getOrders()
	{
		return orders;
	}
	// orders属性的setter方法
	public void setOrders(Set<Order> orders)
	{
		this.orders = orders;
	}    


}
