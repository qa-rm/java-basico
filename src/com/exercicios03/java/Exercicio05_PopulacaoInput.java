package com.exercicios03.java;

import java.util.Scanner;

public class Exercicio05_PopulacaoInput {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		Double pA;
		System.out.println("Informe população A: ");
		pA = scan.nextDouble();
		Double tA;
		System.out.println("Informe taxa crescimento A: ");
		tA = scan.nextDouble();
		
		Double pB;
		System.out.println("Informe população B: ");
		pB = scan.nextDouble();
		Double tB;
		System.out.println("Informe taxa crescimento B: ");
		tB = scan.nextDouble();
		
		int C = 0;
		if (pA > pB) {
			do {
				pA = pA + (pA * tA);
				pB = pB + (pB * tB);
				
				C++;
			} while (pB <= pA);
			
			System.out.println("Tempo (anos) para B chegar em A: " + C);
		} else if (pB > pA) {
			do {
				pA = pA + (pA * tA);
				pB = pB + (pB * tB);
				
				C++;
			} while (pA <= pB);
			
			System.out.println("Tempo (anos) para A chegar em B: " + C);
		} else {
			System.out.println("Ambas populações são iguais");
		}
	}

}
