package chapter21.interceptor;

import java.io.Serializable;
import org.hibernate.*;
import org.hibernate.type.Type;
import java.util.*;

public class EntityBeanInterceptor extends EmptyInterceptor
{
	private ThreadLocal entityBeans = new ThreadLocal();

	@Override
	public void afterTransactionBegin(Transaction tx)
	{
		entityBeans.set(new HashSet<EntityInfo>());
	}

	@Override
	public void afterTransactionCompletion(Transaction tx)
	{
		if (tx.wasCommitted())
		{
			Iterator i = ((Collection) entityBeans.get()).iterator();
			while (i.hasNext())
			{
				EntityInfo info = (EntityInfo) i.next();
				processEntityBean(info);

			}
		}
		entityBeans.set(null);
	}

	private void processEntityBean(EntityInfo info)
	{
		System.out.println(info);
	}

	@Override
	public boolean onSave(Object entity, Serializable id, Object[] state,
			String[] propertyNames, Type[] types)
	{
		EntityInfo info = new EntityInfo();
		info.entityBean = entity;
		info.properties = propertyNames;
		info.id = id;
		((HashSet<EntityInfo>) entityBeans.get()).add(info);
		return false;
	}

}
