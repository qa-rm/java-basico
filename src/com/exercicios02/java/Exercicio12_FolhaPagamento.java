package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio12_FolhaPagamento {

	private static Scanner scan;
	private static Double ir = (double) 0;
	private static String porcentagemIr = null;
	private static Double inss = (double) 0;
	private static Double fgts = (double) 0;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Este programa vai calcular a folha de pagamento.");
		System.out.println("Quanto você ganha por hora? ");
		Double custoHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês? ");
		int horaTrabalhada = scan.nextInt();
		
		Double bruto = custoHora * horaTrabalhada;
		inss = bruto * 0.1;
		fgts = bruto * 0.11;
		
		if ((bruto > 0) && (bruto <= 900)) {
			ir = (double) 0;
			porcentagemIr = "(0%)";
		} else if ((bruto > 900) && (bruto <= 1500)) {
			ir = 0.05 * bruto;
			porcentagemIr = "(5%)";
		} else if ((bruto > 1500) && (bruto <= 2500)) {
			ir = 0.1 * bruto;
			porcentagemIr = "(10%)";
		} else if (bruto > 2500) {
			ir = 0.2 * bruto;
			porcentagemIr = "(20%)";
		} else {
			System.out.println("Salário inválido");
		}
		
		Double liquido = (bruto - (inss + ir));
		
		System.out.println("Salário Bruto: (" + custoHora + " * " + horaTrabalhada + ") : R$ " + bruto);
		System.out.println("(–) IR " + porcentagemIr + " : R$ " + ir);
		System.out.println("(–) INSS (10%) : R$ " + inss);
		System.out.println("FGTS (11%) : R$ " + fgts);
		System.out.println("Total de descontos: R$ " + (inss + ir));
		System.out.println("Salário Líquido: R$ " + liquido);
	}

}
