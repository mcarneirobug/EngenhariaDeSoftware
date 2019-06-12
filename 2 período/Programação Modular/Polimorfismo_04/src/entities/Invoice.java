package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice {
	private Date date = new Date();
	private Garage garage;
	private Car car;
	private Piece [ ] piece;
	
	public Invoice(Piece [ ] piece, Car car, Garage garage) {
		this.setPiece(piece);
		this.setCar(car);
		this.garage = garage;
	}//end constructor()
	
	public Invoice(Date date) {
		this.setDate(date);
		this.setPiece(piece);
	}//end constructor()

	public Car getCar() {
		return this.car;
	}//end getCar()

	public void setCar(Car car) {
		this.car = car;
	}//end setCar()

	public Piece[] getPiece() {
		return this.piece;
	}//end getPiece()

	public void setPiece(Piece[] piece) {
		this.piece = piece;
	}//end setPiece()

	public Date getDate() {
		return this.date;
	}//end getDate()

	public void setDate(Date date) {
		this.date = date;
	}//end setDate()
	
	private double piecePrice() {
		double aux = 0;
		for(int i=0;i<this.piece.length;i++) {
			aux = aux + this.piece[i].getPrice();
		}
		return (aux);
	}//end piecePrice()
	
	private double calculateAll() {
		return this.car.getPrice() + this.piecePrice() + this.garage.getPrice();
	}//end calculateAll()

	@Override
	public String toString() {	
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String aux = ("###########################################################");
		aux += ("\n# Date: "+ dateFormat.format(date) + "                               #\n");
		aux += ("######################## INVOICE ##########################");
		aux += ("\nCar: "+ car.getModel() + " | Color: "+ car.getColor()+
				" | Year: "+ car.getYear() + " | Price: "+ this.car.getPrice());
		for(int i=0;i<piece.length;i++) {
			if(piece[i] instanceof NewPiece) {
				aux += ("\n\nNew Piece: ");
			}//end if
			else if(piece[i] instanceof UsedPiece) {
				aux += ("\n\nUsed Piece: ");
			}//end else if
			else {
				aux += ("\n\nPiece: ");
			}//end else
			aux += (piece[i].getName() + " | Amount: " + piece[i].getAmount()+ 
					           " | Price: R$"+piece[i].getPrice());
		}//end for
		aux += ("\n\nGarage: "+ garage.getDescription() + " | Price: R$"+ garage.getPrice());
		aux += ("\n##########################################################");
		aux += ("\n# Final price: "+ "[R$ "+ calculateAll() +"]            		 #");	
		aux += ("\n##########################################################");
		return (aux);
	}//end toString()
}//end class Invoice()