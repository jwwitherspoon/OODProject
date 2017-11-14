public class AddHotSauce extends FoodDecorator 
{

   public AddHotSauce(Food decoratedFood) 
   {
      super(decoratedFood);		
   }

   @Override
   public void AddOne() 
   {
      decoratedFood.AddOne();	       
      withHotSauce(decoratedFood);
   }

   private void withHotSauce(Food decoratedFood)
   {
      System.out.println("HotSauce Added");
   }
   //Null Method
   public void PrintInfo()
   {
	   
   }
}