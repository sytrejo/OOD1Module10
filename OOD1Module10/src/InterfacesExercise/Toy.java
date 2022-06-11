package InterfacesExercise;

public abstract class Toy implements BasketItem {
	
	private int minAge;
	private int maxAge;
	private String name;
	private double price;
	private int calories;
	
	//constructor
	public Toy(int minAge, int maxAge) {
		this.minAge = minAge;
		this.maxAge = maxAge;
	}
	
	//getters and setters
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
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
