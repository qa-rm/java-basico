package com.exercicios03.java;

import java.util.Scanner;

public class Exercicio29_GeraPrimos {

	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Digite um número para determinar o intervalo de primos: ");
		int n = scan.nextInt();
		int primo, i, c = 1;
		
		do {
			primo = 0;
			for (i = 1; i <= c; i++) {
				if (c%i == 0) {
					primo++;				
				};
			}
			 
			if (primo == 2) System.out.print(c+" ");
			
			++c;
		} while (c <= n);
	}
}