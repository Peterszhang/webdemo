package chapter4;

import java.io.*;
import java.net.*;

public class ChineseRequestHeader
{
	public static void main(String[] args) throws Exception
	{
		String chineseUTF8 = "中文信息";
		String chineseURLEncode = java.net.URLEncoder.encode(chineseUTF8,
				"UTF-8");
		Socket socket = new Socket("localhost", 8080); // 用Socket类连接服务器
		OutputStream os = socket.getOutputStream(); // 获得OutputStream对象
		// 以UTF8编码格式接收ChineseResponseHeader返回的响应消息
		java.io.OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		// 开始向ChineseResponseHeader发送HTTP请求头消息
		osw.write("GET /webdemo/servlet/ChineseResponseHeader HTTP/1.1\r\n");
		osw.write("Host:localhost:8080\r\n");
		osw.write("chinese_utf8:" + chineseUTF8 + "\r\n"); // 发送UTF8编码的中文消息
		osw.write("chineseURLEncode:" + chineseURLEncode + "\r\n"); // 发送URL编码的中文消息
		osw.write("Connection:close\r\n\r\n");
		osw.flush(); // 刷新缓冲区
		InputStream is = socket.getInputStream(); // 获得InputStream对象
		// 以UTF-8编码格式读取ChineseResponseHeader返回的HTTP响应消息头
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String s = "";
		// 开始以行为单位读取响应消息
		while ((s = br.readLine()) != null)
		{
			String strArray[] = s.split(":"); // 用正则表达式获得消息字段半和消息字段值
			if (strArray.length == 2)
			{
				// 当字段名是chinese_utf8时，输出字段名和字段值
				if (strArray[0].trim().equals("chinese_utf8"))
				{
					System.out.println(s);
				}
				// 当字段名是chineseURLEncode时，输出字段名和字段值
				else if (strArray[0].trim().equals("chineseURLEncode"))
				{
					System.out.println(java.net.URLDecoder.decode(s, "UTF-8"));
				}
			}
		}
		is.close();
		osw.close();
	}
}
