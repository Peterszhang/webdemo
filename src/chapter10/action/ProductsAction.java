package chapter10.action;

import com.opensymphony.xwork2.*;
import chapter10.Product;
import java.util.*;

//public class ProductsAction implements Action
public class ProductsAction extends ActionSupport
{
	private Product product1;
	private Product product2;
	
	private Product[] products;
    private List<Product> productList;
    
    private List myProductList;
    private Map myProductMap;
    private Set myProductSet;
    
	// myProductSet属性的getter方法
	public Set getMyProductSet()
	{
		return myProductSet;
	}

	// myProductSet属性的setter方法
	public void setMyProductSet(Set myProductSet)
	{
		this.myProductSet = myProductSet;
	}

	// myProductList属性的getter方法
	public List getMyProductList()
	{
		return myProductList;
	}

	// myProductList属性的setter方法
	public void setMyProductList(List myProductList)
	{
		this.myProductList = myProductList;
	}

	// myProductMap属性的getter方法
	public Map getMyProductMap()
	{
		return myProductMap;
	}

	// myProductMap属性的setter方法
	public void setMyProductMap(Map myProductMap)
	{
		this.myProductMap = myProductMap;
	}

	// products属性的getter方法
	public Product[] getProducts()
	{
		return products;
	}

	// products属性的setter方法
	public void setProducts(Product[] products)
	{
		this.products = products;
	}

	// product1属性的getter方法
	public Product getProduct1()
	{
		return product1;
	}

	// product1属性的setter方法
	public void setProduct1(Product product1)
	{
		this.product1 = product1;
	}

	// product2属性的getter方法
	public Product getProduct2()
	{
		return product2;
	}

	// product2属性的setter方法
	public void setProduct2(Product product2)
	{
		this.product2 = product2;
	}

	public String execute() throws Exception
	{			 	

		return SUCCESS;
	}

	// productList属性的getter方法
	public List<Product> getProductList()
	{
		return productList;
	}

	// productList属性的setter方法
	public void setProductList(List<Product> productList)
	{
		this.productList = productList;
	}
}