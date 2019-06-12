package model.entities.exception;

public class ExceptionData extends Exception {
	private static final long serialVersionUID = 1L;

	public ExceptionData() {
		super("ERROR: Data invalida. ");
	}
	
	public ExceptionData(String msg) {
		super(msg);
	}
}
