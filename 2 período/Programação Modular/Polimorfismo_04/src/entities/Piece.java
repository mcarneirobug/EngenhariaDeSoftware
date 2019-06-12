package entities;

public class Piece {
	private String name;
	private static double price = 50.0;
	private int amount;
	private int guarantee;
	
	public Piece(String name, int guarantee, int amount) {
		this.setName(name);
		this.amount = amount;
		this.setGuarantee(guarantee);
	}//end constructor()
	
	public String getName() {
		return ("Piece: "+ this.name);
	}//end getName()

	public void setName(String name) {
		this.name = name;
	}//end setName()

	public double getPrice() {
		return (price * this.getAmount());
	}//end getPrice()

	public int getGuarantee() {
		return this.guarantee;
	}//end getGuarantee()

	public void setGuarantee(int guarantee) {
		this.guarantee = guarantee;
	}//end setGuarantee()

	public int getAmount() {
		return this.amount;
	}//end getAmount()
}//end class Piece()