package InterfacesExercise;

import java.util.ArrayList;

public class CalorieCounter {
	//if you have an array for the items/objects you don't need the individual instance declaration.
	private ArrayList<FoodItem> lowCalorieFoods = new ArrayList<FoodItem>();
	
	
	public void addLowCalorieFood(FoodItem foodItem) {
		if(foodItem.getCalories() <= 500) {
			lowCalorieFoods.add(foodItem);
			System.out.println("Low Calorie food added");
		}
	}
	
	public ArrayList<FoodItem> getAllLowCalorieFoods(){
		return lowCalorieFoods;
	}
	
	
	


}
