package tree.exercice3.application;

public class ExceptionData extends Exception {
	private static final long serialVersionUID = 1L;

	public ExceptionData() {
		super("ERROR: Data invalida. ");
	}
	
	public ExceptionData(String msg) {
		super(msg);
	}
}
