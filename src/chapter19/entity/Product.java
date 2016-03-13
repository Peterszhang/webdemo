package chapter19.entity;


public class Product
{
    private int id;
    private String name;
    private ProductDetail productDetail;
    public Product(String name)
    {
    	this.name = name;
    }
    public Product()
    {	
    }
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public ProductDetail getProductDetail()
	{
		return productDetail;
	}
	public void setProductDetail(ProductDetail productDetail)
	{
		this.productDetail = productDetail;
	}
}
