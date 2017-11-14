public class AddChili extends FoodDecorator 
{

   public AddChili(Food decoratedFood) 
   {
      super(decoratedFood);		
   }

   @Override
   public void AddOne() 
   {
      decoratedFood.AddOne();	       
   }

   private void withChili(Food decoratedFood)
   {
      System.out.println("Chili ");
   }
   public void PrintInfo()
   {
	   decoratedFood.PrintInfo();
	   withChili(decoratedFood);
   }
}