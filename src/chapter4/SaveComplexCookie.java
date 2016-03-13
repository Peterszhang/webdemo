package chapter4;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class SaveComplexCookie extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		// 创建一个用于进行Base64编码的BASE64Encoder对象
		sun.misc.BASE64Encoder base64Encoder = new sun.misc.BASE64Encoder();
		// 创建一个用于接收被序列化的对象实例字节流的ByteArrayOutputStream对象
		ByteArrayOutputStream classBytes = new ByteArrayOutputStream();
		// 创建一个用于向流中写入对象的ObjectOutputStream对象
		ObjectOutputStream oos = new ObjectOutputStream(classBytes);
		oos.writeObject(new MyCookie()); // 写入MyCookie对象实例
		oos.close(); // 关闭ObjectOutputStream对象
		// 将被序列化的对象实例的字节流按Base64编码格式进行编码
		String classStr = base64Encoder.encode(classBytes.toByteArray());
		Cookie cookie = new Cookie("mycookie", classStr); // 将Base64编码写入Cookie
		cookie.setMaxAge(60 * 60 * 24); // Cookie的超时时间为1天
		response.addCookie(cookie);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("MyCookie的对象实例已写入Cookie"); // 输出提示消息
	}
}
