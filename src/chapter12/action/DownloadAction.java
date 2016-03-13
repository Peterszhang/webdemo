package chapter12.action;

import com.opensymphony.xwork2.*;
import java.io.*;

public class DownloadAction extends ActionSupport
{
	
    private String inputPath;
    
    // inputPath属性的getter方法
	public String getInputPath()
	{
		return inputPath;
	}
	// inputPath属性的setter方法
	public void setInputPath(String inputPath)
	{
		this.inputPath = inputPath;
	}
	public InputStream getTargetInputStream() throws Exception
    {
    	javax.servlet.ServletContext  servletContext = org.apache.struts2.ServletActionContext.getServletContext();
    	return servletContext.getResourceAsStream(inputPath);
    }
	public String execute() throws Exception
	{
		return SUCCESS;
	}


}