package chapter4;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChineseResponseHeader extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String chineseUTF8 = request.getHeader("chinese_utf8"); // 获得消息头chinese_utf8的值
		// 获得消息头chineseURLEncode的值
		String chineseURLEncode = request.getHeader("chineseURLEncode");
		// 取出UTF-8编码，再将其转换成UCS2编码格式，保存在chineseUTF8中
		chineseUTF8 = new String(chineseUTF8.getBytes("iso-8859-1"), "utf-8");
		System.out.println(chineseUTF8); // 向控制台输出chineseUTF8的值
		// 设置响应消息头chinese_utf8的值，需要将UTF-8编码直接放到String对象中
		response.setHeader("chinese_utf8", new String(chineseUTF8
				.getBytes("UTF-8"), "ISO-8859-1")); // 设置响应消息头chineseURLEncode的值，将%xx形式的编码按原样返回
		response.setHeader("chineseURLEncode", chineseURLEncode);
		// 对客户端发过来的%xx形式的中文消息进行解码
		chineseURLEncode = java.net.URLDecoder
				.decode(chineseURLEncode, "UTF-8");
		System.out.println(chineseURLEncode); // 输出chineseURLEncode的值
	}
}
