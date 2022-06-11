package InterfacesExercise;

import java.util.ArrayList;

public class CalorieCounter {
	//TODO is this correct?
	private FoodItem calories;
	
	private ArrayList<FoodItem> lowCalorieFoods = new ArrayList<FoodItem>();
	
	
	public void addLowCalorieFood(FoodItem foodItem) {
		//TODO check value and add to basket
		System.out.println("Low Calorie food added");
	}
	
	public ArrayList<FoodItem> getAllLowCalorieFoods(){
		return lowCalorieFoods;
	}
	
	
	


}
