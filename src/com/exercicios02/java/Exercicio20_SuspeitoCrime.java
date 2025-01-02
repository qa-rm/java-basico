package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio20_SuspeitoCrime {

	private static Scanner scan;
	private static String p1;
	private static String p2;
	private static String p3;
	private static String p4;
	private static String p5;
	private static int conta;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println(". Telefonou para a vítima? (S/N)");
		p1 = scan.nextLine().toUpperCase();
		
		System.out.println("Esteve no local do crime? (S/N)");
		p2 = scan.nextLine().toUpperCase();
		
		System.out.println("Mora perto da vítima? (S/N)");
		p3 = scan.nextLine().toUpperCase();
		
		System.out.println("Devia para a vítima? (S/N)");
		p4 = scan.nextLine().toUpperCase();
		
		System.out.println("Já trabalhou com a vítima? (S/N)");
		p5 = scan.nextLine().toUpperCase();

		conta = 0;
		
		if (p1.intern() == "S") {
			conta+= 1;
		}
		if (p2.intern() == "S") {
			conta+= 1;
		}
		if (p3.intern() == "S") {
			conta+= 1;
		}
		if (p4.intern() == "S") {
			conta+= 1;
		}
		if (p5.intern() == "S") {
			conta+= 1;
		}
		
		switch (conta) {
		case 1:
		case 2: System.out.println("Suspeita");
			break;
		case 3:
		case 4: System.out.println("Cúmplice");
		break;
		case 5: System.out.println("Assassino");
		break;

		default: System.out.println("Inocente");
			break;
		}
	}

}
