package applicationCar;

public class Truck extends Car {
	
	private int load;
	
	public Truck(int speed, double price, String color, int load) {
		super(speed, price, color);
		this.load = load;
	}//end constructor()
	
	public double getSalePrice() {
		if(this.load > 2000) {
			return super.price - (super.price * 10)/100;
		} else {
			return super.price - (super.price * 20)/100;
		}//end else
	}//end getSalePrice()

	public int getLoad() {
		return this.load;
	}//end getLoad()
	
}//end class Truck()
