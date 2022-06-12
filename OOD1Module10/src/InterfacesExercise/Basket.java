package InterfacesExercise;

import java.util.ArrayList;



public class Basket {
	
	private ArrayList<BasketItem> basketItems = new ArrayList<BasketItem>();
	
	public void addItem(BasketItem basketItem) {
		basketItems.add(basketItem);
		System.out.println("Your item has been added to the basket");
	}
	
	public void removeItem(BasketItem basketItem) {
		basketItems.remove(basketItem);
		System.out.println("Your item has been removed from the basket");
	}
	
	public ArrayList<BasketItem> getAllItems(){
		return basketItems;
	}

}
