package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio11_AumentoSalario {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Salário: ");
		Double antigoSalario = scan.nextDouble();
		Double salario = antigoSalario;
		Double valorAumento = (double) 0;
		String aumento = "Percentual de aumento: 0%";
		
		if ((salario > 0) && (salario <= 280)) {
			valorAumento = salario * 0.2;
			salario+= valorAumento;
			aumento = "Percentual de aumento: 20%";
		} else if ((salario > 280) && (salario <= 700)) {
			valorAumento = salario * 0.15;
			salario+= valorAumento;
			aumento = "Percentual de aumento: 15%";
		} else if ((salario > 700) && (salario <= 1500)) {
			valorAumento = salario * 0.1;
			salario+= valorAumento;
			aumento = "Percentual de aumento: 10%";
		} else if (salario > 1500) {
			valorAumento = salario * 0.05;
			salario+= valorAumento;
			aumento = "Percentual de aumento: 5%";
		} else {
			System.out.println("Salário inválido");
		}
		
		System.out.println("Salário antes do reajuste: R$ " + antigoSalario);
		System.out.println(aumento);
		System.out.println("Valor do aumento: R$ " + valorAumento);
		System.out.println("Salário após o reajuste: R$ " + salario);
	}

}
