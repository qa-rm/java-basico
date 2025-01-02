package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio15_TipoTriangulo {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Por favor, dê-me três lados de um triangulo");
		int l1 = scan.nextInt();
		int l2 = scan.nextInt();
		int l3 = scan.nextInt();
		
		if (((l1 + l2) > l3) || ((l1 + l3) > l2) || ((l2 + l3) > l1) && ((l1 > 0) && (l2 > 0) && (l3 > 0))) {
			if ((l1 == l2) && (l2 == l3)) {
				System.out.println("Triângulo Equilátero");
			} else if (((l1 == l2) && (l1 != l3)) ||
					   ((l1 != l2) && (l2 == l3)) ||
					   ((l1 == l3) && (l2 != l3))) {
				System.out.println("Triângulo Isósceles");
			} else {
				System.out.println("Triângulo Escaleno");
			}
		} else {
			System.out.println("Não é um triângulo!!");
		}

	}

}