package chapter10.converter;

import java.util.Map;
import chapter10.Product;

public class StrutsProductsConverter extends
		org.apache.struts2.util.StrutsTypeConverter
{

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass)
	{
		if (values.length > 1)
		{
			if (toClass == java.util.List.class)
			{
				java.util.List<Product> products = new java.util.ArrayList<Product>();
				for (int i = 0; i < values.length; i++)
				{
					Product product = new Product();
					String[] productValues = values[i].split(",");
					product.setName(productValues[0].trim());
					product.setPrice(Float.parseFloat(productValues[1].trim()));
					product.setCount(Integer.parseInt(productValues[2].trim()));
					products.add(product);
				}
				return products;
			}
			else
			{
				Product[] products = new Product[values.length];
				for (int i = 0; i < values.length; i++)
				{
					Product product = new Product();
					String[] productValues = values[i].split(",");
					product.setName(productValues[0].trim());
					product.setPrice(Float.parseFloat(productValues[1].trim()));
					product.setCount(Integer.parseInt(productValues[2].trim()));
					products[i] = product;
				}
				return products;
			}
		}
		else
		{
			Product product = new Product();
			String[] productValues = values[0].split(",");
			product.setName(productValues[0].trim());
			product.setPrice(Float.parseFloat(productValues[1].trim()));
			product.setCount(Integer.parseInt(productValues[2].trim()));
			return product;
		}
	}

	@Override
	public String convertToString(Map context, Object o)
	{
		if (o instanceof Product)
		{
			Product product = (Product) o;
			return product.getName() + "," + product.getPrice() + ","
					+ product.getCount();
		}
		else if (o instanceof Product[])
		{
			String result = "";
			Product[] products = (Product[]) o;
			for (Product product : products)
			{
				result += "[" + product.getName() + "," + product.getPrice()
						+ "," + product.getCount() + "]";

			}
			return result;
		}
		else if (o instanceof java.util.List)
		{
			String result = "";
			java.util.List<Product> products = (java.util.List<Product>) o;
			for (Product product : products)
			{
				result += "[" + product.getName() + "," + product.getPrice()
						+ "," + product.getCount() + "]";

			}
			return result;
		}
		else
			return "";
	}

}
