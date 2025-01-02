package com.exercicios03.java;

import java.util.Scanner;

/*
int fatorial (int numero) {
    return numero == 0 ? 1 : numero * fatorial(numero - 1);
}
*/

public class Exercicio17_Fatorial {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Digite o número para calcular seu fatorial: ");
		int n = scan.nextInt();
		
		int calculo = n;		
		if (n == 0) calculo++;		
		n-= 1;
		
		while (n > 1) {
			System.out.println(calculo+"*"+n);
			calculo*= n--;
		};
	
		System.out.println("Resultado fatorial: " + calculo);
	}
}
