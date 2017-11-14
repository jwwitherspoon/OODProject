
public class Order 
{
	int itemCount = 0;
	Food[] totalOrder = new Food[1000];
	Driver driver;
	
	void Add(Food food)
	{
		this.totalOrder[itemCount]=food;
		this.itemCount++;
	}
	private boolean CheckSize()
	{
		return(itemCount<500);
	}
	void Deliver()
	{
	 	if(CheckSize())
	 		driver.useSmall();
	 	else
	 		driver.useLarge();
	}
	
}
