
public class Test {
	public static void main(String[] args) {
		Products
			p1, p2, p3;
		Transaction
			t1, t2, t3;
		Inventory
			i1 = new Inventory();
		Model100A
			hundredA1 = new Model100A();
		VendingApp
			va1;
		
		va1 = new VendingApp(hundredA1);
		va1.run();
		
		p1 = new Products(1000, 20, 55, "chocolate chips");
		p2 = new Products(1034, 10, 50, "candy bar");
		p3 = new Products(1100, 17, 75, "cookies");
		
		i1.add(p1);
		i1.add(p2);
		i1.add(p3);
		
		t1 = new Transaction(1, 80, p1);
		t2 = new Transaction(2, 80, p2);
		t3 = new Transaction(3, 100, p3);
		
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		System.out.println(i1);
	}
}
