package chapter10.action;

import com.opensymphony.xwork2.*;
import java.util.*;

public class TypeConversionAction implements Action
{
    private String[] products = new String[3];
    private int[] numbers = new int[3];
    private List<Integer> collections;

	// collections属性的getter方法
	public List<Integer> getCollections()
	{
		return collections;
	}
	// collections属性的setter方法
	public void setCollections(List<Integer> collections)
	{
		this.collections = collections;
	}
	// products属性的getter方法
	public String[] getProducts()
	{
		return products;
	}
	// products属性的setter方法
	public void setProducts(String[] products)
	{
		this.products = products;
	}
	
	// numbers属性的getter方法
	public int[] getNumbers()
	{
		return numbers;
	}
	// numbers属性的setter方法
	public void setNumbers(int[] numbers)
	{
		this.numbers = numbers;
	}
	
	public String execute() throws Exception
	{		
		return SUCCESS;
	}


}