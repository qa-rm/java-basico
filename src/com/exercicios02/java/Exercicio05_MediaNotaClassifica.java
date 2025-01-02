package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio05_MediaNotaClassifica {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Digite duas notas: ");
		Double n1 = scan.nextDouble();
		Double n2 = scan.nextDouble();
		
		Double media = ((n1+n2)/2);
		
		System.out.println("Média das Notas: " + media);
		
		if ((media >= 7) && (media != 10)) {
			System.out.println("Aprovado");
		} else if (media < 7) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado com Distinção");
		} 

	}

}