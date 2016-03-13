package chapter14;

import java.util.Comparator;

public class MyComparator implements Comparator
{

	public int compare(Object o1, Object o2)
	{
		String str1 = (String)o1;
		String str2 = (String)o2;
		return str2.length() - str1.length();
	}

}
