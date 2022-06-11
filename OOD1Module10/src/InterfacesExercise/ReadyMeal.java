package InterfacesExercise;

public abstract class ReadyMeal implements BasketItem, FoodItem {
	
	private String cuisineType;
	private String name;
	private double price;
	private int calories;
	
	//constructor
	public ReadyMeal(String cuisineType) {
		this.cuisineType = cuisineType;
	}

	//getters and setters
	public String getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}
	
	//methods inherited from Basket
	@Override
	public String getName() {
		System.out.println("The name of this item is a: " + name);
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public double getPrice() {
		System.out.println("The price of this item is: $ " + price);
		return price;
	}
	
	@Override
	public void setPrice(double price) {
		this.price = price; 
	}
	
	//methods inherited from FoodItem
	public int getCalorie() {
		System.out.println("This item's calorie count is: " + calories);
		return calories;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	
	

}
