package com.exercicios02.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio22_Fruteira {

	private static Double qtdMorango;
	private static Double qtdMaca;
	private static Double cstMorango;
	private static Double cstMaca;
	private static Double valKg;
	private static Double valPg;
	private static Scanner scan;
	
	public static String format(double x) {  
	    DecimalFormat df = new DecimalFormat("#0.00");  
	    return df.format(x);
	}	
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Morango (Kg.): ");
		qtdMorango = scan.nextDouble();
		
		System.out.println("Maçã (Kg.): ");
		qtdMaca = scan.nextDouble();
		
		if ((qtdMorango >= 0) && (qtdMaca >= 0)) {
			if (qtdMorango <= 5) {
				cstMorango = qtdMorango * 2.5;
			} else if (qtdMorango > 5) {
				cstMorango = qtdMorango * 2.2;
			}
			
			if (qtdMaca <= 5) {
				cstMaca = qtdMaca * 1.8;
			} else if (qtdMaca > 5) {
				cstMaca = qtdMaca * 1.5;
			}
			
			valKg = qtdMorango + qtdMaca;
			valPg = cstMorango + cstMaca;
			
			if ((valKg > 8) || (valPg > 25)) {
				valPg-= (valPg * 0.1);
				System.out.println("Valor dos morangos: R$ " + format(cstMorango - cstMorango * 0.1) + "\n" +
								   "Valor das maçãs: R$ " + format(cstMaca - cstMaca * 0.1) + "\n" +
								   "Valor total: R$ " + format(valPg));
			} else {
				System.out.println("Valor dos morangos: R$ " + format(cstMorango) + "\n" +
								   "Valor das maçãs: R$ " + format(cstMaca) + "\n" +
								   "Valor total: R$ " + format(valPg));
			}

		} else {
			if (qtdMorango < 0) {
				System.out.println("Quantidade de morangos inconssistente.");
			}
			
			if (qtdMaca < 0) {
				System.out.println("Quantidade de maçãs inconssistente.");
			}
		}

	}

}
