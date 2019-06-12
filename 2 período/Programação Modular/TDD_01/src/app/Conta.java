package app;

public class Conta {
	
	private double saldo;
	private int conta;
	private static int id = 0;
	
	public double getSaldo() {
		return this.saldo;
	} //end getSaldo()
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	} //end setSaldo()
	
	public int getConta() {
		return this.conta;
	} //end getConta()
	
	public void setConta(int conta) {
		this.conta = conta;
	} //end setConta()
	
	/**
	 * Construtor padrao
	 */
	public Conta() {
		this.saldo = 0.0;
		this.conta = 12345;
		Conta.setId(Conta.getId() + 1);
	} //end Conta()
	
	public Conta(double saldo, int conta) {
		this.setSaldo(saldo);
		this.setConta(conta);
		Conta.setId(Conta.getId() + 1);
	} //end construtor secundario()
	
	public void depositar(double valor) {
		this.saldo += valor;
	} //end depositar()
	
	public boolean sacar (double valor) {
		if(this.getSaldo() - valor < 0) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		} //end else
	} //end sacar()

	public static int getId() {
		return Conta.id;
	}//end getId()

	public static void setId(int id) {
		Conta.id = id;
	}//end setId()
} //end class Conta()
