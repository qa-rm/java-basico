package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio02_PositivoNegativo {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int valor = scan.nextInt();
		
		if (valor > 0){
			System.out.println("Positivo");			
		} else if (valor < 0) {
			System.out.println("Negativo");
		} else { System.out.println("Nulo");}

	}

}
