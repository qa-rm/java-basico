package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio14_AtribuirNotaAluno {

	private static Scanner scan;
	private static String conceito;
	private static String situacao;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Digite duas notas: ");
		Double n1 = scan.nextDouble();
		Double n2 = scan.nextDouble();
		
		Double media = ((n1+n2)/2);
		
		System.out.println("Nota 1: " + n1 + "\tNota 2: " + n2);
		System.out.println("Média das Notas: " + media);
		
		if ((media > 0) && (media <= 4)) {
			conceito = "E";
		} else if ((media > 4) && (media <= 6)) {
			conceito = "D";
		} else if ((media > 6) && (media <= 7.5)) {
			conceito = "C";
		} else if ((media > 7.5) && (media <= 9)) {
			conceito = "B";
		} else if (media > 9) {
			conceito = "A";
		} else {
			conceito = "Inconsistente";
		}
		
		switch (conceito) {
		case "A":
		case "B":
		case "C": situacao = "APROVADO";
			break;
		case "D":
		case "E": situacao = "REPROVADO";
		default: situacao = "INCONSISTENTE";
			break;
		}
		
		System.out.println("Conceito: " + conceito);
		System.out.println("Situação: " + situacao);
	}

}
