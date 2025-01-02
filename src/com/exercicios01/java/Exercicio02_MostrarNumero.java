package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio02_MostrarNumero {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);		
		
		System.out.println("Digite um número: ");
		int numero1 = scan.nextInt();
		System.out.println("O número informado foi: " + numero1);		
		

	}

}
