package entities;

public class Car {
	private String color;
	private String model;
	private int year;
	private static final double FIXED_PRICE = 80.000;
	
	public Car() {
		this.setColor("red");
		this.setModel("Porsche");
		this.setYear(2019);
	} //end constructor()
	
	public Car(String color, String model, int year) {
		this.setColor(color);
		this.setModel(model);
		this.setYear(year);
	}//end constructor()
	
	public String getColor() {
		return this.color;
	} //end getColor()
	
	public void setColor(String color) {
		this.color = color;
	}//end setColor()
	
	public String getModel() {
		return this.model;
	}//end getModel()
	
	public void setModel(String model) {
		this.model = model;
	}//end setModel()
	
	public int getYear() {
		return this.year;
	}//end getYear()
	
	public void setYear(int year) {
		this.year = year;
	}//end setYear()

	public double getPrice() {
		if(this.model.contains("sedan")) {
			return (FIXED_PRICE + 500.00) * 0.10 + 100000.00;
		} else {
			return (FIXED_PRICE + 500.00) * 0.50 + 100000.00;
		}//end else
	}//end getPrice()
} //end class Car()