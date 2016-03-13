package chapter10.action;

import com.opensymphony.xwork2.*;
import chapter10.Product;


//public class ProductAction implements Action
public class ProductAction extends ActionSupport
{
	private Product product;	
	
	// product属性的getter方法
	public Product getProduct()
	{
		return product;
	}

	// product属性的setter方法 
	public void setProduct(Product product)
	{
		this.product = product;
	}
	public String execute() throws Exception
	{			 	
		return SUCCESS;
	}


}