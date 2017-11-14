public class Wings implements Food 
{
	int Amount;
	String Name = "Wings";
	public Wings()
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