// Base class for all event types
public class Context {
	
	// Instance of the Menu interface
	Menu menu;
	
	// Explicit constructor
	public Context(Menu menu) {
		this.menu = menu;
	}
	
	// Get FoodDecorator list from Menu instance
	public FoodDecorator[] placeOrder() {
		return menu.getFoodList();
	}
}
