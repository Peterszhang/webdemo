package chapter18.action;

import hibernate.HibernateSessionFactory;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = null;
		try
		{
		    chapter18.entity.Keys keys = new chapter18.entity.Keys();
		    chapter18.entity.PrimaryKey pk = new chapter18.entity.PrimaryKey();
		    pk.setKey1(1);
		    pk.setKey2("abc");
		    keys.setPrimaryKey(pk);
		    //keys.setData("bike");
			tx = session.beginTransaction(); // 开始事务
		    Object obj = session.get(chapter18.entity.Keys.class, pk);
		    if( obj != null)
		    {
		    	chapter18.entity.Keys myKeys = (chapter18.entity.Keys)obj;
		    	//System.out.println(myKeys.getData());
		    }
		    String hql = "select data from Keys  where primaryKey.key1 = ? and primaryKey.key2=?";
			Query query = session.createQuery(hql);
			query.setInteger(0, pk.getKey1());
			query.setString(1, pk.getKey2());
		
			System.out.println(query.list().get(0));
			//session.save(keys); // 保存数据
			tx.commit();
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			tx.rollback();
		}

		finally
		{
			session.close(); // 关闭Session对象
		}

	}

}
