package chapter14;

import  org.apache.struts2.util.SubsetIteratorFilter;

public class RegexDecider implements SubsetIteratorFilter.Decider
{

	private String regex;
	
	public void setRegex(String regex)
	{
		this.regex = regex;
	}
	public boolean decide(Object arg) throws Exception
	{
		String str = (String)arg;	
		return str.matches(regex);
	}

}
