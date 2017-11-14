public class HotDog implements Food 
{
	int Amount;
	String Name = "HotDog";
	public HotDog()
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