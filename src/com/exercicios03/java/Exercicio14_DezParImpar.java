package com.exercicios03.java;

import java.util.Scanner;

public class Exercicio14_DezParImpar {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o número "+i+": ");
			int n = scan.nextInt();
			
			if ((n%2) == 0) {
				par+= 1;
			} else {
				impar+= 1;
			}
		}
		
		System.out.println("Total de números par: "+par);
		System.out.println("Total de números ímpar: "+impar);
	}

}
