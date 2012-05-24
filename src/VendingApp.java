import java.util.ArrayList;


public class VendingApp {
	private ArrayList<VendingMachine>
		machines;
	
	public VendingApp() {
		this.machines = new ArrayList<VendingMachine>();
	}
	public VendingApp(VendingMachine machine) {
		this.addMachine(machine);
	}
	public VendingApp(ArrayList<VendingMachine> machines) {
		this.machines = machines;
	}
	
	private void addMachine(VendingMachine machine) {
		this.machines.add(machine);
	}
	
	public void run() {
		System.out.format("This vending app has %d machines", 
				this.machines.size());
	}
}
