package chapter17.action;

import hibernate.HibernateSessionFactory;
import com.opensymphony.xwork2.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import chapter17.entity.*;

public class FirstHibernateAction extends ActionSupport implements
		ModelDriven<MyMessage>
{
	private MyMessage myMessage = new MyMessage();
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

	public MyMessage getModel()
	{
		return myMessage;
	}

	public String execute() throws Exception
	{

		Session session = HibernateSessionFactory.getSession();
		Transaction tx = null;
		try
		{
			tx = session.beginTransaction(); // 开始事务
			session.save(myMessage); // 保存数据
			tx.commit();
			setResult("成功添加记录!");
		}
		catch (Exception e)
		{
			setResult(e.getMessage());
			tx.rollback();
		}

		finally
		{
			session.close(); // 关闭Session对象
		}

		return SUCCESS;
	}

}