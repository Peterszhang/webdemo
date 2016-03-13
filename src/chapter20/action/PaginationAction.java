package chapter20.action;

import hibernate.HibernateSessionFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import com.opensymphony.xwork2.*;
import java.util.*;

public class PaginationAction extends ActionSupport
{
    private String entity;
    private String fields;
    private int rows;
    private int currentPage;  
    private List records = new ArrayList();     	
	public String execute() throws Exception
	{
		Session session = HibernateSessionFactory.getSession();
		Criteria crit = session.createCriteria(entity);
        crit.setFirstResult((currentPage - 1) * rows);
        crit.setMaxResults(rows);        
		List list = crit.list();
		for (Object obj : list)
		{			
			records.add(obj);
		}
		session.close();
		return SUCCESS;
	}

	// fields属性的getter方法
	public String getFields()
	{
		return fields;
	}


	// fields属性的setter方法
	public void setFields(String fields)
	{
		
		this.fields = fields;
	}
	// rows属性的getter方法
	public int getRows()
	{
		return rows;
	}

	// rows属性的setter方法
	public void setRows(int rows)
	{
		this.rows = rows;
	}

	// entity属性的getter方法
	public String getEntity()
	{
		return entity;
	}


	// entity属性的setter方法
	public void setEntity(String entity)
	{
		this.entity = entity;
	}


	// currentPage属性的getter方法
	public int getCurrentPage()
	{
		return currentPage;
	}


	// currentPage属性的setter方法
	public void setCurrentPage(int currentPage)
	{
		this.currentPage = currentPage;
	}


	// records属性的getter方法
	public List<List<String>> getRecords()
	{
		return records;
	}


	// records属性的setter方法
	public void setRecords(List<List<String>> records)
	{
		this.records = records;
	}

	// fieldList属性的getter方法
	public String[] getFieldList()
	{		
		return fields.split(",");
	}
}