package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio18_ParImpar {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int n = scan.nextInt()%2;
		
		if (n == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é ímpar");
		}

	}

}
