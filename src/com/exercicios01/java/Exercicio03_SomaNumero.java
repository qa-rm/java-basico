package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio03_SomaNumero {
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		int resultado = (numero1 + numero2);
		System.out.println("Soma = " + resultado);
		

	}

}
