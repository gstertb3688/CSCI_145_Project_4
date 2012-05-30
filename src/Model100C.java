import java.util.ArrayList;

public class Model100C extends VendingMachine {
	public Model100C () { super(); }
	public Model100C (ArrayList<String> itemSelectors, ArrayList<Products> inventory) { 
		super(itemSelectors, inventory);
	}

	public void takeMoney(int money) {
		if (money == 100) {
			this.currentPaid += money;
		}
		else {
			System.out.println("Error: Only takes dollar bills.");
			this.currentPaid = 0;
		}
	}

	public void pickItem(String item) {

	}	
}
