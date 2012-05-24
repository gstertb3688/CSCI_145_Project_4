import java.util.ArrayList;

public abstract class VendingMachine {
	protected int
		money, currentPaid, transactionNumber;
	// First itemSelector will correspond to first inventory item
	protected ArrayList<String>
		itemSelectors;
	//use Inventory class instead of ArrayList<Product>, maybe?
	protected ArrayList<Products>
		inventory;
	protected ArrayList<Transaction>
		transactions;
	
	//use Inventory class instead of ArrayList<Product>, maybe?
	public VendingMachine() { 
		this.setInventory(new ArrayList<Products>()); 
		this.transactionNumber = 0;
	}
	public VendingMachine(ArrayList<String> itemSelectors, ArrayList<Products> inventory) { 
		this.setItemSelectors(itemSelectors);
		this.setInventory(inventory); 		
		this.transactionNumber = 0;
	}
	
	public void setInventory(ArrayList<Products> inventory) { this.inventory = inventory; }
	public void setItemSelectors(ArrayList<String> itemSelectors) { this.itemSelectors = itemSelectors; }
	
	public abstract void takeMoney(int money);
	
	public void selectItem(String itemSelector) {
		if (this.itemSelectors.contains(itemSelector)) {
			System.out.format("You entered an amount of %d cents\n" +
								"The cost of this item is %d cents\n" +
								"Thank you and please take your item.\n", 
								this.currentPaid, this.inventory.get(this.itemSelectors.indexOf(itemSelector)).getPrice());
																// index of itemSelector should be same as index of product we want to get
		}
		
	}
	
	public String toString() {
		return String.format("This vending machine has: %d products.\n", inventory.size());
	}
}
