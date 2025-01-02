package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio06_AreaCirculo {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Este programa vai calcular a área de um círculo");
		System.out.println("Para começar digite o valor do raio do círculo: ");
		Double raio = scan.nextDouble();
		System.out.println("A área do círculo é: " + (Math.PI * Math.pow(raio, 2)));

	}

}
