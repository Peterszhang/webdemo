package chapter14.action;

import com.opensymphony.xwork2.*;
import org.apache.struts2.util.IteratorGenerator.Converter;

public class ErrorsAction extends ActionSupport
{
	@Override
	public String execute() throws Exception
	{
		addFieldError("field1", "field1的第一条错误信息!");
		addFieldError("field1", "field1的第二条错误信息!");
		addFieldError("field2", "field2的第一条错误信息!");
		
		addActionError("第一条Action错误!");
		addActionError("第二条Action错误!");
		
		addActionMessage("第一条Action消息!");
		addActionMessage("第二条Action消息！");
		return SUCCESS;
	}
}