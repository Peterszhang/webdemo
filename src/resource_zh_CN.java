import java.util.ListResourceBundle;

public class resource_zh_CN extends ListResourceBundle
{
	private final Object resources[][] = 
	{
	    { "product.name", "产品名（类文件）" }, 
	    { "product.price", "产品价格（类文件）" },
	    { "message", "你好，{0}！现在的时间是{1}（类文件）" } 
	};
	@Override
	protected Object[][] getContents()
	{		
		return resources;
	}
}
