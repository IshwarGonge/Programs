import java.util.*;
public class NewYork
{
	public static void main(String args[])
	{
			
		Calendar c=Calendar.getInstance();
		c.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		
		System.out.println("Time in New_York "
		+c.get(c.HOUR_OF_DAY)+":"
		+c.get(c.MINUTE)+":"
		+c.get(c.SECOND));
//		
	}
}
