package chapter15.action;

import java.util.*;
import com.opensymphony.xwork2.Action;
import com.googlecode.jsonplugin.annotations.JSON;

public class MyJSON
{
	private  int num1;
	private  int num2;
	private int sum;
    private String province;

	private static Map<String, List<String>> provinces = new HashMap<String, List<String>>();

	public String execute()
	{
		sum = num1 + num2;

		List<String> cities_ln = new ArrayList<String>();
		cities_ln.add("沈阳市");
		cities_ln.add("大连市");
		cities_ln.add("本溪市");
		cities_ln.add("抚顺市");
		provinces.put("辽宁", cities_ln);
		List<String> cities_gd = new ArrayList<String>();
		cities_gd.add("深圳市");
		cities_gd.add("珠海市");
		cities_gd.add("汕头市");
		cities_gd.add("江门市");
		provinces.put("广东", cities_gd);
		List<String> cities_hxj = new ArrayList<String>();
		cities_hxj.add("哈尔滨市");
		cities_hxj.add("齐齐哈尔市");
		cities_hxj.add("大庆市");
		cities_hxj.add("佳木斯市");
		provinces.put("黑龙江", cities_hxj);

		return Action.SUCCESS;
	}

	// num1属性的getter方法
	public int getNum1()
	{
		return num1;
	}

	// num1属性的setter方法
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}

	// num2属性的getter方法
	public int getNum2()
	{
		return num2;
	}

	// num2属性的setter方法
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}

	// sum属性的getter方法
	public int getSum()
	{
		return sum;
	}

	// sum属性的setter方法
	public void setSum(int sum)
	{
		this.sum = sum;
	}
	
	public List<String> getCities()
	{
	
		return  provinces.get(province);
	}

	// province属性的getter方法
	public String getProvince()
	{
		return province;
	}

	// province属性的setter方法
	public void setProvince(String province)
	{
		this.province = province;
	}

	// provinces属性的getter方法
	@JSON(name="myProvinces")
	public Map<String, List<String>> getProvinces()
	{
		return provinces;
	}
	
	
}