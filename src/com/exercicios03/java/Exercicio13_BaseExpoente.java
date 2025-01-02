package com.exercicios03.java;

import java.util.Scanner;

public class Exercicio13_BaseExpoente {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Base: ");
		int b = scan.nextInt();

		System.out.println("Expoente: ");
		int e = scan.nextInt();
		
		Double n = (double) 1;
		
		for (int i = 1; i <= e; i++) {
			n*= b; 
		}
		
		System.out.println("Resultado: "+n);
	}

}
