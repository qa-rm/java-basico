package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio05_MetrosCentimetros {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Este programa converte metros para centímetros");
		System.out.println("Para começar digite um número em metro: ");
		Double numero = scan.nextDouble();
		System.out.println("O número " + numero + " convertido em centímetros é igual a " + (numero/0.01));
	}

}
