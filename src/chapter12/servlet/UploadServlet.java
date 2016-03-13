package chapter12.servlet;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadServlet extends HttpServlet
{

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		try
		{
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			FileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			List<FileItem> items = upload.parseRequest(request);
			String uploadPath = this.getInitParameter("path");
			String filename = "";
			InputStream is = null;

			for (FileItem item : items) // 循环处理上传文件
			{
				
				if (item.isFormField())
				{
					if (item.getFieldName().equals("filename"))
					{

						if (!item.getString().equals(""))
							filename = item.getString("UTF-8");									

					}
				}
				else if (item.getName() != null && !item.getName().equals("")) // 处理文件名不为空的上传文件
				{
					// 获得上传文件名
					filename = item.getName().substring(
							item.getName().lastIndexOf("\\") + 1);
					is = item.getInputStream();

				}

			}

			filename = uploadPath + filename;
			if (new File(filename).exists())
			{
				out.println("该文件已经存在，请为文件指定一个新的文件名！");
			}
			else if (!filename.equals(""))
			{
				FileOutputStream fos = new FileOutputStream(filename);
				byte[] buffer = new byte[8192]; // 每次读8K字节
				int count = 0;
				while ((count = is.read(buffer)) > 0)
				{
					fos.write(buffer, 0, count);
				}
				fos.close();
				is.close();
				out.println("文件上传成功!");
			}
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
		}

	}

}
