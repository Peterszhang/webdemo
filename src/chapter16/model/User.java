package chapter16.model;

public class User
{
    private  String username;
    private String password;
    private String repassword;
    private String email;
    private String validationCode;
	// validationCode属性的getter方法
	public String getValidationCode()
	{
		return validationCode;
	}
	// validationCode属性的setter方法
	public void setValidationCode(String validationCode)
	{
		this.validationCode = validationCode;
	}
	// username属性的getter方法
	public String getUsername()
	{
		return username;
	}
	// username属性的setter方法
	public void setUsername(String username)
	{
		this.username = username;
	}
	// password属性的getter方法
	public String getPassword()
	{
		return password;
	}
	// password属性的setter方法
	public void setPassword(String password)
	{
		this.password = password;
	}
	// email属性的getter方法
	public String getEmail()
	{
		return email;
	}
	// email属性的setter方法
	public void setEmail(String email)
	{
		this.email = email;
	}
	// repassword属性的getter方法
	public String getRepassword()
	{
		return repassword;
	}
	// repassword属性的setter方法
	public void setRepassword(String repassword)
	{
		this.repassword = repassword;
	}
}
