package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio08_Salario {

	private static Scanner scan;	
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Este programa vai calcular e mostrar o total do seu salário no mês");
		System.out.println("Quanto você ganha por hora? ");
		Double custoHora = scan.nextDouble();
		System.out.println("Quantas horas você trabalha por mês? ");
		Double horaTrabalhada = scan.nextDouble();
		System.out.println("O total do seu salário no mês é: R$" + (custoHora * horaTrabalhada));

	}

}
