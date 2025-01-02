package com.exercicios03.java;

public class Exercicio04_Populacao {
	public static void main(String[] args) {
		Double pA = 80000.00;
		Double pB = 200000.00;
		int C = 0;
		while (pB >= pA) {
			pA = pA + (pA * 0.03);
			pB = pB + (pB * 0.015);
			
			C+= 1; 
		};
		
		System.out.println("Anos Necessários: " + C);		
	}
}
