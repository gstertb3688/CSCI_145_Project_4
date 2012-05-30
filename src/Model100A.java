import java.util.ArrayList;

public class Model100A extends VendingMachine {
	public Model100A () { super(); }
	public Model100A (ArrayList<String> itemSelectors, ArrayList<Products> inventory) { 
		super(itemSelectors, inventory);
	}
	
	public void takeMoney(int money) {
		if (money == 5 || money == 10 || money == 25) {
			this.currentPaid += money;
		}
		else {
			System.out.println("Error: Only takes coins.");
			this.currentPaid = 0;
		}
	}
	
	public void pickItem(String item) \\not sure if this one is need or not for this machine
	{
		
	}
	
	public String toString() {
		// add more data
		return String.format("This machine accepts coins only.\n)" +
								"No changes will be given.\n");
	}
}
