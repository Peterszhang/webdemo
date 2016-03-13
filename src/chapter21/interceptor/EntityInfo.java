package chapter21.interceptor;

import java.io.Serializable;

public class EntityInfo
{
	public Object entityBean;
	public Serializable id;
	public String[] properties;
	
	public String toString()
	{
		String info = "";
		if (entityBean != null)
		{
			info = entityBean.getClass().toString() + "\r\nid:" + id + "\r\n";

			if (properties != null)
			{

				for (String property : properties)
				{
					try
					{
						String getter = "get"
								+ property.substring(0, 1).toUpperCase()
								+ property.substring(1);
						java.lang.reflect.Method method = entityBean.getClass()
								.getMethod(getter);
						info = info + property + ":"
								+ method.invoke(entityBean).toString() + "\r\n";
					}
					catch (Exception e)
					{

					}
				}

			}
		}
		return info;
	}
}
