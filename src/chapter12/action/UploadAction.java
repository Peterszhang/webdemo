package chapter12.action;

import com.opensymphony.xwork2.*;
import java.io.*;

public class UploadAction extends ActionSupport
{
	// 封装上传文件域的属性
	private File upload;
	// 封装上传文件类型的属性
	private String uploadContentType;
	// 封装上传文件名的属性
	private String uploadFileName;
	// 封装上传文件新文件名的属性
	private String filename;
	// 封装上传文件保存在服务器的路径，通过参数设置
	private String uploadPath;
	// 封装上传文件类型的属性，通过参数设置
	private String allowTypes;

	// 封装处理结果的属性
	private String result;

	// result属性的getter方法
	public String getResult()
	{
		return result;
	}

	// result属性的setter方法
	public void setResult(String result)
	{
		this.result = result;
	}

	// upload属性的getter方法
	public File getUpload()
	{
		return upload;
	}

	// upload属性的setter方法
	public void setUpload(File upload)
	{
		this.upload = upload;
	}

	// uploadContentType属性的getter方法
	public String getUploadContentType()
	{
		return uploadContentType;
	}

	// uploadContentType属性的setter方法
	public void setUploadContentType(String uploadContentType)
	{
		this.uploadContentType = uploadContentType;
	}

	// uploadFileName属性的getter方法
	public String getUploadFileName()
	{
		return uploadFileName;
	}

	// uploadFileName属性的setter方法
	public void setUploadFileName(String uploadFileName)
	{
		this.uploadFileName = uploadFileName;
	}

	// filename属性的getter方法
	public String getFilename()
	{
		return filename;
	}

	// filename属性的setter方法
	public void setFilename(String filename)
	{
		this.filename = filename;
	}

	// uploadPath属性的getter方法
	public String getUploadPath()
	{
		return uploadPath;
	}

	// uploadPath属性的setter方法
	public void setUploadPath(String uploadPath)
	{
		this.uploadPath = uploadPath;
	}

	private boolean allowType(String contentType)
	{
		String[] types = allowTypes.split(",");
		for (String type : types)
		{
			if (contentType.equals(type.trim()))
				return true;
		}
		return false;
	}

	public String execute() throws Exception
	{
		//if (!allowType(uploadContentType))
		if (false)
		{
			result = "不允许上传该类型的文件！";
		}
		else
		{
			String fn = "";
			if (filename.equals(""))
			{
				// 获得上传文件名
				fn = uploadPath
						+ uploadFileName;
			}
			else
			{
				fn = uploadPath + filename;
			}
			if (new File(fn).exists())
			{
				result = "该文件已经存在，请为文件指定一个新的文件名！";
			}
			else
			{
				FileOutputStream fos = new FileOutputStream(fn);
				InputStream is = new FileInputStream(upload);
				byte[] buffer = new byte[8192]; // 每次读8K字节
				int count = 0;
				while ((count = is.read(buffer)) > 0)
				{
					fos.write(buffer, 0, count);
				}
				fos.close();
				is.close();
				result = "文件上传成功！";
			}
		}
		return "result";
	}

	// uploadTypes属性的getter方法
	public String getAllowTypes()
	{
		return allowTypes;
	}

	// uploadTypes属性的setter方法
	public void setAllowTypes(String allowTypes)
	{
		this.allowTypes = allowTypes;
	}
}