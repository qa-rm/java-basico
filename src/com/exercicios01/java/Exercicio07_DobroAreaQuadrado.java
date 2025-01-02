package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio07_DobroAreaQuadrado {

	private static Scanner scan;	
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Este programa vai calcular a área de um quadrado e depois dobrá-la e exibi-la");
		System.out.println("Para começar digite o valor de um dos lados do quadrado: ");
		Double lado = scan.nextDouble();
		System.out.println("O dobro da área do quadrado é: " + ((Math.pow(lado, 2))*2));
	}

}
