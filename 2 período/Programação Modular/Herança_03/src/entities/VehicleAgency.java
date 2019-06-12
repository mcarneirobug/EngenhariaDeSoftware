package entities;

import applicationCar.Car;
import applicationCar.Fiat;
import applicationCar.Sedan;
import applicationCar.Truck;
import javax.swing.JOptionPane;

public class VehicleAgency extends Car {
	
	public static void main(String [] args) {

		Truck volvo = new Truck(100, 150000.0, "black", 2100);
		Truck iveco = new Truck(110, 185000.0, "red", 1900);

		Fiat uno = new Fiat(220, 12000.0, "yellow", 10);

		Sedan prisma = new Sedan(120, 43694.0, "white", 5);
		Sedan corolla = new Sedan(200, 20000.0, "green", 7);

		JOptionPane.showMessageDialog(null, "Truck volvo \n Load: " + volvo.getLoad()
				+ "\n Price: " + volvo.getSalePrice(), "volvo", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Truck iveco \n Load: " + iveco.getLoad()
				+ "\n Price: " + iveco.getSalePrice(), "iveco", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Fiat uno \n Price: " + uno.getSalePrice(),
				"uno", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Sedan prisma \n Price: " + prisma.getSalePrice(),
				"prisma", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Sedan corolla \n Price: " + corolla.getSalePrice(),
				"corolla", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}//end main()
}//end class VehicleAgency()
