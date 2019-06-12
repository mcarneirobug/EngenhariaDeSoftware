package entities;

public class UsedPiece extends Piece {
	private static final double REBATE = 0.15;
	
	public UsedPiece(String name, int guarantee, int amount) {
		super(name, guarantee, amount);
	}//end constructor()
	@Override
	public double getPrice() {
		return (super.getPrice() * REBATE);
	}//end getPrice()
}//end class UsedPiece()