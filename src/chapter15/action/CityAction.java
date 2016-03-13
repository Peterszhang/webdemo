package chapter15.action;

import com.opensymphony.xwork2.*;
import java.util.*;

public class CityAction extends ActionSupport
{		
	private String province;
    private static Map<String, List<String>> provinces = new HashMap<String, List<String>>();
    private int cityCount = 0;
    static
    {
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
    }
    
	// province属性的getter方法
	public String getProvince()
	{
		return province;
	}

	// province属性的setter方法
	public void setProvince(String province) throws Exception
	{
		this.province = province;
	}

	// provinces属性的getter方法
	public Set<String> getProvinces()
	{
		return provinces.keySet();
	}
    public int getProvinceCount()
    {
    	return getProvinces().size();
    }
    public List<String> getCities()
    {    	
    	List<String> cities = provinces.get(province);
    	cityCount = cities.size();
    	return cities;
    }
	public int getCityCount()
	{
		return cityCount;
	}
	public String provinces() throws Exception
	{		
	
		return SUCCESS;
	}

	public String cities() throws Exception
	{
		
		return SUCCESS;
	}	
}