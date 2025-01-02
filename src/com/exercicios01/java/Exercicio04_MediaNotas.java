package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio04_MediaNotas {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Digite quatro notas: ");
		Double n1 = scan.nextDouble();
		Double n2 = scan.nextDouble();
		Double n3 = scan.nextDouble();
		Double n4 = scan.nextDouble();
		
		System.out.println("Média das Notas: "+((n1+n2+n3+n4)/4));

	}

}
