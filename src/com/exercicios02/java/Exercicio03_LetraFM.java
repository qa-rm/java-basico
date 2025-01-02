package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio03_LetraFM {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		String letra = scan.next();

		
		if (letra.equalsIgnoreCase("M")){
			System.out.println("M – Letra Eme");			
		} else if (letra.equalsIgnoreCase("F")) {
			System.out.println("F – Letra Efe");
		} else { System.out.println("Nenhuma das opções");}
		
	}
}
