package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio06_TresMaior {

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
		
		System.out.println("O maior número é: " + maior);

	}

}
