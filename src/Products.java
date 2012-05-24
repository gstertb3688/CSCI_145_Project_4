
public class Products {
	private int
		id, price, quantity;
	private String
		description;
	
	public Products() {
		this.setID(0);
		this.setPrice(0);
		this.setDescription("N/A");
		this.setQuantity(0);
	}
	public Products(int id, int quantity, int price, String description) {
		this.setID(id);
		this.setPrice(price);
		this.setDescription(description);
		this.setQuantity(quantity);
	}
	
	public void setID(int id) 						{ this.id = id; }
	public void setQuantity(int quantity) 			{ this.quantity = quantity; }
	public void setPrice(int price) 				{ this.price = price; }
	public void setDescription(String description) 	{ this.description = description; }
	
	public int getID() 				{ return this.id; }
	public int getPrice() 			{ return this.price; }
	public int getQuantity()		{ return this.quantity; }
	public String getDescription() 	{ return this.description; }
	
	public String toString() {
		return String.format("ID: %d\nQuantity: %d\nPrice: %d\nDescription: %s\n",
				this.id, this.quantity, this.price, this.description);
	}
}
