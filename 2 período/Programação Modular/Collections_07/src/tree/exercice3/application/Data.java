package tree.exercice3.application;

import java.time.LocalDate;
import java.util.Calendar;

public class Data implements Ordenavel {
	private int ano;
	private int mes;
	private int dia;

	public int getAno() {
		return this.ano;
	} // end getAno()

	public void setAno(int ano) throws ExceptionData {
		if(this.ano < 0 || this.ano > 2019) 
			throw new ExceptionData();
		this.ano = ano;
	} // end setAno()

	public int getMes() {
		return this.mes;
	} // end getMes()

	public void setMes(int mes) throws ExceptionData {
		if(mes > 12 || mes <= 0)
			throw new ExceptionData();
		this.mes = mes;
	} // end setMes()

	public int getDia() {
		return this.dia;
	} // end getDia()

	public void setDia(int dia) throws ExceptionData {
		if(this.dia > 31 || this.dia < 0)
			throw new ExceptionData();
		this.dia = dia;
	} // end setDia()

	public Data() {
		LocalDate now = LocalDate.now();
		this.dia = now.getDayOfMonth();
		this.mes = now.getMonthValue();
		this.ano = now.getYear();
	} // end Data()

	public Data(int ano, int mes, int dia) throws ExceptionData {
		this.setAno(ano);
		this.setMes(mes);
		this.setDia(dia);
	} // end construtor secundario()

	public void adicionaDias(int dias) {
		for(int i = 0; i < dias; i++, proximoDia());
	} // end adicionaDias()

	public int diasNoMes() {
		int dia; 
		
		if(this.getMes() == 2) {
			if(eAnoBissexto()) {
				dia = 29;
			}//end if
			else {
				dia = 28;
			}//end else
		}//end if
		else {
			if(this.getMes() == 1 || this.getMes() == 3 || this.getMes() == 5 || this.getMes() == 7 ||
			   this.getMes() == 8 || this.getMes() == 10 || this.getMes() == 12) {
				dia = 31;
			} //end if
			else {
				dia = 30;
			} //end else
		} //end else
		return (dia);
	}//end diasNoMes()

	public String diaDaSemana() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(this.getAno(), this.getMes(), this.getDia());
		int aux = calendar.get(Calendar.DAY_OF_WEEK);
		String week = "";
		
		switch(aux) {
		case 1: 
			week = "Domingo";
			break;
		case 2:
			week = "Segunda-feira";
			break;
		case 3:
			week = "Terca-feira";
			break;
		case 4:
			week = "Quarta-feira";
			break;
		case 5:
			week = "Quinta-feira";
			break;
		case 6:
			week = "Sexta-feira";
			break;
		case 7:
			week = "Sabado";
			break;
		default: 
			System.out.println("ERROR: Dia invalido. ");
		}//switch
		return (week);
	} // end diaDaSemana()

	public boolean eAnoBissexto() {
		if (this.getAno() % 4 == 0 && this.getAno() % 100 != 0) {
			return true;
		} // end if
		else {
			return false;
		} // end else
	} // end eAnoBissexto()

	public boolean fimAno() {
		if (this.mes == 12) {
			return true;
		} else {
			return false;
		} // end else
	}// end fimAno()

	public void proximoDia() {
		if(this.getMes() == 2) {
			if(eAnoBissexto()) {
				if(this.getDia() == 29) {
					this.mes++;
					this.dia = 1;
				} else {
					this.dia++;
				}//end else
			} else {
				if(this.getDia() == 28) {
					this.dia = 1;
					this.mes++;
				} else {
					this.dia++;
				}//end else
			} //end else
		} else {
			if(fimAno()) {
				if(this.getDia() == 31) {
					this.dia = 1;
					this.mes = 1;
					this.ano++;
				} else {
					this.dia++;
				}//end else
			} else {
				if(this.getMes() == 4 || this.getMes() == 6 || this.getMes() == 9 || this.getMes() == 11) {
					if(this.getDia() == 30) {
						this.dia = 1;
						this.mes++;
					} else {
						this.dia++;
					}//end else
				} else {
					if(this.getDia() == 31) {
						this.dia = 1;
						this.mes++;
					} else {
						if(this.getDia() == 31) {
							this.dia = 1;
							this.mes++;
						} else {
							this.dia++;
						}//end else
					}//end else
				}//end else
			}//end else
		}//end else
	}//end proximoDia()
	
	public String porExtenso() {
		String ext = "";

		switch (this.mes) {
		case 1:
			ext = "Janeiro";
			break;
		case 2:
			ext = "Fevereiro";
			break;
		case 3:
			ext = "Marco";
			break;
		case 4:
			ext = "Abril";
			break;
		case 5:
			ext = "Maio";
			break;
		case 6:
			ext = "Junho";
			break;
		case 7:
			ext = "Julho";
			break;
		case 8:
			ext = "Agosto";
			break;
		case 9:
			ext = "Setembro";
			break;
		case 10:
			ext = "Outubro";
			break;
		case 11:
			ext = "Novembro";
			break;
		case 12:
			ext = "Dezembro";
			break;
		default:
			System.out.println("ERROR: Mes invalido. ");
		} // end switch
		return (this.dia + " de " + ext + " de " + this.ano);
	} // end porExtenso()

	@Override
	public String toString() {
		return (this.getDia()+ "/" + this.getMes() + "/" + this.getAno());
	}
	
	public void show() {
		System.out.println(this);
	}
		
	@Override
	public boolean menorQue(Ordenavel o) {
		Data data = (Data) o;
		boolean aux = false;
		if(this.getAno() < data.getAno()) {
			aux = true;
		} else if(this.getAno() > data.getAno()) {
			aux = false;
		} else {
			if(this.getMes() < data.getAno()) {
				aux = true;
			} else if(this.getMes() > data.getMes()) {
				aux = false;
			} else {
				if(this.getDia() < data.getDia()) {
					aux = true;
				} else {
					aux = false;
				}
			}
		}
		return (aux);
	}
} // end class Data()