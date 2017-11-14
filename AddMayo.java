public class AddMayo extends FoodDecorator 
{

   public AddMayo(Food decoratedFood) 
   {
      super(decoratedFood);		
   }

   @Override
   public void AddOne() 
   {
      decoratedFood.AddOne();	       
      withMayo(decoratedFood);
   }

   private void withMayo(Food decoratedFood)
   {
      System.out.println("Mayo Added");
   }
   //Null Method
   public void PrintInfo()
   {
	   
   }
}