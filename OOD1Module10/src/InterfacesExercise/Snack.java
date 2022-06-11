package InterfacesExercise;

public abstract class Snack implements BasketItem, FoodItem{
	
	private int fatContent;
	private int sugarContent;
	private String name;
	private double price;
	
	//constructor
	public Snack(int fatContent, int sugarContent) {
		this.fatContent = fatContent;
		this.sugarContent = sugarContent;
	}
	
	//getters and setters
	public int getFatContent() {
		return fatContent;
	}
	public void setFatContent(int fatContent) {
		this.fatContent = fatContent;
	}
	public int getSugarContent() {
		return sugarContent;
	}
	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
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
	
	
	

}
