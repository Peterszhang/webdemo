package chapter18.action;

public class Test2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String[] params = new String[]{"--config=hibernate.cfg.xml"};
		
		 org.hibernate.tool.hbm2ddl.SchemaExport.main(params);  
	}

}
