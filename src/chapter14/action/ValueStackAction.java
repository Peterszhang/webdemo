package chapter14.action;

import com.opensymphony.xwork2.*;
import chapter14.*;


public class ValueStackAction extends ActionSupport
{
    private String value = "ValueStack中的值";
    private Product product = new Product();
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

	// name属性的getter方法
	public String getValue()
	{
		return value;
	} 

	// name属性的setter方法
	public void setValue(String value)
	{
		this.value = value;
	}

	public String execute() throws Exception
	{
		ActionContext context = ActionContext.getContext();
		context.put("valueStackAction", this);
		context.put("newProduct", product);		
		product.setName("自行车");
		product.setPrice((float)343.5);

		return SUCCESS;
	}

}