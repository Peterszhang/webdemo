package chapter19.entity;



public class ProductDetail
{
    private int id;
    private String detail;
    private Product product;
    public ProductDetail(String detail)
    {
    	this.detail = detail;
    }

	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getDetail()
	{
		return detail;
	}
	public void setDetail(String detail)
	{
		this.detail = detail;
	}
	public Product getProduct()
	{
		return product;
	}
	public void setProduct(Product product)
	{
		this.product = product;
	}
}
