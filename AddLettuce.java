public class AddLettuce extends FoodDecorator 
{

   public AddLettuce(Food decoratedFood) 
   {
      super(decoratedFood);		
   }

   @Override
   public void AddOne() 
   {
      decoratedFood.AddOne();	       
   }

   private void withLettuce(Food decoratedFood)
   {
      System.out.println("Lettuce ");
   }
   public void PrintInfo()
   {
	   decoratedFood.PrintInfo();
	   withLettuce(decoratedFood);
   }
}