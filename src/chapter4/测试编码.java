package chapter4;

class 鸟
{
	public void 飞()
	{
		System.out.println("飞翔");
	}

	public void 叫()
	{
		System.out.println("鸣叫");
	}
}

public class 测试编码
{

	public static void main(String[] args) throws Exception
	{
		鸟 小鸟 = new 鸟(); // 实例化“鸟”类
		小鸟.飞(); // 调用“飞”方法
		小鸟.叫(); // 调用“叫"方法
		String s = "飞翔";

		byte[] utf8 = s.getBytes("utf-8");
		System.out.println(new String(utf8, "gbk"));
		for (int i = 0; i < utf8.length; i++)
		{
			System.out.print(Integer.toHexString(0xff & utf8[i]) + " ");
		}
		System.out.println(new String(s.getBytes("ISO-8859-1"), "GBK"));
		
		System.out.println(new String(s.getBytes("Unicode"), "Unicode"));
	}

}
