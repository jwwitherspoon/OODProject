public class AddMustard extends FoodDecorator 
{

   public AddMustard(Food decoratedFood) 
   {
      super(decoratedFood);		
   }

   @Override
   public void AddOne() 
   {
      decoratedFood.AddOne();	       
      withMustard(decoratedFood);
   }

   private void withMustard(Food decoratedFood)
   {
      System.out.println("Mustard Added");
   }
   //Null Method
   public void PrintInfo()
   {
	   
   }
}