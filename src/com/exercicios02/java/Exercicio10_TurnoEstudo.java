package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio10_TurnoEstudo {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Em que turno você estuda? ");
		System.out.println("Por favor, digite \"M\"-matutino \"V\"-Vespertino ou \"N\"-Noturno");
		
		String turno = scan.nextLine().toUpperCase().trim();
		switch (turno) {
		case "M":
			System.out.println("Bom Dia!");
			break;
		case "V":
			System.out.println("Boa Tarde!");
			break;
		case "N":
			System.out.println("Boa Noite!");
			break;
		default:
			System.out.println("Valor Inválido!");
			break;
		}
	}

}
