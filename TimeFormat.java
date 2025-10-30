// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat
{
	public static void main(String[] args) 
 {
	String[] time = args[0].split(":");
	int hours = Integer.parseInt(time[0]);
	int minutes = Integer.parseInt(time[1]);

	if(hours > 12 )
	{	
		if(minutes < 10)
		{
			System.out.println(hours - 12 + ":0" + minutes + " PM");
		}
		
		else System.out.println(hours - 12 + ":" + minutes + " PM");
		
	}

	else if(hours < 12)
	{
	if(minutes < 10)
	{
		System.out.println(hours + ":0" + minutes + " AM");	
	}
	else System.out.println(hours + ":" + minutes + " AM");

	}
	else if(minutes < 10)
	{
		System.out.println(hours + ":0" + minutes + " PM");
	}
	else System.out.println(hours + minutes + " PM");
 }

}