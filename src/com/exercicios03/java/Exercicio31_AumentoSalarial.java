package com.exercicios03.java;

import java.util.GregorianCalendar;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.out;

public class Exercicio31_AumentoSalarial {
	
	private static DecimalFormat formatFloat;
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		GregorianCalendar hoje = new GregorianCalendar();
		formatFloat = new DecimalFormat("###,###,##0.00");
		
		int anos = hoje.get(GregorianCalendar.YEAR) - 1995, R = 1;		
		Double salario = (double) 1000, multiplica = (double) 0;
		
		do {
			multiplica = 0.015;
			for (int i = 1; i <= anos; i++) {		
				salario+= salario * multiplica;
				multiplica*= 2; 
			}
			out.print("Salário após aumento: R$ "+formatFloat.format(salario));
			out.println("\nDigite o salário inicial: ");
			salario = scan.nextDouble();
		} while(R == 1);
	}
}