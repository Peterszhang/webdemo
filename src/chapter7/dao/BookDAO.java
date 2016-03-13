package chapter7.dao;

import java.util.*;

public class BookDAO
{    
	private static Map<String, Integer> books= new LinkedHashMap<String, Integer>();
    static
    {
    	books.put("J2EE整合详解与典型案例", 79);
    	books.put("VISUAL C# 2008开发技术实例祥解", 89);
    	books.put("STRUTS 2技术详解", 69);
    	books.put("ASP经典模块开发大全", 69);
    	books.put("ASP.NET 3.5网络数据库开发实例自学手册", 79);
    	books.put("XML开发典型应用：数据标记、处理、共享与分析", 65);
    }
    
    public Map<String, Integer> getBooks(String name)
    {
    	Map<String, Integer> books = new LinkedHashMap<String, Integer>();
    
    	for(Map.Entry<String, Integer> entry: BookDAO.books.entrySet())
    	{
    		if(entry.getKey().toLowerCase().contains(name.toLowerCase()))
    			books.put(entry.getKey(), entry.getValue());
    	}    			    	
    	return books;
    }
    
}

