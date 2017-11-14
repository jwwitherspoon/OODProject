
public class Sports implements Menu {
	
	private FoodDecorator[] foodList;
	
	public Sports() {
		foodList = new FoodDecorator[4];
		foodList[0] = new FoodDecorator();
		foodList[1] = new FoodDecorator();
		foodList[2] = new FoodDecorator();
		foodList[3] = new FoodDecorator();
	}
	
	@Override
	public FoodDecorator[] getFoodList() {
		return foodList;
	}
	
}
