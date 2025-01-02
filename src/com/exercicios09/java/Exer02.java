package com.exercicios09.java;

import java.util.Scanner;

public class Exer02 {

	private static Scanner scan;
	
	public static void main(String[] args) {
		System.out.println("***Calculadora***");
		
		scan = new Scanner(System.in);
		
		int t;
		
		do {
			System.out.println("***1-Soma | 2-Subtração | 3-Multiplicação | 4-Divisão | 5-Potência |6-Sair***");
			t = scan.nextInt();
			
			if (t != 6) {
				System.out.println("Digite primeiro e segundo valores: ");
				Double n1 = scan.nextDouble();
				Double n2 = scan.nextDouble();
				
				Calculadora.calcular(t, n1, n2);
			}
		} while (t != 6);
		
		System.out.println("Fim do programa, see ya!!");
	}

}
