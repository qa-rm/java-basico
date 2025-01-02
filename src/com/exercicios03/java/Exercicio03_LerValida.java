package com.exercicios03.java;

import java.util.Scanner;

public class Exercicio03_LerValida {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String nome;
		do {
			System.out.println("Digite o nome maior do que 3 caracteres: ");
			nome = scan.next();
		} while (nome.length() <= 3);
		
		scan = new Scanner(System.in);
		int idade;
		do {
			System.out.println("Digite a idade entre 0 e 150: ");
			idade = scan.nextInt();
		} while (idade < 0 || idade > 150);
		
		scan = new Scanner(System.in);
		Double salario;
		do {
			System.out.println("Digite o salário maior do que zero: ");
			salario = scan.nextDouble();
		} while (salario < 0);
		
		scan = new Scanner(System.in);
		String sexo;
		do {
			System.out.println("Digite o sexo (F/M): ");
			sexo = scan.next();
		} while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F"));
		
		scan = new Scanner(System.in);
		String civil;
		do {
			System.out.println("Digite o Estado Civil: 's', 'c', 'v', 'd': ");
			civil = scan.next();
		} while (!civil.equalsIgnoreCase("S") && !civil.equalsIgnoreCase("C") && !civil.equalsIgnoreCase("V") && !civil.equalsIgnoreCase("D"));
		
		System.out.println("Muito bem.");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + civil);
	}

}
