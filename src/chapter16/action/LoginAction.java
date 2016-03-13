package chapter16.action;

import javax.servlet.http.HttpServletRequest;
import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;
import javax.servlet.http.*;
import chapter16.model.*;
import chapter16.dao.interfaces.*;
import chapter16.dao.*;

public class LoginAction extends ActionSupport implements ModelDriven<User>,
		ServletRequestAware
{

	private User user = new User();
	private HttpServletRequest request;

	public User getModel()
	{
		return user;
	}

	public void setServletRequest(HttpServletRequest request)
	{
		this.request = request;

	}

	public String execute() throws Exception
	{

		UserDAO userDAO = new UserDAOImpl();
		Object obj = ActionContext.getContext().getSession().get(
				"validation_code");

		String validationCode = (obj != null) ? obj.toString() : "";
		if (!validationCode.equalsIgnoreCase(user.getValidationCode()))
		{
			if (user.getValidationCode() != null)
			{
				this.addActionError("验证码输入错误!");
			}
			return INPUT;
		}

		if (!userDAO.validateUser(user))
		{
			this.addActionError("用户名或密码错误!");
			return INPUT;
		}
		HttpSession session = request.getSession();
		session.setAttribute("username", user.getUsername());
		session.setMaxInactiveInterval(60 * 60 * 3);
		return SUCCESS;
	}

}