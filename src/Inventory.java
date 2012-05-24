import java.util.ArrayList;

public class Inventory {
	private ArrayList<Products> 
		products;
	
	public Inventory() {
		products = new ArrayList<Products>();
	}
	public Inventory(Products p) {
		this.add(p);
	}
	
	public void add(Products p) {
		this.products.add(p);
	}
	
	public Products retrieve(Products p) {
		Products currentProduct = this.products.get(this.products.indexOf(p));
		
		// add checks to make sure you don't go into negative quantity
		if (products.contains(p) && currentProduct.getQuantity() != 0) {
			currentProduct.setQuantity(currentProduct.getQuantity() - 1);
		}
		
		return p;
	}
	
	public int inventoryAmount() {
		int inventoryAmount = 0;
		
		for (int i = 0; i < products.size(); i++) {
			inventoryAmount += products.get(i).getQuantity();
		}
		
		return inventoryAmount;
	}
	
	public String toString() {
		String s = String.format("Number of products in inventory: %d\n",
				this.inventoryAmount());
		for (Products p : products) {
			s += "\t" + p;
		}
		
		return s;
	}
}
