public class Fries implements Food 
{
	int Amount;
	String Name = "Fries";
	public Fries()
	{
		Amount = 1;
	}
   @Override
   public void AddOne()
   {
	   Amount++;
   }
   public void PrintInfo()
   {
	   System.out.println(Name + ":" + Amount);
   }
}