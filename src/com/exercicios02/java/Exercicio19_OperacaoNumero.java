package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio19_OperacaoNumero {
	
	private static Scanner scan;
	private static int m1;
	private static int m2;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		System.out.println("Qual operação deseja fazer?");
		System.out.println("\"a\". par ou ímpar;");
		System.out.println("\"b\". positivo ou negativo;");
		
		String escolha = scan.next().toLowerCase().trim();
		
		switch (escolha) {
		case "a":
			m1 = n1%2;
			m2 = n2%2;
			
			if (m1 == 0) {
				System.out.println(n1 + " = par");
			} else {
				System.out.println(n1 + " = ímpar");
			}
			
			if (m2 == 0) {
				System.out.println(n2 + " = par");
			} else {
				System.out.println(n2 + " = ímpar");
			}
			break;
		case "b":
			if (n1 > 0) {
				System.out.println(n1 + " = positivo");
			} else if (n1 < 0) {
				System.out.println(n1 + " = negativo");
			} else {
				System.out.println(n1 + " = nulo");
			}
			
			if (n2 > 0) {
				System.out.println(n2 + " = positivo");
			} else if (n2 < 0) {
				System.out.println(n2 + " = negativo");
			} else {
				System.out.println(n2 + " = nulo");
			}
			break;
		default: System.out.println("Opção inválida!!");
		}
	}
}
