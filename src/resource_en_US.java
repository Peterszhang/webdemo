import java.util.ListResourceBundle;

public class resource_en_US extends ListResourceBundle
{
	private final Object resources[][] = 
	{
	    { "product.name", "product name（类文件）" }, 
	    { "product.price", "product price（类文件）" },
	    { "message", "Hello,{0}! Now is {1}（类文件）" } 
	};
	@Override
	protected Object[][] getContents()
	{	
		return resources;
	}
}
