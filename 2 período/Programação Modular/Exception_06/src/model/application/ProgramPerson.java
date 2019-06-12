package model.application;

import java.util.Scanner;

import model.entities.exception.ExceptionValueNegative;
import model.entities.person.Address;
import model.entities.person.Customer;
import model.entities.person.Employee;

public class ProgramPerson {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws ExceptionValueNegative {

		regCustomer();
		System.out.println("");
		regEmployee();	
		System.exit(0);	
	}
	
	private static void regCustomer() {
		String name; 
		Address address = new Address("Savassi", "BH", "Minas Gerais", "MG", 1252525, 31250500);
		double creditLimit; 
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Credit limit: ");
		creditLimit = sc.nextDouble();
		
		try {
			new Customer(name, address, creditLimit);
		} catch(ExceptionValueNegative e) {
			e.printStackTrace();
			System.out.println(e.getMessage());	
		} finally {
			System.out.println("Encerrando...");
		}
	}
	
	
	private static void regEmployee() throws ExceptionValueNegative {
		String name, office; 
		long cpf; 
		int age;
		char genre; 
		double salary;
		
		sc.nextLine();
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Age: ");
		age = sc.nextInt();
		System.out.print("Genre: ");
		genre = sc.next().charAt(0);
		System.out.print("Cpf: ");
		cpf = sc.nextLong();
		System.out.print("Office: ");
		office = sc.nextLine();
		sc.nextLine();
		System.out.print("Salary: ");
		salary = sc.nextDouble();
		
		try {
			new Employee(name, null, cpf, age, genre, office, salary);
		} catch(ExceptionValueNegative e) {
			e.printStackTrace();
			System.out.println(e.getMessage());	
		} finally {
			System.out.println("Programa finalizado...");
		}	
	}
}
