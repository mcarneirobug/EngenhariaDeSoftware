package applicationCar;

public class Sedan extends Car {
	private int length;
	
	public Sedan(int speed, double price, String color, int length) {
		super(speed, price, color);
		this.length = length;
	}//end constructor()

	public double getSalePrice() {
		if(this.length > 6) {
			return super.price - (super.price * 5)/100;
		} else {
			return super.price - (super.price * 10)/100;
		}//end else
	}//end getSalePrice()
}//end class Sedan()
