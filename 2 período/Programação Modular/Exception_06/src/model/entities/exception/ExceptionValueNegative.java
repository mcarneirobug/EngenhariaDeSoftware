package model.entities.exception;

public class ExceptionValueNegative extends Exception {
	private static final long serialVersionUID = 1L;

	public ExceptionValueNegative() {
		super("ERROR: Nao pode haver valor negativo.");
	}
	
	public ExceptionValueNegative(String msg) {
		super(msg);
	}
}
