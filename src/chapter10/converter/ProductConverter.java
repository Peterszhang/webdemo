package chapter10.converter;

import java.util.Map;
import chapter10.Product;

public class ProductConverter extends ognl.DefaultTypeConverter
{

	@Override
	public Object convertValue(Map context, Object value, Class toType)
	{
		if (toType == Product.class)
		{
			String[] params = (String[]) value;
			Product product = new Product();
			String[] productValues = params[0].split(",");

			product.setName(productValues[0].trim());
			product.setPrice(Float.parseFloat(productValues[1].trim()));
			product.setCount(Integer.parseInt(productValues[2].trim()));
			return product;
		}
		else if (toType == String.class)
		{
			Product product = (Product) value;
			return product.getName() + "," + product.getPrice() + ","
					+ product.getCount();
		}
		return null;
	}

}
