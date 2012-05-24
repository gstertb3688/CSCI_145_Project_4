
public class Transaction {
	private int
		number, paid, change;
	private Products
		product;
	
	public Transaction() {
		this.setNumber(0);
		this.setPaid(0);
		this.setProduct(new Products());
	}
	public Transaction(int number, int paid, Products product) {
		this.setNumber(number);
		this.setPaid(paid);
		this.setProduct(product);
	}
	
	public void setChange(int change) 			{ this.change = change;}
	
	private void setNumber(int number) 			{ this.number = number; }
	private void setPaid(int paid) 				{ this.paid = paid; }
	private void setProduct(Products product) 	{ this.product = product; }	
	
	public int getNumber() 		{ return this.number; }
	public int getPaid() 		{ return this.paid; }
	public int getChange()		{ return this.change; }
	public Products getProduct(){ return this.product; }
	
	public String toString() {
		return String.format("Transaction Number: %d\nProduct: %s\nAmount paid: %d\nChange: %d\n",
								number, product, paid, change);
	}
}
