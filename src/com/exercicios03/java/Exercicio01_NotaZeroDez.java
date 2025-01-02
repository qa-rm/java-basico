package com.exercicios03.java;

import java.util.Scanner;

public class Exercicio01_NotaZeroDez {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int n0;
		do {
			System.out.println("Digite uma nota de 0 à 10: ");
			n0 = scan.nextInt();
			
			if (n0 < 0 || n0 > 10) {
				System.out.println("Valor inválido.");
			}
		} while (n0 < 0 || n0 > 10);
		System.out.println("Muito bem.");
	}

}
