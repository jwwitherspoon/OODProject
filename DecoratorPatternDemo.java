public class DecoratorPatternDemo 
{
   public static void main(String[] args) 
   {
	   	Food Burger = new Burger();
	   	Burger.PrintInfo();
	   	
	   	Food BurgerCheese= new AddCheese(new Burger());
	   		
		BurgerCheese.AddOne();
	   
   }
}