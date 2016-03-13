package chapter23;

public class CollectionBean
{
    private java.util.List<String> myList;
    private String[] myArray;
    private java.util.Set mySet;
    private java.util.Map myMap;
    private java.util.Properties myProperties;

	public java.util.Properties getMyProperties()
	{
		return myProperties;
	}

	public void setMyProperties(java.util.Properties myProperties)
	{
		System.out.println("Properties类型:" + myProperties.getClass().getName());		
		this.myProperties = myProperties;
	}

	public java.util.Map getMyMap()
	{
		return myMap;
	}

	public void setMyMap(java.util.Map myMap)
	{
		System.out.println("Map类型：" + myMap.getClass().getName());
		this.myMap = myMap;
	}

	public java.util.Set getMySet()
	{
		return mySet;
	}

	public void setMySet(java.util.Set mySet)
	{
		System.out.println("Set类型：" + mySet.getClass().getName());
		this.mySet = mySet;
	}

	public java.util.List<String> getMyList()
	{
		return myList;
	}

	public void setMyList(java.util.List<String> myList)
	{
		System.out.println("List类型：" + myList.getClass().getName());
		this.myList = myList;
	}

	public String[] getMyArray()
	{
		return myArray;
	}

	public void setMyArray(String[] myArray)
	{
		this.myArray = myArray;
	}    
}
