package chapter14.action;

import com.opensymphony.xwork2.*;
import org.apache.struts2.util.IteratorGenerator.Converter;

public class InvestigateAction extends ActionSupport
{
	private String[] hobbies;
	private java.util.List<String> j2eeServers;
	private java.util.List<String> cities;

	public java.util.List<String> getCities()
	{
		return cities;
	}


	public void setCities(java.util.List<String> cities)
	{
		this.cities = cities;
	}


	public java.util.List<String> getJ2eeServers()
	{
		return j2eeServers;
	}


	public void setJ2eeServers(java.util.List<String> servers)
	{
		j2eeServers = servers;
	}


	public String[] getHobbies()
	{
		return hobbies;
	}

	
	public void setHobbies(String[] hobbies)
	{
		this.hobbies = hobbies;
	}

	@Override
	public String execute() throws Exception
	{
		return SUCCESS;
	}
}