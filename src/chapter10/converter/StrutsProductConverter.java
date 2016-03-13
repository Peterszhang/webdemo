package chapter10.converter;

import java.util.Map;
import chapter10.Product;

public class StrutsProductConverter extends org.apache.struts2.util.StrutsTypeConverter
{

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass)
	{
	
		Product product = new Product();
		String[] productValues = values[0].split(",");
		product.setName(productValues[0].trim());
		product.setPrice(Float.parseFloat(productValues[1].trim()));
		product.setCount(Integer.parseInt(productValues[2].trim()));
		return product;
	}

	@Override
	public String convertToString(Map context, Object o)
	{
		Product product = (Product) o;
		return product.getName() + "," + product.getPrice() + ","
				+ product.getCount();
	}


}
