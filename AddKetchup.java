public class AddKetchup extends FoodDecorator 
{

   public AddKetchup(Food decoratedFood) 
   {
      super(decoratedFood);		
   }

   @Override
   public void AddOne() 
   {
      decoratedFood.AddOne();	       
      withKetchup(decoratedFood);
   }

   private void withKetchup(Food decoratedFood)
   {
      System.out.println("Ketchup Added");
   }
   //Null Method
   public void PrintInfo()
   {
	   
   }
}