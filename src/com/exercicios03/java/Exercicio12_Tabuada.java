package com.exercicios03.java;

import java.util.Scanner;

public class Exercicio12_Tabuada {

	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int n = 0;
		do {
			System.out.println("Digite um número entre 1 e 10 para calcular a tabuada: ");
			n = scan.nextInt();
		} while (n<1 || n>10);
		
		System.out.println("o Tabuada de: "+n);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("o "+n+" x "+i+" = "+n*i);
		}
	}

}
