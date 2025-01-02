package com.exercicios02.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio21_Combustivel {

	private static Scanner scan;
	private static Double l1;
	
	public static String format(double x) {  
	    DecimalFormat df = new DecimalFormat("#0.00");  
	    return df.format(x);
	}
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("A-álcool, G-gasolina");
		String t1 = scan.nextLine().toUpperCase().trim();

		Double val1 = (double) 0;
		
		switch (t1) {
		case "A":
			System.out.println("Quantia em litros: ");
			l1 = scan.nextDouble();
			
			if ((l1 > 0) && (l1 <= 20)) {
				val1 = l1 * (1.9 - (1.9 * 0.03));
			} else if ((l1 > 0) && (l1 > 20)) {
				val1 = l1 * (1.9 - (1.9 * 0.05));
			}
			break;
		case "G":
			System.out.println("Quantia em litros: ");
			l1 = scan.nextDouble();
			
			if ((l1 > 0) && (l1 <= 20)) {
				val1 = l1 * (2.5 - (2.5 * 0.04));
			} else if ((l1 > 0) && (l1 > 20)) {
				val1 = l1 * (2.5 - (2.5 * 0.06));
			}
			break;
		default: System.out.println("Opção inválida!!");
			break;
		}
		
		 System.out.println("Valor a ser pago: R$ " + format(val1));
	}

}
