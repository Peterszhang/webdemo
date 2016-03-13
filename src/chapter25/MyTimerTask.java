package chapter25;

public class MyTimerTask extends java.util.TimerTask
{
	private java.text.SimpleDateFormat format = new java.text.SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	public void run()
	{
		System.out.println(format.format(new java.util.Date()));
	}

}
