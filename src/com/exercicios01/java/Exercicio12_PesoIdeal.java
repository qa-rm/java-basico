package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio12_PesoIdeal {

	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Este programa vai calcular o peso ideal pela altura.");
		System.out.println("Para começar informe uma altura: ");
		Double altura1 = scan.nextDouble();
		
		System.out.println("Peso ideal: " + ((72.7 * altura1) - 58) + " Kg");


	}

}
