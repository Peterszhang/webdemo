package chapter21.event;

import org.hibernate.event.SaveOrUpdateEvent;
import org.hibernate.event.def.DefaultSaveOrUpdateEventListener;
import chapter17.entity.*;

public class MySaveOrUpdateEventListener extends
		DefaultSaveOrUpdateEventListener
{

	@Override
	public void onSaveOrUpdate(SaveOrUpdateEvent event)
	{
		
		if (event.getObject() instanceof MyMessage)
		{
			
			MyMessage message = (MyMessage) event.getObject();
			if (message.getName().length() < 5)
			{
				System.out.println("name属性长度不能小于5");
				return;
			}
		}
		super.onSaveOrUpdate(event);
	}
}
