package chapter23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestPropertyEditor
{

	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src\\PropertyEditor.xml");

		Contact contact = (Contact) context.getBean("contact");

		if (contact.getPhoneNumber1() != null)
			System.out.println(contact.getPhoneNumber1().getNumber());			
		if (contact.getPhoneNumber2() != null)
			System.out.println(contact.getPhoneNumber2().getNumber());			

	}

}
