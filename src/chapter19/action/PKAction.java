package chapter19.action;

import hibernate.HibernateSessionFactory;
import com.opensymphony.xwork2.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import chapter17.entity.*;
import chapter19.entity.*;

public class PKAction extends ActionSupport
{
    private int id;
    private String name;
    private int key1;
    private String key2;
    private String data;
	private String result;
	

	// result属性的getter方法
	public String getResult()
	{
		return result;
	}

	// result属性的setter方法
	public void setResult(String result)
	{
		this.result = result;
	}
	public String querypk() throws Exception
	{
		Session session = HibernateSessionFactory.getSession();		
		Object obj = session.get(MyMessage.class, id);
		if(obj != null)
		{
			MyMessage myMessage = (MyMessage)obj;						
			setResult("查询：id=" + id + "，name=" + myMessage.getName());			
		}
		else
		{
			setResult("在t_message表中未找到任何记录！");
		}
		
		session.close();		
		return SUCCESS;
	}
	public String queryCompositePK() throws Exception
	{
		Session session = HibernateSessionFactory.getSession();
		PrimaryKey pk = new PrimaryKey();
		pk.setKey1(key1);
		pk.setKey2(key2);
		Object obj = session.get(Keys.class, pk);
		if(obj != null)
		{
			Keys keys = (Keys)obj;						
			setResult("查询：key1=" + key1 + "，key2=" + key2 + ", data=" + keys.getData());			
		}
		else
		{
			setResult("在t_keys表中未查到任何记录！");
		}
		
		session.close();		
		return SUCCESS;
	}

	public String updatepk() throws Exception
	{
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		MyMessage myMessage = new MyMessage();
		myMessage.setId(id);
		myMessage.setName(name);
        session.saveOrUpdate(myMessage);						
		setResult("保存：id=" + id + "，name=" + myMessage.getName());			
	    tx.commit();
		session.close();		
		return SUCCESS;
	}
	public String updateCompositePK() throws Exception
	{
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		PrimaryKey pk = new PrimaryKey();
		pk.setKey1(key1);
		pk.setKey2(key2);
		Keys keys = new Keys();
		keys.setPrimaryKey(pk);
		keys.setData(data);
		session.saveOrUpdate(keys);						
		setResult("保存：key1=" + key1 + "，key2=" + key2 + ", data=" + keys.getData());			
	    tx.commit();
		session.close();		
		return SUCCESS;
	}
	
	// id属性的getter方法
	public int getId()
	{
		return id;
	}

	// id属性的setter方法
	public void setId(int id)
	{
		this.id = id;
	}

	// name属性的getter方法
	public String getName()
	{
		return name;
	}

	// name属性的setter方法
	public void setName(String name)
	{
		this.name = name;
	}

	// key1属性的getter方法
	public int getKey1()
	{
		return key1;
	}

	// key1属性的setter方法
	public void setKey1(int key1)
	{
		this.key1 = key1;
	}

	// key2属性的getter方法
	public String getKey2()
	{
		return key2;
	}

	// key2属性的setter方法
	public void setKey2(String key2)
	{
		this.key2 = key2;
	}

	// data属性的getter方法
	public String getData()
	{
		return data;
	}

	// data属性的setter方法
	public void setData(String data)
	{
		this.data = data;
	}

}