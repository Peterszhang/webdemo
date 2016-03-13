package chapter14;

public class Cities
{
	public City[] getCities()
	{
		City[] cities = new City[4];
		cities[0] = new City("bj", "北京");
		cities[1] = new City("sh", "上海");
		cities[2] = new City("gz", "广州");
		cities[3] = new City("others", "其他");
		return cities;
	}

}
