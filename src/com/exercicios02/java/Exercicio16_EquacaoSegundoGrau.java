package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio16_EquacaoSegundoGrau {

	private static Scanner scan;
	private static Double b;
	private static Double c;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Equação do segundo grau: \"ax2 + bx + c\"");
		System.out.println("Informe \"ax\": ");
		int a = scan.nextInt();
		
		if (a == 0) {
			System.out.println("Não é uma equação de segundo grau.");
		} else {
			System.out.println("Informe \"bx\": ");
			b = scan.nextDouble();
			
			System.out.println("Informe \"cx\": ");
			c = scan.nextDouble();
			
			double d = Math.pow(b,2) - 4 * a * c;
			
			System.out.println("Delta = " + d);
			
			if (d < 0) {
				System.out.println("A equação não possui raízes reais, porque Delta é negativo");
			} else if (d == 0) {
				System.out.println("A equação possui apenas uma raíz real, sendo ela: " + (-b / (2 * a)));
			} else {
				System.out.println("Raiz 1, ▲ positivo: " + ((-(b) + Math.sqrt(d)) / (2 * a)));
				System.out.println("Raiz 2, ▲ negativo: " + ((-(b) - Math.sqrt(d)) / (2 * a)));
			}
			
		}
	}

}
