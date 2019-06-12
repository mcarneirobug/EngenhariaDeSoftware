package applicationCar;

public class Fiat extends Car {
	
	private int factoryDiscount;
	
	public Fiat(int speed, double price, String color, int factoryDiscount) {
		super(speed, price, color);
		this.factoryDiscount = factoryDiscount;
	}//end constructor()
	
	public double getSalePrice() {

		return (super.getSalePrice() - (super.getSalePrice() * this.factoryDiscount/100));
	}//end getSalePrice()
}//end class Fiat()
