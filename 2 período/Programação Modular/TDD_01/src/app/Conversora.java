package app;

public class Conversora {

	private final double pes = 3.2808;
	private final double pol = 39.370;
	
	public Conversora() {
		//empty
	} //end Conversora()
	
	public double converterPesParaMetros(double valor) {
		double resp;
		resp = (valor/this.getPes());
		return (resp);
	} //end converterPesParaMetros()

	public double converterPesParaPolegadas(double valor) {
		double resp;
		resp = (valor * this.getPol())/this.getPes();
		return (resp);
	} //end converterPesParaPolegadas()
	
	public double converterPesParaCentimetros(double valor) {
		double resp;
		resp = (valor * 100.0)/this.getPes();
		return (resp);
	} //end converterPesParaCentimetros()
	
	public double converterPolegadasParaMetros(double valor) {
		double resp;
		resp = (valor/this.getPol());
		return (resp);
	} //end converterPolegadasParaMetros()
	
	public double converterPolegadasParaPes(double valor) {
		double resp;
		resp = (valor * this.getPes())/this.getPol();
		return (resp);
	} //end converterPolegadasParaPes()
	
	public double converterPolegadasParaCentimetros(double valor) {
		double resp;
		resp = (valor * 100.0)/this.getPol();
		return (resp);
	} //end converterPolegadasParaCentimetros()
	
	public double converterMetrosParaPes(double valor) {
		double resp;
		resp = (valor * this.getPes());
		return (resp);
	} //end converterMetrosParaPes()
	
	public double converterMetrosParaPolegadas(double valor) {
		double resp;
		resp = (valor * this.getPol());
		return (resp);
	} //end converterMetrosParaPolegadas()
	
	public double converterMetrosParaCentimetros(double valor) {
		double resp;
		resp = (valor * 100.0);
		return (resp);
	} //end converterMetrosParaCentimetros()
	
	public double converterCentimetrosParaPes(double valor) {
		double resp;
		resp = (valor * this.getPes())/100;
		return (resp);
	} //end converterCentimetrosParaPes()
	
	public double converterCentimetrosParaPolegadas(double valor) {
		double resp;
		resp = (valor * this.getPol())/100;
		return (resp);
	} //end converterCentimetrosParaPolegadas()
	
	public double converterCentimetrosParaMetros(double valor) {
		double resp;
		resp = (valor/100);
		return (resp);
	} //end converterCentimetrosParaMetros()
	
	public double getPes() {
		return pes;
	} //end getPes()

	public double getPol() {
		return pol;
	} //end getPol()
	
} //end class Conversora()
