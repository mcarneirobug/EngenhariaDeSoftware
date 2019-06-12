package applicationCar;

public class Car {
	
	protected int speed;
	protected double price;
	protected String color;
	
	public double getSalePrice() {
		return getPrice();
	}//end getSalePrice()
	
	/**
	 * getter and setter
	 * @return
	 */
	
	public int getSpeed() {
		return this.speed;
	}//end getSpeed()
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}//end setSpeed()
	
	public double getPrice() {
		return this.price;
	}//end getPrice()
	
	public void setPrice(double price) {
		this.price = price;
	}//end setPrice()
	
	public String getColor() {
		return this.color;
	}//end getColor()
	
	public void setColor(String color) {
		this.color = color;
	}//end setColor()
	
	/**
	 * Constructor
	 */
	
	public Car() {
		this.setSpeed(100);
		this.setPrice(45000);
		this.setColor("Red");
	}//end default constructor() 
	
	public Car(int speed, double price, String color) {
		this.setSpeed(speed);
		this.setPrice(price);
		this.setColor(color);
	}//end constructor()
}//end class Car()
