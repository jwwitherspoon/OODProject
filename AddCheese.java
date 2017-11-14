public class AddCheese extends FoodDecorator 
{

   public AddCheese(Food decoratedFood) 
   {
      super(decoratedFood);		
   }

   @Override
   public void AddOne() 
   {
      decoratedFood.AddOne();	       
   }

   private void withCheese(Food decoratedFood)
   {
      System.out.println("Cheese ");
   }
   public void PrintInfo()
   {
	   decoratedFood.PrintInfo();
	   withCheese(decoratedFood);
   }
}