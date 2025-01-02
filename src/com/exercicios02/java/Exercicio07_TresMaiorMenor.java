package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio07_TresMaiorMenor {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		Double n1 = scan.nextDouble();
		Double n2 = scan.nextDouble();
		Double n3 = scan.nextDouble();
		
		Double maior = (double) 0;
		
		if (n1 > n2) {
			maior = n1;
		} else if (n1 < n2) {
			maior = n2;
		}
		
		if (n3 > maior) {
			maior = n3;
		}
		
		Double menor = (double) 0;
		
		if (maior == n1) {
			if (n2 < n3) {
				menor = n2;
			} else { menor = n3;}
		} else if (maior == n2) {
			if (n1 < n3) {
				menor = n1;
			} else { menor = n3;}
		} else if (maior == n3) {
			if (n1 < n2) {
				menor = n1;
			} else { menor = n2;}
		}
		
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
	}

}
