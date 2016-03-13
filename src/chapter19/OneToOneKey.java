package chapter19;

import hibernate.*;
import org.hibernate.*;
import chapter19.entity.*;

public class OneToOneKey
{
	public static void main(String[] args)
	{
		
		Session session = HibernateSessionFactory.getSession();		
		Transaction tx = session.beginTransaction();
		
		ProductDetail productDetail = new ProductDetail("product detail");
		Product product  = new Product("Car");
		productDetail.setProduct(product);
		product.setProductDetail(productDetail);
		session.save(product);
		tx.commit();
		int id = product.getId();
		Object obj = session.get(Product.class, id);
		if(obj != null)
		{
			product = (Product)obj;
			System.out.println("Product.id=" + product.getId());
			System.out.println("Product.name=" + product.getName());
			System.out.println("ProductDetail.id=" + product.getProductDetail().getId());
			System.out.println("ProductDetail.detail=" + product.getProductDetail().getDetail());
			
		}
		session.close();		
	}
}
