package chapter19.entity;

public class Keys
{
    private PrimaryKey primaryKey;
    private String data;
	public PrimaryKey getPrimaryKey()
	{
		return primaryKey;
	}
	public void setPrimaryKey(PrimaryKey primaryKey)
	{
		this.primaryKey = primaryKey;
	}
	public String getData()
	{
		return data;
	}
	public void setData(String data)
	{
		this.data = data;
	}
}
