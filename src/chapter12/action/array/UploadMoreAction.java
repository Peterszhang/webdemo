package chapter12.action.array;

import com.opensymphony.xwork2.*;
import java.io.*;

public class UploadMoreAction extends ActionSupport
{
	// 封装上传文件域的属性
	private File[] upload;
	// 封装上传文件类型的属性
	private String[] uploadContentType;
	// 封装上传文件名的属性
	private String[] uploadFileName;

	
	// 封装上传文件保存在服务器的路径，通过参数设置
	private String uploadPath;


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
	public File[] getUpload()
	{
		return upload;
	}

	// upload属性的setter方法
	public void setUpload(File[] upload)
	{
		this.upload = upload;
	}

	// uploadContentType属性的getter方法
	public String[] getUploadContentType()
	{
		return uploadContentType;
	}

	// uploadContentType属性的setter方法
	public void setUploadContentType(String[] uploadContentType)
	{
		this.uploadContentType = uploadContentType;
	}

	// uploadFileName属性的getter方法
	public String[] getUploadFileName()
	{
		return uploadFileName;
	}

	// uploadFileName属性的setter方法
	public void setUploadFileName(String[] uploadFileName)
	{
		this.uploadFileName = uploadFileName;
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

	public String execute() throws Exception
	{
		for(int i = 0; i < uploadFileName.length; i++)
		{
			String fn = uploadPath + uploadFileName[i];
			FileOutputStream fos = new FileOutputStream(fn);
			InputStream is = new FileInputStream(upload[i]);
			byte[] buffer = new byte[8192]; // 每次读8K字节
			int count = 0;
			while ((count = is.read(buffer)) > 0)
			{
				fos.write(buffer, 0, count);
			}
			fos.close();
			is.close();
		}
		result = "文件上传成功！";
		return "result";
	}


}