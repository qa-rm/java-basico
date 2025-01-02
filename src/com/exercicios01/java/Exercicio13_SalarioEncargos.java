package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio13_SalarioEncargos {

	private static Scanner scan;	
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Este programa vai calcular e mostrar o total do seu salário e encargos no mês");
		System.out.println("Quanto você ganha por hora? ");
		Double custoHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês? ");
		Double horaTrabalhada = scan.nextDouble();
		
		Double bruto = (custoHora * horaTrabalhada);
		Double liquido = (bruto * 0.76);
		System.out.println("Salário Bruto: R$" + bruto);
		System.out.println("INSS: R$" + (bruto * 0.08));
		System.out.println("Sindicato: R$" + (bruto * 0.05));
		System.out.println("Salário Líquido: R$" + liquido);
		
		System.out.println("Salário Bruto : R$ " + bruto + " - IR (11%) : R$ " + (bruto * 0.11) + " - INSS " +
		" (8%) : R$ " + (bruto * 0.08) + " - Sindicato ( 5%) : R$ " + (bruto * 0.05) + " = Salário " +
		" Liquido : R$ " + liquido);

	}
}
