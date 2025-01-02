package com.exercicios03.java;

import java.util.Scanner;

public class Exercicio07_MaiorNumero {

	private static Scanner scan;	
	
	public static void main(String[] args) {		
		scan = new Scanner(System.in);			
		
		Double maior = (double) 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Informe o número "+i+":");
			Double n = scan.nextDouble();
			
			if (n > maior) {
				maior = n;
			}
		}
		
		System.out.println("O maior número é: " + maior);

	}

}
