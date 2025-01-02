package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio01_NumeroMaior {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		if (n1 >= n2) {
			System.out.println(n1);			
		} else if (n1 <= n2) {
			System.out.println(n2);
		}

	}

}
