public class AddTomato extends FoodDecorator 
{

   public AddTomato(Food decoratedFood) 
   {
      super(decoratedFood);		
   }

   @Override
   public void AddOne() 
   {
      decoratedFood.AddOne();	       
      withTomato(decoratedFood);
   }

   private void withTomato(Food decoratedFood)
   {
      System.out.println("Tomato Added");
   }
   //Null Method
   public void PrintInfo()
   {
	   
   }
}