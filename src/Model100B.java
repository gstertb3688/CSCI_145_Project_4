import java.util.ArrayList;

public class Model100B extends VendingMachine {
	public Model100B () { super(); }
	public Model100B (ArrayList<String> itemSelectors, ArrayList<Products> inventory) { 
		super(itemSelectors, inventory);
	}
	
	public void takeMoney(int money) {
		if (money == 5 || money == 10 || money == 25 || money == 100) {
			this.currentPaid += money;
		}
		else {
			System.out.println("Error: Only takes coins and dollar bills.");
			this.currentPaid = 0;
		}
	}
	
	public void pickItem(String item) {
		
	}
}
