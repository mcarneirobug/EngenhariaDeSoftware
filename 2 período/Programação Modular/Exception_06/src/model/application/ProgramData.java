package model.application;

import java.time.LocalDate;
import java.util.Scanner;

import model.entities.data.Data;
import model.entities.exception.ExceptionData;;

public class ProgramData {
	public static void main(String[] args) throws ExceptionData {
		Scanner sc = new Scanner(System.in);
		LocalDate now = LocalDate.now();

		Data data = new Data();

		try {
			data = new Data(2020, 2, 13);
		} catch (ExceptionData e) {
			System.out.println("ANO INVALIDO - TRATAMENTO COM ANO ATUAL");
			data.setDia(13);
			data.setMes(2);
			data.setAno(now.getYear());
			System.out.println(e.getMessage());
		} finally {
			System.out.println(data.porExtenso());
		}

		System.out.println("-----------------------------------------------");
		System.out.println();

		try {
			data = new Data(2018, 13, 5);
		} catch (ExceptionData e) {
			System.out.println("MÊS INVALIDO - TRATAMENTO COM MÊS ATUAL");
			data.setDia(5);
			data.setMes(now.getMonthValue());
			data.setAno(2018);
			System.out.println(e.getMessage());
		} finally {
			System.out.println(data.porExtenso());
		}

		System.out.println("-----------------------------------------------");
		System.out.println();

		try {
			data = new Data(2018, 2, 35);
		} catch (ExceptionData e) {
			System.out.println("DIA INVALIDO - TRATAMENTO COM DIA ATUAL");
			data.setDia(now.getDayOfMonth());
			data.setMes(2);
			data.setAno(2018);
			System.out.println(e.getMessage());
		} finally {
			System.out.println(data.porExtenso());
		}
		sc.close();
		System.exit(0);
	}
}