package chapter23;

import java.util.*;

public class PhoneEditor extends java.beans.PropertyEditorSupport
{
	@Override
	public void setAsText(String text) throws IllegalArgumentException
	{
		setValue(new PhoneNumber(text));
	}

	@Override
	public void setValue(Object value)
	{
		super.setValue(null);
		if (value instanceof List)
		{
			String number = "";
			List<String> moreNumber = (List) value;
			for (String s : moreNumber)
				number += "-" + s;
			super.setValue(new PhoneNumber(number.substring(1)));
		}
		else if (value instanceof PhoneNumber)
			super.setValue(value);

		
	}

}