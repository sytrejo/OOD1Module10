package InterfacesExercise;

import java.util.ArrayList;



public class Basket {
	//TODO is this correct?
	private BasketItem basketItem;
	
	private ArrayList<BasketItem> basketItems = new ArrayList<BasketItem>();
	
	public void addItem(BasketItem basketItem) {
		System.out.println("Your item has been added to the basket");
	}
	
	public void removeItem(BasketItem basketItem) {
		System.out.println("Your item has been removed from the basket");
	}
	
	public ArrayList<BasketItem> getAllItems(){
		return basketItems;
	}

}
