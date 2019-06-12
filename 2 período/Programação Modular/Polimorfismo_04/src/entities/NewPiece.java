package entities;

public class NewPiece extends Piece {
	public static final double NEW_PIECE = 100.0;
	
	public NewPiece(String name, int guarantee, int amount) {
		super(name, guarantee, amount);
	}//end constructor()
	@Override
	public double getPrice() {
		return (super.getPrice() + NEW_PIECE);
	}//end getPrice()
}//end class NewPiece()