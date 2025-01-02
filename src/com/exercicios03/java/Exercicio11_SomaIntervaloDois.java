package com.exercicios03.java;

import java.util.Scanner;

public class Exercicio11_SomaIntervaloDois {

	private static Scanner scan;
	private static int n1;
	private static int n2;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		n1 = scan.nextInt();

		System.out.println("Digite outro número inteiro: ");
		n2 = scan.nextInt();
		
		int Soma = 0;		
		if (n1 < n2) {
			for (int i = n1+1; i < n2; i++) {
				Soma+= i;
				System.out.print(i+" ");
			}
		} else if (n2 < n1) {
			for (int i = n2+1; i < n1; i++) {
				Soma+= i;
				System.out.print(i+" ");
			}
		} else {
			System.out.println("Não existe intervalo entre os números.");
		};
		
		System.out.println("Soma do intervalo entre os números: "+Soma);
	}
}
