package InterfacesExercise;

public abstract class Laptop implements BasketItem{
	
	private double cpuSpeed;
	private double memory;
	private double hardDrive;
	private String name;
	private double price;
	
	//constructor
	public Laptop(String name, double cpuSpeed, double memory, double hardDrive) {
		this.name = name;
		this.cpuSpeed = cpuSpeed;
		this.memory = memory;
		this.hardDrive = hardDrive;
	}
	
	//getters and setters
	public double getCpuSpeed() {
		return cpuSpeed;
	}
	public void setCpuSpeed(double cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}
	public double getMemory() {
		return memory;
	}
	public void setMemory(double memory) {
		this.memory = memory;
	}
	public double getHardDrive() {
		return hardDrive;
	}
	public void setHardDrive(double hardDrive) {
		this.hardDrive = hardDrive;
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
