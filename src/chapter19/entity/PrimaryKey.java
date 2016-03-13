package chapter19.entity;

public class PrimaryKey implements java.io.Serializable
{
    private int key1;
    private String key2;
	public int getKey1()
	{
		return key1;
	}
	public void setKey1(int key1)
	{
		this.key1 = key1;
	}
	public String getKey2()
	{
		return key2;
	}
	public void setKey2(String key2)
	{
		this.key2 = key2;
	}
    
}
