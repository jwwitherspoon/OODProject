public class Burger implements Food 
{
	int Amount;
	String Name = "Burger";
	public Burger()
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