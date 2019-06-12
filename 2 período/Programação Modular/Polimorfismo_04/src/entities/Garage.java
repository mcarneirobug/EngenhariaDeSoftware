package entities;

public class Garage {
	private int id;
	private String description;
	private int amount; 
	private static int cont = 0;
	private static final double PRICE = 100.0;  
	
	public Garage(String description, int amount) {
		this.description = description;
		this.amount = amount;
		this.id = ++cont;
	}//end constructor()
	
	public Garage() {
		this.setDescription("Undefined");
		this.amount = 0;
		this.id = ++cont;
	}//end constructor()
	
	public static int getCount() {
		return cont;
	}//end getCount()
	
	public int getId() {
		return this.id;
	}//end getId()
	
	public double getPrice() {
		return (PRICE * this.getAmount());
	}//end getPrice()
	
	public String getDescription() {
		return this.description;
	}//end getDescription()
	
	public void setDescription(String description) {
		this.description = description;
	}//end setDescription()

	public int getAmount() {
		return this.amount;
	}//end getAmount()
} //end class Garage()