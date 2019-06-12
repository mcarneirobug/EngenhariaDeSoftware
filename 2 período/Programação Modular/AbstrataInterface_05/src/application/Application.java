package application;

import java.util.Locale;

import entities.person.Address;
import entities.person.Customer;
import entities.person.Ordenador;

public class Application {	
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);	
		Address address = new Address("Savassi", "BH", "Minas Gerais", "MG", 1252525, 31250500);
	
		Customer [] listCustomer = { 
			new Customer("Matheus", address, 500.00),
			new Customer("José", address, 400.00),
			new Customer("Docin", address, 200.00),
			new Customer("Vanderlei", address, 800.00),
		};
		
		Customer [] auxList = new Customer[listCustomer.length];
		
		System.out.println("Lista original: ");
		show(listCustomer);
		
		System.out.println("Lista crescente: ");
		auxList = (Customer[]) Ordenador.crescente(listCustomer);
		show(auxList);
		
		System.out.println("Lista decrescente: ");
		auxList = (Customer[]) Ordenador.decrescente(listCustomer);
		show(auxList);
	}
	
	public static void show(Customer [] list) {
		for(Customer c : list)
			System.out.println(c.getName());
			System.out.println(" ");
	}	
}