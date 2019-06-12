package application;

import entities.Car;
import entities.Garage;
import entities.Invoice;
import entities.NewPiece;
import entities.Piece;
import entities.UsedPiece;

public class ProgramAgency {
	public static void main(String [] args) {
		
		Car car = new Car("Yellow", "Porsche", 2019);
		
		Piece p1 = new Piece("Handle", 12, 1);
		Piece p2 = new NewPiece("Wiper blade", 24, 2);
		Piece p3 = new UsedPiece("Roof", 6, 1);
		
		Piece [] piece = new Piece[3];
		
		piece[0] = p1;
		piece[1] = p2;
		piece[2] = p3;
		
		Garage garage = new Garage("Check the engine", 1);
		Invoice invoice = new Invoice(piece, car, garage);
		System.out.println(invoice.toString());
		System.exit(0);
	}//end main()
}//end ProgramAgency()