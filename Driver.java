
public class Driver implements Driving
{
	String Name;
	int ID;
	void useLarge()
	{
		System.out.println("This order will be delivered by" + ID +" in a Large vehicle");
	}
	void useSmall()
	{
		System.out.println("This order will be delivered by" + ID + " in a Small vehicle");
	}
	@Override
	public void execute()
	{
		
	}
}
